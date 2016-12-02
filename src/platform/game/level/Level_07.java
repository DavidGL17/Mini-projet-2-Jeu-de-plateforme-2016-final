package platform.game.level;

import platform.game.Block;
import platform.game.BlockIndecis;
import platform.game.Lava;
import platform.game.Overlay;
import platform.game.Player;
import platform.game.World;
import platform.util.Box;
import platform.util.Loader;
import platform.util.Vector;

public class Level_07 extends Level{
	@Override
    public void register(World world) {
		super.register(world);
		Loader loader = world.getLoader();
		Player franky;
		//premier spawn point
		if (!world.getCheckpoint()){
			franky = new Player(new Vector(0, 1), new Vector(4, 0), world.getLoader());
		} else {
			//deuxème spawn point (si le joueur a passer le checkpoint)
			franky = new Player(new Vector(0, 1), new Vector(4, 0), world.getLoader());
		}
	    world.register(franky);
	    Overlay overlayfranky = new Overlay(franky);
	    world.register(overlayfranky);
	    
	    
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
	    
	    
	    //lava
	    world.register(new Lava(new Box(new Vector(12, -2.25), 6, 4), loader, "liquidLavaTop_mid3x2"));
	    world.register(new Lava(new Box(new Vector(18, -2.25), 6, 4), loader, "liquidLavaTop_mid3x2"));
	    world.register(new Lava(new Box(new Vector(24, -2.25), 6, 4), loader, "liquidLavaTop_mid3x2"));
	    world.register(new Lava(new Box(new Vector(30, -2.25), 6, 4), loader, "liquidLavaTop_mid3x2"));
	    world.register(new Lava(new Box(new Vector(12, -6.25), 6, 4), loader, "liquidLava2"));
	    world.register(new Lava(new Box(new Vector(18, -6.25), 6, 4), loader, "liquidLava2"));
	    world.register(new Lava(new Box(new Vector(24, -6.25), 6, 4), loader, "liquidLava2"));
	    world.register(new Lava(new Box(new Vector(30, -6.25), 6, 4), loader, "liquidLava2"));
	    
	    
	    //platformes
//	    world.register(new BlockIndecis(new Box(center, width, height), timerDisparition, timerApparition, loader, dessin));
	}
}
