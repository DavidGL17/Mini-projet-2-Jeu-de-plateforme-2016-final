package platform.game;

import platform.util.Box;
import platform.util.Input;
import platform.util.Sprite;
import platform.util.Output;
import platform.util.Vector;
import platform.util.Loader;

public class Limits extends Actor{
	public Limits(Box box){
		super(box,1000000);
	}
	public void interact(Actor other) {
		super.interact(other);
		if (getBox().isColliding(other.getBox())){
			other.hurt(this , Damage.VOID , Double.POSITIVE_INFINITY ,Vector.ZERO);
		}
	}
}