package platform.game;

import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;
import platform.util.Vector;

public class Lever extends Actor implements Signal{
	private Vector position;
	private boolean value = true;
	private final String LEVER_RIGHT = "lever.right";
	private final String LEVER_LEFT = "lever.left";
	private final static double WIDTH = 1;
	private final static double HEIGHT = 0.5;
	
	public Lever(Vector position, Loader loader){
		super(10, new Box(position, WIDTH, HEIGHT), loader.getSprite("lever.left"));
		this.position = position;
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
	// pour évoluer au cours du temps :
		public void update(Input input) {
			
		}
		// pour être dessiné
		public void draw(Input input , Output output) {
			if (value){
				output.drawSprite(getWorld().getLoader().getSprite(LEVER_LEFT), getBox());
			} else {
				output.drawSprite(getWorld().getLoader().getSprite(LEVER_RIGHT), getBox());
			}
		}

		@Override
		public boolean isActive() {
			return value;
		}
}
