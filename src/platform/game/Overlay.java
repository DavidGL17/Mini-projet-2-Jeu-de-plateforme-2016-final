package platform.game;

import java.awt.event.KeyEvent;

import platform.util.Box;
import platform.util.Input;
import platform.util.Output;
import platform.util.Vector;

public class Overlay extends Actor{
	private Player player;
	private final static String COEUR_PLEIN = "heart.full";
	private final String COEUR_DEMI= "heart.half";
	private final String COEUR_Vide = "heart.empty";
	private final double SIZE = 0.2;
	
	public Overlay(Player player){
		super(0, new Box(new Vector(player.getPosition().getX(), player.getPosition().getY()+0.5), 0.2, 0.2), player.getWorld().getLoader().getSprite(COEUR_PLEIN));
		this.player = player;
	}
	public void update(Input input) {
		super.update(input);
	}
	public void draw(Input input, Output output){
		double p = -0.5;
		for (int i = 0;i<player.getHP()/2;++i){
			output.drawSprite(getSprite(), new Box(new Vector(getPosition().getX()+p, getPosition().getY()), SIZE, SIZE));
		}
	}
}
