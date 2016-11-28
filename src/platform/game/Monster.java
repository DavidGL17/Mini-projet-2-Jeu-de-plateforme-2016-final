package platform.game;

import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Vector;

//Cette classe est la base de nos monstre, des petits slimes aux boss. 
//WIP

public abstract class Monster extends Actor{
	private Vector position;
	private Vector vitesse;
	private final static double SIZE = 1;
	private final static String dessin = "blocker.happy";
	private double HP = 10;
	private double HPMax = 10;
	
	public Monster(Vector vitesse, Vector position, Loader loader){
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
	
	private String lastKey = "R";
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
	}
}
