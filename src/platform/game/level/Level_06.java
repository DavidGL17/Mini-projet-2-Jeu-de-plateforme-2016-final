package platform.game.level;

import platform.game.And;
import platform.game.Block;
import platform.game.BlockDeco;
import platform.game.Exit;
import platform.game.Lever;
import platform.game.LimiteTangible;
import platform.game.Limits;
import platform.game.Not;
import platform.game.Overlay;
import platform.game.Player;
import platform.game.Spikedroite;
import platform.game.Spikebas;
import platform.game.Spikes;
import platform.game.Spikegauche;
import platform.game.Torch;
import platform.game.World;
import platform.util.Box;
import platform.util.Vector;

public class Level_06 extends Level{
	 @Override
	    public void register(World world) {
	        super.register(world);
	
	Player franky = new Player(new Vector(0, -4), new Vector(16, 12), world.getLoader());
	world.register(franky);
	Overlay overlayfranky = new Overlay(franky);
	world.register(overlayfranky);
	
  
    world.register(new BlockDeco(new Vector(-4, 13), 2, 2, world.getLoader(), "door.closed"));
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
    
	
  
    world.register(new Block(new Box(new Vector(2, -21), 6, 6), world.getLoader().getSprite("castle.middle3")));
    world.register(new Block(new Box(new Vector(8, -21), 6, 6), world.getLoader().getSprite("castle.middle3")));
    world.register(new Block(new Box(new Vector(14, -21), 6, 6), world.getLoader().getSprite("castle.middle3")));
    world.register(new Block(new Box(new Vector(20, -21), 6, 6), world.getLoader().getSprite("castle.middle3")));
    world.register(new Block(new Box(new Vector(26, -21), 6, 6), world.getLoader().getSprite("castle.middle3")));
    world.register(new Block(new Box(new Vector(32, -21), 6, 6), world.getLoader().getSprite("castle.middle3")));

    world.register(new Block(new Box(new Vector(7, -10), 4, 8), world.getLoader().getSprite("castle.middle2_4")));
    world.register(new Block(new Box(new Vector(7, -2), 4, 8), world.getLoader().getSprite("castle.middle2_4")));
    world.register(new Block(new Box(new Vector(7, 6), 4, 8), world.getLoader().getSprite("castle.middle2_4")));
    world.register(new Block(new Box(new Vector(7, 11), 4, 8), world.getLoader().getSprite("castle.middle2_4")));

    world.register(new Block(new Box(new Vector(17, -14), 4, 8), world.getLoader().getSprite("castle.middle2_4")));
    world.register(new Block(new Box(new Vector(17, -8), 4, 8), world.getLoader().getSprite("castle.middle2_4")));
    world.register(new Block(new Box(new Vector(17, -2), 4, 8), world.getLoader().getSprite("castle.middle2_4")));
    world.register(new Block(new Box(new Vector(17, 4), 4, 8), world.getLoader().getSprite("castle.middle2_4")));
    
    world.register(new Block(new Box(new Vector(29, 12), 6, 6), world.getLoader().getSprite("castle.middle.left3")));
    world.register(new Block(new Box(new Vector(29, 6), 6, 6), world.getLoader().getSprite("castle.middle.left3")));
    world.register(new Block(new Box(new Vector(29, 0), 6, 6), world.getLoader().getSprite("castle.middle.left3")));
    world.register(new Block(new Box(new Vector(29, -6), 6, 6), world.getLoader().getSprite("castle.middle.left3")));
    world.register(new Block(new Box(new Vector(29, -11), 6, 6), world.getLoader().getSprite("castle.middle.left3")));
    
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


    
    
    world.register(new BlockDeco(new Vector(-4, 12), 18, 18, world.getLoader(), "bg_castle3"));
    world.register(new BlockDeco(new Vector(6, 6), 18, 18, world.getLoader(), "bg_castle3"));
    world.register(new BlockDeco(new Vector(24, 6), 18, 18, world.getLoader(), "bg_castle3"));
    world.register(new BlockDeco(new Vector(24, -12), 18, 18, world.getLoader(), "bg_castle3"));
    world.register(new BlockDeco(new Vector(6, -12), 18, 18, world.getLoader(), "bg_castle3"));


	 }
}
