package platform.game.Actors;

import platform.game.Actor;
import platform.util.Box;
import platform.util.Input;
import platform.util.Output;
import platform.util.Vector;

public class Overlay extends Actor{
	private ActeurOverlay acteur;
	private final static String COEUR_PLEIN = "heart.full";
	private final String COEUR_VIDE = "heart.empty";
	private final double SIZE = 0.2;
	private final double HPMax;
	private Vector position;
	
	public Overlay(ActeurOverlay acteur){
		super(10, new Box(new Vector(acteur.getPosition().getX(), acteur.getPosition().getY()+0.5), 0.2, 0.2), acteur.getWorld().getLoader().getSprite(COEUR_PLEIN));
		this.acteur = acteur;
		this.position= new Vector(acteur.getPosition().getX()+0.1, acteur.getPosition().getY()+acteur.getBox().getHeight()/2+0.3);
		HPMax = acteur.getHPMax()/10*(-1);
	}
	public Vector getPosition(){
		return position;
	}
	
	public void update(Input input) {
		super.update(input);
		this.position= new Vector(acteur.getPosition().getX()+0.1, acteur.getPosition().getY()+acteur.getBox().getHeight()/2+0.3);
	}
	public void draw(Input input, Output output){
		double p = HPMax;
		for (int i = 1;i<=acteur.getHPMax();++i){
			if (i <= acteur.getHP()){
				output.drawSprite(getWorld().getLoader().getSprite(COEUR_PLEIN), new Box(new Vector(getPosition().getX()+p, getPosition().getY()), SIZE, SIZE));
			} else {
				output.drawSprite(getWorld().getLoader().getSprite(COEUR_VIDE), new Box(new Vector(getPosition().getX()+p, getPosition().getY()), SIZE, SIZE));
			}
			p +=0.2;
		}
	}
}
