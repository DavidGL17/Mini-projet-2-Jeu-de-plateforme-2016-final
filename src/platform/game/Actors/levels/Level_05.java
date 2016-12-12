package platform.game.Actors.levels;

import platform.game.World;
import platform.game.Actors.Exit;
import platform.game.Actors.Lava;
import platform.game.Actors.Lever;
import platform.game.Actors.Limits;
import platform.game.Actors.Overlay;
import platform.game.Actors.Player;
import platform.game.Actors.Teleporteur;
import platform.game.Actors.Torch;
import platform.game.Actors.blocks.Block;
import platform.game.Actors.blocks.BlockDeco;
import platform.game.Actors.blocks.BlockDisparitionSignal;
import platform.game.Actors.blocks.Mover;
import platform.util.Box;
import platform.util.Loader;
import platform.util.Vector;

public class Level_05 extends Level{
	@Override
    public void register(World world) {
		super.register(world);
		Loader loader = world.getLoader();
		
		Player franky = new Player(new Vector(0, 1), new Vector(4, 0), world.getLoader());
	    world.register(franky);
	    Overlay overlayfranky = new Overlay(franky);
	    world.register(overlayfranky);
	    
	    world.register(new Limits(new Box(new Vector(0, -19), 300, 1)));
	    world.register(new BlockDeco(new Vector(6, 6), 30, 30, world.getLoader(), "bg_castle3"));

	    										//Platforme
	    world.register(new Block(new Box(new Vector(-18, -3), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-18, -9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-18, -15), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-12, -3), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-12, -9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-12, -15), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-6, -3), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-6, -9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-6, -15), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(0, -3), 6, 6), world.getLoader().getSprite("castle.middle3")));
	    world.register(new Block(new Box(new Vector(0, -9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(0, -15), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(6, -3), 6, 6), world.getLoader().getSprite("castle.middle3")));
	    world.register(new Block(new Box(new Vector(6, -9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(6, -15), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(12, -3), 6, 6), world.getLoader().getSprite("castle.middle3")));
	    world.register(new Block(new Box(new Vector(12, -9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(12, -15), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(18, -3), 6, 6), world.getLoader().getSprite("castle.middle3")));
	    world.register(new Block(new Box(new Vector(18, -9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(18, -15), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(24, -3), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(24, -9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(24, -15), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(30, -3), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(30, -9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(30, -15), 6, 6), world.getLoader().getSprite("castle.center3")));
	    
											//murs et toit
	    
												//bord gauche
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

	    										//bord droite
	    world.register(new Block(new Box(new Vector(18, 12), 6, 6), world.getLoader().getSprite("castle.middle.left3")));
	    world.register(new Block(new Box(new Vector(18, 18), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(18, 24), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(24, 3), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(24, 9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(24, 12), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(24, 18), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(24, 24), 6, 6), world.getLoader().getSprite("castle.center3")));
	    
	    Lever lever = new Lever(new Vector(40,-56.5), loader,"lever.right", "lever.left");
	    Mover mover = new Mover(new Vector(15, 4.5), new Vector(14, 10.5), 2, 9, 1, loader, lever, "stone.7");
	    world.register(new Exit(new Vector(19.5, 1), 1.5, 2, loader, lever));
	    world.register(new Torch(new Vector(18, 1.25), loader));
	    world.register(lever);
	    world.register(mover);
	    
												// toit
	    world.register(new Block(new Box(new Vector(0, 18), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(0, 24), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(6, 18), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(6, 24), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(12, 18), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(12, 24), 6, 6), world.getLoader().getSprite("castle.center3")));

	    
	    
	    										//Passage à l'autre coté 
	    world.register(new Teleporteur(new Box(new Vector(0, 1), 2, 2), new Vector(4, -57), loader));
	    world.register(new Teleporteur(new Box(new Vector(0, -56), 2, 2) , new Vector(4, 0), loader));
	    
	    world.register(new BlockDeco(new Vector(10, -50), 30, 30, world.getLoader(), "bg_castle3"));
	    world.register(new BlockDeco(new Vector(40, -50), 30, 30, world.getLoader(), "bg_castle3"));
	    
	    										//platforme principale
	    world.register(new Block(new Box(new Vector(-18, -60), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-18, -66), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-18, -72), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-12, -60), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-12, -66), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-12, -72), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-6, -60), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-6, -66), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-6, -72), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(0, -60), 6, 6), world.getLoader().getSprite("castle.middle3")));
	    world.register(new Block(new Box(new Vector(0, -66), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(0, -72), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(6, -60), 6, 6), world.getLoader().getSprite("castle.middle3")));
	    world.register(new Block(new Box(new Vector(6, -66), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(6, -72), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(36, -60), 6, 6), world.getLoader().getSprite("castle.middle3")));
	    world.register(new Block(new Box(new Vector(36, -66), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(36, -72), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(42, -60), 6, 6), world.getLoader().getSprite("castle.middle3")));
	    world.register(new Block(new Box(new Vector(42, -66), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(42, -72), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(48, -60), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(48, -66), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(48, -72), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(54, -60), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(54, -66), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(54, -72), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(60, -60), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(60, -66), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(60, -72), 6, 6), world.getLoader().getSprite("castle.center3")));
	    
	    				//Lava
	    world.register(new Lava(new Box(new Vector(12, -59.25), 6, 4), loader, "liquidLavaTop_mid3x2"));
	    world.register(new Lava(new Box(new Vector(18, -59.25), 6, 4), loader, "liquidLavaTop_mid3x2"));
	    world.register(new Lava(new Box(new Vector(24, -59.25), 6, 4), loader, "liquidLavaTop_mid3x2"));
	    world.register(new Lava(new Box(new Vector(30, -59.25), 6, 4), loader, "liquidLavaTop_mid3x2"));
	    world.register(new Lava(new Box(new Vector(12, -63.25), 6, 4), loader, "liquidLava2"));
	    world.register(new Lava(new Box(new Vector(18, -63.25), 6, 4), loader, "liquidLava2"));
	    world.register(new Lava(new Box(new Vector(24, -63.25), 6, 4), loader, "liquidLava2"));
	    world.register(new Lava(new Box(new Vector(30, -63.25), 6, 4), loader, "liquidLava2"));

	    	//platformes
	    world.register(new BlockDisparitionSignal(new Box(new Vector(11, -55), 1, 1), loader,"stone.1", lever));
	    world.register(new Block(new Box(new Vector(13, -54), 1, 1), loader.getSprite("stone.1")));
	    world.register(new BlockDisparitionSignal(new Box(new Vector(17, -56), 1, 1), loader,"stone.1", lever));
	    world.register(new Block(new Box(new Vector(20,-54), 1, 1), loader.getSprite("stone.1")));
	    world.register(new BlockDisparitionSignal(new Box(new Vector(22, -55), 1, 1), loader,"stone.1", lever));
	    world.register(new Block(new Box(new Vector(24,-56), 1, 1), loader.getSprite("stone.1")));
	    world.register(new BlockDisparitionSignal(new Box(new Vector(27, -54), 1, 1), loader,"stone.1", lever));
	    world.register(new BlockDisparitionSignal(new Box(new Vector(29, -56), 1, 1), loader,"stone.1", lever));	    

	    
	    										//bord gauche
	    world.register(new Block(new Box(new Vector(-18, -54), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-18, -48), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-18, -42), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-18, -36), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-18, -30), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-12, -54), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-12, -48), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-12, -42), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-12, -36), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-12, -30), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-6, -54), 6, 6), world.getLoader().getSprite("castle.middle.right3")));
	    world.register(new Block(new Box(new Vector(-6, -48), 6, 6), world.getLoader().getSprite("castle.middle.right3")));
	    world.register(new Block(new Box(new Vector(-6, -42), 6, 6), world.getLoader().getSprite("castle.middle.right3")));
	    world.register(new Block(new Box(new Vector(-6, -36), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(-6, -30), 6, 6), world.getLoader().getSprite("castle.center3")));
	    
	    										//bord droite
	    world.register(new Block(new Box(new Vector(48, -54), 6, 6), world.getLoader().getSprite("castle.middle.left3")));
	    world.register(new Block(new Box(new Vector(48, -48), 6, 6), world.getLoader().getSprite("castle.middle.left3")));
	    world.register(new Block(new Box(new Vector(48, -42), 6, 6), world.getLoader().getSprite("castle.middle.left3")));
	    world.register(new Block(new Box(new Vector(54, -54), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(54, -48), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(54, -42), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(60, -54), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(60, -48), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(60 , -42), 6, 6), world.getLoader().getSprite("castle.center3")));
	    
	    										// toit
	    world.register(new Block(new Box(new Vector(0, -36), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(0, -30), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(6, -36), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(6, -30), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(12, -36), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(12, -30), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(18, -36), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(18, -30), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(24, -36), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(24, -30), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(30, -36), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(30, -30), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(36, -36), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(36, -30), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(42, -36), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(42, -30), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(48, -36), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(48, -30), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(54, -36), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(54, -30), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(60, -36), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(60, -30), 6, 6), world.getLoader().getSprite("castle.center3")));
	    
	}
}
