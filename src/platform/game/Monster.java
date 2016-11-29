package platform.game;

import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Vector;

public abstract class Monster extends Actor{
	private Vector position;
	private Vector vitesse;
	private Box boxDAction;
	private final double width;
	private final double height;
	
	public Monster(Vector vitesse, Vector position, double width, double height, Box boxDAction,Loader loader, String dessin){
		super(1337,new Box(position, width,height),loader,dessin);
		if (vitesse ==null){
			throw new NullPointerException();
		}
		if (position==null){
			throw new NullPointerException ();
		}
		if (boxDAction == null){
			throw new NullPointerException();
		}
		this.position=position;
		this.vitesse=vitesse;
		this.boxDAction = boxDAction;
		this.width = width;
		this.height = height;
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
	 * @param position the position to set
	 */
	protected void setPosition(Vector position) {
		if (position == null){
			throw new NullPointerException();
		}
		this.position = position;
	}

	private boolean colliding = false;
	private boolean triggered = false;
	private Vector positionTriggered;
	private Player theEnnemi;

	
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
			if (other.isPlayer()&&other.getBox().isColliding(boxDAction)){
				positionTriggered = other.getPosition();
				triggered = true;
				theEnnemi = ((Player)other);
			}
		}
	}
	
	private final double MAX_SPEED_RIGHT = 5;
	private final double MAX_SPEED_LEFT = -5;
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
		double delta = input.getDeltaTime () ;
		Vector acceleration = new Vector (0.0, -9.81) ;
		vitesse = vitesse.add(acceleration.mul(delta));
		position = position.add(vitesse.mul(delta));
		setBox(new Box(position, width, height));
	}
}
