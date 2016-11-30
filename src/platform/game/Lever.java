package platform.game;

import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;
import platform.util.Vector;

public class Lever extends Actor implements Signal{
	private Vector position;
	private boolean value = true;
	private final String leverActive;
	private final String leverNotActive;
	private final static double WIDTH = 1;
	private final static double HEIGHT = 1;
	
	public Lever(Vector position, Loader loader, String leverActive, String leverNotActive){
		super(10, new Box(position, WIDTH, HEIGHT), loader.getSprite("lever.left"));
		this.position = position;
		this.leverActive = leverActive;
		this.leverNotActive = leverNotActive;
	}
	
	public boolean hurt(Actor instigator , Damage type , double amount , Vector location) {
		switch (type){
		case ACTIVATION :
			value = !value;
			return true;
		default :
			return false;
		}
	}
	// pour être dessiné
	public void draw(Input input , Output output) {
		if (value){
			output.drawSprite(getWorld().getLoader().getSprite(leverNotActive), getBox());
		} else {
			output.drawSprite(getWorld().getLoader().getSprite(leverActive), getBox());
		}
	}

	@Override
	public boolean isActive() {
		return !value;
	}
}
