package platform.game;

import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;

//Cetta classe est utilisée dans les niveaux trop longs afin de ne pas avoir à tout recommencer depuis le début
public class Checkpoint extends Actor{
	private static final String drapeauBas = "flagBlueHanging";
	private final String drapeauHaut1 = "flagBlue1";
	private final String drapeauHaut2 = "flagBlue2";
	private boolean checkpointDone = false;
	
	public Checkpoint(Box box, Loader loader){
		super(10, box, loader.getSprite(drapeauBas));
	}
	
	public void update(Input input){
		checkpointDone = getWorld().getCheckpoint();
	}
}
