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
	//permet de savoir s'il faut que le joueur entre en contact avec l'exit ou non
	private boolean playerPresent = true;
	private int levelMode = 1;
	private Level levlAMettre = null;
	public final static String fermee = "door.closed";
	public final static String ouverte = "door.open";

	//Les trois constructeurs suivants ne fonctionnent que si le player rentre en contact avec
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
	//Celui la permet de passer à un niveau spécifique (levelMode == 3)
	public Exit(Vector position, double Width, double Height,Loader loader, Signal signal, Level levelAMettre){
		super(10, new Box(position, Width, Height), loader.getSprite(fermee));
		this.signal=signal;
		this.changeLevelMode = true;
		this.levelMode = 3;
		this.levlAMettre = levelAMettre;
	}
	
	
	//Celui la permet de changer de niveau normalement mais la porte n'est pas dessinnée, le joueur peut encore rentrrer en contacte qavec ou pas a choix
	public Exit(Signal signal, int levelMode, boolean playerPresent){
		changeLevelMode = true;
		this.signal = signal;
		this.levelMode = levelMode;
		this.playerPresent = playerPresent;
	}
	
	@Override
	public void interact(Actor other) {
		if (playerPresent && getBox().isColliding(other.getBox()) && other.isPlayer() && signal.isActive()){
			exit();
		} else {
			if (!playerPresent && signal.isActive()){
				exit();
			}
		}
	}
	
	//permet de gérer la procédure du choix de changement de niveau dépendant du mode de jeu
	private void exit(){
		//On verifie dans s'il faut changer de mode de Jeu et on vérifie dans quel mode de jeu on est (surtout entre 2 ou 3) voir simulator
		if (changeLevelMode){
			switch (levelMode){
				case 3 :
					getWorld().setNextLevel(levlAMettre);
				default :
					getWorld().changeLevelMode(levelMode);
			}
		} else {
			if(getWorld().getLevelMode() == 3){
				getWorld().changeLevelMode(2);
			} else {
				getWorld().nextLevel();
			}
		}
	}
	
	//La priorité change pour que lorsque la porte est fermée elle ne soit pas déssinnée par dessus le player
	@Override
	public void update(Input input) {
		if (signal.isActive()){
			setSprite(getWorld().getLoader().getSprite(ouverte));
			setPriority(1500);
		} else {
			setSprite(getWorld().getLoader().getSprite(fermee));
			setPriority(10);
		}
	}
	// pour être dessiné
	@Override
	public void draw(Input input , Output output) {
		if (signal.isActive()){
			if (getBox() != null){
				output.drawSprite(getSprite(), getBox());
			}
		} else {
			if (getBox() != null){
				output.drawSprite(getSprite(), getBox());
			}
		}
	}
}
