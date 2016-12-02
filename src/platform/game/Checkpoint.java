package platform.game;

import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;

//Cetta classe est utilisée dans les niveaux trop longs afin de ne pas avoir à tout recommencer depuis le début
public class Checkpoint extends Actor{
	private static final String drapeauBas = "flagBlueHanging";
	private final String drapeauHaut1 = "flagBlue1";
	private final String drapeauHaut2 = "flagBlue2";
	private boolean checkpointDone = false;
	//pour le dessin du checkpoint
	private final double COOLDOWN_MAX = 0.4;
	private double cooldown = COOLDOWN_MAX;
	
	public Checkpoint(Box box, Loader loader){
		super(10, box, loader.getSprite(drapeauBas));
	}
	
	public void update(Input input){
		checkpointDone = getWorld().getCheckpoint();
		if (checkpointDone){
			cooldown -= input.getDeltaTime();
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
