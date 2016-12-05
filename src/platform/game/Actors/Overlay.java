package platform.game.Actors;

import platform.game.Actor;
import platform.util.Box;
import platform.util.Input;
import platform.util.Output;
import platform.util.Vector;

public class Overlay extends Actor{
	private Player player;
	private final static String COEUR_PLEIN = "heart.full";
	private final String COEUR_DEMI= "heart.half";
	private final String COEUR_VIDE = "heart.empty";
	private final double SIZE = 0.2;
	private final double HPMax;
	private Vector position;
	
	public Overlay(Player player){
		super(10, new Box(new Vector(player.getPosition().getX(), player.getPosition().getY()+0.5), 0.2, 0.2), player.getWorld().getLoader().getSprite(COEUR_PLEIN));
		this.player = player;
		this.position= new Vector(player.getPosition().getX()+0.1, player.getPosition().getY()+0.8);
		HPMax = player.getHPMax()/10/2*(-1);
	}
	public Vector getPosition(){
		return position;
	}
	
	public void update(Input input) {
		super.update(input);
		this.position= new Vector(player.getPosition().getX()+0.1, player.getPosition().getY()+0.8);
	}
	public void draw(Input input, Output output){
		double p = HPMax;
		for (int i = 1;i<=player.getHP()/2;++i){
			output.drawSprite(getSprite(), new Box(new Vector(getPosition().getX()+p, getPosition().getY()), SIZE, SIZE));
			p +=0.2;
		}
		if ((((player.getHPMax()/2)-(player.getHP()/2))<=1)&&(((player.getHPMax()/2)-(player.getHP()/2))>0)){
			if (((player.getHP()/2)-4)==0.5){
				output.drawSprite(getWorld().getLoader().getSprite(COEUR_DEMI), new Box(new Vector(getPosition().getX()+p, getPosition().getY()), SIZE, SIZE));
			} else {
				output.drawSprite(getWorld().getLoader().getSprite(COEUR_VIDE), new Box(new Vector(getPosition().getX()+p, getPosition().getY()), SIZE, SIZE));
			}
		} else {
			if (((player.getHPMax()/2)-(player.getHP()/2))<=2&&(((player.getHPMax()/2)-(player.getHP()/2))>1)){
				if (((player.getHP()/2)-3)==0.5){
					output.drawSprite(getWorld().getLoader().getSprite(COEUR_DEMI), new Box(new Vector(getPosition().getX()+p, getPosition().getY()), SIZE, SIZE));
				} else {
					output.drawSprite(getWorld().getLoader().getSprite(COEUR_VIDE), new Box(new Vector(getPosition().getX()+p, getPosition().getY()), SIZE, SIZE));
				}
				p +=0.2;
				output.drawSprite(getWorld().getLoader().getSprite(COEUR_VIDE), new Box(new Vector(getPosition().getX()+p, getPosition().getY()), SIZE, SIZE));
			} else {
				if (((player.getHPMax()/2)-(player.getHP()/2))<=3&&(((player.getHPMax()/2)-(player.getHP()/2))>2)){
					if (((player.getHP()/2)-2)==0.5){
						output.drawSprite(getWorld().getLoader().getSprite(COEUR_DEMI), new Box(new Vector(getPosition().getX()+p, getPosition().getY()), SIZE, SIZE));
					} else {
						output.drawSprite(getWorld().getLoader().getSprite(COEUR_VIDE), new Box(new Vector(getPosition().getX()+p, getPosition().getY()), SIZE, SIZE));
					}
					p +=0.2;
					output.drawSprite(getWorld().getLoader().getSprite(COEUR_VIDE), new Box(new Vector(getPosition().getX()+p, getPosition().getY()), SIZE, SIZE));
					p +=0.2;
					output.drawSprite(getWorld().getLoader().getSprite(COEUR_VIDE), new Box(new Vector(getPosition().getX()+p, getPosition().getY()), SIZE, SIZE));
				} else {
					if (((player.getHPMax()/2)-(player.getHP()/2))<=4&&(((player.getHPMax()/2)-(player.getHP()/2))>3)){
						if (((player.getHP()/2)-1)==0.5){
							output.drawSprite(getWorld().getLoader().getSprite(COEUR_DEMI), new Box(new Vector(getPosition().getX()+p, getPosition().getY()), SIZE, SIZE));
						} else {
							output.drawSprite(getWorld().getLoader().getSprite(COEUR_VIDE), new Box(new Vector(getPosition().getX()+p, getPosition().getY()), SIZE, SIZE));
						}
						p +=0.2;
						output.drawSprite(getWorld().getLoader().getSprite(COEUR_VIDE), new Box(new Vector(getPosition().getX()+p, getPosition().getY()), SIZE, SIZE));
						p +=0.2;
						output.drawSprite(getWorld().getLoader().getSprite(COEUR_VIDE), new Box(new Vector(getPosition().getX()+p, getPosition().getY()), SIZE, SIZE));
						p +=0.2;
						output.drawSprite(getWorld().getLoader().getSprite(COEUR_VIDE), new Box(new Vector(getPosition().getX()+p, getPosition().getY()), SIZE, SIZE));
					} else {
						if (((player.getHPMax()/2)-(player.getHP()/2))<=5&&(((player.getHPMax()/2)-(player.getHP()/2))>4)){
							if (((player.getHP()/2)==0.5)){
								output.drawSprite(getWorld().getLoader().getSprite(COEUR_DEMI), new Box(new Vector(getPosition().getX()+p, getPosition().getY()), SIZE, SIZE));
							} else {
								output.drawSprite(getWorld().getLoader().getSprite(COEUR_VIDE), new Box(new Vector(getPosition().getX()+p, getPosition().getY()), SIZE, SIZE));
							}
							p +=0.2;
							output.drawSprite(getWorld().getLoader().getSprite(COEUR_VIDE), new Box(new Vector(getPosition().getX()+p, getPosition().getY()), SIZE, SIZE));
							p +=0.2;
							output.drawSprite(getWorld().getLoader().getSprite(COEUR_VIDE), new Box(new Vector(getPosition().getX()+p, getPosition().getY()), SIZE, SIZE));
							p +=0.2;
							output.drawSprite(getWorld().getLoader().getSprite(COEUR_VIDE), new Box(new Vector(getPosition().getX()+p, getPosition().getY()), SIZE, SIZE));
							p +=0.2;
							output.drawSprite(getWorld().getLoader().getSprite(COEUR_VIDE), new Box(new Vector(getPosition().getX()+p, getPosition().getY()), SIZE, SIZE));
						}
					}
				}
			}
		}
	}
}
