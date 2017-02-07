package platform.game.Actors.levels;

import platform.game.World;
import platform.util.Loader;

public class Level_Matrices extends Level{

	@Override
    public void register(World world) {
    	super.register(world);
    	world.thereIsNoPlayer();
    	Loader loader = world.getLoader();
    	
    }
}
