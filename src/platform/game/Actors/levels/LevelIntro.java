package platform.game.Actors.levels;

import java.awt.event.KeyEvent;

import platform.game.World;
import platform.game.Actors.Exit;
import platform.game.Actors.GravitySwitcher;
import platform.game.Actors.LimiteTangible;
import platform.game.Actors.Locker;
import platform.game.Actors.Player;
import platform.game.Actors.actorSignal.SignalReadKey;
import platform.game.Actors.actorSignal.SignalSouris;
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
        Player franky = new Player(new Vector(0, 0), new Vector(0, 15), world.getLoader());
        world.register(franky);
        world.register(new LimiteTangible(new Vector(-6.5, 0), 1, 100));
        world.register(new LimiteTangible(new Vector(6.5, 0), 1, 100));
        world.register(new BlockDeco(new Vector(0, 0), 20, 20, loader, "textIntro"));
        
        
        SignalReadKey signalGravity = new SignalReadKey(KeyEvent.VK_L);
        world.register(signalGravity);
        world.register(new GravitySwitcher(signalGravity));
        
        
        //portes
        world.register(new Exit(new Vector(5, -28), 1.5, 2, loader, new Constant(true),1));
        world.register(new BlockDeco(new Vector(5, -26), 1, 5, loader, "text1"));
        world.register(new Exit(new Vector(-5, -28), 1.5, 2, loader, new Constant(true),2));
        world.register(new BlockDeco(new Vector(-5, -26), 2, 6, loader, "text2"));
        
        //platforme
        for (int i = 0;i<9;++i){
        	world.register(new Block(new Box(new Vector(-24+(6*i), -32), 6, 6),loader.getSprite("grass.middle.center3")));
        	world.register(new Block(new Box(new Vector(-24+(6*i), -38), 6, 6),loader.getSprite("grass.center3")));
        }
        
      //haut(matrices)
	    for (int i = 0;i<9;++i){
        	world.register(new Block(new Box(new Vector(-12+(3*i), 32), 3, 3),loader.getSprite("grass.center")));
        }
	    SignalSouris signal = new SignalSouris(new Box(new Vector(0, 36),2,2),true);
	    world.register(signal);
	    world.register(new BlockDeco(new Vector(0, 36), 2, 2, loader, "portal1"));
	    world.register(new Locker(new Vector(5, 36), loader, Locker.blue, signal));
        
        
        //background
	   
    	world.register(new BlockDeco(new Vector(0, -28.5), 1, 1, world.getLoader(), "foliagePack_001"));
    	world.register(new BlockDeco(new Vector(3, -28.5), 1, 1, world.getLoader(), "foliagePack_001"));
    	world.register(new BlockDeco(new Vector(-10, -28.5), 1, 1, world.getLoader(), "foliagePack_001"));
    	world.register(new BlockDeco(new Vector(-6, -28.5), 1, 1, world.getLoader(), "foliagePack_004"));
    	world.register(new BlockDeco(new Vector(8, -28.5), 1, 1, world.getLoader(), "foliagePack_001"));
    	world.register(new BlockDeco(new Vector(2, -28.5), 1, 1, world.getLoader(), "foliagePack_002"));
    	world.register(new BlockDeco(new Vector(-3, -28.5), 1, 1, world.getLoader(), "foliagePack_002"));

        world.register(new BlockDeco(new Vector(0, -20), 20, 100, world.getLoader(), "Background_112"));
    	world.register(new BlockDeco(new Vector(-20, -28), 2, 20, world.getLoader(), "longbush2"));
    	world.register(new BlockDeco(new Vector(20, -28), 2, 20, world.getLoader(), "longbush2"));
    	world.register(new BlockDeco(new Vector(0, -28), 2, 20, world.getLoader(), "longbush2"));

        world.register(new BlockDeco(new Vector(0, -22), 15, 25, world.getLoader(), "Background_18"));
	    world.register(new BlockDeco(new Vector(0, 0), 500, 505, world.getLoader(), "Background2_1"));

	    
	}
}
