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
	public Fireball(Vector vitesse, Vector position){
		super(9001);
		if (vitesse ==null){
			throw new NullPointerException();
		}
		if (position==null){
			throw new NullPointerException ();
		}
		this.position=position;
		this.vitesse=vitesse;
	}
	@Override
	public Box getBox () {
	//position est l'attribut position de l'objet SIZE une constante choisie pour la taille , par exemple 0.4
	return new Box(position , SIZE , SIZE) ;
	}
	@Override
	public void update(Input input) {
	super.update(input) ;
	double delta = input.getDeltaTime () ;
	Vector acceleration = new Vector (0.0, -9.81) ;
	vitesse = vitesse.add(acceleration.mul(delta)) ;
	position = position.add(vitesse.mul(delta)) ;
	}
}
