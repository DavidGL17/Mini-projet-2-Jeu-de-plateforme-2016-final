package platform.game;

import platform.util.Box;
import platform.util.Input;
import platform.util.Sprite;
import platform.util.Output;
import platform.util.Vector;
import platform.util.Loader;

class Fireball extends Actor{
	private Vector position;
	private Vector vitesse;
	private Box box;
	private final double SIZE = 0.4;
	private final static String dessin = "fireball";
	
	public Fireball(Vector vitesse, Vector position, Loader loader){
		super(9001,loader,dessin);
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
	@Override
	public Box getBox () {
		return box;
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
		output.drawSprite(getSprite(), getBox(), input.getTime());
	}
	@Override
	public void interact(Actor other) {
		super.interact(other);
		if (other.isSolid ()) {
			Vector delta = other.getBox ().getCollision(position) ;
				if (delta != null) {
						position = position.add(delta) ;
						vitesse = vitesse.mirrored(delta) ;
				}
			}
		}
}
