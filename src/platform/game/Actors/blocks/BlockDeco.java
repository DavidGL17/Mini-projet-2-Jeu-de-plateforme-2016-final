package platform.game.Actors.blocks;

import platform.util.Box;
import platform.util.Loader;
import platform.util.Vector;

public class BlockDeco extends Block{
	
	public BlockDeco(Vector position, double height, double width, Loader loader,String dessin){
		super(new Box(position,  width,height), loader.getSprite(dessin));
		this.setPriority(-10);
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}
}
