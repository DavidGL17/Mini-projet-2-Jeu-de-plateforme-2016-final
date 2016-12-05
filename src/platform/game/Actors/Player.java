package platform.game.Actors;

import java.awt.event.KeyEvent;

import platform.game.Actor;
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
	 * @param position the position to set
	 */
	protected void setPosition(Vector position) {
		if (position == null){
			throw new NullPointerException();
		}
		this.position = position;
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
	private boolean limite = false;
	
	@Override
	public void interact(Actor other) {
		super.interact(other);
		if (other.isSolid ()) {
			Vector delta = other.getBox().getCollision(getBox());
			if (delta != null) {
				colliding = true;
				limite = false;
				position = position.add(delta) ;
				if (delta.getX() != 0.0){
					vitesse = new Vector (0.0, vitesse.getY());
				}
				if (delta.getY() != 0.0){
					vitesse = new Vector(vitesse.getX(), 0.0) ;
				}
			}
		}
		if (other.isLimiteTangible()&&getBox().isColliding(other.getBox())){
			limite = true;
		}
	}
	@Override
	public boolean hurt(Actor instigator , Damage type, double amount , Vector location) {
		super.hurt(instigator, type, amount, location);
		switch (type) {
			case FIRE :
				HP -= amount;
				return true;
			case AIR :
				vitesse = getPosition().sub(location).resized(amount);
				return true;
			case VOID :
				HP = 0;
				return true;
			case PHYSICAL :
				HP -= amount;
				return true;
			case SMALLMONSTER :
				HP -= amount;
				return true;
			case HEAL :
				if (HP<HPMax){
					HP += amount;
					if (HP>HPMax){
						HP = HPMax;
					}
					return true;
				} else {
					return false;
				}
			default :
				return super.hurt(instigator , type, amount , location);
		}
	}
	public boolean isPlayer(){
		return true;
	}
	
	private String lastKey = "R";
	private final double MAX_SPEED_RIGHT = 8;
	private final double MAX_SPEED_LEFT = -8;
	private double cooldownBouleDeFeu;
	private double conteurDeBoule = 0;
	private final double COOLDOWN_BOULE_DE_FEU = 1;
	
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
		//Espace + Gauche/Droite : Long Walljump
		//Espace + Gauche/Droite + Haut : Petit Walljump en hauteur
		if (!limite){
			if (input.getKeyboardButton(KeyEvent.VK_SPACE).isPressed ()){
				if (colliding && input.getKeyboardButton(KeyEvent.VK_RIGHT).isDown() && input.getKeyboardButton(KeyEvent.VK_UP).isDown() && Math.abs(vitesse.getY()) > 0) {
					vitesse = new Vector(-10, 8);	
					} else {
						if (colliding && input.getKeyboardButton(KeyEvent.VK_RIGHT).isDown() && Math.abs(vitesse.getY()) > 0){
							vitesse = new Vector(-15, 3);
						} else {
							if (colliding && input.getKeyboardButton(KeyEvent.VK_LEFT).isDown() && input.getKeyboardButton(KeyEvent.VK_UP).isDown() && Math.abs(vitesse.getY()) > 0){
								vitesse = new Vector(10, 8);	
							} else {
								if (colliding && input.getKeyboardButton(KeyEvent.VK_LEFT).isDown() && Math.abs(vitesse.getY()) > 0){
									vitesse = new Vector(15, 3);
								} else {
									if (colliding){
										vitesse = new Vector(vitesse.getX(), 7);		
									}
								}
							}
						}
					}
			}
		}
						
			
		//Q : boule de feu
		if (cooldownBouleDeFeu>0){
			cooldownBouleDeFeu -= input.getDeltaTime();
		}
		if (conteurDeBoule>=3){
			cooldownBouleDeFeu=COOLDOWN_BOULE_DE_FEU;
			conteurDeBoule=0;
		}
		if (cooldownBouleDeFeu <=0){
			if (input.getKeyboardButton(KeyEvent.VK_Q).isPressed ()){
				if (lastKey.equals("R")){
					Vector v = new Vector(4+vitesse.getX(),4+vitesse.getY());
					getWorld().register(new Fireball(v, position, getWorld().getLoader(),this));
				} else {
					Vector v = new Vector(-4+vitesse.getX(),4+vitesse.getY());
					getWorld().register(new Fireball(v, position, getWorld().getLoader(),this));
				}
				++conteurDeBoule;
			}
		}
		//W : dégats AIR
		if (input.getKeyboardButton(KeyEvent.VK_W).isPressed ()){
			if (lastKey.equals("L")){
				getWorld ().hurt(new Box(new Vector(position.getX()-1, position.getY()), SIZE, SIZE), this , Damage.AIR , Damage.AIR.getDamage(),getPosition ());
			} else {
				getWorld ().hurt(new Box(new Vector(position.getX()+1, position.getY()), SIZE, SIZE), this , Damage.AIR , Damage.AIR.getDamage(),getPosition ());
			}
		}
		//E : active leviers,...
		if (input.getKeyboardButton(KeyEvent.VK_E).isPressed ()){
			getWorld ().hurt(new Box(new Vector(position.getX(), position.getY()), SIZE, SIZE), this , Damage.ACTIVATION , Damage.ACTIVATION.getDamage(),getPosition ());
		}
		if (HP<=0){
			getWorld().unregister(this);
			getWorld().tryAgain();
		}
		double delta = input.getDeltaTime () ;
		Vector acceleration = getWorld().getGravity();
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
