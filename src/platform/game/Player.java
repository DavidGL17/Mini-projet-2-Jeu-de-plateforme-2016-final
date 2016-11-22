package platform.game;

import java.awt.event.KeyEvent;

import platform.util.Box;
import platform.util.Input;
import platform.util.Sprite;
import platform.util.Output;
import platform.util.Vector;
import platform.util.Loader;

public class Player extends Actor{
	private Vector position;
	private Vector vitesse;
	private Box box;
	private final double SIZE = 1;
	private final static String dessin = "blocker.happy";
	
	public Player(Vector vitesse, Vector position, Loader loader){
		super(1337,loader,dessin);
		if (vitesse ==null){
			throw new NullPointerException();
		}
		if (position==null){
			throw new NullPointerException ();
		}
		this.position=position;
		this.vitesse=vitesse;
		box = new Box(position, SIZE, SIZE);
	}
	public Box getBox(){
		return box;
	}
	/**
	 * @return the position
	 */
	public Vector getPosition() {
		return position;
	}
	/**
	 * @return the vitesse
	 */
	public Vector getVitesse() {
		return vitesse;
	}
	
	private boolean colliding = false;
	private final double MAX_SPEED_RIGHT = 4;
	private final double MAX_SPEED_LEFT = -4;

	
	@Override
	public void interact(Actor other) {
		super.interact(other);
		if (other.isSolid ()) {
			Vector delta = other.getBox().getCollision(box);
			if (delta != null) {
				colliding = true;
				position = position.add(delta) ;
				if (delta.getX() != 0.0){
					vitesse = new Vector (0.0, vitesse.getY());
				}
				if (delta.getY() != 0.0){
					vitesse = new Vector(vitesse.getX(), 0.0) ;
				}
			}
		}
	}
	public void preUpdate(){
		colliding=false;
	}
	@Override
	public void update(Input input) {
		super.update(input);
		if (colliding) {
			double scale = Math.pow (0.001 , input.getDeltaTime ()) ;
			vitesse = vitesse.mul(scale) ;
		}
		if (input.getKeyboardButton(KeyEvent.VK_RIGHT).isDown ()) {
			if (vitesse.getX() < MAX_SPEED_RIGHT) {
				double increase = 60.0 * input.getDeltaTime () ;
				double speed = vitesse.getX() + increase ;
				if (speed > MAX_SPEED_RIGHT){
					speed = MAX_SPEED_RIGHT ;
				}
				vitesse = new Vector(speed , vitesse.getY()) ;
			}
		}
		if (input.getKeyboardButton(KeyEvent.VK_LEFT).isDown ()) {
			if (vitesse.getX() > MAX_SPEED_LEFT) {
				double decrease = -60.0 * input.getDeltaTime () ;
				double speed = vitesse.getX() + decrease ;
				if (speed < MAX_SPEED_LEFT){
					speed = MAX_SPEED_LEFT ;
				}
				vitesse = new Vector(speed , vitesse.getY()) ;
			}
		}
		if (input.getKeyboardButton(KeyEvent.VK_SPACE).isPressed ()){
			if (colliding){
				vitesse = new Vector(vitesse.getX(), 7.0);
			}
		}
		if (input.getKeyboardButton(KeyEvent.VK_Q).isPressed ()){
			Vector v = vitesse.add(vitesse.resized(2.0));
			Fireball fireball = new Fireball(v, position, getWorld().getLoader());
			getWorld().register(fireball);
		}
		double delta = input.getDeltaTime () ;
		Vector acceleration = new Vector (0.0, -9.81) ;
		vitesse = vitesse.add(acceleration.mul(delta));
		position = position.add(vitesse.mul(delta));
		box = new Box(position, SIZE, SIZE);
	}
	public void draw(Input input, Output output){
		output.drawSprite(getSprite(), getBox());
	}
	public void postUpdate(){
		super.postUpdate();
		getWorld().setView(position,8);
	}
}
