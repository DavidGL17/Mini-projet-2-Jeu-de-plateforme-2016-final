package platform.game.Actors.blocks;

import platform.game.Actor;
import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;
import platform.util.Sprite;
import platform.util.Vector;

/**
 * Simple solid actor that does nothing.
 */
public class Block extends Actor {
	private final static String dessin = "box.empty";
	
	public Block(Box box, Sprite sprite){
		super(1,box,sprite);
	}
	@Override
	public void draw(Input input , Output output) {
		output.drawSprite(getSprite(), getBox());
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}
}
