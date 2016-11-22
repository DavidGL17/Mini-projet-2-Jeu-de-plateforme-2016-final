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
	
	@Override
	public void interact(Actor other) {
		super.interact(other) ;
		if (other.isSolid ()) {
			Vector delta = other.getBox().getCollision(box);
			colliding = true;
			if (delta != null) {
				position = position.add(delta) ;
				if (delta.getX() != 0.0){
					vitesse = new Vector (0.0, vitesse.getY());
					if (delta.getY() != 0.0){
						vitesse = new Vector(vitesse.getX(), 0.0) ;
					}
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
		double maxSpeedRight = 4.0 ;
		double maxSpeedLeft = -4.0;
//		if (colliding) {
//			double scale = Math.pow (0.001 , input.getDeltaTime ()) ;
//			vitesse = vitesse.mul(scale) ;
//		}
		if (input.getKeyboardButton(KeyEvent.VK_RIGHT).isDown ()) {
			if (vitesse.getX() < maxSpeedRight) {
				double increase = 60.0 * input.getDeltaTime () ;
				double speed = vitesse.getX() + increase ;
				if (speed > maxSpeedRight){
					speed = maxSpeedRight ;
				}
				vitesse = new Vector(speed , vitesse.getY()) ;
			}
		}
		if (input.getKeyboardButton(KeyEvent.VK_LEFT).isDown ()) {
			if (vitesse.getX() > maxSpeedLeft) {
				double decrease = -60.0 * input.getDeltaTime () ;
				double speed = vitesse.getX() + decrease ;
				if (speed < maxSpeedLeft){
					speed = maxSpeedLeft ;
				}
				vitesse = new Vector(speed , vitesse.getY()) ;
			}
		}
		if (input.getKeyboardButton(KeyEvent.VK_UP).isPressed ()){
//			if (colliding){
				vitesse = new Vector(vitesse.getX(), 7.0);
//			}
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
}
