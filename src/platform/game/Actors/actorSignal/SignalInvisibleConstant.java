package platform.game.Actors.actorSignal;

import platform.game.Actor;
import platform.game.Signals.Signal;
import platform.util.Box;

public class SignalInvisibleConstant extends Actor implements Signal{
	private boolean signal = false;
	public SignalInvisibleConstant(Box box){
		super(box, 1400);
	}
	@Override
	public void interact(Actor other){
		if (getBox().isColliding(other.getBox())&&other.isPlayer()){
			signal = true;
		}
	}
	@Override
	public boolean isActive(){
		return signal;
	}
}
