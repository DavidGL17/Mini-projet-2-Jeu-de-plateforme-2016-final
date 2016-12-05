package platform.game.Actors;

import platform.game.Actor;
import platform.util.Box;
import platform.util.Vector;

public class LimiteTangible extends Actor{
	public LimiteTangible(Vector position, double width, double height){
		super(new Box(position, width, height), 0);
	}
	public boolean isLimiteTangible(){
		return true;
	}
	public boolean isSolid(){
		return true;
	}
}
