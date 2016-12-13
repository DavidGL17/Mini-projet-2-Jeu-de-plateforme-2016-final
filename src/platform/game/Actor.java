package platform.game;

import platform.game.Actors.Damage;
import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;
import platform.util.Sprite;
import platform.util.Vector;

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
	//Pour limits
	public Actor(Box box, int priority){
		this.box=box;
		this.priority=priority;
	}
	
	//Getters and setters
	public World getWorld(){
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
		if (box == null){
			return null ;
		}
		return box.getCenter () ;
	}
	protected int getPriority(){
		return priority;
	}
	protected void setPriority(int p){
		priority=p;
	}
	public void setSprite(Sprite sprite){
		this.sprite = sprite;
	}
	
	public boolean isSolid () {
		return false ;
	}
	//Méthode facilitant l'interaction entre le Player et d'autres acteurs (évite d'avoir recours aux instance of)
	public boolean isPlayer(){
		return false;
	}
	//Permet de créer des limites qui limitent le mouvement du player(évite d'avoir recours aux instance of)
	//Voir update de Player
	public boolean isLimiteTangible(){
		return false;
	}
	
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
	
	//permet d'enregistrer et de désenregistrer l'acteur dans le monde
	public void register(World world) {
		this.world = world ;
	}
	public void unregister () {
		world = null ;
	}
	
	public boolean hurt(Actor instigator , Damage type , double amount , Vector location) {
		return false ;
	}
	//permet de gérer les interactions avec les autres acteur
	public void interact(Actor other) {}
	public void preUpdate(){}
	// pour évoluer au cours du temps :
	public void update(Input input) {}
	// pour être dessiné
	public void draw(Input input , Output output) {}
	public void postUpdate(){}
}