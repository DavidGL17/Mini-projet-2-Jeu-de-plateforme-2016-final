package platform.game.Actors.levels;

import platform.game.World;
import platform.game.Actors.Exit;
import platform.game.Actors.Heart;
import platform.game.Actors.Jumper;
import platform.game.Actors.Lever;
import platform.game.Actors.LimiteTangible;
import platform.game.Actors.Limits;
import platform.game.Actors.Overlay;
import platform.game.Actors.Player;
import platform.game.Actors.Spikedroite;
import platform.game.Actors.Spikegauche;
import platform.game.Actors.Spikes;
import platform.game.Actors.blocks.Block;
import platform.game.Actors.blocks.BlockDeco;
import platform.game.Actors.blocks.Mover;
import platform.util.Box;
import platform.util.Vector;

public class Level_03 extends Level{
	 @Override
	    public void register(World world) {
	        super.register(world);
	
	
	Player franky = new Player(new Vector(0, -4), new Vector(0, 0), world.getLoader());
	world.register(franky);
	Overlay overlayfranky = new Overlay(franky);
	world.register(overlayfranky);
	world.register(new Limits(new Box(new Vector(0, -42) , 1000, 5)));
    world.register(new LimiteTangible(new Vector(-2, 0), 2, 30));


	
													// Hill
	world.register(new Block(new Box(new Vector(29, 2), 2, 2), world.getLoader().getSprite("grassHalfLeft")));  
	world.register(new Block(new Box(new Vector(31, 2), 2, 2), world.getLoader().getSprite("grassHalfRight")));  
	world.register(new Block(new Box(new Vector(-12, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));  
	world.register(new Block(new Box(new Vector(-18, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));   
	world.register(new Block(new Box(new Vector(-24, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));   
	world.register(new Block(new Box(new Vector(-6, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));   
	world.register(new Block(new Box(new Vector(0, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));   
	world.register(new Block(new Box(new Vector(6, -2), 6, 6), world.getLoader().getSprite("grass.middle.center3")));   
	world.register(new Block(new Box(new Vector(12, -2), 6, 6), world.getLoader().getSprite("grass.middle.center3")));   
	world.register(new Block(new Box(new Vector(18, -2), 6, 6), world.getLoader().getSprite("grass.middle.center3")));   
	world.register(new Block(new Box(new Vector(24, -2), 6, 6), world.getLoader().getSprite("grass.middle.center3")));   
	world.register(new Block(new Box(new Vector(30, -2), 6, 6), world.getLoader().getSprite("grass.center3")));  
	world.register(new Block(new Box(new Vector(30, 2), 6, 6), world.getLoader().getSprite("grass.middle.center3")));  
	world.register(new Block(new Box(new Vector(30, -4), 6, 6), world.getLoader().getSprite("grass.center3")));   
	world.register(new Block(new Box(new Vector(30, -10), 6, 6), world.getLoader().getSprite("grass.center3")));   
	world.register(new Block(new Box(new Vector(30, -16), 6, 6), world.getLoader().getSprite("grass.center3")));   
	world.register(new Block(new Box(new Vector(30, -22), 6, 6), world.getLoader().getSprite("grass.center3")));   
	world.register(new Block(new Box(new Vector(30, -28), 6, 6), world.getLoader().getSprite("grass.center3")));   
	world.register(new Block(new Box(new Vector(30, -34), 6, 6), world.getLoader().getSprite("grass.center3")));   
	world.register(new Block(new Box(new Vector(30, -36), 6, 6), world.getLoader(). getSprite("grass.center3")));  
	world.register(new Block(new Box(new Vector(0, -6), 6, 6), world.getLoader().getSprite("grass.center3")));   
	world.register(new Block(new Box(new Vector(-6, -6), 6, 6), world.getLoader().getSprite("grass.center3")));   
	world.register(new Block(new Box(new Vector(-12, -6), 6, 6), world.getLoader().getSprite("grass.center3")));   
	world.register(new Block(new Box(new Vector(-18, -6), 6, 6), world.getLoader().getSprite("grass.center3")));   
	world.register(new Block(new Box(new Vector(-24, -6), 6, 6), world.getLoader().getSprite("grass.center3")));   
	world.register(new Block(new Box(new Vector(6, -8), 6, 6), world.getLoader().getSprite("grass.center3")));   
	world.register(new Block(new Box(new Vector(12, -8), 6, 6), world.getLoader().getSprite("grass.center3")));   
	world.register(new Block(new Box(new Vector(18, -8), 6, 6), world.getLoader().getSprite("grass.center3")));   
	world.register(new Block(new Box(new Vector(24, -8), 6, 6), world.getLoader().getSprite("grass.center3")));   
	world.register(new Block(new Box(new Vector(24, -14), 6, 6), world.getLoader().getSprite("grass.center3")));   
	world.register(new Block(new Box(new Vector(24, -20), 6, 6), world.getLoader().getSprite("grass.center3")));   
	world.register(new Block(new Box(new Vector(24, -26), 6, 6), world.getLoader().getSprite("grass.center3")));   
	world.register(new Block(new Box(new Vector(24, -32), 6, 6), world.getLoader().getSprite("grass.center3")));   
	world.register(new Block(new Box(new Vector(24, -36), 6, 6), world.getLoader().getSprite("grass.center3")));   
	world.register(new Block(new Box(new Vector(18, -14), 6, 6), world.getLoader().getSprite("grass.center3")));   
	world.register(new Block(new Box(new Vector(18, -20), 6, 6), world.getLoader().getSprite("grass.center3")));   
	world.register(new Block(new Box(new Vector(18, -26), 6, 6), world.getLoader().getSprite("grass.center3")));   
	world.register(new Block(new Box(new Vector(18, -32), 6, 6), world.getLoader().getSprite("grass.center3")));   
	world.register(new Block(new Box(new Vector(18, -36), 6, 6), world.getLoader().getSprite("grass.center3")));   
	world.register(new Jumper(new Vector(14, 2), world.getLoader()));
	world.register(new Spikes(new Vector(15.5, 1.5), world.getLoader()));
	world.register(new Spikes(new Vector(17, 1.5), world.getLoader()));
	world.register(new Spikes(new Vector(18.5, 1.5), world.getLoader()));
	world.register(new Spikes(new Vector(20, 1.5), world.getLoader()));
	world.register(new Spikes(new Vector(21.5, 1.5), world.getLoader()));
	world.register(new Spikes(new Vector(23, 1.5), world.getLoader()));
	world.register(new Spikes(new Vector(24.5, 1.5), world.getLoader()));
	world.register(new Spikes(new Vector(26, 1.5), world.getLoader()));	

	world.register(new BlockDeco(new Vector(2, 3.5), 1, 1, world.getLoader(), "foliagePack_001"));
	world.register(new BlockDeco(new Vector(29, 5.5), 1, 1, world.getLoader(), "foliagePack_020"));
	world.register(new BlockDeco(new Vector(-4, 3.5), 1, 1, world.getLoader(), "foliagePack_004"));
	world.register(new BlockDeco(new Vector(9, 5), 9, 5, world.getLoader(), "foliagePack_008"));
	world.register(new BlockDeco(new Vector(5, 1.5), 1, 1, world.getLoader(), "mushroomRed"));
	world.register(new BlockDeco(new Vector(10, 1.5), 1, 1, world.getLoader(), "mushroomBrown"));
	world.register(new BlockDeco(new Vector(-7, 4), 2, 20, world.getLoader(), "longbush2"));
	world.register(new BlockDeco(new Vector(4, 4), 2, 2, world.getLoader(), "foliagePack_leaves_002"));
	world.register(new BlockDeco(new Vector(4, 2), 2, 2, world.getLoader(), "foliagePack_leaves_022"));
	world.register(new BlockDeco(new Vector(5, 2), 2, 2, world.getLoader(), "foliagePack_leaves_001"));
	world.register(new BlockDeco(new Vector(7, 2), 2, 2, world.getLoader(), "foliagePack_leaves_001"));
	world.register(new BlockDeco(new Vector(18, 2), 2, 20, world.getLoader(), "longbush2"));
	world.register(new BlockDeco(new Vector(35, 0), 8, 12, world.getLoader(), "Background3_86"));
	world.register(new BlockDeco(new Vector(1, 4), 13, 3, world.getLoader(), "hill_largeAlt"));
	world.register(new BlockDeco(new Vector(3, 6), 17, 4, world.getLoader(), "hill_largeAlt"));
	world.register(new BlockDeco(new Vector(30, 6), 3, 4, world.getLoader(), "foliagePack_059"));

	world.register(new BlockDeco(new Vector(35, -8), 8, 12, world.getLoader(), "Background3_86"));
	world.register(new BlockDeco(new Vector(35, -16), 8, 12, world.getLoader(), "Background3_86"));
	world.register(new BlockDeco(new Vector(31, -22), 8, 12, world.getLoader(), "Background3_86"));
	world.register(new BlockDeco(new Vector(31, -28), 8, 12, world.getLoader(), "Background3_86"));
	world.register(new BlockDeco(new Vector(35, -34), 8, 12, world.getLoader(), "Background3_86"));
	world.register(new BlockDeco(new Vector(35, -35), 8, 12, world.getLoader(), "Background3_86"));







													//Outside Castle
	
	world.register(new Block(new Box(new Vector(40, -4), 6, 6), world.getLoader().getSprite("castle.middle.left3"))); 
	world.register(new Block(new Box(new Vector(40, 2), 6, 6), world.getLoader().getSprite("castle.middle.left3")));   
	world.register(new Block(new Box(new Vector(40, 8), 6, 6), world.getLoader().getSprite("castle.middle.left3")));   
	world.register(new Block(new Box(new Vector(40, 14), 6, 6), world.getLoader().getSprite("castle.middle.left3")));   
	world.register(new Block(new Box(new Vector(40, 20), 6, 6), world.getLoader().getSprite("castle.middle.left3")));   
	world.register(new Block(new Box(new Vector(40, -10), 6, 6), world.getLoader().getSprite("castle.middle.left3")));   
	world.register(new Block(new Box(new Vector(40, -16), 6, 6), world.getLoader().getSprite("castle.middle.left3")));   
	world.register(new Block(new Box(new Vector(40, -22), 6, 6), world.getLoader().getSprite("castle.middle.left3")));   
	world.register(new Block(new Box(new Vector(40, -30), 6, 6), world.getLoader().getSprite("castle.middle.left3")));   
	world.register(new Block(new Box(new Vector(40, -36), 6, 6), world.getLoader().getSprite("castle.middle.left3")));   
	world.register(new Spikegauche(new Vector(36.5, 7.5), world.getLoader()));
	world.register(new Spikegauche(new Vector(36.5, 9), world.getLoader()));
	world.register(new Spikegauche(new Vector(36.5, 10.5), world.getLoader()));
	world.register(new Spikegauche(new Vector(36.5, 12), world.getLoader()));
	world.register(new Spikegauche(new Vector(36.5, 13.5), world.getLoader()));
	world.register(new Spikegauche(new Vector(36.5, 15), world.getLoader()));
	world.register(new Spikegauche(new Vector(36.5, 16.5), world.getLoader()));
	world.register(new Spikegauche(new Vector(36.5, 6), world.getLoader()));
	world.register(new Spikegauche(new Vector(36.5, 4.5), world.getLoader()));
	world.register(new Spikegauche(new Vector(36.5, 3), world.getLoader()));
	world.register(new Spikedroite(new Vector(33.5, -3), world.getLoader()));
	world.register(new Spikedroite(new Vector(33.5, -4.5), world.getLoader()));
	world.register(new Spikedroite(new Vector(33.5, -6), world.getLoader()));
	world.register(new Spikedroite(new Vector(33.5, -7.5), world.getLoader()));
	world.register(new Spikegauche(new Vector(36.5, -11.5), world.getLoader()));
	world.register(new Spikegauche(new Vector(36.5, -13), world.getLoader()));
	world.register(new Spikegauche(new Vector(36.5, -14.5), world.getLoader()));
	world.register(new Spikedroite(new Vector(33.5, -17), world.getLoader()));
	world.register(new Spikedroite(new Vector(33.5, -18.5), world.getLoader()));
	world.register(new Spikedroite(new Vector(33.5, -19.5), world.getLoader()));
	world.register(new Spikegauche(new Vector(36.5, -22), world.getLoader()));
	world.register(new Spikegauche(new Vector(36.5, -23.5), world.getLoader()));

	world.register(new Spikegauche(new Vector(36.5, -28.5), world.getLoader()));
	world.register(new Spikegauche(new Vector(36.5, -30), world.getLoader()));

													//Inside Castle
	
	world.register(new Heart(new Vector(38, -26), world.getLoader()));
	world.register(new Block(new Box(new Vector(46, -16), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Block(new Box(new Vector(46, -22), 6, 6), world.getLoader().getSprite("castle.center3")));   
	world.register(new Block(new Box(new Vector(46, -30), 6, 6), world.getLoader().getSprite("castle.center3")));   
	world.register(new Block(new Box(new Vector(46, -36), 6, 6), world.getLoader().getSprite("castle.center3")));   
	world.register(new Block(new Box(new Vector(52, -36), 6, 6), world.getLoader().getSprite("castle.center3")));   
	world.register(new Block(new Box(new Vector(52, -30), 6, 6), world.getLoader().getSprite("castle.center3")));   
	world.register(new Block(new Box(new Vector(52, -22), 6, 6), world.getLoader().getSprite("castle.center3")));   
	world.register(new Block(new Box(new Vector(52, -16), 6, 6), world.getLoader().getSprite("castle.center3")));  
	Lever lever = new Lever(new Vector(60.5, -26), world.getLoader(), "leverdroiteright", "leverdroite.left");
	world.register(lever);
	world.register(new Mover(new Vector(58, -28), new Vector(58, -2), 6, 2,1.0, world.getLoader(), lever, "mover"));
	world.register(new Block(new Box(new Vector(58, -30), 6, 6), world.getLoader().getSprite("castle.center3")));   
	world.register(new Block(new Box(new Vector(58, -36), 6, 6), world.getLoader().getSprite("castle.center3")));   
	world.register(new Block(new Box(new Vector(58, -42), 6, 6), world.getLoader().getSprite("castle.center3")));   
	world.register(new Block(new Box(new Vector(46, -16), 6, 6), world.getLoader().getSprite("castle.center3")));   
	world.register(new Block(new Box(new Vector(64, -4), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Block(new Box(new Vector(64, -10), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Block(new Box(new Vector(64, -16), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Block(new Box(new Vector(64, -22), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Block(new Box(new Vector(64, -28), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Block(new Box(new Vector(64, -34), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Block(new Box(new Vector(52, -10), 6, 6), world.getLoader().getSprite("castle.center3")));   
	world.register(new Block(new Box(new Vector(52, -4), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Block(new Box(new Vector(52, 2), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Block(new Box(new Vector(52, 8), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Block(new Box(new Vector(52, 14), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Block(new Box(new Vector(52, 20), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Block(new Box(new Vector(46, 20), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Block(new Box(new Vector(46, 14), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Block(new Box(new Vector(46, 8), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Block(new Box(new Vector(46, 2), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Block(new Box(new Vector(46, -4), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Block(new Box(new Vector(46, -10), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Block(new Box(new Vector(58, 7), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Block(new Box(new Vector(64, 7), 6, 6), world.getLoader().getSprite("castle.center3")));   
	world.register(new Block(new Box(new Vector(68, 7), 6, 6), world.getLoader().getSprite("castle.center3")));  
	world.register(new Block(new Box(new Vector(70, 2), 6, 6), world.getLoader().getSprite("castle.center3")));  
	world.register(new Block(new Box(new Vector(70, 12), 6, 6), world.getLoader().getSprite("castle.center3"))); 
	world.register(new Block(new Box(new Vector(64, 12), 6, 6), world.getLoader().getSprite("castle.center3")));  
	world.register(new Block(new Box(new Vector(58, 12), 6, 6), world.getLoader().getSprite("castle.center3")));  


	world.register(new Block(new Box(new Vector(82, 2), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Block(new Box(new Vector(82, 8), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Block(new Box(new Vector(82, -4), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Block(new Box(new Vector(82, -10), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Block(new Box(new Vector(82, 14), 6, 6), world.getLoader().getSprite("castle.center3")));   	

	world.register(new Block(new Box(new Vector(70, 7), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Block(new Box(new Vector(70, -4), 6, 6), world.getLoader().getSprite("castle.center3")));   
	world.register(new Block(new Box(new Vector(70, -10), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Block(new Box(new Vector(70, -16), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Block(new Box(new Vector(70, -22), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Block(new Box(new Vector(70, -28), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Block(new Box(new Vector(70, -34), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Block(new Box(new Vector(76, 2), 6, 6), world.getLoader().getSprite("castle.center3")));   
	world.register(new Block(new Box(new Vector(76, 8), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Block(new Box(new Vector(76, 14), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Block(new Box(new Vector(76, 20), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Block(new Box(new Vector(76, -4), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Block(new Box(new Vector(76, -10), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Block(new Box(new Vector(76, -16), 6, 6), world.getLoader().getSprite("castle.center3")));   
	world.register(new Block(new Box(new Vector(76, -22), 6, 6), world.getLoader().getSprite("castle.center3")));   
	world.register(new Block(new Box(new Vector(76, -28), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Block(new Box(new Vector(76, -34), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Block(new Box(new Vector(76, -40), 6, 6), world.getLoader().getSprite("castle.center3")));   	


	world.register(new Block(new Box(new Vector(76, -12), 6, 6), world.getLoader().getSprite("castle.center3")));   	
	world.register(new Exit(new Vector(65, 0), 1.5, 2, world.getLoader(), lever));
	
	world.register(new BlockDeco(new Vector(43, -26), 8, 12, world.getLoader(), "bg_castle3"));
	world.register(new BlockDeco(new Vector(55, -26), 8, 12, world.getLoader(), "bg_castle3"));
	world.register(new BlockDeco(new Vector(55, -20), 8, 12, world.getLoader(), "bg_castle3"));
	world.register(new BlockDeco(new Vector(55, -14), 8, 12, world.getLoader(), "bg_castle3"));
	world.register(new BlockDeco(new Vector(55, -8), 8, 12, world.getLoader(), "bg_castle3"));
	world.register(new BlockDeco(new Vector(55, -2), 8, 12, world.getLoader(), "bg_castle3"));
	world.register(new BlockDeco(new Vector(61, 3), 8, 12, world.getLoader(), "bg_castle3"));





	
	
												// Background
	
		world.register(new BlockDeco(new Vector(12, 0), 30, 50, world.getLoader(), "Background_173"));
		world.register(new BlockDeco(new Vector(-38, 0), 30, 50, world.getLoader(), "Background_173"));
		world.register(new BlockDeco(new Vector(6, 0), 500, 500, world.getLoader(), "Background2_1"));


	 }
}
