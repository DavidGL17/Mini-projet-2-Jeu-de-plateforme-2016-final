package platform.game.Actors.levels;

import platform.game.Actors.Exit;
import platform.game.Actors.Player;
import platform.game.Actors.World;
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
        world.register(new BlockDeco(new Vector(0, 3), 2, 4, loader, "zoneTexteLevelChoixNiveau_01"));
	    world.register(new Block(new Box(new Vector(10, 3), 4, 1), world.getLoader().getSprite("stone.3")));

        
        
        //platformes et sol
        world.register(new Block(new Box(new Vector(-12, -3), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-12, -9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-12, -15), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-6, -3), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-6, -9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-6, -15), 6, 6), world.getLoader().getSprite("castle.center3")));
	    for(int i = 0;i<7;++i){
	    	world.register(new Block(new Box(new Vector(0+(i*6), -3), 6, 6), world.getLoader().getSprite("castle.middle3")));
		    world.register(new Block(new Box(new Vector(0+(i*6), -9), 6, 6), world.getLoader().getSprite("castle.center3")));
		    world.register(new Block(new Box(new Vector(0+(i*6), -15), 6, 6), world.getLoader().getSprite("castle.center3")));
	    }
	    
        //murs et toit
        	//mur gauche
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
	}
}
