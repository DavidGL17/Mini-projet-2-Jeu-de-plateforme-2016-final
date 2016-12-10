package platform.game.Actors;

import platform.game.Actor;
import platform.game.Actors.levels.Level;
import platform.game.Signals.Signal;
import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;
import platform.util.Vector;

public class Exit extends Actor{
	private Signal signal;
	private final boolean changeLevelMode;
	private int levelMode = 1;
	private Level levlAMettre = null;
	public final static String fermee = "door.closed";
	public final static String ouverte = "door.open";

	//Ce constructeur permet de passer de niveau en niveau dans le mode histoire
	public Exit(Vector position, double Width, double Height,Loader loader, Signal signal){
		super(10, new Box(position, Width, Height), loader.getSprite(fermee));
		this.signal=signal;
		changeLevelMode = false;
	}
	//Celui la permet de revenir à un niveau donné (en changeant levelMode)
	public Exit(Vector position, double Width, double Height,Loader loader, Signal signal, int levelMode){
		super(10, new Box(position, Width, Height), loader.getSprite(fermee));
		this.signal=signal;
		this.changeLevelMode = true;
		this.levelMode = levelMode;
	}
	//Celui la permet de passer à un niveau spécifique (levelMode == 3=
	public Exit(Vector position, double Width, double Height,Loader loader, Signal signal, Level levelAMettre){
		super(10, new Box(position, Width, Height), loader.getSprite(fermee));
		this.signal=signal;
		this.changeLevelMode = true;
		this.levelMode = 3;
		this.levlAMettre = levelAMettre;
	}
	
	public void interact(Actor other) {
		if (getBox().isColliding(other.getBox())){
			if (other.isPlayer()){
				if (signal.isActive()){
					//On verifie dans s'il faut changer de mode de Jeu et on vérifie dans quel mode de jeu on est (surtout entre 2 ou 3) voir simulator
					if (changeLevelMode){
						if (levelMode == 3){
							getWorld().setNextLevel(levlAMettre);
							getWorld().changeLevelMode(levelMode);
						} else {
							getWorld().changeLevelMode(levelMode);
						}
					} else {
						getWorld().nextLevel();
					}
				}
			}
		}
	}
	public void update(Input input) {
		if (signal.isActive()){
			setSprite(ouverte, getWorld().getLoader());
			setPriority(1500);
		} else {
			setSprite(fermee,getWorld().getLoader());
			setPriority(10);
		}
	}
	// pour être dessiné
	public void draw(Input input , Output output) {
		if (signal.isActive()){
			output.drawSprite(getSprite(), getBox());
		} else {
			output.drawSprite(getSprite(), getBox());
		}
	}
}
