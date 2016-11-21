package platform.game;

import platform.game.level.Level;
import java.util.ArrayList;
import java.util.List;
import platform.util.Box;
import platform.util.Sprite;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;
import platform.util.SortedCollection;
import platform.util.Vector;
import platform.util.View;

/**
 * Basic implementation of world, managing a complete collection of actors.
 */

public class Simulator implements World {

    private Loader loader;
    private Vector currentCenter ;
    private double currentRadius ;
    private Vector expectedCenter = Vector.ZERO;
    private double expectedRadius=10;
    private SortedCollection<Actor> actors = new SortedCollection<Actor>();
    private List<Actor> registered;
    private List<Actor> unregistered;
    /**
    * Create a new simulator.
    * @param loader associated loader , not null
    */
    public Simulator(Loader loader , String [] args) {
    	if (loader == null) {
    			throw new NullPointerException () ;
    	}
    	this.loader = loader ;
    	currentCenter = Vector.ZERO ;
    	currentRadius = 10.0 ;
    	registered = new ArrayList<Actor>();
    	unregistered = new ArrayList<Actor>();
    	Block block1 = new Block(new Vector(-4, -1),new Vector(4, 0),loader);
    	Block block2 = new Block(new Vector(-2, 0),new Vector(-1, 1),loader);
    	Fireball fireball = new Fireball(new Vector(-3,5), new Vector(3, 2),loader);
    	Player franky = new Player(new Vector(0, -1), new Vector(2, 3), loader);
    	actors.add(block1);
    	actors.add(block2);
    	actors.add(fireball);
    	actors.add(franky);
    }
    @Override
    public void setView(Vector center , double radius) {
    	if (center == null)
    			throw new NullPointerException () ;
    	if (radius <= 0.0)
    		throw new IllegalArgumentException("radius must be positive") ;
    	expectedCenter = center ;
    	expectedRadius = radius ;
    }
	
    /**
     * Simulate a single step of the simulation.
     * @param input input object to use, not null
     * @param output output object to use, not null
     */
	public void update(Input input, Output output){
		double factor = 0.002 ;
		currentCenter = currentCenter.mul (1.0 -factor).add(expectedCenter.mul(factor)) ;
		currentRadius = currentRadius * (1.0 - factor) +expectedRadius * factor ;
		View view = new View(input , output) ;
		view.setTarget(currentCenter , currentRadius) ;
		for (Actor actor : actors){
			actor.preUpdate();
		}
		for (Actor actor : actors){
			for (Actor other : actors){
				if (actor.getPriority () > other.getPriority ()){
					actor.interact(other) ;
				}
			}
		}
		// Apply update
		for (Actor a : actors){		
			a.update(input);
		}
		// Draw everything
		for (Actor a : actors.descending ()){
			a.draw(view , view) ;
		}
		for (Actor actor : actors){
			actor.postUpdate();
		}
		if (view.getMouseButton (1).isPressed ())
			setView(view.getMouseLocation (), 10.0) ;
		// Add registered actors
		for (int i = 0 ; i < registered.size() ; ++i) {
			Actor actor = registered.get(i) ;
			if ( !actors.contains(actor)) {
				actor.register(this);
				actors.add(actor) ;
			}
		}
		registered.clear () ;
		// Remove unregistered actors
		for (int i = 0 ; i < unregistered.size() ; ++i) {
			Actor actor = unregistered.get(i) ;
			actor.unregister();
			actors.remove(actor) ;
		}
		unregistered.clear () ;
	}

    @Override
    public Loader getLoader() {
        return loader;
    }
    @Override
    public void register(Actor actor) {
    registered.add(actor) ;
    }
    @Override
    public void unregister(Actor actor) {
    unregistered.add(actor) ;
    }
    
}
