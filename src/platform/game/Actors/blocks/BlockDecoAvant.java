package platform.game.Actors.blocks;

import platform.util.Loader;
import platform.util.Vector;

public class BlockDecoAvant extends BlockDeco {
	
	public BlockDecoAvant(Vector position, double height, double width, Loader loader, String dessin) {
		super(position, height, width, loader, dessin);
		this.setPriority(10000);
	}
}
