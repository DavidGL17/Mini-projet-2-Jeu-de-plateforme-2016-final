package platform.game;

import java.awt.event.KeyEvent;

import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;
import platform.util.Vector;

public class Player extends Actor{
	private Vector position;
	private Vector vitesse;
	private final static double SIZE = 1;
	private final static String dessin = "blocker.happy";
	private double HP = 10;
	private double HPMax = 10;
	
	public Player(Vector vitesse, Vector position, Loader loader){
		super(1337,new Box(position, SIZE, SIZE),loader,dessin);
		if (vitesse ==null){
			throw new NullPointerException();
		}
		if (position==null){
			throw new NullPointerException ();
		}
		this.position=position;
		this.vitesse=vitesse;
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
	/**
	 * @return the hP
	 */
	public double getHP() {
		return HP;
	}
	/**
	 * @return the hPMax
	 */
	public double getHPMax() {
		return HPMax;
	}

	private boolean colliding = false;
	private final double MAX_SPEED_RIGHT = 4;
	private final double MAX_SPEED_LEFT = -4;

	
	@Override
	public void interact(Actor other) {
		super.interact(other);
		if (other.isSolid ()) {
			Vector delta = other.getBox().getCollision(getBox());
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
	@Override
	public boolean hurt(Actor instigator , Damage type, double amount , Vector location) {
		super.hurt(instigator, type, amount, location);
		switch (type) {
			case AIR :
				vitesse = getPosition().sub(location).resized(amount);
				return true;
			case VOID :
				HP = 0;
				return true;
			case PHYSICAL :
				HP -= amount;
				return true;
			case HEAL :
				HP -= amount;
				if (HP>HPMax){
					HP = HPMax;
				}
				return true;
			default :
				return super.hurt(instigator , type, amount , location) ;
		}
	}
	
	private String lastKey = "R";
	
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
		//Flèche droite : droite
		if (input.getKeyboardButton(KeyEvent.VK_RIGHT).isDown ()) {
			lastKey = "R";
			if (vitesse.getX() < MAX_SPEED_RIGHT) {
				double increase = 60.0 * input.getDeltaTime () ;
				double speed = vitesse.getX() + increase ;
				if (speed > MAX_SPEED_RIGHT){
					speed = MAX_SPEED_RIGHT ;
				}
				vitesse = new Vector(speed , vitesse.getY()) ;
			}
		}
		//Flèche gauche : gauche
		if (input.getKeyboardButton(KeyEvent.VK_LEFT).isDown ()) {
			lastKey = "L";
			if (vitesse.getX() > MAX_SPEED_LEFT) {
				double decrease = -60.0 * input.getDeltaTime () ;
				double speed = vitesse.getX() + decrease ;
				if (speed < MAX_SPEED_LEFT){
					speed = MAX_SPEED_LEFT ;
				}
				vitesse = new Vector(speed , vitesse.getY()) ;
			}
		}
		//Espace : saut
		if (input.getKeyboardButton(KeyEvent.VK_SPACE).isPressed ()){
			if (colliding){
				vitesse = new Vector(vitesse.getX(), 7.0);
			}
		}
		//Q : boule de feu
		if (input.getKeyboardButton(KeyEvent.VK_Q).isPressed ()){
			if (lastKey.equals("R")){
				Vector v = new Vector(4+vitesse.getX(),4+vitesse.getY());
				getWorld().register(new Fireball(v, position, getWorld().getLoader(),this));
			} else {
				Vector v = new Vector(-4+vitesse.getX(),4+vitesse.getY());
				getWorld().register(new Fireball(v, position, getWorld().getLoader(),this));
			}
		}
		if (HP<=0){
			getWorld().unregister(this);
			getWorld().tryAgain();
		}
		double delta = input.getDeltaTime () ;
		Vector acceleration = new Vector (0.0, -9.81) ;
		vitesse = vitesse.add(acceleration.mul(delta));
		position = position.add(vitesse.mul(delta));
		setBox(new Box(position, SIZE, SIZE));
	}
	public void draw(Input input, Output output){
		output.drawSprite(getSprite(), getBox());
	}
	public void postUpdate(){
		super.postUpdate();
		getWorld().setView(position,8);
	}
}
