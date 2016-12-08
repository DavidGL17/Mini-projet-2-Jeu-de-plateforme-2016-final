package platform.game.Actors;

import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;

public class Lava extends Limits{

	public Lava(Box box, Loader loader, String dessin){
		super(new Box(box.getCenter(), box.getWidth(), box.getHeight()));
		setSprite(dessin, loader);
	}
	
	// pour être dessiné
	public void draw(Input input , Output output) {
		output.drawSprite(getSprite(), getBox());
	}
}
