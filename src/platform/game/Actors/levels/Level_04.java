package platform.game.Actors.levels;

import platform.game.World;
import platform.game.Actors.Exit;
import platform.game.Actors.Lever;
import platform.game.Actors.Limits;
import platform.game.Actors.Overlay;
import platform.game.Actors.Player;
import platform.game.Actors.Torch;
import platform.game.Actors.actorSignal.SignalInvisibleConstant;
import platform.game.Actors.blocks.Block;
import platform.game.Actors.blocks.BlockDeco;
import platform.game.Actors.blocks.BlockDecoSignal;
import platform.game.Signals.And;
import platform.game.Signals.Not;
import platform.util.Box;
import platform.util.Loader;
import platform.util.Vector;

public class Level_04 extends Level{
	@Override
    public void register(World world) {
		super.register(world);
		Loader loader = world.getLoader();
		
		Player franky = new Player(new Vector(0, 1), new Vector(6, 0), world.getLoader());
	    world.register(franky);
	    Overlay overlayfranky = new Overlay(franky);
	    world.register(overlayfranky);
	    
	    world.register(new Limits(new Box(new Vector(0, -19), 300, 1)));
	    SignalInvisibleConstant tuto = new SignalInvisibleConstant(new Box(new Vector(6, 7), 3, 5));
	    world.register(tuto);
	    world.register(new BlockDecoSignal(new Vector(7, 11), 10, 6, loader, "tuto3", tuto));
	     
	    world.register(new BlockDeco(new Vector(6, 6), 18, 18, world.getLoader(), "bg_castle3"));
	   
	  
	    
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
	    world.register(new Block(new Box(new Vector(18, -3), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(18, -9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(18, -15), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(24, -3), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(24, -9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(24, -15), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(30, -3), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(30, -9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(30, -15), 6, 6), world.getLoader().getSprite("castle.center3")));
	    
	    										//Signaux et deco
	    world.register(new Block(new Box(new Vector(6, 5), 8, 2), world.getLoader().getSprite("stone.3")));
	    Lever lever = new Lever(new Vector(-1, 0.5), loader,"lever.right", "lever.left");
	    Lever lever2 = new Lever(new Vector(3.5, 0.5), loader,"lever.right", "lever.left");
	    Lever lever3 = new Lever(new Vector(8, 0.5), loader,"lever.right", "lever.left");
	    Lever lever4 = new Lever(new Vector(12.5, 0.5), loader,"lever.right", "lever.left");
	    world.register(lever);
	    world.register(lever2);
	    world.register(lever3);
	    world.register(lever4);
	    world.register(new Exit(new Vector(6, 7), 1.5, 2, world.getLoader(), new And(new And(lever4, new Not(lever3)), new And(new Not(lever), lever2))));
	    world.register(new Torch(new Vector(4, 7.5), world.getLoader()));
	    world.register(new Torch(new Vector(8, 7.5), world.getLoader()));
	    
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
	    world.register(new Block(new Box(new Vector(18, 3), 6, 6), world.getLoader().getSprite("castle.middle.left3")));
	    world.register(new Block(new Box(new Vector(18, 9), 6, 6), world.getLoader().getSprite("castle.middle.left3")));
	    world.register(new Block(new Box(new Vector(18, 12), 6, 6), world.getLoader().getSprite("castle.middle.left3")));
	    world.register(new Block(new Box(new Vector(18, 18), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(18, 24), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(24, 3), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(24, 9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(24, 12), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(24, 18), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(24, 24), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(30, 3), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(30, 9), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(30, 12), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(30, 18), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(30, 24), 6, 6), world.getLoader().getSprite("castle.center3")));
	    
	    										// toit
	    world.register(new Block(new Box(new Vector(0, 18), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(0, 24), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(6, 18), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(6, 24), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(12, 18), 6, 6), world.getLoader().getSprite("castle.center3")));
	    world.register(new Block(new Box(new Vector(12, 24), 6, 6), world.getLoader().getSprite("castle.center3")));
	    
	}
}
