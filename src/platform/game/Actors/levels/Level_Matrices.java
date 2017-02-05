package platform.game.Actors.levels;

import platform.game.World;
import platform.game.Actors.Locker;
import platform.game.Actors.actorSignal.SignalSouris;
import platform.game.Actors.blocks.BlockDeco;
import platform.util.Box;
import platform.util.Loader;
import platform.util.Vector;

public class Level_Matrices extends Level{
	
	@Override
    public void register(World world) {
    	super.register(world);
    	world.thereIsNoPlayer();
    	
    	Loader loader = world.getLoader();
    	
    	
    	SignalSouris signal = new SignalSouris(new Box(new Vector(0, 0), 3, 3),true);
    	world.register(signal);
	    world.register(new Locker(new Vector(0, 5), loader, Locker.blue, signal));
	    world.register(new BlockDeco(new Vector(0, 0), 3, 3, loader, "portal1"));
    }
}
