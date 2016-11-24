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
	private Box box;

	//Pour fireball et player
	public Actor(int p,Box box,Loader loader,String dessin){
		priority=p;
		sprite = loader.getSprite(dessin);
		this.box = box;
	}
	//Pour les blocks
	public Actor(int p,Box box,Sprite sprite){
		priority=p;
		this.sprite = sprite;
		this.box = box;
	}
	//Pour les levels
	public Actor(){
	}
	
	//Getters and setters
	protected World getWorld(){
		return world;
	}
	public Sprite getSprite(){
		return sprite;
	}
	public Box getBox () {
		return box;
	}
	protected void setBox(Box box){
		this.box= box;
	}
	public Vector getPosition () {
		Box box = getBox() ;
		if (box == null)
			return null ;
			return box.getCenter () ;
	}
	public int getPriority(){
		return priority;
	}
	protected void setSprite(String dessin){
		sprite = world.getLoader().getSprite(dessin);
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
	public void interact(Actor other) {}
	public boolean isSolid () {
		return false ;
	}
	public void preUpdate(){}
	public void postUpdate(){}
	public void register(World world) {
		this.world = world ;
	}
	public void unregister () {
		world = null ;
	}
	public boolean hurt(Actor instigator , Damage type , double amount , Vector location) {
		return false ;
	}
}