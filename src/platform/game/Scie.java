package platform.game;

import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;
import platform.util.Vector;

public class Scie extends Actor{
	
	public Scie(Box box, Loader loader, String dessin){
		super(8000, box, loader, dessin);
	}
	
	public boolean isSolid(){
		return true;
	}
	public void interact(Actor other){
		if (other.getBox().isColliding(getBox())&&other.getBox()!=null){
			other.hurt(this, Damage.VOID, Damage.VOID.getDamage(), getPosition());
		}
	}
	public void draw(Input input, Output output){
		output.drawSprite(getSprite(), getBox(), input.getTime()*4);
	}
}
