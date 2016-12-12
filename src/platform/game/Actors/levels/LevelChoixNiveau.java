package platform.game.Actors.levels;

import platform.game.World;
import platform.game.Actors.Exit;
import platform.game.Actors.Player;
import platform.game.Actors.blocks.Block;
import platform.game.Actors.blocks.BlockDeco;
import platform.game.Signals.Constant;
import platform.game.Signals.Signal;
import platform.util.Box;
import platform.util.Loader;
import platform.util.Vector;

public class LevelChoixNiveau extends Level{
	@Override
    public void register(World world) {
        super.register(world);
        Loader loader = getWorld().getLoader();
        Signal signal = new Constant(true);
        Player franky = new Player(new Vector(0, 0), new Vector(6, 0), world.getLoader());
        world.register(franky);
        
        
        
        //Portes et signes
        	//retour choix
        world.register(new Exit(new Vector(0, 1), 1.5, 2, loader, signal,0));
        world.register(new BlockDeco(new Vector(0, 3), 1, 4, loader, "text3"));
        for (int i = 0;i<10;++i){
    	    world.register(new Block(new Box(new Vector(10+(i*8), 3), 4, 1), world.getLoader().getSprite("stone.3")));
        }
        world.register(new Exit(new Vector(10, 4.5), 1.5, 2, loader, signal,new Level_01()));
        world.register(new BlockDeco(new Vector(10, 6.5), 1, 4, loader, "text4"));
        world.register(new Exit(new Vector(18, 4.5), 1.5, 2, loader, signal,new Level_02()));
        world.register(new BlockDeco(new Vector(18, 6.5), 1, 4, loader, "text5"));
        world.register(new Exit(new Vector(26, 4.5), 1.5, 2, loader, signal,new Level_02b()));
        world.register(new BlockDeco(new Vector(26, 6.5), 1, 4, loader, "text6"));
        world.register(new Exit(new Vector(34, 4.5), 1.5, 2, loader, signal,new Level_03()));
        world.register(new BlockDeco(new Vector(34, 6.5), 1, 4, loader, "text7"));
        world.register(new Exit(new Vector(42, 4.5), 1.5, 2, loader, signal,new Level_04()));
        world.register(new BlockDeco(new Vector(42, 6.5), 1, 4, loader, "text8"));
        world.register(new Exit(new Vector(50, 4.5), 1.5, 2, loader, signal,new Level_05()));
        world.register(new BlockDeco(new Vector(50, 6.5), 1, 4, loader, "text9"));
        world.register(new Exit(new Vector(58, 4.5), 1.5, 2, loader, signal,new Level_06()));
        world.register(new BlockDeco(new Vector(58, 6.5), 1, 4, loader, "text10"));
        world.register(new Exit(new Vector(66, 4.5), 1.5, 2, loader, signal,new Level_07()));
        world.register(new BlockDeco(new Vector(66, 6.5), 1, 4, loader, "text11"));
        world.register(new Exit(new Vector(74, 4.5), 1.5, 2, loader, signal,new Level_08()));
        world.register(new BlockDeco(new Vector(74, 6.5), 1, 4, loader, "text12"));
        world.register(new Exit(new Vector(82, 4.5), 1.5, 2, loader, signal,new LevelBoss()));
        world.register(new BlockDeco(new Vector(82, 6.5), 1, 4, loader, "text13"));

        
        //platformes et sol
        world.register(new Block(new Box(new Vector(-18, -3), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-18, -9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-18, -15), 6, 6), world.getLoader().getSprite("castle.center3")));
        world.register(new Block(new Box(new Vector(-12, -3), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-12, -9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-12, -15), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-6, -3), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-6, -9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-6, -15), 6, 6), world.getLoader().getSprite("castle.center3")));
	    for(int i = 0;i<15;++i){
	    	world.register(new Block(new Box(new Vector(0+(i*6), -3), 6, 6), world.getLoader().getSprite("castle.middle3")));
		    world.register(new Block(new Box(new Vector(0+(i*6), -9), 6, 6), world.getLoader().getSprite("castle.center3")));
		    world.register(new Block(new Box(new Vector(0+(i*6), -15), 6, 6), world.getLoader().getSprite("castle.center3")));
	    }
	    world.register(new Block(new Box(new Vector(90, -3), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(90, -9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(90, -15), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(96, -3), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(96, -9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(96, -15), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(102, -3), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(102, -9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(102, -15), 6, 6), world.getLoader().getSprite("castle.center3")));
	    
	    
        //murs et toit
        	//mur gauche
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
	    	//mur droite
	    world.register(new Block(new Box(new Vector(90, 3), 6, 6), world.getLoader().getSprite("castle.middle.left3")));
	    world.register(new Block(new Box(new Vector(90, 9), 6, 6), world.getLoader().getSprite("castle.middle.left3")));
	    world.register(new Block(new Box(new Vector(90, 12), 6, 6), world.getLoader().getSprite("castle.middle.left3")));
	    world.register(new Block(new Box(new Vector(90, 18), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(90, 24), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(96, 3), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(96, 9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(96, 12), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(96, 18), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(96, 24), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(102, 3), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(102, 9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(102, 12), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(102, 18), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(102, 24), 6, 6), world.getLoader().getSprite("castle.center3")));
	    
	    	//toit
	    for(int i = 0;i<15;++i){
	    	world.register(new Block(new Box(new Vector(0+(i*6), 18), 6, 6), world.getLoader().getSprite("castle.center3")));
		    world.register(new Block(new Box(new Vector(0+(i*6), 24), 6, 6), world.getLoader().getSprite("castle.center3")));
	    }
	    
	    
	  //background
        for (int i = 0;i<5;++i){
	    		world.register(new BlockDeco(new Vector(6+(18*i), 8), 18, 18, world.getLoader(), "bg_castle3"));
	    }
	}
}
