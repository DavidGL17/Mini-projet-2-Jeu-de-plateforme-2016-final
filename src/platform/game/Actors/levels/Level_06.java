package platform.game.Actors.levels;

import platform.game.Actors.Exit;
import platform.game.Actors.Heart;
import platform.game.Actors.Overlay;
import platform.game.Actors.Player;
import platform.game.Actors.Spikebas;
import platform.game.Actors.Spikedroite;
import platform.game.Actors.Spikegauche;
import platform.game.Actors.Spikes;
import platform.game.Actors.World;
import platform.game.Actors.blocks.Block;
import platform.game.Actors.blocks.BlockDeco;
import platform.game.Signals.Constant;
import platform.util.Box;
import platform.util.Vector;

public class Level_06 extends Level{
	 @Override
	    public void register(World world) {
	        super.register(world);
	
	Player franky = new Player(new Vector(0, -4), new Vector(-4, 13), world.getLoader());
	world.register(franky);
	Overlay overlayfranky = new Overlay(franky);
	world.register(overlayfranky);
	
  
    world.register(new BlockDeco(new Vector(-4, 13), 2, 2, world.getLoader(), "door.closed"));
    world.register(new Block(new Box(new Vector(-18, 16), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-18, 22), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-18, 10), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-18, 4), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-18, -2), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-18, -8), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-18, -14), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-18, -20), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-18, -26), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-18, -32), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-14, 10), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-14, 4), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-14, -2), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-14, -8), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-14, -14), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-14, -20), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-10, -2), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-10, -8), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-10, -14), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-10, -20), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-10, -26), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-4, -21), 6, 6), world.getLoader().getSprite("castle.center3")));


    world.register(new Block(new Box(new Vector(-10, 3), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-10, 9), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-12, 12), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-12, 18), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-12, 24), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-4, 9), 6, 6), world.getLoader().getSprite("castle.middle.right3")));
    world.register(new Block(new Box(new Vector(-4, 3), 6, 6), world.getLoader().getSprite("castle.middle.right3")));
    world.register(new Block(new Box(new Vector(-4, -3), 6, 6), world.getLoader().getSprite("castle.middle.right3")));
    world.register(new Block(new Box(new Vector(-4, -9), 6, 6), world.getLoader().getSprite("castle.middle.right3")));
    world.register(new Block(new Box(new Vector(-4, -15), 6, 6), world.getLoader().getSprite("castle.middle.right3")));
    
    world.register(new Block(new Box(new Vector(35, 15), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(35, 21), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(35, 27), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(41, 15), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(41, 15), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(41, 21), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(41, 21), 6, 6), world.getLoader().getSprite("castle.center3")));

  
    world.register(new Block(new Box(new Vector(2, -21), 6, 6), world.getLoader().getSprite("castle.middle3")));
    world.register(new Block(new Box(new Vector(8, -21), 6, 6), world.getLoader().getSprite("castle.middle3")));
    world.register(new Block(new Box(new Vector(14, -21), 6, 6), world.getLoader().getSprite("castle.middle3")));
    world.register(new Block(new Box(new Vector(20, -21), 6, 6), world.getLoader().getSprite("castle.middle3")));
    world.register(new Block(new Box(new Vector(26, -21), 6, 6), world.getLoader().getSprite("castle.middle3")));

    world.register(new Block(new Box(new Vector(17, -20), 4, 8), world.getLoader().getSprite("castle.middle2_4")));
    world.register(new Block(new Box(new Vector(17, -12), 4, 8), world.getLoader().getSprite("castle.middle2_4")));
    world.register(new Block(new Box(new Vector(17, -4), 4, 8), world.getLoader().getSprite("castle.middle2_4")));
    world.register(new Block(new Box(new Vector(17, 4), 4, 8), world.getLoader().getSprite("castle.middle2_4")));
    
   
    
    world.register(new Block(new Box(new Vector(-8, 12), 6, 6), world.getLoader().getSprite("castle.middle.right3")));
    world.register(new Block(new Box(new Vector(-6, 18), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-6, 24), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(18, 18), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(18, 24), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(23, 18), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(23, 24), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(23, 30), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(29, 30), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(29, 24), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(29, 18), 6, 6), world.getLoader().getSprite("castle.center3")));

    world.register(new Block(new Box(new Vector(0, 18), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(0, 24), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(6, 18), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(6, 24), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(12, 18), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(12, 24), 6, 6), world.getLoader().getSprite("castle.center3")));

    world.register(new Block(new Box(new Vector(7, -10), 4, 8), world.getLoader().getSprite("castle.middle2_4")));
    world.register(new Block(new Box(new Vector(7, -2), 4, 8), world.getLoader().getSprite("castle.middle2_4")));
    world.register(new Block(new Box(new Vector(7, 6), 4, 8), world.getLoader().getSprite("castle.middle2_4")));
    world.register(new Block(new Box(new Vector(7, 14), 4, 8), world.getLoader().getSprite("castle.middle2_4")));

    world.register(new Block(new Box(new Vector(29, 13), 6, 6), world.getLoader().getSprite("castle.middle.left3")));
    world.register(new Block(new Box(new Vector(29, 7), 6, 6), world.getLoader().getSprite("castle.middle.left3")));
    world.register(new Block(new Box(new Vector(29, 1), 6, 6), world.getLoader().getSprite("castle.middle.left3")));
    world.register(new Block(new Box(new Vector(29, -5), 6, 6), world.getLoader().getSprite("castle.middle.left3")));
    world.register(new Block(new Box(new Vector(29, -11), 6, 6), world.getLoader().getSprite("castle.middle.left3")));
    
    world.register(new Spikedroite(new Vector(-0.5, -16.5), world.getLoader()));
	world.register(new Spikedroite(new Vector(-0.5, -15), world.getLoader()));
	world.register(new Spikedroite(new Vector(-0.5, -13.5), world.getLoader()));
	world.register(new Spikedroite(new Vector(-0.5, -12), world.getLoader()));
    world.register(new Spikedroite(new Vector(-0.5, -10.5), world.getLoader()));
	world.register(new Spikedroite(new Vector(-0.5, -9), world.getLoader()));
	world.register(new Spikedroite(new Vector(-0.5, -7.5), world.getLoader()));
    world.register(new Spikedroite(new Vector(-0.5, -6), world.getLoader()));
	world.register(new Spikedroite(new Vector(-0.5, -4.5), world.getLoader()));
	world.register(new Spikedroite(new Vector(-0.5, -3), world.getLoader()));
    world.register(new Spikedroite(new Vector(-0.5, -1.5), world.getLoader()));
	world.register(new Spikedroite(new Vector(-0.5, 0), world.getLoader()));
    world.register(new Spikedroite(new Vector(-0.5, 1.5), world.getLoader()));
	world.register(new Spikedroite(new Vector(-0.5, 3), world.getLoader()));
	world.register(new Spikedroite(new Vector(-0.5, 4.5), world.getLoader()));
    world.register(new Spikedroite(new Vector(-0.5, 6), world.getLoader()));
	world.register(new Spikedroite(new Vector(-0.5, 7.5), world.getLoader()));
	world.register(new Spikedroite(new Vector(-0.5, 9), world.getLoader()));
	world.register(new Spikedroite(new Vector(-0.5, 10.5), world.getLoader()));
	
	world.register(new Spikegauche(new Vector(4.5, 10.5), world.getLoader()));
	world.register(new Spikegauche(new Vector(4.5, 9), world.getLoader()));
	world.register(new Spikegauche(new Vector(4.5, 7.5), world.getLoader()));
	world.register(new Spikegauche(new Vector(4.5, 6), world.getLoader()));
	world.register(new Spikegauche(new Vector(4.5, 4.5), world.getLoader()));
	world.register(new Spikegauche(new Vector(4.5, 3), world.getLoader()));
	world.register(new Spikegauche(new Vector(4.5, 1.5), world.getLoader()));
	world.register(new Spikegauche(new Vector(4.5, 0), world.getLoader()));
	world.register(new Spikegauche(new Vector(4.5, -1.5), world.getLoader()));
	world.register(new Spikegauche(new Vector(4.5, -3), world.getLoader()));
	world.register(new Spikegauche(new Vector(4.5, -4.5), world.getLoader()));
	world.register(new Spikegauche(new Vector(4.5, -6), world.getLoader()));
	world.register(new Spikegauche(new Vector(4.5, -7.5), world.getLoader()));
	world.register(new Spikegauche(new Vector(4.5, -9), world.getLoader()));
	world.register(new Spikegauche(new Vector(4.5, -10.5), world.getLoader()));
	world.register(new Spikegauche(new Vector(4.5, -12), world.getLoader()));
	world.register(new Spikegauche(new Vector(4.5, -13), world.getLoader()));

	world.register(new Spikebas(new Vector(7, -14.5), world.getLoader()));

    world.register(new Spikes(new Vector(0.5, -17.5), world.getLoader()));
    world.register(new Spikes(new Vector(1, -17.5), world.getLoader()));
    world.register(new Spikes(new Vector(9, -17.5), world.getLoader()));
    world.register(new Spikes(new Vector(10.5, -17.5), world.getLoader()));

	world.register(new Spikegauche(new Vector(14.5, -10.5), world.getLoader()));
	world.register(new Spikegauche(new Vector(14.5, -9), world.getLoader()));
	world.register(new Spikegauche(new Vector(14.5, -7.5), world.getLoader()));
	world.register(new Spikedroite(new Vector(9.5, -13), world.getLoader()));
	world.register(new Spikedroite(new Vector(9.5, -4.5), world.getLoader()));
	world.register(new Spikedroite(new Vector(9.5, -3), world.getLoader()));
	world.register(new Spikedroite(new Vector(9.5, -1.5), world.getLoader()));
	world.register(new Spikegauche(new Vector(14.5, 0.5), world.getLoader()));
	world.register(new Spikegauche(new Vector(14.5, 2), world.getLoader()));
	world.register(new Spikedroite(new Vector(9.5, 3), world.getLoader()));
	world.register(new Spikedroite(new Vector(9.5, 4.5), world.getLoader()));
	world.register(new Spikedroite(new Vector(9.5, 9.5), world.getLoader()));
	world.register(new Spikedroite(new Vector(9.5, 11), world.getLoader()));
	world.register(new Spikedroite(new Vector(9.5, 12.5), world.getLoader()));
	world.register(new Spikedroite(new Vector(9.5, 13.5), world.getLoader()));
	world.register(new Spikebas(new Vector(10.5, 14.5), world.getLoader()));
	world.register(new Spikebas(new Vector(12, 14.5), world.getLoader()));
	world.register(new Spikebas(new Vector(13.5, 14.5), world.getLoader()));
	world.register(new Spikebas(new Vector(15, 14.5), world.getLoader()));
	world.register(new Spikebas(new Vector(16.5, 14.5), world.getLoader()));
	world.register(new Spikebas(new Vector(18, 14.5), world.getLoader()));
	world.register(new Spikebas(new Vector(19.5, 14.5), world.getLoader()));
	world.register(new Spikebas(new Vector(21, 14.5), world.getLoader()));
	world.register(new Spikebas(new Vector(22.5, 14.5), world.getLoader()));
	world.register(new Spikebas(new Vector(24, 14.5), world.getLoader()));
	world.register(new Spikebas(new Vector(24.5, 14.5), world.getLoader()));
	world.register(new Spikegauche(new Vector(14.5, 7), world.getLoader()));

	world.register(new Spikegauche(new Vector(25.5, 13.5), world.getLoader()));
	world.register(new Spikegauche(new Vector(25.5, 12), world.getLoader()));
	world.register(new Spikegauche(new Vector(25.5, 10.5), world.getLoader()));
	world.register(new Spikegauche(new Vector(25.5, 9), world.getLoader()));
	world.register(new Spikegauche(new Vector(25.5, 7.5), world.getLoader()));

	world.register(new Spikedroite(new Vector(19.5, 7), world.getLoader()));
	world.register(new Spikedroite(new Vector(19.5, 5.5), world.getLoader()));

	world.register(new Spikegauche(new Vector(25.5, 0.5), world.getLoader()));
	world.register(new Spikegauche(new Vector(25.5, -1), world.getLoader()));
	world.register(new Spikegauche(new Vector(25.5, -2.5), world.getLoader()));
	world.register(new Spikegauche(new Vector(25.5, -4), world.getLoader()));


	world.register(new Spikedroite(new Vector(19.5, -0.5), world.getLoader()));
	world.register(new Spikedroite(new Vector(19.5, -2), world.getLoader()));

	world.register(new Spikedroite(new Vector(19.5, -2), world.getLoader()));
	world.register(new Spikedroite(new Vector(19.5, -2), world.getLoader()));

	world.register(new Spikedroite(new Vector(19.5, -8), world.getLoader()));

	world.register(new Spikegauche(new Vector(25.5, -9), world.getLoader()));
	world.register(new Spikegauche(new Vector(25.5, -10.5), world.getLoader()));
	world.register(new Spikegauche(new Vector(25.5, -12), world.getLoader()));

	world.register(new Spikedroite(new Vector(19.5, -14.5), world.getLoader()));
	world.register(new Spikedroite(new Vector(19.5, -16), world.getLoader()));

	world.register(new Spikes(new Vector(20.5, -17.5), world.getLoader()));
	world.register(new Spikes(new Vector(22, -17.5), world.getLoader()));
	world.register(new Spikes(new Vector(23.5, -17.5), world.getLoader()));
	world.register(new Spikes(new Vector(25, -17.5), world.getLoader()));

	world.register(new Spikes(new Vector(16.25, 8.5), world.getLoader()));
	world.register(new Spikes(new Vector(17.75, 8.5), world.getLoader()));

    world.register(new Block(new Box(new Vector(35, -27), 6, 6), world.getLoader().getSprite("castle.center3")));

	
    world.register(new Block(new Box(new Vector(35, -21), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(35, -15), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(35, -9), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(35, -3), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(35, 3), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(35, 9), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(35, -27), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(35, -33), 6, 6), world.getLoader().getSprite("castle.center3")));
    
    world.register(new Block(new Box(new Vector(29, -27), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(23, -27), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(27, -27), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(21, -27), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(15, -27), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(9, -27), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(3, -27), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-3, -27), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-9, -27), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-15, -27), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-21, -27), 6, 6), world.getLoader().getSprite("castle.center3")));

    world.register(new Block(new Box(new Vector(41, -21), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(41, -15), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(41, -9), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(41, -3), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(41, 3), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(41, 9), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(41, -27), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(41, -33), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(41, -39), 6, 6), world.getLoader().getSprite("castle.center3")));
	
    world.register(new Block(new Box(new Vector(47, -21), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(47, -15), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(47, -9), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(47, -3), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(47, 3), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(47, 9), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(47, -27), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(47, -33), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(47, -39), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(32, -21), 6, 6), world.getLoader().getSprite("castle.middle3")));
    world.register(new Block(new Box(new Vector(26, -21), 6, 6), world.getLoader().getSprite("castle.middle3")));

    
	world.register(new Heart(new Vector(17, 10), world.getLoader()));
    world.register(new Exit(new Vector(30, -17), 1.5, 2, world.getLoader(), new Constant(true)));
    
    
    world.register(new BlockDeco(new Vector(-4, 12), 18, 18, world.getLoader(), "bg_castle3"));
    world.register(new BlockDeco(new Vector(6, 6), 18, 18, world.getLoader(), "bg_castle3"));
    world.register(new BlockDeco(new Vector(24, 6), 18, 18, world.getLoader(), "bg_castle3"));
    world.register(new BlockDeco(new Vector(24, -12), 18, 18, world.getLoader(), "bg_castle3"));
    world.register(new BlockDeco(new Vector(6, -12), 18, 18, world.getLoader(), "bg_castle3"));


	 }
}
