package platform.game.Actors;

import platform.game.Actor;
import platform.game.Signals.Signal;
import platform.util.Input;

//Cet acteur provoque un changement de niveau lorsqu'il reçoit le signal de le faire (uniquement pour changement en mode de jeu matrices pour le moment)
public class ExitSignal extends Actor{
	private final Signal signal;
	
	public ExitSignal (Signal signal){
		this.signal = signal;
	}
	
	public void update (Input input){
		if (signal.isActive()){
			getWorld().changeLevelMode(4);
		}
	}
}
