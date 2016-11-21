package platform.game;

import platform.util.Box;
import platform.util.Input;
import platform.util.Sprite;
import platform.util.Output;
import platform.util.Vector;
import platform.util.Loader;

/**
 * Simple solid actor that does nothing.
 */
public class Block extends Actor {
	private Box box;
	private final String dessin = "box.empty";
	private Sprite sprite;
	public Block(Vector basGauche, Vector hautDroite, Loader loader){
		super(0);
		sprite = loader.getSprite(dessin);
		box = new Box(basGauche, hautDroite);
	}
	public void draw(Input input , Output output) {
		output.drawSprite(sprite, box);
	}
}
