package platform.game.Actors;

import platform.game.Actor;
import platform.util.Box;
import platform.util.Vector;

public class LimiteTangible extends Actor{
	public LimiteTangible(Vector position, double width, double height){
		super(new Box(position, width, height), 0);
	}
	@Override
	public boolean isLimiteTangible(){
		return true;
	}
	@Override
	public boolean isSolid(){
		return true;
	}
}
