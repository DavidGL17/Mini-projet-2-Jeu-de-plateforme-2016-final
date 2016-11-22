package platform.game;

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
	@Override
	public void interact(Actor other) {
		super.interact(other) ;
		if (other.isSolid ()) {
			Vector delta = other.getBox().getCollision(box);
			if (delta != null) {
				position = position.add(delta) ;
				vitesse = new Vector(0, 0);
				if (delta.getX() != 0.0){
					vitesse = new Vector (0.0, vitesse.getY()) ;
					if (delta.getY() != 0.0){
						vitesse = new Vector(vitesse.getX(), 0.0) ;
					}
				}
			}
		}
	}
	@Override
	public void update(Input input) {
		super.update(input);
		double delta = input.getDeltaTime () ;
		Vector acceleration = new Vector (0.0, -9.81) ;
		vitesse = vitesse.add(acceleration.mul(delta)) ;
		position = position.add(vitesse.mul(delta));
		box = new Box(position, SIZE, SIZE);
	}
	public void draw(Input input, Output output){
		output.drawSprite(getSprite(), getBox());
	}
}
