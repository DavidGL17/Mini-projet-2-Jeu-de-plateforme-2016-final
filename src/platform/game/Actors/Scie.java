package platform.game.Actors;

import platform.game.Actor;
import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;

public class Scie extends Actor{
	
	public Scie(Box box, Loader loader, String dessin){
		super(8000, box, loader, dessin);
	}
	@Override
	public boolean isSolid(){
		return true;
	}
	@Override
	public void interact(Actor other){
		if (new Box(getPosition(), getBox().getWidth()-0.5, getBox().getHeight()-0.5).isColliding(other.getBox())){
			other.hurt(this, Damage.VOID, Damage.VOID.getDamage(), getPosition());
		}
	}
	@Override
	public void draw(Input input, Output output){
		output.drawSprite(getSprite(), getBox(), input.getTime()*4);
	}
}
