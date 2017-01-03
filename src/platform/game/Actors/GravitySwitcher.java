package platform.game.Actors;

import platform.game.Actor;
import platform.game.Signals.Signal;
import platform.util.Input;

public class GravitySwitcher extends Actor{
	private Signal signal;
	
	public GravitySwitcher(Signal signal){
		this.signal = signal;
	}
	public void update(Input input){
		if (signal.isActive()){
			getWorld().switchGravity();
		}
	}
}
