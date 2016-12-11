package platform.game.Actors.levels;

import platform.game.Actors.Exit;
import platform.game.Actors.LimiteTangible;
import platform.game.Actors.Player;
import platform.game.Actors.World;
import platform.game.Actors.blocks.Block;
import platform.game.Actors.blocks.BlockDeco;
import platform.game.Signals.Constant;
import platform.util.Box;
import platform.util.Loader;
import platform.util.Vector;

public class LevelIntro extends Level{
	@Override
    public void register(World world) {
        super.register(world);
        Loader loader = getWorld().getLoader();
        Player franky = new Player(new Vector(0, 0), new Vector(0, -20), world.getLoader());
        world.register(franky);
        world.register(new LimiteTangible(new Vector(-6.5, 0), 1, 100));
        world.register(new LimiteTangible(new Vector(6.5, 0), 1, 100));
        
        //portes
        world.register(new Exit(new Vector(5, -28), 1.5, 2, loader, new Constant(true),1));
        world.register(new BlockDeco(new Vector(5, -26), 1, 5, loader, "text1"));
        world.register(new Exit(new Vector(-5, -28), 1.5, 2, loader, new Constant(true),2));
        world.register(new BlockDeco(new Vector(-5, -26), 2, 6, loader, "text2"));
        
        //platforme
        for (int i = 0;i<7;++i){
        	world.register(new Block(new Box(new Vector(-18+(6*i), -32), 6, 6),loader.getSprite("grass.middle.center3")));
        	world.register(new Block(new Box(new Vector(-18+(6*i), -38), 6, 6),loader.getSprite("grass.center3")));
        }
        //background
	    world.register(new BlockDeco(new Vector(0, -22), 15, 25, world.getLoader(), "Background_18"));
	    world.register(new BlockDeco(new Vector(0, 0), 500, 505, world.getLoader(), "Background2_1"));

	}
}
