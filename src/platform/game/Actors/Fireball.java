package platform.game.Actors;

import platform.game.Actor;
import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;
import platform.util.Vector;

public class Fireball extends Actor{
	private Vector position;
	private Vector vitesse;
	private final static double SIZE = 0.4;
	private final static String dessin = "fireball";
	private Player owner = null;
	private double cooldown;
	private final double COOLDOWN = 5;
	
	public Fireball(Vector vitesse, Vector position, Loader loader, Player owner){
		super(9001,new Box(position, SIZE, SIZE), loader,dessin);
		if (vitesse ==null){
			throw new NullPointerException();
		}
		if (position==null){
			throw new NullPointerException ();
		}
		this.position=position;
		this.vitesse=vitesse;
		this.owner=owner;
		this.cooldown = COOLDOWN;
	}

	public boolean hurt(Actor instigator , Damage type , double amount , Vector location) {
		switch(type) {
		case VOID : 
			getWorld().unregister(this);
			return true;
		default :
			return true;
		}
	}
	@Override
	public void interact(Actor other) {
		super.interact(other);
		if (other.isSolid()&&other.getBox()!=null) {
			Vector delta = other.getBox().getCollision(position);
			if (delta != null) {
					position = position.add(delta) ;
					vitesse = vitesse.mirrored(delta) ;
			}
		}
		if (getBox().isColliding(other.getBox())){
			if (!other.equals(owner) && owner!=null){
				if(other.hurt(this,Damage.FIRE,Damage.FIRE.getDamage(),getPosition())){
					getWorld().unregister(this);
				}
			}
		}
	}
	@Override
	public void update(Input input) {
		super.update(input);
		cooldown -= input.getDeltaTime();
		if (cooldown<=0){
			getWorld().unregister(this);
		}
		double delta = input.getDeltaTime () ;
		Vector acceleration = new Vector (0.0, -9.81) ;
		vitesse = vitesse.add(acceleration.mul(delta)) ;
		position = position.add(vitesse.mul(delta));
		setBox(new Box(position, SIZE, SIZE));
	}
	public void draw(Input input, Output output){
		output.drawSprite(getSprite(), getBox(), input.getTime()*25);
	}
}
