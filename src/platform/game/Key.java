package platform.game;

import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;
import platform.util.Vector;

public class Key extends Actor implements Signal{
	private final static double HEIGHT = 0.5;
	private final static double WIDTH = 0.5;
	public final static String blue = "key.blue";
	public final static String green = "key.green";
	public final static String yellow = "key.yellow";
	public final static String red = "key.red";

	public Key(Vector position, Loader loader, String color){
		super(1400,new Box(position, WIDTH, HEIGHT),loader, color);
	}
	
	private boolean taken = false;
	
	public void update(Input input) {
		if (taken){
			getWorld().unregister(this);
		}
	}
	public void interact(Actor other){
		super.interact(other);
		if (other.isPlayer()&&(getBox().isColliding(other.getBox()))){
			taken = true;
			getWorld().unregister(this);
		}
	}
	public void draw(Input input , Output output) {
		output.drawSprite(getSprite(), getBox());
	}
	public boolean isActive(){
		return taken;
	}
}
