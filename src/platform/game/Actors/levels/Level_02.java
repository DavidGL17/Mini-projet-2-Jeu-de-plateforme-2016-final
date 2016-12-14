package platform.game.Actors.levels;

import platform.game.World;
import platform.game.Actors.Exit;
import platform.game.Actors.Key;
import platform.game.Actors.LimiteTangible;
import platform.game.Actors.Limits;
import platform.game.Actors.Locker;
import platform.game.Actors.Overlay;
import platform.game.Actors.Player;
import platform.game.Actors.blocks.Block;
import platform.game.Actors.blocks.BlockDeco;
import platform.util.Box;
import platform.util.Vector;

public class Level_02 extends Level{
	 @Override
	    public void register(World world) {
        super.register(world);

		Player franky = new Player(new Vector(0, 1), new Vector(8,0), world.getLoader());
	    world.register(franky);
	    Overlay overlayfranky = new Overlay(franky);
	    world.register(overlayfranky);
	    
	    
	    												//Spawn	
	    world.register(new Limits(new Box(new Vector(0, -19), 300, 1)));
	    world.register(new LimiteTangible(new Vector(7, 0), 2, 30));
	    world.register(new Block(new Box(new Vector(-12, -3), 6, 6), world.getLoader().getSprite("grass.middle.center3")));
	    world.register(new Block(new Box(new Vector(-12, -9), 6, 6), world.getLoader().getSprite("grass.center3")));

	    world.register(new Block(new Box(new Vector(-6, -3), 6, 6), world.getLoader().getSprite("grass.middle.center3")));
	    world.register(new Block(new Box(new Vector(-6, -9), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(-6, -15), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(0, -3), 6, 6), world.getLoader().getSprite("grass.middle.center3")));
	    world.register(new Block(new Box(new Vector(0, -9), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(0, -15), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(6, -3), 6, 6), world.getLoader().getSprite("grass.middle.center3")));
	    world.register(new Block(new Box(new Vector(6, -9), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(6, -15), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(12, -3), 6, 6), world.getLoader().getSprite("grass.middle.center3")));
	    world.register(new Block(new Box(new Vector(12, -9), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(12, -15), 6, 6), world.getLoader().getSprite("grass.center3")));
	    
    	world.register(new BlockDeco(new Vector(5, 1), 2, 3, world.getLoader(), "foliagePack_056"));
    	world.register(new BlockDeco(new Vector(0, 0.5), 1, 1, world.getLoader(), "foliagePack_001"));
    	world.register(new BlockDeco(new Vector(14, 0.5), 1, 1, world.getLoader(), "foliagePack_001"));
    	world.register(new BlockDeco(new Vector(-4, 0.5), 1, 1, world.getLoader(), "foliagePack_004"));
    	world.register(new BlockDeco(new Vector(21, -1.5), 9, 5, world.getLoader(), "foliagePack_008"));
    	world.register(new BlockDeco(new Vector(25, -5.5), 1, 1, world.getLoader(), "mushroomRed"));
    	world.register(new BlockDeco(new Vector(28, -5.5), 1, 1, world.getLoader(), "mushroomBrown"));
    	world.register(new BlockDeco(new Vector(35, 0.5), 1, 1, world.getLoader(), "mushroomRed"));
    	world.register(new BlockDeco(new Vector(38, 0.5), 1, 1, world.getLoader(), "mushroomRed"));
    	world.register(new BlockDeco(new Vector(40, 12.5), 1, 1, world.getLoader(), "foliagePack_001"));
    	world.register(new BlockDeco(new Vector(37, 12.5), 1, 1, world.getLoader(), "foliagePack_001"));
    	world.register(new BlockDeco(new Vector(45, 12.5), 1, 1, world.getLoader(), "foliagePack_003"));
    	world.register(new BlockDeco(new Vector(50, 12.5), 1, 1, world.getLoader(), "foliagePack_002"));
    	world.register(new BlockDeco(new Vector(40, 12.5), 1, 1, world.getLoader(), "foliagePack_001"));
    	world.register(new BlockDeco(new Vector(54, 4.5), 1, 1, world.getLoader(), "mushroomBrown"));
    	world.register(new BlockDeco(new Vector(51.5, 4.5), 1, 1, world.getLoader(), "mushroomBrown"));

    	world.register(new BlockDeco(new Vector(64, 16.5), 9, 5, world.getLoader(), "foliagePack_006"));
    	world.register(new BlockDeco(new Vector(66, 12.5), 1, 1, world.getLoader(), "mushroomRed"));
    	world.register(new BlockDeco(new Vector(68, 12.5), 1, 1, world.getLoader(), "mushroomRed"));

    	world.register(new BlockDeco(new Vector(73, 17), 12, 6, world.getLoader(), "foliagePack_005"));

    	world.register(new BlockDeco(new Vector(5, 1), 2, 20, world.getLoader(), "longbush2"));
    	world.register(new BlockDeco(new Vector(-15, 1), 2, 20, world.getLoader(), "longbush2"));
    	world.register(new BlockDeco(new Vector(25, -5), 2, 20, world.getLoader(), "longbush2"));
    	world.register(new BlockDeco(new Vector(43, 1), 2, 20, world.getLoader(), "longbush2"));
    	world.register(new BlockDeco(new Vector(43, 13), 2, 20, world.getLoader(), "longbush2"));
    	world.register(new BlockDeco(new Vector(63, 13), 2, 20, world.getLoader(), "longbush2"));
    	world.register(new BlockDeco(new Vector(83, 13), 2, 20, world.getLoader(), "longbush2"));
	    world.register(new BlockDeco(new Vector(44, 18), 20, 100, world.getLoader(), "Background_112"));
	    world.register(new BlockDeco(new Vector(44, 15), 15, 4, world.getLoader(), "hill_largeAlt"));
    	world.register(new BlockDeco(new Vector(48, 13), 13, 3, world.getLoader(), "hill_largeAlt"));
    	world.register(new BlockDeco(new Vector(46, 15), 18, 4, world.getLoader(), "hill_largeAlt"));
	    world.register(new BlockDeco(new Vector(4, -1), 20, 30, world.getLoader(), "Background_92"));
		world.register(new BlockDeco(new Vector(8, 7), 8, 3, world.getLoader(), "hill_largeAlt"));
		world.register(new BlockDeco(new Vector(0, 6), 9, 3, world.getLoader(), "hill_largeAlt"));
	    world.register(new BlockDeco(new Vector(6, 10), 8, 20, world.getLoader(), "Cloud_7"));
		world.register(new BlockDeco(new Vector(11, 8), 12, 3, world.getLoader(), "hill_largeAlt"));
    	world.register(new BlockDeco(new Vector(4, 8), 10, 3, world.getLoader(), "hill_largeAlt"));
		world.register(new BlockDeco(new Vector(33, -1), 20, 30, world.getLoader(), "Background_92"));
	    world.register(new BlockDeco(new Vector(54, 8), 8 , 12, world.getLoader(), "Background2_84"));
        world.register(new BlockDeco(new Vector(15, 6), 15, 20, world.getLoader(), "Background_19"));

	    world.register(new BlockDeco(new Vector(40, 18), 500, 500, world.getLoader(), "Background2_1"));
	
	    
	    
	    											//Début du saut
	    world.register(new Block(new Box(new Vector(18, -9), 6, 6), world.getLoader().getSprite("grass.middle.center3")));
	    world.register(new Block(new Box(new Vector(24, -9), 6, 6), world.getLoader().getSprite("grass.middle.center3")));
	    world.register(new Block(new Box(new Vector(18, -15), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(24, -15), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(30, -9), 6, 6), world.getLoader().getSprite("grass.middle.center3")));
	    world.register(new Block(new Box(new Vector(30, -15), 6, 6), world.getLoader().getSprite("grass.center3")));
	    
	    world.register(new Block(new Box(new Vector(36, -3), 6, 6), world.getLoader().getSprite("grass.middle.center3")));
	    world.register(new Block(new Box(new Vector(36, -9), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(36, -15), 6, 6), world.getLoader().getSprite("grass.center3")));
	    
	    world.register(new Block(new Box(new Vector(26, 15), 2, 6), world.getLoader().getSprite("grass.middle1_3")));
	    world.register(new Block(new Box(new Vector(26, 9), 2, 6), world.getLoader().getSprite("grass.center1_3")));
	    world.register(new Block(new Box(new Vector(26, 3), 2, 6), world.getLoader().getSprite("grass.center1_3")));
	    
	    world.register(new Block(new Box(new Vector(36, 9), 6, 6), world.getLoader().getSprite("grass.middle.center3")));
	    world.register(new Block(new Box(new Vector(42, 9), 6, 6), world.getLoader().getSprite("grass.middle.center3")));
	    world.register(new Block(new Box(new Vector(42, 3), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(42, -3), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(42, -9), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(42, -15), 6, 6), world.getLoader().getSprite("grass.center3")));
	    
	    world.register(new Block(new Box(new Vector(48, 9), 6, 6), world.getLoader().getSprite("grass.middle.center3")));
	    world.register(new Block(new Box(new Vector(48, 3), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(48, -3), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(48, -9), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(48, -15), 6, 6), world.getLoader().getSprite("grass.center3")));


	    
	    world.register(new Block(new Box(new Vector(52, -17), 2, 6), world.getLoader().getSprite("grass.center1_3")));
	    world.register(new Block(new Box(new Vector(54, -17), 2, 6), world.getLoader().getSprite("grass.center1_3")));
	    world.register(new Block(new Box(new Vector(52, -11), 2, 6), world.getLoader().getSprite("grass.center1_3")));
	    world.register(new Block(new Box(new Vector(54, -11), 2, 6), world.getLoader().getSprite("grass.center1_3")));
	    world.register(new Block(new Box(new Vector(52, -5), 2, 6), world.getLoader().getSprite("grass.center1_3")));
	    world.register(new Block(new Box(new Vector(54, -5), 2, 6), world.getLoader().getSprite("grass.center1_3")));
	    world.register(new Block(new Box(new Vector(52, 1), 2, 6), world.getLoader().getSprite("grass.center1_3")));
	    world.register(new Block(new Box(new Vector(54, 1), 2, 6), world.getLoader().getSprite("grass.center1_3")));
	    

	    
	    Key keyRed = new Key(new Vector(53, 4.5), world.getLoader(), Key.red);
	    Locker locker1 = new Locker(new Vector(56.5, 12.5), world.getLoader(), Locker.red, keyRed);
	    Locker locker2 = new Locker(new Vector(59.5, 12.5), world.getLoader(), Locker.red, keyRed);
	    Locker locker3 = new Locker(new Vector(56.5, 13.5), world.getLoader(), Locker.red, keyRed);
	    Locker locker4 = new Locker(new Vector(59.5, 13.5), world.getLoader(), Locker.red, keyRed);
	    Locker locker5 = new Locker(new Vector(58.5, 14.5), world.getLoader(), Locker.red, keyRed);
	    Locker locker6 = new Locker(new Vector(57.5, 14.5), world.getLoader(), Locker.red, keyRed);
	    world.register(locker1);
	    world.register(locker2);
	    world.register(locker3);
	    world.register(locker4);
	    world.register(locker5);
	    world.register(locker6);
	    world.register(keyRed);
	    world.register(new Exit(new Vector(58, 13), 1.5, 2, world.getLoader(), keyRed));
	    world.register(new LimiteTangible(new Vector(62, 12), 2, 30));
	    
	    
	    world.register(new Block(new Box(new Vector(58, 9), 6, 6), world.getLoader().getSprite("grass.middle.center3")));
	    world.register(new Block(new Box(new Vector(58, 3), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(58, -3), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(58, -9), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(58, -15), 6, 6), world.getLoader().getSprite("grass.center3")));

	    world.register(new Block(new Box(new Vector(64, 9), 6, 6), world.getLoader().getSprite("grass.middle.center3")));
	    world.register(new Block(new Box(new Vector(64, 3), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(64, -3), 6, 6), world.getLoader().getSprite("grass.center3")));

	    world.register(new Block(new Box(new Vector(70, 9), 6, 6), world.getLoader().getSprite("grass.middle.center3")));
	    world.register(new Block(new Box(new Vector(70, 3), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(70, -3), 6, 6), world.getLoader().getSprite("grass.center3")));

	    world.register(new Block(new Box(new Vector(76, 9), 6, 6), world.getLoader().getSprite("grass.middle.center3")));
	    world.register(new Block(new Box(new Vector(76, 3), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(76, -3), 6, 6), world.getLoader().getSprite("grass.center3")));

	 }
}
