package platform.game.Actors;

import platform.game.Actor;
import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;
import platform.util.Vector;

//Cette classe définit les méthodes génériques utilisée par les monstres de notre Jeu
//@see Slime
public abstract class Monster extends Actor{
	private Vector position;
	private Vector vitesse;
	private final Box boxDAction;
	private final double width;
	private final double height;
	
	//La priorité est juste plus grande que celle de Player (de 1) pour que le monstre puisse infliger des dégats
	//La boxDAction représente la zone que le monstre "va patrouiller". Si le Player rentre dans cette zone, il sera détecté et le monstre bougera vers lui
	//Le monstre ne pourra pas sauter, il bougera que linéairement (par rapportà l'axe x)
	//@see update
	public Monster(Vector vitesse, Vector position, double width, double height, Box boxDAction, double movement,Loader loader, String dessin){
		super(1338,new Box(position, width,height),loader,dessin);
		if (vitesse ==null){
			throw new NullPointerException();
		}
		if (position==null){
			throw new NullPointerException ();
		}
		this.position=position;
		this.vitesse=vitesse;
		this.boxDAction = boxDAction;
		this.width = width;
		this.height = height;
		this.movement = movement;
	}
	/**
	 * @return the position
	 */
	@Override
	public Vector getPosition() {
		return getBox().getCenter();
	}
	/**
	 * @return the vitesse
	 */
	public Vector getVitesse() {
		return vitesse;
	}

	/**
	 * @return the boxDAction
	 * utile pour certains monstres en faisant apparitre d'autres à leur mort.
	 * @see Slime
	 */
	public Box getBoxDAction() {
		return boxDAction;
	}

	private boolean colliding = false;
	//triggered permet de définir si le joueur est ou n'est pas dans la zone d'action. Elle permet de définir le comportement à adopter
	private boolean triggered = false;
	//Permet d'avoir accès au Player qui a oser embeter le monstre. (Notament à sa position)
	private Player theEnnemi;

	/**
	 * @return the colliding
	 */
	public boolean isColliding() {
		return colliding;
	}
	
	/**
	 * @return the triggered
	 */
	public boolean isTriggered() {
		return triggered;
	}
	/**
	 * @return the theEnnemi
	 */
	public Player getTheEnnemi() {
		return theEnnemi;
	}
	//Permet de gérer les interactions des monstres (les sous-classes y feront appel et complementerons cette méthode)
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
		//permet de savoir si le joueur est dans la box d'action. S'il n'y est pas, on vérifie que l'actor en question est bien le joueur.
		//Si c'est le cas, cela veut dire que la box du joueur ne collide pas avec celle du monstre, et donc que le monstre ne doit pas être activé
		if (other.isPlayer()){
			if (boxDAction!=null){
				if (boxDAction.isColliding(other.getBox())){
					triggered = true;
					theEnnemi = ((Player)other);
				} else {
					triggered = false;
					theEnnemi = null;
				}
			}
		}
	}
	
	private final double movement;
	private boolean directionDroite = true;
	
	/**
	 * @return la direction du monstre
	 */
	public boolean getDirectionDroite() {
		return directionDroite;
	}
	
	/**
	 * @return the movement
	 */
	public double getMovement() {
		return movement;
	}
	@Override
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
	// Les monstres n'ont pas de vitesse, leur position change uniquement en x (ils ne tombent pas mais ne sautent pas non plus)
	//La constant mouvement permet de changer leur position. le boolean directionDroite permet de savoir dans quelle direction va le monstre, 
	//pour pouvoir ajouter ou retirer la constante mouvement au X de la position. Ceci est uniquement pour quand le player n'est pas dans la zone
	//d'action du monstre
		if (!triggered){
			if (directionDroite){
				position = new Vector(position.getX()+(movement*input.getDeltaTime()), position.getY());
				if (position.getX()>boxDAction.getCenter().getX()+(boxDAction.getWidth()/2)){
					position = new Vector(boxDAction.getCenter().getX()+(boxDAction.getWidth()/2), position.getY());
					directionDroite=false;
				}
			} else {
				position = new Vector(position.getX()-(movement*input.getDeltaTime()), position.getY());
				if (position.getX()<boxDAction.getCenter().getX()-(boxDAction.getWidth()/2)){
					position = new Vector(boxDAction.getCenter().getX()-(boxDAction.getWidth()/2), position.getY());
					directionDroite = true;
				}
			}
		} else {
			//Le monstre va se diriger vers le joueur
			if (position.getX()<theEnnemi.getPosition().getX()){
				position = new Vector(position.getX()+(movement*input.getDeltaTime()), position.getY());
			} else {
				if (position.getX()>theEnnemi.getPosition().getX()){
					position = new Vector(position.getX()-(movement*input.getDeltaTime()), position.getY());
				} else {
					//permet d'éviter que le monstre bouge s'il est déja sur le joueur
					if (position.getX() == theEnnemi.getPosition().getX()){
						position = new Vector(position.getX()-(movement*input.getDeltaTime()), position.getY());
					}
				}
			}
		}
		setBox(new Box(position, width, height));
	}
	
	 //oblige les sous classes à redéfinir ces méthode (qui sont spécifiques à chaque monstre)
	public abstract boolean hurt(Actor instigator , Damage type, double amount , Vector location);
	public abstract void draw(Input input, Output output);
}
