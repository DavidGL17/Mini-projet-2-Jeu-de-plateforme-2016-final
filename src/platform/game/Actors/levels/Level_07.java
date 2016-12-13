package platform.game.Actors.levels;

import platform.game.World;
import platform.game.Actors.Checkpoint;
import platform.game.Actors.Exit;
import platform.game.Actors.Lava;
import platform.game.Actors.Lever;
import platform.game.Actors.Overlay;
import platform.game.Actors.Player;
import platform.game.Actors.blocks.Block;
import platform.game.Actors.blocks.BlockDeco;
import platform.game.Actors.blocks.BlockIndecis;
import platform.game.Actors.monsters.Slime;
import platform.util.Box;
import platform.util.Loader;
import platform.util.Vector;

public class Level_07 extends Level{
	@Override
    public void register(World world) {
		super.register(world);
		Loader loader = world.getLoader();
		Checkpoint checkpoint = new Checkpoint(new Vector(108, 1), loader, "flagBlueHanging", "flagBlue","flagBlue2");
	    world.register(checkpoint);
		Player franky;
		//premier spawn point
		if (!world.getCheckpoint()){
			franky = new Player(new Vector(0, 1), new Vector(0, 0), world.getLoader());
		} else {
			//deuxème spawn point (si le joueur a passer le checkpoint)
			franky = new Player(new Vector(0, 1), new Vector(108, 0), world.getLoader());
		}
	    world.register(franky);
	    Overlay overlayfranky = new Overlay(franky);
	    world.register(overlayfranky);
	    for (int i = 0;i<16;++i){
	    	for (int j = 0; j<5;++j){
	    		world.register(new BlockDeco(new Vector(-7+(18*i), 0+(18*j)), 18, 18, world.getLoader(), "bg_castle3"));
	    	}
	    }
	    
	    //sol et murs
	    	// mur gauche
	    world.register(new Block(new Box(new Vector(-18, 3), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-18, 9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-18, 12), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-18, 18), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-18, 24), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-12, 3), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-12, 9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-12, 12), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-12, 18), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-12, 24), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-6, 3), 6, 6), world.getLoader().getSprite("castle.middle.right3")));
	    world.register(new Block(new Box(new Vector(-6, 9), 6, 6), world.getLoader().getSprite("castle.middle.right3")));
	    world.register(new Block(new Box(new Vector(-6, 12), 6, 6), world.getLoader().getSprite("castle.middle.right3")));
	    world.register(new Block(new Box(new Vector(-6, 18), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-6, 24), 6, 6), world.getLoader().getSprite("castle.center3")));
	    
	    	//sol principale gauche
	    world.register(new Block(new Box(new Vector(-18, -3), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-18, -9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-18, -12), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-12, -3), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-12, -9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-12, -12), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-6, -3), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-6, -9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-6, -12), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(0, -3), 6, 6), world.getLoader().getSprite("castle.middle3")));
	    world.register(new Block(new Box(new Vector(0, -9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(0, -12), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(6, -3), 6, 6), world.getLoader().getSprite("castle.middle3")));
	    world.register(new Block(new Box(new Vector(6, -9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(6, -12), 6, 6), world.getLoader().getSprite("castle.center3")));
	    
	    	//toit
	    world.register(new Block(new Box(new Vector(0, 18), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(0, 24), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(6, 18), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(6, 24), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(12, 18), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(12, 24), 6, 6), world.getLoader().getSprite("castle.center3")));
	    
	    	//sol Checkpoint
	    world.register(new Block(new Box(new Vector(84, -3), 6, 6), world.getLoader().getSprite("castle.middle3")));
	    world.register(new Block(new Box(new Vector(84, -9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(84, -12), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(90, -3), 6, 6), world.getLoader().getSprite("castle.middle3")));
	    world.register(new Block(new Box(new Vector(90, -9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(90, -12), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(96, -3), 6, 6), world.getLoader().getSprite("castle.middle3")));
	    world.register(new Block(new Box(new Vector(96, -9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(96, -12), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(102, -3), 6, 6), world.getLoader().getSprite("castle.middle3")));
	    world.register(new Block(new Box(new Vector(102, -9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(102, -12), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(108, -3), 6, 6), world.getLoader().getSprite("castle.middle3")));
	    world.register(new Block(new Box(new Vector(108, -9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(108, -12), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(114, -3), 6, 6), world.getLoader().getSprite("castle.middle3")));
	    world.register(new Block(new Box(new Vector(114, -9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(114, -12), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(120, -3), 6, 6), world.getLoader().getSprite("castle.middle3")));
	    world.register(new Block(new Box(new Vector(120, -9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(120, -12), 6, 6), world.getLoader().getSprite("castle.center3")));
	    
	    
	    //lava
	    world.register(new Lava(new Box(new Vector(12, -2.25), 6, 4), loader, "liquidLavaTop_mid3x2"));
	    world.register(new Lava(new Box(new Vector(18, -2.25), 6, 4), loader, "liquidLavaTop_mid3x2"));
	    world.register(new Lava(new Box(new Vector(24, -2.25), 6, 4), loader, "liquidLavaTop_mid3x2"));
	    world.register(new Lava(new Box(new Vector(30, -2.25), 6, 4), loader, "liquidLavaTop_mid3x2"));
	    world.register(new Lava(new Box(new Vector(36, -2.25), 6, 4), loader, "liquidLavaTop_mid3x2"));
	    world.register(new Lava(new Box(new Vector(42, -2.25), 6, 4), loader, "liquidLavaTop_mid3x2"));
	    world.register(new Lava(new Box(new Vector(48, -2.25), 6, 4), loader, "liquidLavaTop_mid3x2"));
	    world.register(new Lava(new Box(new Vector(54, -2.25), 6, 4), loader, "liquidLavaTop_mid3x2"));
	    world.register(new Lava(new Box(new Vector(60, -2.25), 6, 4), loader, "liquidLavaTop_mid3x2"));
	    world.register(new Lava(new Box(new Vector(66, -2.25), 6, 4), loader, "liquidLavaTop_mid3x2"));
	    world.register(new Lava(new Box(new Vector(72, -2.25), 6, 4), loader, "liquidLavaTop_mid3x2"));
	    world.register(new Lava(new Box(new Vector(78, -2.25), 6, 4), loader, "liquidLavaTop_mid3x2"));
	    world.register(new Lava(new Box(new Vector(12, -6.25), 6, 4), loader, "liquidLava2"));
	    world.register(new Lava(new Box(new Vector(18, -6.25), 6, 4), loader, "liquidLava2"));
	    world.register(new Lava(new Box(new Vector(24, -6.25), 6, 4), loader, "liquidLava2"));
	    world.register(new Lava(new Box(new Vector(30, -6.25), 6, 4), loader, "liquidLava2"));
	    world.register(new Lava(new Box(new Vector(36, -6.25), 6, 4), loader, "liquidLava2"));
	    world.register(new Lava(new Box(new Vector(42, -6.25), 6, 4), loader, "liquidLava2"));
	    world.register(new Lava(new Box(new Vector(48, -6.25), 6, 4), loader, "liquidLava2"));
	    world.register(new Lava(new Box(new Vector(54, -6.25), 6, 4), loader, "liquidLava2"));
	    world.register(new Lava(new Box(new Vector(60, -6.25), 6, 4), loader, "liquidLava2"));
	    world.register(new Lava(new Box(new Vector(66, -6.25), 6, 4), loader, "liquidLava2"));
	    world.register(new Lava(new Box(new Vector(72, -6.25), 6, 4), loader, "liquidLava2"));
	    world.register(new Lava(new Box(new Vector(78, -6.25), 6, 4), loader, "liquidLava2"));
	    world.register(new Lava(new Box(new Vector(12, -10.25), 6, 4), loader, "liquidLava2"));
	    world.register(new Lava(new Box(new Vector(18, -10.25), 6, 4), loader, "liquidLava2"));
	    world.register(new Lava(new Box(new Vector(24, -10.25), 6, 4), loader, "liquidLava2"));
	    world.register(new Lava(new Box(new Vector(30, -10.25), 6, 4), loader, "liquidLava2"));
	    world.register(new Lava(new Box(new Vector(36, -10.25), 6, 4), loader, "liquidLava2"));
	    world.register(new Lava(new Box(new Vector(42, -10.25), 6, 4), loader, "liquidLava2"));
	    world.register(new Lava(new Box(new Vector(48, -10.25), 6, 4), loader, "liquidLava2"));
	    world.register(new Lava(new Box(new Vector(54, -10.25), 6, 4), loader, "liquidLava2"));
	    world.register(new Lava(new Box(new Vector(60, -10.25), 6, 4), loader, "liquidLava2"));
	    world.register(new Lava(new Box(new Vector(66, -10.25), 6, 4), loader, "liquidLava2"));
	    world.register(new Lava(new Box(new Vector(72, -10.25), 6, 4), loader, "liquidLava2"));
	    world.register(new Lava(new Box(new Vector(78, -10.25), 6, 4), loader, "liquidLava2"));
	    
	    
	    //platformes 1
	    world.register(new BlockIndecis(new Box(new Vector(12, 1.5), 3, 1), 2, 1, loader, "stone.broken.3", "stone.broken2.3"));
	    world.register(new Block(new Box(new Vector(18, 2), 3, 1), loader.getSprite("stone.3")));
	    world.register(new BlockIndecis(new Box(new Vector(28, 1.5), 3, 1), 1.5, 2, loader, "stone.broken.3","stone.broken2.3"));
	    world.register(new Block(new Box(new Vector(38, 2), 3, 1), loader.getSprite("stone.3")));
	    world.register(new BlockIndecis(new Box(new Vector(49, 3), 3, 1), 2, 2, loader, "stone.broken.3","stone.broken2.3"));
	    world.register(new Block(new Box(new Vector(59, 3), 3, 1), loader.getSprite("stone.3")));
	    world.register(new BlockIndecis(new Box(new Vector(69, 3), 3, 1), 1, 1, loader, "stone.broken.3","stone.broken2.3"));

	    //slimes
	    world.register(new Slime(new Vector(0, 0), new Vector(90, 1),5,4, new Box(new Vector(92, 1), 18, 4), loader, 2,2,true));
	    
	    
	    
	    	//postCheckpoint
	    
	    //lava
	    for(int i = 0;i<20;++i){
	    	world.register(new Lava(new Box(new Vector(126+(6*i), -2.25), 6, 4), loader, "liquidLavaTop_mid3x2"));
	    }
	    for(int i = 0;i<20;++i){
		    world.register(new Lava(new Box(new Vector(126+(6*i), -6.25), 6, 4), loader, "liquidLava2"));
	    }
	    for(int i = 0;i<20;++i){
		    world.register(new Lava(new Box(new Vector(126+(6*i), -10.25), 6, 4), loader, "liquidLava2"));
	    }
	    //platformes
	    world.register(new BlockIndecis(new Box(new Vector(132, 1.5), 3, 1), 3, 2, loader, "stone.broken.3", "stone.broken2.3"));
	    world.register(new Block(new Box(new Vector(145, 2), 3, 1), loader.getSprite("stone.3")));
	    world.register(new BlockIndecis(new Box(new Vector(157, 1.5), 3, 1), 2, 1, loader, "stone.broken.3", "stone.broken2.3"));
	    world.register(new Block(new Box(new Vector(166, 4), 2, 6), loader.getSprite("stone.7")));
	    world.register(new BlockIndecis(new Box(new Vector(175, 1.5), 3, 1), 1, 1, loader, "stone.broken.3", "stone.broken2.3"));
	    world.register(new BlockIndecis(new Box(new Vector(185, 5), 2, 6), 2, 1, loader, "stone.broken.7", "stone.broken2.7"));
	    world.register(new Block(new Box(new Vector(179, 11), 2, 6), loader.getSprite("stone.7")));
	    world.register(new Block(new Box(new Vector(203, 2), 6, 1), loader.getSprite("stone.3")));
	    world.register(new BlockIndecis(new Box(new Vector(215, 1), 3, 1), 1, 2, loader, "stone.broken.3", "stone.broken2.3"));
	    world.register(new Block(new Box(new Vector(226, 2), 3, 1),loader.getSprite("stone.3")));
	    world.register(new Block(new Box(new Vector(236, 2), 3, 1), loader.getSprite("stone.3")));


	    //passage à exit
	    world.register(new Block(new Box(new Vector(205, 8), 2, 6), loader.getSprite("stone.7")));
	    world.register(new Block(new Box(new Vector(209, 10), 6, 2), loader.getSprite("stone.3")));
	    world.register(new Block(new Box(new Vector(215, 10), 6, 2), loader.getSprite("stone.3")));
	    world.register(new Block(new Box(new Vector(221, 10), 6, 2), loader.getSprite("stone.3")));
	    world.register(new Block(new Box(new Vector(227, 10), 6, 2), loader.getSprite("stone.3")));
	    world.register(new Block(new Box(new Vector(233, 10), 6, 2), loader.getSprite("stone.3")));
	    world.register(new Block(new Box(new Vector(239, 10), 6, 2), loader.getSprite("stone.3")));
	    world.register(new Block(new Box(new Vector(243, 8), 2, 6), loader.getSprite("stone.7")));
	    world.register(new Block(new Box(new Vector(243, 2), 2, 6), loader.getSprite("stone.7")));
	    Lever levier = new Lever(new Vector(236, 3), loader, "lever.left", "lever.right");
	    world.register(levier);
	    
	    //exit
	    world.register(new Exit(new Vector(258, 0), 1.5, 2, loader, levier));
	    	//sol
	    world.register(new Block(new Box(new Vector(246, -4), 6, 6), world.getLoader().getSprite("castle.middle3")));
	    world.register(new Block(new Box(new Vector(246, -10), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(252, -4), 6, 6), world.getLoader().getSprite("castle.middle3")));
	    world.register(new Block(new Box(new Vector(252, -10), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(258, -4), 6, 6), world.getLoader().getSprite("castle.middle3")));
	    world.register(new Block(new Box(new Vector(258, -10), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(264, -4), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(264, -10), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(270, -4), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(270, -10), 6, 6), world.getLoader().getSprite("castle.center3")));
	    	//murdroite
	    world.register(new Block(new Box(new Vector(264, 2), 6, 6), world.getLoader().getSprite("castle.middle.left3")));
	    world.register(new Block(new Box(new Vector(264, 8), 6, 6), world.getLoader().getSprite("castle.middle.left3")));
	    world.register(new Block(new Box(new Vector(264, 12), 6, 6), world.getLoader().getSprite("castle.middle.left3")));
	    world.register(new Block(new Box(new Vector(264, 18), 6, 6), world.getLoader().getSprite("castle.middle.left3")));
	    world.register(new Block(new Box(new Vector(264, 24), 6, 6), world.getLoader().getSprite("castle.middle.left3")));
	    world.register(new Block(new Box(new Vector(264, 30), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(264, 36), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(270, 2), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(270, 8), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(270, 12), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(270, 18), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(270, 24), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(270, 30), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(270, 36), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(276, 2), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(276, 8), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(276, 12), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(276, 18), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(276, 24), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(276, 30), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(276, 36), 6, 6), world.getLoader().getSprite("castle.center3")));
	    	//toit
	    world.register(new Block(new Box(new Vector(258, 30), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(258, 36), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(252, 30), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(252, 36), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(246, 30), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(246, 36), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(240, 30), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(240, 36), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(234, 30), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(234, 36), 6, 6), world.getLoader().getSprite("castle.center3")));
	}
}
