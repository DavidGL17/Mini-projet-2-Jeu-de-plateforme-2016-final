package platform.game;

import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;
import platform.util.Vector;

//Cetta classe est utilisée dans les niveaux trop longs afin de ne pas avoir à tout recommencer depuis le début
public class Checkpoint extends Actor{
	private static final String drapeauBas = "flagBlueHanging";
	private final static double widthNotCheckpoint = 2;
	private final static double heightNotCheckpoint = 2;
	private final String drapeauHaut1 = "flagBlue";
	private final String drapeauHaut2 = "flagBlue2";
	private final static double widthCheckpoint = 2;
	private final static double heightCheckpoint = 2;
	private boolean checkpointDone = false;
	//pour le dessin du checkpoint
	private final double COOLDOWN_MAX = 0.4;
	private double cooldown = COOLDOWN_MAX;
	
	public Checkpoint(Vector center, Loader loader){
		super(1400, new Box(center, widthNotCheckpoint, heightNotCheckpoint), loader.getSprite(drapeauBas));
	}
	
	public void interact(Actor other){
		if (getBox().isColliding(other.getBox())&&other.isPlayer()){
			checkpointDone = true;
			getWorld().setCheckpoint(checkpointDone);
		}
	}
	public void update(Input input){
		if (checkpointDone){
			cooldown -= input.getDeltaTime();
			setBox(new Box(getPosition(), widthCheckpoint, heightCheckpoint));
			setPriority(10);
			if (cooldown<0){
				cooldown = COOLDOWN_MAX;
			}
		}
	}
	public void draw (Input input, Output output){
		if (checkpointDone){
			if (cooldown >0.2){
				output.drawSprite(getWorld().getLoader().getSprite(drapeauHaut1), getBox());
			} else {
				output.drawSprite(getWorld().getLoader().getSprite(drapeauHaut2), getBox());
			}
		} else {
			output.drawSprite(getWorld().getLoader().getSprite(drapeauBas), getBox());
		}
	}
}
