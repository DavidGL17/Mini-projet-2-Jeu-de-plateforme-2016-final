package platform.game.Actors.blocks;

import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;
import platform.util.Vector;

public class BlockDecoAvant extends BlockDeco {
	private Vector position;
	private final double WIDTH;
	private final double HEIGHT;
	
	public BlockDecoAvant(Vector position, double height, double width, Loader loader, String dessin) {
		super(position, height, width, loader, dessin);
		WIDTH = width;
		HEIGHT = height;
		this.position = position;
		this.setPriority(10000);
		
		
	}
	public boolean isSolid(){
		return false;
	}
	public void draw(Input input, Output output){
		output.drawSprite(getSprite(), new Box(position, WIDTH, HEIGHT));	
		
	}
}
