package platform.game.Actors.levels;

import platform.game.Actors.Exit;
import platform.game.Actors.Jumper;
import platform.game.Actors.Key;
import platform.game.Actors.LimiteTangible;
import platform.game.Actors.Limits;
import platform.game.Actors.Overlay;
import platform.game.Actors.Player;
import platform.game.Actors.SignalAlternant;
import platform.game.Actors.SignalInvisibleConstant;
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
	    	Player franky = new Player(new Vector(0, -4), new Vector(324, 4), world.getLoader());
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
	    	world.register(new BlockDeco(new Vector(59, -3), 10, 16, world.getLoader(), "Background2_84"));

		    world.register(new Block(new Box(new Vector(70, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));   
		    world.register(new Block(new Box(new Vector(70, -6), 6, 6), world.getLoader().getSprite("grass.center3")));   
		    world.register(new Block(new Box(new Vector(70, -12), 6, 6), world.getLoader().getSprite("grass.center3")));   
	    	world.register(new BlockDeco(new Vector(76, -3), 10, 16, world.getLoader(), "Background2_84"));
		 
		    world.register(new Block(new Box(new Vector(86, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));   
		    world.register(new Block(new Box(new Vector(86, -6), 6, 6), world.getLoader().getSprite("grass.center3")));   
		    world.register(new Block(new Box(new Vector(86, -12), 6, 6), world.getLoader().getSprite("grass.center3")));
	    	world.register(new BlockDeco(new Vector(92, -3), 10, 16, world.getLoader(), "Background2_84"));

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
	    	world.register(new Mover(new Vector(130, 10), new Vector(140, 0), 6, 2,1, world.getLoader(), signal, "mover"));
	    	world.register(new BlockDeco(new Vector(139, -3), 10, 16, world.getLoader(), "Background2_84"));
	    	world.register(new BlockDeco(new Vector(123, -3), 10, 16, world.getLoader(), "Background2_84"));
	    	world.register(new BlockDeco(new Vector(110, -3), 10, 16, world.getLoader(), "Background2_84"));

		    world.register(new Block(new Box(new Vector(144, 0), 2, 6), world.getLoader().getSprite("grass.middle1_3")));
		    world.register(new Block(new Box(new Vector(144, -6), 2, 6), world.getLoader().getSprite("grass.center1_3")));
		    world.register(new Block(new Box(new Vector(144, -12), 2, 6), world.getLoader().getSprite("grass.center1_3")));
	    	world.register(new BlockDeco(new Vector(151, -3), 10, 16, world.getLoader(), "Background2_84"));

		    world.register(new Block(new Box(new Vector(152, 0), 2, 6), world.getLoader().getSprite("grass.middle1_3")));
		    world.register(new Block(new Box(new Vector(152, -6), 2, 6), world.getLoader().getSprite("grass.center1_3")));
		    world.register(new Block(new Box(new Vector(152, -12), 2, 6), world.getLoader().getSprite("grass.center1_3")));

		    world.register(new Block(new Box(new Vector(160, 0), 2, 6), world.getLoader().getSprite("grass.middle1_3")));
		    world.register(new Block(new Box(new Vector(160, -6), 2, 6), world.getLoader().getSprite("grass.center1_3")));
		    world.register(new Block(new Box(new Vector(160, -12), 2, 6), world.getLoader().getSprite("grass.center1_3")));
	    
		    world.register(new Mover(new Vector(170, 2), new Vector(170, 12), 2, 6,1, world.getLoader(), signal, "grass.middle1_3"));
		    world.register(new Mover(new Vector(180, 2), new Vector(180, 12), 2, 6,1, world.getLoader(), signal2, "grass.middle1_3"));
		    world.register(new Mover(new Vector(190, 2), new Vector(190, 12), 2, 6,1, world.getLoader(), signal, "grass.middle1_3"));
		    										
		    										// Partie 3
		    
		    world.register(new Block(new Box(new Vector(212, 0), 6, 6), world.getLoader().getSprite("grass.center3")));   
		    world.register(new Block(new Box(new Vector(212, -6), 6, 6), world.getLoader().getSprite("grass.center3")));   
		    world.register(new Block(new Box(new Vector(212, -12), 6, 6), world.getLoader().getSprite("grass.center3")));   
	   
		    world.register(new BlockDeco(new Vector(217, 4), 10, 16, world.getLoader(), "Background3_86"));
	    	world.register(new BlockDeco(new Vector(233, 4), 10, 16, world.getLoader(), "Background3_86"));
	    	world.register(new BlockDeco(new Vector(217, -6), 10, 16, world.getLoader(), "Background3_86"));
	    	world.register(new BlockDeco(new Vector(233, -6), 10, 16, world.getLoader(), "Background3_86"));
	    	world.register(new BlockDeco(new Vector(233, 14), 10, 16, world.getLoader(), "Background3_86"));

	    	world.register(new BlockDeco(new Vector(249, 4), 10, 16, world.getLoader(), "Background3_86"));
	    	world.register(new BlockDeco(new Vector(249, -6), 10, 16, world.getLoader(), "Background3_86"));
	    	world.register(new BlockDeco(new Vector(249, 14), 10, 16, world.getLoader(), "Background3_86"));
	    	world.register(new BlockDeco(new Vector(265, 4), 10, 16, world.getLoader(), "Background3_86"));
	    	world.register(new BlockDeco(new Vector(265, 14), 10, 16, world.getLoader(), "Background3_86"));
	    	world.register(new BlockDeco(new Vector(265, -6), 10, 16, world.getLoader(), "Background3_86"));

		    world.register(new Block(new Box(new Vector(210, 10), 2, 2), world.getLoader().getSprite("grassHillLeft")));   
		    world.register(new Block(new Box(new Vector(212, 12), 2, 2), world.getLoader().getSprite("grassHillLeft")));   
		    world.register(new Block(new Box(new Vector(214, 14), 2, 2), world.getLoader().getSprite("grassHillLeft")));   
		    world.register(new Block(new Box(new Vector(212, 10), 2, 2), world.getLoader().getSprite("grass.center")));   
		    world.register(new Block(new Box(new Vector(214, 10), 2, 2), world.getLoader().getSprite("grass.center")));   
		    world.register(new Block(new Box(new Vector(214, 12), 2, 2), world.getLoader().getSprite("grass.center")));   

	    	world.register(new BlockDeco(new Vector(223, 10), 10, 16, world.getLoader(), "Background3_86"));

		    world.register(new Block(new Box(new Vector(231, 10), 16, 2), world.getLoader().getSprite("grassCenter.8")));   
		    world.register(new Block(new Box(new Vector(247, 10), 16, 2), world.getLoader().getSprite("grassCenter.8")));   
		    world.register(new Block(new Box(new Vector(263, 10), 16, 2), world.getLoader().getSprite("grassCenter.8")));   
		    world.register(new Block(new Box(new Vector(231, 12), 16, 2), world.getLoader().getSprite("grassCenter.8")));   
		    world.register(new Block(new Box(new Vector(247, 12), 16, 2), world.getLoader().getSprite("grassCenter.8")));   
		    world.register(new Block(new Box(new Vector(263, 12), 16, 2), world.getLoader().getSprite("grassCenter.8")));   

		    
		    world.register(new Block(new Box(new Vector(216, 16), 2, 2), world.getLoader().getSprite("grassHillLeft")));   
		    world.register(new Block(new Box(new Vector(218, 18), 2, 2), world.getLoader().getSprite("grassHillLeft")));   
		    world.register(new Block(new Box(new Vector(220, 20), 2, 2), world.getLoader().getSprite("grassHillLeft")));   
		    world.register(new Block(new Box(new Vector(218, 16), 2, 2), world.getLoader().getSprite("grass.center")));   
		    world.register(new Block(new Box(new Vector(220, 16), 2, 2), world.getLoader().getSprite("grass.center")));   
		    world.register(new Block(new Box(new Vector(220, 18), 2, 2), world.getLoader().getSprite("grass.center")));
	    	world.register(new Block(new Box(new Vector(224, 18), 6, 6), world.getLoader().getSprite("grass.middle.center3")));    	    	
	    	world.register(new Block(new Box(new Vector(230, 18), 6, 6), world.getLoader().getSprite("grass.middle.center3")));    	    	
	    	world.register(new Block(new Box(new Vector(236, 18), 6, 6), world.getLoader().getSprite("grass.middle.center3")));    	    	
	    	world.register(new Block(new Box(new Vector(242, 18), 6, 6), world.getLoader().getSprite("grass.middle.center3")));    	    	
	    	world.register(new Block(new Box(new Vector(248, 18), 6, 6), world.getLoader().getSprite("grass.middle.center3")));    	    	
	    	world.register(new Block(new Box(new Vector(254, 18), 6, 6), world.getLoader().getSprite("grass.middle.center3")));    	    	
	    	world.register(new Block(new Box(new Vector(260, 18), 6, 6), world.getLoader().getSprite("grass.middle.center3")));    	    	
	    	world.register(new Block(new Box(new Vector(266, 18), 6, 6), world.getLoader().getSprite("grass.middle.center3")));    	    	


		    

//	    	SignalAlternant signal3 = new SignalAlternant(2);
//	    	world.register(signal3);
//	    	
//		    world.register(new Mover(new Vector(218, 0), new Vector(218, 30), 6, 2, 0.2, world.getLoader(), signal3, "mover"));
//		    world.register(new Mover(new Vector(218, -5), new Vector(218, 25), 6, 2, 0.2, world.getLoader(), signal3, "mover"));

		    world.register(new Block(new Box(new Vector(226, 0), 6, 6), world.getLoader().getSprite("grass.center3")));   
		    world.register(new Block(new Box(new Vector(226, -6), 6, 6), world.getLoader().getSprite("grass.center3")));   
		    world.register(new Block(new Box(new Vector(226, -12), 6, 6), world.getLoader().getSprite("grass.center3")));   

		    world.register(new Block(new Box(new Vector(240, 0), 2, 6), world.getLoader().getSprite("grass.center1_3")));   
		    world.register(new Block(new Box(new Vector(240, -6), 2, 6), world.getLoader().getSprite("grass.center1_3")));   
		    world.register(new Block(new Box(new Vector(240, -12), 2, 6), world.getLoader().getSprite("grass.center1_3")));   

		    world.register(new Block(new Box(new Vector(250, 0), 1, 6), world.getLoader().getSprite("grass.center1_3")));   
		    world.register(new Block(new Box(new Vector(250, -6), 1, 6), world.getLoader().getSprite("grass.center1_3")));   
		    world.register(new Block(new Box(new Vector(250, -12), 1, 6), world.getLoader().getSprite("grass.center1_3")));   

		    world.register(new Block(new Box(new Vector(260, 0), 1, 6), world.getLoader().getSprite("grass.center1_3")));   
		    world.register(new Block(new Box(new Vector(260, -6), 1, 6), world.getLoader().getSprite("grass.center1_3")));   
		    world.register(new Block(new Box(new Vector(260, -12), 1, 6), world.getLoader().getSprite("grass.center1_3")));   

	    	world.register(new Block(new Box(new Vector(270, 0), 6, 6), world.getLoader().getSprite("grass.center3")));    	    	

	    											// Partie 4
	    	
	    	world.register(new Block(new Box(new Vector(270, -6), 6, 6), world.getLoader().getSprite("grass.center3")));    	    	
	    	world.register(new Block(new Box(new Vector(270, -12), 6, 6), world.getLoader().getSprite("grass.center3")));  
	    	world.register(new Block(new Box(new Vector(272, 10), 2, 2), world.getLoader().getSprite("grass.center")));    	    	
	    	world.register(new Block(new Box(new Vector(272, 12), 2, 2), world.getLoader().getSprite("grass.center")));    	    	
	    	
	    	world.register(new Block(new Box(new Vector(276, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));    	    	
	    	world.register(new Block(new Box(new Vector(282, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));    	    	
	    	world.register(new Block(new Box(new Vector(288, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));    	    	

	    	world.register(new Block(new Box(new Vector(283, 14), 4, 2), world.getLoader().getSprite("grass.middle3")));    	    	


	    	world.register(new Block(new Box(new Vector(294, 14), 4, 2), world.getLoader().getSprite("grass.middle3")));    	    	
	    	world.register(new Block(new Box(new Vector(291, 7), 6, 2), world.getLoader().getSprite("grass.middle3")));    	    	
	    	world.register(new Block(new Box(new Vector(297, 7), 6, 2), world.getLoader().getSprite("grass.middle3")));    	    	
		    world.register(new Slime(new Vector(0, 0), new Vector(287, 9),0.05,8, new Box(new Vector(294, 9), 9, 4), loader, 2,2,true));

	    	world.register(new Block(new Box(new Vector(300, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));    	    	

	    	world.register(new Block(new Box(new Vector(304, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));    	    	
	    	world.register(new Block(new Box(new Vector(310, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));    	    	
	    	world.register(new Block(new Box(new Vector(309, 7), 6, 2), world.getLoader().getSprite("grass.middle3")));    	    	
	    	world.register(new Block(new Box(new Vector(309, 12), 6, 2), world.getLoader().getSprite("grass.middle3")));    	    	
		    world.register(new Slime(new Vector(0, 0), new Vector(307, 9),0.05,8, new Box(new Vector(309, 9), 3, 2), loader, 2,2,true));
		    world.register(new Slime(new Vector(0, 0), new Vector(309, 4),0.05,8, new Box(new Vector(307, 4), 3, 2), loader, 2,2,true));

	    	world.register(new Block(new Box(new Vector(322, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));    	    	

	    	world.register(new Block(new Box(new Vector(319.5, 3.5), 1, 1), world.getLoader().getSprite("box")));    	    	
	    	world.register(new Block(new Box(new Vector(319.5, 4.5), 1, 1), world.getLoader().getSprite("box")));    	    	
	    	world.register(new Block(new Box(new Vector(319.5, 5.5), 1, 1), world.getLoader().getSprite("box")));    	    	
	    	world.register(new Block(new Box(new Vector(320.5, 3.5), 1, 1), world.getLoader().getSprite("box")));    	    	
	    	world.register(new Block(new Box(new Vector(321.5, 3.5), 1, 1), world.getLoader().getSprite("box")));    	    	
	    	world.register(new Block(new Box(new Vector(320.5, 4.5), 1, 1), world.getLoader().getSprite("box")));    	    	

	    	world.register(new Block(new Box(new Vector(328, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));    	    	
	    	world.register(new Block(new Box(new Vector(334, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));    	    	

	        SignalInvisibleConstant plaque = new SignalInvisibleConstant(new Box(new Vector(318, 0), 2, 100));
	        world.register(plaque);
	    	world.register(new Exit(new Vector(334, 4), 1.5, 2, world.getLoader(), plaque));

	    											// Background
	    	
		    world.register(new BlockDeco(new Vector(6, 2), 20, 60, world.getLoader(), "Background_17"));
		    world.register(new BlockDeco(new Vector(20, 30), 20, 100, world.getLoader(), "Background_112"));
		    world.register(new BlockDeco(new Vector(66, 2), 20, 60, world.getLoader(), "Background_17"));
		    world.register(new BlockDeco(new Vector(131, -2), 20, 60, world.getLoader(), "Background_17"));
		    world.register(new BlockDeco(new Vector(191, -2), 20, 60, world.getLoader(), "Background_17"));
		    world.register(new BlockDeco(new Vector(180, 12), 15, 25, world.getLoader(), "Background_18"));

		    world.register(new BlockDeco(new Vector(250, 0), 500, 505, world.getLoader(), "Background2_1"));
	 }
}
