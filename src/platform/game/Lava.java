package platform.game;

import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;

public class Lava extends Limits{
	private final String dessin;
	public final static String LAVA_TOP = "liquidLavaTop_mid";
	public final static String LAVA_MID = "liquidLava";

	public Lava(Box box, Loader loader, String dessin){
		super(box);
		this.dessin = dessin;
		setSprite(dessin);
	}
	
	// pour être dessiné
	public void draw(Input input , Output output) {
		output.drawSprite(getSprite(), getBox());
	}
}
