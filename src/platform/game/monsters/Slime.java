package platform.game.monsters;

import platform.game.Monster;
import platform.util.Box;
import platform.util.Loader;
import platform.util.Vector;

//Cette classe permet de modeliser le comportement de slimes. 

public abstract class Slime extends Monster{
	private final static double width = 1;
	private final static double height = 1;
	private final static String dessin = "blocker.happy";
	private double HPMax = 5;
	private double HP = HPMax;
	
	public Slime(Vector vitesse, Vector position, Box boxDAction, Loader loader){
		super(vitesse, position, width, height, boxDAction, loader, dessin);
	}
}
