package platform.game;

import platform.util.Box;
import platform.util.Input;
import platform.util.Sprite;
import platform.util.Output;
import platform.util.Vector;
import platform.util.Loader;

public class Fireball extends Actor{
	private Vector position;
	private Vector vitesse;
	private final double SIZE = 0.4;
	private final static String dessin = "fireball";
	private Player owner = null;
	
	public Fireball(Vector vitesse, Vector position, Loader loader, Player owner){
		super(9001,new Box(position, SIZE, SIZE),dessin);
		if (vitesse ==null){
			throw new NullPointerException();
		}
		if (position==null){
			throw new NullPointerException ();
		}
		this.position=position;
		this.vitesse=vitesse;
		this.owner=owner;
	}

	@Override
	public void update(Input input) {
		super.update(input);
		double delta = input.getDeltaTime () ;
		Vector acceleration = new Vector (0.0, -9.81) ;
		vitesse = vitesse.add(acceleration.mul(delta)) ;
		position = position.add(vitesse.mul(delta));
		setBox(new Box(position, SIZE, SIZE));
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
		if (other.getBox().isColliding(getBox())){
			if (other.hurt(this,Damage.FIRE,Damage.FIRE.getDamage(),getPosition())){
			// faire en sorte ici que la boule feu disparaisse
			// une fois qu'elle a infligé un dommage.
			}
		}
	}
	
}
