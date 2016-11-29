package platform.game.level;

import platform.game.Block;
import platform.game.Jumper;
import platform.game.Key;
import platform.game.Limits;
import platform.game.Overlay;
import platform.game.Player;
import platform.game.Spikes;
import platform.game.Spikegauche;
import platform.game.Spikedroite;
import platform.game.World;
import platform.util.Box;
import platform.util.Vector;

public class Level_03 extends Level{
	 @Override
	    public void register(World world) {
	        super.register(world);
	
	
	Player franky = new Player(new Vector(0, -4), new Vector(33, 6), world.getLoader());
	world.register(franky);
	Overlay overlayfranky = new Overlay(franky);
	world.register(overlayfranky);
	world.register(new Limits(new Box(new Vector(0, -42) , 1000, 5)));

	
													// Hill

	world.register(new Block(new Box(new Vector(-12, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));   
	world.register(new Block(new Box(new Vector(-6, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));   
	world.register(new Block(new Box(new Vector(0, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));   
	world.register(new Block(new Box(new Vector(6, -2), 6, 6), world.getLoader().getSprite("grass.middle.center3")));   
	world.register(new Block(new Box(new Vector(12, -2), 6, 6), world.getLoader().getSprite("grass.middle.center3")));   
	world.register(new Block(new Box(new Vector(18, -2), 6, 6), world.getLoader().getSprite("grass.middle.center3")));   
	world.register(new Block(new Box(new Vector(24, -2), 6, 6), world.getLoader().getSprite("grass.middle.center3")));   
	world.register(new Block(new Box(new Vector(30, -2), 6, 6), world.getLoader().getSprite("grass.center3")));  
	world.register(new Block(new Box(new Vector(30, 2), 6, 6), world.getLoader().getSprite("grass.middle.center3")));  
	world.register(new Block(new Box(new Vector(30, -4), 6, 6), world.getLoader().getSprite("grass.center3")));   
	world.register(new Block(new Box(new Vector(30, -10), 6, 6), world.getLoader().getSprite("grass.center3")));   
	world.register(new Block(new Box(new Vector(30, -16), 6, 6), world.getLoader().getSprite("grass.center3")));   
	world.register(new Block(new Box(new Vector(30, -22), 6, 6), world.getLoader().getSprite("grass.center3")));   
	world.register(new Block(new Box(new Vector(30, -28), 6, 6), world.getLoader().getSprite("grass.center3")));   
	world.register(new Block(new Box(new Vector(30, -34), 6, 6), world.getLoader().getSprite("grass.center3")));   
	world.register(new Block(new Box(new Vector(30, -36), 6, 6), world.getLoader().getSprite("grass.center3")));   


	world.register(new Jumper(new Vector(14, 2), world.getLoader()));
	world.register(new Spikes(new Vector(15.5, 1.5), world.getLoader()));
	world.register(new Spikes(new Vector(17, 1.5), world.getLoader()));
	world.register(new Spikes(new Vector(18.5, 1.5), world.getLoader()));
	world.register(new Spikes(new Vector(20, 1.5), world.getLoader()));
	world.register(new Spikes(new Vector(21.5, 1.5), world.getLoader()));
	world.register(new Spikes(new Vector(23, 1.5), world.getLoader()));
	world.register(new Spikes(new Vector(24.5, 1.5), world.getLoader()));
	world.register(new Spikes(new Vector(26, 1.5), world.getLoader()));


													// Castle
	
	world.register(new Block(new Box(new Vector(40, -4), 6, 6), world.getLoader().getSprite("castle.middle.left3"))); 
	world.register(new Block(new Box(new Vector(40, 2), 6, 6), world.getLoader().getSprite("castle.middle.left3")));   
	world.register(new Block(new Box(new Vector(40, 8), 6, 6), world.getLoader().getSprite("castle.middle.left3")));   
	world.register(new Block(new Box(new Vector(40, 14), 6, 6), world.getLoader().getSprite("castle.middle.left3")));   
	world.register(new Block(new Box(new Vector(40, 20), 6, 6), world.getLoader().getSprite("castle.middle.left3")));   
	world.register(new Block(new Box(new Vector(40, -4), 6, 6), world.getLoader().getSprite("castle.middle.left3")));   
	world.register(new Block(new Box(new Vector(40, -10), 6, 6), world.getLoader().getSprite("castle.middle.left3")));   
	world.register(new Block(new Box(new Vector(40, -16), 6, 6), world.getLoader().getSprite("castle.middle.left3")));   
	world.register(new Block(new Box(new Vector(40, -22), 6, 6), world.getLoader().getSprite("castle.middle.left3")));   
	world.register(new Block(new Box(new Vector(40, -30), 6, 6), world.getLoader().getSprite("castle.middle.left3")));   
	world.register(new Block(new Box(new Vector(40, -36), 6, 6), world.getLoader().getSprite("castle.middle.left3")));   
	world.register(new Spikegauche(new Vector(36.5, 7.5), world.getLoader()));
	world.register(new Spikegauche(new Vector(36.5, 9), world.getLoader()));
	world.register(new Spikegauche(new Vector(36.5, 10.5), world.getLoader()));
	world.register(new Spikegauche(new Vector(36.5, 12), world.getLoader()));
	world.register(new Spikegauche(new Vector(36.5, 13.5), world.getLoader()));
	world.register(new Spikegauche(new Vector(36.5, 15), world.getLoader()));
	world.register(new Spikegauche(new Vector(36.5, 16.5), world.getLoader()));
	world.register(new Spikegauche(new Vector(36.5, 6), world.getLoader()));
	world.register(new Spikegauche(new Vector(36.5, 4.5), world.getLoader()));
	world.register(new Spikegauche(new Vector(36.5, 3), world.getLoader()));
	world.register(new Spikedroite(new Vector(33.5, -3), world.getLoader()));
	world.register(new Spikedroite(new Vector(33.5, -4.5), world.getLoader()));
	world.register(new Spikedroite(new Vector(33.5, -6), world.getLoader()));
	world.register(new Spikedroite(new Vector(33.5, -7.5), world.getLoader()));
	world.register(new Spikegauche(new Vector(36.5, -11.5), world.getLoader()));
	world.register(new Spikegauche(new Vector(36.5, -13), world.getLoader()));
	world.register(new Spikegauche(new Vector(36.5, -14.5), world.getLoader()));
	world.register(new Spikedroite(new Vector(33.5, -17), world.getLoader()));
	world.register(new Spikedroite(new Vector(33.5, -18.5), world.getLoader()));
	world.register(new Spikedroite(new Vector(33.5, -19.5), world.getLoader()));
	world.register(new Spikegauche(new Vector(36.5, -22), world.getLoader()));
	world.register(new Spikegauche(new Vector(36.5, -23.5), world.getLoader()));





	
	
	
	 }
}
