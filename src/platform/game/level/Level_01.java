package platform.game.level;

import platform.game.Block;
import platform.game.Exit;
import platform.game.Key;
import platform.game.LimiteTangible;
import platform.game.Limits;
import platform.game.Locker;
import platform.game.Overlay;
import platform.game.Player;
import platform.game.World;
import platform.game.BlockDeco;
import platform.util.Box;
import platform.util.Vector;

public class Level_01 extends Level {

	 @Override
	    public void register(World world) {
	        super.register(world);
	        
	        // Register a new instance, to restart level automatically
	        world.setNextLevel(new BasicLevel());
	    	Player franky = new Player(new Vector(0, -4), new Vector(44, 26), world.getLoader());
	    	world.register(franky);
	    	Overlay overlayfranky = new Overlay(franky);
	    	world.register(overlayfranky);
	    	world.register(new Limits(new Box(new Vector(0, -12) , 1000, 5)));
	    	Key key = new Key(new Vector(56, 26), world.getLoader(), Key.blue);
	    	world.register(key);
		    world.register(new LimiteTangible(new Vector(-10, 0), 2, 30));



	        													// Spawn
	    	

		    
	    	world.register(new Block(new Box(new Vector(0, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));    
	    	world.register(new Block(new Box(new Vector(-6, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));    
	    	world.register(new Block(new Box(new Vector(6, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));    
	    	world.register(new Block(new Box(new Vector(14, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));    
	    	world.register(new Block(new Box(new Vector(20, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));   
	    	world.register(new Block(new Box(new Vector(10, 0), 2, 6), world.getLoader().getSprite("grass.center1_3")));    
	    	world.register(new Block(new Box(new Vector(10, 4), 2, 2), world.getLoader().getSprite("grass.middle")));    
	    	world.register(new Block(new Box(new Vector(-6, -6), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(0, -6), 6, 6), world.getLoader().getSprite("grass.center3")));    	    	
	    	world.register(new Block(new Box(new Vector(6, -6), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(14, -6), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(20, -6), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(10, -6), 2, 6), world.getLoader().getSprite("grass.center1_3")));    
	    	
	    	
	    	world.register(new BlockDeco(new Vector(0, 3.5), 1, 1, world.getLoader(), "foliagePack_001"));
	    	world.register(new BlockDeco(new Vector(14, 3.5), 1, 1, world.getLoader(), "foliagePack_001"));
	    	world.register(new BlockDeco(new Vector(-4, 3.5), 1, 1, world.getLoader(), "foliagePack_004"));
	    	world.register(new BlockDeco(new Vector(6, 7), 9, 5, world.getLoader(), "foliagePack_008"));
	    	world.register(new BlockDeco(new Vector(5, 3.5), 1, 1, world.getLoader(), "mushroomRed"));
	    	world.register(new BlockDeco(new Vector(7.5, 3.5), 1, 1, world.getLoader(), "mushroomBrown"));
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
	    	world.register(new BlockDeco(new Vector(22, 4), 2, 2, world.getLoader(), "foliagePack_leaves_002"));
	    	world.register(new BlockDeco(new Vector(2, 8), 8, 3, world.getLoader(), "hill_largeAlt"));
	    	world.register(new BlockDeco(new Vector(-2, 6), 6, 2, world.getLoader(), "hill_largeAlt"));
	    	world.register(new BlockDeco(new Vector(0, 8), 10, 3, world.getLoader(), "hill_largeAlt"));
	    








	    														// Jump

	    	world.register(new Block(new Box(new Vector(34, 8), 6, 6), world.getLoader().getSprite("grass.center3")));  
	    	world.register(new Block(new Box(new Vector(34, 14), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(34, 2), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(34, -4), 6, 6), world.getLoader().getSprite("grass.center3")));   
	    	world.register(new Block(new Box(new Vector(34, -6), 6, 6), world.getLoader().getSprite("grass.center3")));   
	    	world.register(new Block(new Box(new Vector(38, 18), 6, 6), world.getLoader().getSprite("grass.center3")));   
	    	world.register(new Block(new Box(new Vector(38, 12), 6, 6), world.getLoader().getSprite("grass.center3")));   
	    	world.register(new Block(new Box(new Vector(38, 6), 6, 6), world.getLoader().getSprite("grass.center3")));   
	    	world.register(new Block(new Box(new Vector(38, 0), 6, 6), world.getLoader().getSprite("grass.center3")));   
	    	world.register(new Block(new Box(new Vector(38, -6), 6, 6), world.getLoader().getSprite("grass.center3")));   
	    	world.register(new Block(new Box(new Vector(42, -6), 6, 6), world.getLoader().getSprite("grass.center3")));   
	    	world.register(new Block(new Box(new Vector(34, 20), 6, 6), world.getLoader().getSprite("grass.middle.center3")));    
	    	world.register(new Block(new Box(new Vector(23, 18), 2, 6), world.getLoader().getSprite("grass.center1_3")));    
	    	world.register(new Block(new Box(new Vector(23, 24), 2, 6), world.getLoader().getSprite("grass.middle1_3")));    
	    	
	    	
	    	


	    														// Exit
	    	
	    	world.register(new Block(new Box(new Vector(30, 22), 2, 2), world.getLoader().getSprite("grassCliffLeft")));    
	    	world.register(new Block(new Box(new Vector(36, 22), 6, 2), world.getLoader().getSprite("grass.middle3")));    
	    	world.register(new Block(new Box(new Vector(42, 20), 6, 6), world.getLoader().getSprite("grass.middle.center3")));    
	    	world.register(new Block(new Box(new Vector(42, 14), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(42, 8), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(42, 2), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(42, -4), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(50, 20), 6, 6), world.getLoader().getSprite("grass.middle.center3")));    
	    	world.register(new Block(new Box(new Vector(50, 14), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(50, 10), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	Locker locker1 = new Locker(new Vector(46.5, 22.5), world.getLoader(), Locker.blue, key);
	    	world.register(locker1);
	    	world.register(new Locker(new Vector(45.5, 22.5), world.getLoader(), Locker.blue, locker1, true));
	    	world.register(new Block(new Box(new Vector(56, 22), 6, 6), world.getLoader().getSprite("grass.middle.center3")));    
	    	world.register(new Block(new Box(new Vector(62, 22), 6, 6), world.getLoader().getSprite("grass.center3")));   
	    	world.register(new Block(new Box(new Vector(62, 18), 6, 6), world.getLoader().getSprite("grass.center3")));   
	    	world.register(new Block(new Box(new Vector(62, 26), 6, 6), world.getLoader().getSprite("grass.center3")));   
	    	world.register(new Block(new Box(new Vector(62, 32), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(56, 32), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(68, 32), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(68, 26), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(68, 38), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(56, 38), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(62, 38), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(68, 22), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(68, 16), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(56, 16), 6, 6), world.getLoader().getSprite("grass.center3"))); 
	    	world.register(new Block(new Box(new Vector(56, 10), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(56, 2), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(56, -4), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(50, -4), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(50, 2), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(46, 2), 2, 6), world.getLoader().getSprite("grass.center1_3")));    
	    	world.register(new Block(new Box(new Vector(46, -4), 2, 6), world.getLoader().getSprite("grass.center1_3")));    
	    	world.register(new Block(new Box(new Vector(62, 2), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(62, -4), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(62, 8), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(62, 14), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(68, 14), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(68, 8), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(68, 2), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(68, -4), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Exit(new Vector(58, 6), 1, 2, world.getLoader(), key));

	    	world.register(new BlockDeco(new Vector(30, 24), 2, 2, world.getLoader(), "foliagePack_leaves_044"));
	    	world.register(new BlockDeco(new Vector(52, 24), 2, 2, world.getLoader(), "foliagePack_leaves_002"));
	    	world.register(new BlockDeco(new Vector(41, 24), 2, 20, world.getLoader(), "longbush2"));
	    	world.register(new BlockDeco(new Vector(56, 27), 6, 6, world.getLoader(), "brickWall"));
	    	world.register(new BlockDeco(new Vector(50, 13), 20, 20, world.getLoader(), "brickWall"));



	    	









	    	


	        
	        
	 }
	
	
	
	
	
	
	
	
}
