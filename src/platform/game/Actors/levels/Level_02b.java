package platform.game.Actors.levels;

import platform.game.Actors.Jumper;
import platform.game.Actors.Key;
import platform.game.Actors.LimiteTangible;
import platform.game.Actors.Limits;
import platform.game.Actors.Overlay;
import platform.game.Actors.Player;
import platform.game.Actors.SignalAlternant;
import platform.game.Actors.World;
import platform.game.Actors.blocks.Block;
import platform.game.Actors.blocks.BlockDeco;
import platform.game.Actors.blocks.Mover;
import platform.game.Actors.monsters.Slime;
import platform.util.Box;
import platform.util.Loader;
import platform.util.Vector;

public class Level_02b extends Level{

	
	 @Override
	    public void register(World world) {
	        super.register(world);
	        
	        // Register a new instance, to restart level automatically
	    	Player franky = new Player(new Vector(0, -4), new Vector(100, 4), world.getLoader());
	    	world.register(franky);
	    	Overlay overlayfranky = new Overlay(franky);
	    	world.register(overlayfranky);
	    	world.register(new Limits(new Box(new Vector(0, -3) , 1000, 5)));
	    	Key key = new Key(new Vector(56, 26), world.getLoader(), Key.blue);
	    	world.register(key);
		    world.register(new LimiteTangible(new Vector(2, 0), 2, 30));
		    Loader loader = world.getLoader();
		    
		    										// Partie 1
		    
		    world.register(new Block(new Box(new Vector(0, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));   
	    	world.register(new Block(new Box(new Vector(-12, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3"))); 
	    	world.register(new Block(new Box(new Vector(-18, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));    
	    	world.register(new Block(new Box(new Vector(-12, -6), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(-18, -6), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(-6, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));    
	    	world.register(new Block(new Box(new Vector(6, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));    
	    	world.register(new Block(new Box(new Vector(-6, -6), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(0, -6), 6, 6), world.getLoader().getSprite("grass.center3")));    	    	
	    	world.register(new Block(new Box(new Vector(6, -6), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(27, -3), 36, 12), world.getLoader().getSprite("grass.middle.center36_12")));    	    	
		    world.register(new Slime(new Vector(0, 0), new Vector(15, 4),0.05,8, new Box(new Vector(30, 4), 18, 4), loader, 2,2,true));
		    world.register(new Block(new Box(new Vector(36, 3.5), 1, 1), world.getLoader().getSprite("box")));    
		    world.register(new Block(new Box(new Vector(37, 3.5), 1, 1), world.getLoader().getSprite("box")));    
		    world.register(new Block(new Box(new Vector(38, 3.5), 1, 1), world.getLoader().getSprite("box")));    
		    world.register(new Block(new Box(new Vector(36.5, 4.5), 1, 1), world.getLoader().getSprite("box")));    
		    world.register(new Block(new Box(new Vector(37.5, 4.5), 1, 1), world.getLoader().getSprite("box")));    
		    world.register(new Block(new Box(new Vector(37, 5.5), 1, 1), world.getLoader().getSprite("box")));    
		    world.register(new Block(new Box(new Vector(48, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));   
	    	world.register(new Block(new Box(new Vector(48, -6), 6, 6), world.getLoader().getSprite("grass.center3")));    	    	
	    	world.register(new Block(new Box(new Vector(48, -12), 6, 6), world.getLoader().getSprite("grass.center3")));    	    	
	    	world.register(new Jumper(new Vector(50, 4), world.getLoader()));
	    	world.register(new BlockDeco(new Vector(59, -5), 10, 16, world.getLoader(), "Background2_84"));

		    world.register(new Block(new Box(new Vector(70, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));   
		    world.register(new Block(new Box(new Vector(70, -6), 6, 6), world.getLoader().getSprite("grass.center3")));   
		    world.register(new Block(new Box(new Vector(70, -12), 6, 6), world.getLoader().getSprite("grass.center3")));   
	    	world.register(new BlockDeco(new Vector(76, -5), 10, 16, world.getLoader(), "Background2_84"));
		 
		    world.register(new Block(new Box(new Vector(86, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));   
		    world.register(new Block(new Box(new Vector(86, -6), 6, 6), world.getLoader().getSprite("grass.center3")));   
		    world.register(new Block(new Box(new Vector(86, -12), 6, 6), world.getLoader().getSprite("grass.center3")));
	    	world.register(new BlockDeco(new Vector(92, -5), 10, 16, world.getLoader(), "Background2_84"));

		    world.register(new Block(new Box(new Vector(102, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));   
		    world.register(new Block(new Box(new Vector(102, -6), 6, 6), world.getLoader().getSprite("grass.center3")));   
		    world.register(new Block(new Box(new Vector(102, -12), 6, 6), world.getLoader().getSprite("grass.center3")));
		    //	    	world.register(new Block(new Box(new Vector(10, 0), 2, 6), world.getLoader().getSprite("grass.center1_3")));    

	    	
	    	world.register(new BlockDeco(new Vector(-8, 4), 2, 2, world.getLoader(), "foliagePack_leaves_044"));
	    	world.register(new BlockDeco(new Vector(-6, 4), 2, 2, world.getLoader(), "foliagePack_leaves_001"));
	    	world.register(new BlockDeco(new Vector(-4, 4), 2, 2, world.getLoader(), "foliagePack_leaves_001"));
	    	world.register(new BlockDeco(new Vector(-2, 4), 2, 2, world.getLoader(), "foliagePack_leaves_001"));
	    	world.register(new BlockDeco(new Vector(0, 4), 2, 2, world.getLoader(), "foliagePack_leaves_001"));
	    	world.register(new BlockDeco(new Vector(2, 4), 2, 2, world.getLoader(), "foliagePack_leaves_001"));
	    	world.register(new BlockDeco(new Vector(4, 4), 2, 2, world.getLoader(), "foliagePack_leaves_001"));
	    	world.register(new BlockDeco(new Vector(6, 4), 2, 2, world.getLoader(), "foliagePack_leaves_001"));
	    	world.register(new BlockDeco(new Vector(8, 4), 2, 2, world.getLoader(), "foliagePack_leaves_001"));
	    	world.register(new BlockDeco(new Vector(10, 4), 2, 2, world.getLoader(), "foliagePack_leaves_001"));
	    	world.register(new BlockDeco(new Vector(12, 4), 2, 2, world.getLoader(), "foliagePack_leaves_001"));
	    	world.register(new BlockDeco(new Vector(14, 4), 2, 2, world.getLoader(), "foliagePack_leaves_001"));
	    	world.register(new BlockDeco(new Vector(16, 4), 2, 2, world.getLoader(), "foliagePack_leaves_001"));
	    	world.register(new BlockDeco(new Vector(18, 4), 2, 2, world.getLoader(), "foliagePack_leaves_001"));
	    	world.register(new BlockDeco(new Vector(20, 4), 2, 2, world.getLoader(), "foliagePack_leaves_001"));
	    	world.register(new BlockDeco(new Vector(22, 4), 2, 2, world.getLoader(), "foliagePack_leaves_001"));
	    	
	    											// Partie 2
	    	
	    	SignalAlternant signal = new SignalAlternant(2);
	    	world.register(signal);
	    	SignalAlternant signal2 = new SignalAlternant(1);
	    	world.register(signal2);
	    	world.register(new Mover(new Vector(108, 0), new Vector(108, 10), 6, 2,1, world.getLoader(), signal, "mover"));
	    	world.register(new Mover(new Vector(114, 10), new Vector(124, 10), 6, 2,1, world.getLoader(), signal2, "mover"));

	    	
	    											// Background
	    	
		    world.register(new BlockDeco(new Vector(6, 2), 20, 60, world.getLoader(), "Background_17"));
//		    world.register(new BlockDeco(new Vector(10, 12), 25, 30, world.getLoader(), "Background_18"));
		    world.register(new BlockDeco(new Vector(20, 30), 20, 100, world.getLoader(), "Background_112"));
		    world.register(new BlockDeco(new Vector(66, 2), 20, 60, world.getLoader(), "Background_17"));
		    world.register(new BlockDeco(new Vector(126, 2), 20, 60, world.getLoader(), "Background_17"));
		    world.register(new BlockDeco(new Vector(6, 0), 500, 505, world.getLoader(), "Background2_1"));
	 }
}
