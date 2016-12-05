package platform.game.level;

import platform.game.Block;
import platform.game.BlockIndecis;
import platform.game.Checkpoint;
import platform.game.Lava;
import platform.game.Overlay;
import platform.game.Player;
import platform.game.World;
import platform.game.monsters.Slime;
import platform.util.Box;
import platform.util.Loader;
import platform.util.Vector;

public class Level_07 extends Level{
	@Override
    public void register(World world) {
		super.register(world);
		Loader loader = world.getLoader();
		Checkpoint checkpoint = new Checkpoint(new Vector(108, 1), loader);
	    world.register(checkpoint);
		Player franky;
		//premier spawn point
		if (!world.getCheckpoint()){
			franky = new Player(new Vector(0, 1), new Vector(100, 0), world.getLoader());
		} else {
			//deuxème spawn point (si le joueur a passer le checkpoint)
			franky = new Player(new Vector(0, 1), new Vector(108, 0), world.getLoader());
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
	    world.register(new Slime(new Vector(0, 0), new Vector(90, 1),0.02,8, new Box(new Vector(92, 1), 18, 4), loader, 2,2,true));

	}
}
