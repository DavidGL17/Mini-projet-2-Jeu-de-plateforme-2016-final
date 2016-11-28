package platform.game;

import java.util.ArrayList;
import java.util.List;

import platform.game.level.Level;
import platform.game.level.Level_01;
import platform.game.level.Level_02;
import platform.util.Box;
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
    private double currentRadius;
    private Vector expectedCenter = Vector.ZERO;
    private double expectedRadius=radius;
    private SortedCollection<Actor> actors = new SortedCollection<Actor>();
    private List<Actor> registered;
    private List<Actor> unregistered;
    public static double radius = 8;
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
    	currentRadius = radius;
    	registered = new ArrayList<Actor>();
    	unregistered = new ArrayList<Actor>();
    	niveaux = new Level[]{new Level_02()};
    	nextLevel();
    	register(nextLevel);
    	transition = false;
    }
    @Override
    public Loader getLoader() {
        return loader;
    }
    @Override
    public void register(Actor actor) {
    	registered.add(actor) ;
    	actor.register(this);
    }
    @Override
    public void unregister(Actor actor) {
    	unregistered.add(actor) ;
    }
    
    @Override
    public void setView(Vector center , double radius) {
    	if (center == null)
    			throw new NullPointerException () ;
    	if (radius <= 0.0)
    		throw new IllegalArgumentException("radius must be positive") ;
    	expectedCenter = center;
    	expectedRadius = radius;
    }
	
    //Levels
    private Level[] niveaux;
	private Level nextLevel;
    private int compteurDeNiveau = 0;
    private boolean transition = false;
    
    public void nextLevel(){
    	if (compteurDeNiveau<niveaux.length){
    		setNextLevel(niveaux[compteurDeNiveau]);
    	} else {
    		compteurDeNiveau = 0;
    		setNextLevel(niveaux[compteurDeNiveau]);
    	}
    	++compteurDeNiveau;
    	transition = true;
    }
    public void setNextLevel(Level level){
    	nextLevel = level;
    }
    public void tryAgain(){
    	--compteurDeNiveau;
    	setNextLevel(niveaux[compteurDeNiveau]);
    	++compteurDeNiveau;
    	transition = true;
    }
	
	
	@Override
    public int hurt(Box area , Actor instigator , Damage type ,double amount , Vector location) {
    	int victims = 0 ;
    	for (Actor actor : actors)
    		if (area.isColliding(actor.getBox ())){
    			if (actor.hurt(instigator , type , amount , location)){
    				++ victims;
    			}
    		}
    	return victims;
    }
    /**
     * Simulate a single step of the simulation.
     * @param input input object to use, not null
     * @param output output object to use, not null
     */
	public void update(Input input, Output output){
		double factor = 0.08 ;
		currentCenter = currentCenter.mul (1.0 -factor).add(expectedCenter.mul(factor));
		currentRadius = currentRadius * (1.0 - factor) +expectedRadius * factor;
		View view = new View(input , output);
		view.setTarget(currentCenter , currentRadius);
		// si un acteur a mis transition à true pour demander le passage
		// à un autre niveau :
		if (transition) {
			// si un acteur a appelé setNextLevel , next ne sera pas null :
			transition = false ;
			actors.clear () ;
			registered.clear () ;
			// tous les anciens acteurs sont désenregistrés ,
			// y compris le Level précédent :
			unregistered.clear () ;
			register(nextLevel) ;
		}
		
		// Pre Update
		for (Actor actor : actors){
			actor.preUpdate();
		}
		// Interact
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
			a.draw(view, view);
		}
		// Post Update
		for (Actor actor : actors){
			actor.postUpdate();
		}
		// Add registered actors
		for (int i = 0 ; i < registered.size() ; ++i) {
			Actor actor = registered.get(i) ;
			if ( !actors.contains(actor)) {
				actors.add(actor) ;
			}
		}
		registered.clear();
		// Remove unregistered actors
		for (int i = 0 ; i < unregistered.size() ; ++i) {
			Actor actor = unregistered.get(i) ;
			actor.unregister();
			actors.remove(actor) ;
		}
		unregistered.clear();
	}
}