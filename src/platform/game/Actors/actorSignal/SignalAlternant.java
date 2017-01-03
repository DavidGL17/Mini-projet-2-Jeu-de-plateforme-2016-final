package platform.game.Actors.actorSignal;

import platform.game.Actor;
import platform.game.Signals.Signal;
import platform.util.Input;

//Ce signal est un acteur invisible. Il fait le déconte d'un timer donné lors de la construction et, lorsqu'il arrive à 0
//inverse son signal. Nous l'utilisons pour les movers notamment
public class SignalAlternant extends Actor implements Signal{
	private final double TIMER_MAX;
	private double timer;
	private boolean signal = false;
	
	public SignalAlternant(double timer){
		TIMER_MAX = timer;
		this.timer = timer;
		setPriority(11);
	}
	@Override
	public void update (Input input){
		timer -= input.getDeltaTime();
		if (timer<=0){
			timer = TIMER_MAX;
			signal = !signal;
		}
	}
	@Override
	public boolean isActive(){
		return signal;
	}
}
