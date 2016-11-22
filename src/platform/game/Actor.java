package platform.game;

import platform.util.Box;
import platform.util.Input;
import platform.util.Vector;
import platform.util.Output;
import platform.util.Sprite;
import platform.util.Loader;

/**
 * Base class of all simulated actors, attached to a world.
 */
public abstract class Actor implements Comparable<Actor> {
	private int priority;
	private World world;
	private Sprite sprite;
	private Loader loader;

	//Pour fireball et player
	public Actor(int p,Loader loader,String dessin){
		priority=p;
		sprite = loader.getSprite(dessin);
		this.loader=loader;
	}
	//Pour les blocks
	public Actor(int p,Sprite sprite){
		priority=p;
		this.sprite = sprite;
	}
	//Pour les levels
	public Actor(){
	}
	
	// pour évoluer au cours du temps :
	public void update(Input input) {}
	// pour être dessiné
	public void draw(Input input , Output output) {}
	@Override
	public int compareTo(Actor other) {
		if (this.priority>other.getPriority()){
			return -1;
		} else {
			if (this.priority==other.getPriority()){
				return 0;
			} else {
				return 1;
			}
		}
	}
	public int getPriority(){
		return priority;
	}
	public void interact(Actor other) {}
	public boolean isSolid () {
		return false ;
	}
	public Box getBox () {
		return null;
	}
	public Vector getPosition () {
		Box box = getBox() ;
		if (box == null)
			return null ;
			return box.getCenter () ;
	}
	public void preUpdate(){}
	public void postUpdate(){}
	public void register(World world) {
		this.world = world ;
	}
	public void unregister () {
		world = null ;
	}
	protected World getWorld(){
		return world;
	}
	public Sprite getSprite(){
		return sprite;
	}
	public boolean hurt(Actor instigator , Damage type , double amount , Vector location) {
		return false ;
	}
}