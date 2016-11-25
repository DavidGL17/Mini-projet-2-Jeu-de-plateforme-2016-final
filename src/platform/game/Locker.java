package platform.game;

import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;
import platform.util.Vector;

public class Locker extends Block implements Signal{
	private Signal signal;
	private Vector position;
	private final static double SIZE =1;
	public final static String blue = "lock.blue";
	public final static String red = "lock.red";
	public final static String yellow = "lock.yellow";
	public final static String green = "lock.green";

	
	public Locker(Vector position, Loader loader, String color,Signal signal){
		super(new Box(position, SIZE, SIZE), loader.getSprite(color));
		this.signal= signal;
		this.position=position;
	}
	
	public boolean isSolid(){
		return signal.isActive();
	}
	// pour évoluer au cours du temps :
	public void update(Input input) {
		if (signal.isActive()){
			setBox(null);
		}
	}
	// pour être dessiné
	public void draw(Input input , Output output) {
		if (!signal.isActive()){
			output.drawSprite(getSprite(), getBox());
		}
	}

	@Override
	public boolean isActive() {
		return signal.isActive();
	}
}
