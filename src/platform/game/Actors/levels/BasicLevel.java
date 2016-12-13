package platform.game.Actors.levels;

import platform.game.World;
import platform.game.Actors.Heart;
import platform.game.Actors.Jumper;
import platform.game.Actors.Key;
import platform.game.Actors.Limits;
import platform.game.Actors.Locker;
import platform.game.Actors.Overlay;
import platform.game.Actors.Player;
import platform.game.Actors.Spikes;
import platform.game.Actors.Torch;
import platform.game.Actors.blocks.Block;
import platform.util.Box;
import platform.util.Vector;

public class BasicLevel extends Level {
    // UNCOMMENT ME WHEN NEEDED
    @Override
    public void register(World world) {
        super.register(world);
        
        // Create blocks
//        world.register(new Block(new Box(new Vector(0, 0), 4, 2), world.getLoader().getSprite("stone.broken.2")));
//        world.register(new Block(new Box(new Vector(-1.5, 1.5), 1, 1), world.getLoader().getSprite("stone.broken.1")));
//    	Block block2 = new Block(new Vector(-2, 0),new Vector(-1, 1),world.getLoader());
//    	Block block3 = new Block(new Vector(4, 0), new Vector(5, 5), world.getLoader());
    	Player franky = new Player(new Vector(0, -4), new Vector(-10, 12), world.getLoader());
    	world.register(franky);
    	Overlay overlayfranky = new Overlay(franky);
    	Jumper jumper = new Jumper(new Vector(12,7.5), world.getLoader()); 
    	
    	world.register(new Block(new Box(new Vector(5, 10), 5, 5), world.getLoader().getSprite("blockerMad")));
    									// Salle 1
    	
    	Key key = new Key(new Vector(2, 8), world.getLoader(), Key.blue);
    	Locker locker1 = (new Locker(new Vector(4, 7.5), world.getLoader(), Locker.blue, key));
//    	Locker locker2 = (new Locker(new Vector(4, 8.5), world.getLoader(), Locker.blue, locker1, true));
//    	Locker locker3 = new Locker(new Vector(4, 9.5), world.getLoader(), Locker.blue, locker2, true);
    	world.register(locker1);
//    	world.register(locker2);
//    	world.register(locker3);
    	world.register(key);
    	world.register(new Limits(new Box(new Vector(0, -15) , 1000, 5)));
    	world.register(new Block(new Box(new Vector(-10, 11), 2, 1), world.getLoader().getSprite("stone.2")));
    	world.register(new Block(new Box(new Vector(-8, 6), 2, 1), world.getLoader().getSprite("stone.2")));
    	world.register(new Block(new Box(new Vector(-3, 6), 2, 1), world.getLoader().getSprite("stone.2")));
    	world.register(new Block(new Box(new Vector(2, 6), 2, 1), world.getLoader().getSprite("stone.2")));
    	world.register(new Block(new Box(new Vector(-10, 0), 6, 2), world.getLoader().getSprite("stone.3")));
    	world.register(new Block(new Box(new Vector(-4, 0), 6, 2), world.getLoader().getSprite("stone.3")));    	
    	world.register(new Block(new Box(new Vector(2, 0), 6, 2), world.getLoader().getSprite("stone.3")));
    	world.register(new Block(new Box(new Vector(2, 14), 6, 2), world.getLoader().getSprite("stone.3")));
    	world.register(new Block(new Box(new Vector(-4, 14), 6, 2), world.getLoader().getSprite("stone.3")));
    	world.register(new Block(new Box(new Vector(-10, 14), 6, 2), world.getLoader().getSprite("stone.3")));
    	world.register(new Block(new Box(new Vector(4, 4), 2, 6), world.getLoader().getSprite("stone.7")));
    	world.register(new Block(new Box(new Vector(4, 12), 2, 4), world.getLoader().getSprite("stone.7")));
    	world.register(new Block(new Box(new Vector(-12, 4), 2, 6), world.getLoader().getSprite("stone.7")));
    	world.register(new Block(new Box(new Vector(-12, 10), 2, 6), world.getLoader().getSprite("stone.7")));
    	world.register(new Spikes(new Vector(-10,1.5), world.getLoader()));
    	world.register(new Spikes(new Vector(-8.5,1.5), world.getLoader()));
    	world.register(new Spikes(new Vector(-7,1.5), world.getLoader()));
    	world.register(new Spikes(new Vector(-5.5,1.5), world.getLoader()));
    	world.register(new Spikes(new Vector(-4,1.5), world.getLoader()));
    	world.register(new Spikes(new Vector(-2.5,1.5), world.getLoader()));
    	world.register(new Spikes(new Vector(-1,1.5), world.getLoader()));
    	world.register(new Spikes(new Vector(0.5,1.5), world.getLoader()));
    	world.register(new Spikes(new Vector(2,1.5), world.getLoader()));
    	
    	world.register(new Block(new Box(new Vector(-10, 18), 6, 6), world.getLoader().getSprite("grass.center3")));
    	
    									// Outdoor
    	
    	world.register(new Block(new Box(new Vector(6, 6), 2, 2), world.getLoader().getSprite("grass.middle")));    
    	world.register(new Block(new Box(new Vector(8, 6), 2, 2), world.getLoader().getSprite("grass.middle")));   
    	world.register(new Block(new Box(new Vector(10, 6), 2, 2), world.getLoader().getSprite("grass.middle")));
    	world.register(new Block(new Box(new Vector(10, 4), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(8, 4), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(6, 4), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(12, 4), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(14, 4), 2, 2), world .getLoader().getSprite("grass.center")));    	
    	world.register(new Block(new Box(new Vector(16, 4), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(18, 4), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(6, 4), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(8, 2), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(10, 2), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(12, 2), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(14, 2), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(16, 2), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(18, 2), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(20, 2), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(20, 4), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(6, 2), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(6, 0), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(8, 0), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(10, 0), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(12, 0), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(14, 0), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(16, 0), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(18, 0), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(20, 0), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(12, 6), 2, 2), world.getLoader().getSprite("grass.middle")));
//    	world.register(new Lava(new Box(new Vector(14, 5.5), 2, 1.5), world.getLoader(),Lava.LAVA_TOP));
//    	world.register(new Lava(new Box(new Vector(16, 5.5), 2, 1.5),  world.getLoader(),Lava.LAVA_TOP));
//    	world.register(new Lava(new Box(new Vector(18, 5.5), 2, 1.5),  world.getLoader(),Lava.LAVA_TOP));
    	world.register(new Block(new Box(new Vector(20, 6), 2, 2), world .getLoader().getSprite("grass.middle")));
    	world.register(new Block(new Box(new Vector(22, 4), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(24, 4), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(26, 4), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(28, 4), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(30, 4), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(22, 2), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(22, 0), 2, 2), world .getLoader().getSprite("grass.center")));   
    	world.register(new Block(new Box(new Vector(24, 0), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(26, 0), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(28, 0), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(30, 0), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(24, 2), 2, 2), world .getLoader().getSprite("grass.center")));    	
    	world.register(new Block(new Box(new Vector(26, 2), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(28, 2), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(30, 2), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(22, 6), 2, 2), world .getLoader().getSprite("grass.middle")));    	
    	world.register(new Block(new Box(new Vector(24, 6), 2, 2), world .getLoader().getSprite("grass.middle")));
    	world.register(new Block(new Box(new Vector(26, 6), 2, 2), world .getLoader().getSprite("grass.middle")));
    	world.register(new Block(new Box(new Vector(28, 6), 2, 2), world .getLoader().getSprite("grass.middle")));
    	world.register(new Block(new Box(new Vector(30, 6), 2, 2), world .getLoader().getSprite("grass.middle")));
//    	Lever lever = new Lever(new Vector(24, 9), world.getLoader());
//    	Mover mover = new Mover(new Vector(24, 8), new Vector(24, 12), 1, 1, world.getLoader(), lever, "grass.middle");
//    	world.register(mover);
//    	world.register(lever);
//    	world.register(new Exit(new Vector(23, 8), 1, 2, world.getLoader(), lever));
    
    										// Saut
    	
    	world.register(new Block(new Box(new Vector(30, 7.5), 1, 1), world .getLoader().getSprite("box.empty")));
    	world.register(new Block(new Box(new Vector(30, 8.5), 1, 1), world .getLoader().getSprite("box.empty")));
    	world.register(new Block(new Box(new Vector(30, 9.5), 1, 1), world .getLoader().getSprite("box.empty")));
    	world.register(new Block(new Box(new Vector(29, 7.5), 1, 1), world .getLoader().getSprite("box.empty")));
    	world.register(new Block(new Box(new Vector(29, 8.5), 1, 1), world .getLoader().getSprite("box.empty")));
    	world.register(new Block(new Box(new Vector(28, 7.5), 1, 1), world .getLoader().getSprite("box.empty")));
    	world.register(new Block(new Box(new Vector(40, 6), 2, 2), world .getLoader().getSprite("grass.middle")));
    	world.register(new Block(new Box(new Vector(40, 4), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(40, 2), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(40, 0), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(40, 6), 2, 2), world .getLoader().getSprite("grass.middle")));
    	world.register(new Block(new Box(new Vector(40, 6), 2, 2), world .getLoader().getSprite("grass.middle")));
    	world.register(new Block(new Box(new Vector(40, 6), 2, 2), world .getLoader().getSprite("grass.middle")));
    	world.register(new Block(new Box(new Vector(40, 7.5), 1, 1), world .getLoader().getSprite("box.empty")));
    	world.register(new Block(new Box(new Vector(40, 8.5), 1, 1), world .getLoader().getSprite("box.empty")));
    	world.register(new Block(new Box(new Vector(40, 9.5), 1, 1), world .getLoader().getSprite("box.empty")));
    	world.register(new Block(new Box(new Vector(41, 7.5), 1, 1), world .getLoader().getSprite("box.empty")));
    	world.register(new Block(new Box(new Vector(41, 8.5), 1, 1), world .getLoader().getSprite("box.empty")));
    	world.register(new Block(new Box(new Vector(42, 7.5), 1, 1), world .getLoader().getSprite("box.empty")));
    	world.register(new Block(new Box(new Vector(35, 11), 1, 1), world .getLoader().getSprite("box.empty")));
    	Jumper jumper2 = new Jumper(new Vector(35,12), world.getLoader());    
    	world.register(new Block(new Box(new Vector(42, 6), 2, 2), world .getLoader().getSprite("grass.middle")));
    	world.register(new Block(new Box(new Vector(42, 4), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(42, 2), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(42, 0), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(44, 6), 2, 2), world .getLoader().getSprite("grass.middle")));
    	world.register(new Block(new Box(new Vector(44, 4), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(44, 2), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(44, 0), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(46, 6), 2, 2), world .getLoader().getSprite("grass.middle")));
    	world.register(new Block(new Box(new Vector(46, 4), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(46, 2), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(46, 0), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(48, 6), 2, 2), world .getLoader().getSprite("grass.middle")));  
    	world.register(new Block(new Box(new Vector(48, 4), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(48, 2), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(48, 0), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(50, 6), 2, 2), world .getLoader().getSprite("grass.middle")));
    	world.register(new Block(new Box(new Vector(50, 4), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(50, 2), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(50, 0), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(52, 6), 2, 2), world .getLoader().getSprite("grass.middle")));
    	world.register(new Block(new Box(new Vector(52, 4), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(52, 2), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(52, 0), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(54, 6), 2, 2), world .getLoader().getSprite("grass.middle")));
    	world.register(new Block(new Box(new Vector(54, 4), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(54, 2), 2, 2), world .getLoader().getSprite("grass.center")));
    	world.register(new Block(new Box(new Vector(54, 0), 2, 2), world .getLoader().getSprite("grass.center")));
    	
//    	world.register(new Heart(new Vector(-3, 7), world.getLoader()));
//    	world.register(new Heart(new Vector(-8, 7), world.getLoader()));
//    	Lever lever = new Lever(new Vector(-8, 7), world.getLoader());
//    	world.register(lever);
    	world.register(new Heart(new Vector(2, 7), world.getLoader()));
//    	world.register(new Spikebas(new Vector(-4,4.9), world.getLoader()));
//    	world.register(new Spikegauche(new Vector(-2.5,3.1), world.getLoader()));
//    	world.register(new Spikedroite(new Vector(-5.5,3.1), world.getLoader()));
    	world.register(new Torch(new Vector(-10, 5), world.getLoader()));    	
    	world.register(new Torch(new Vector(2, 5), world.getLoader()));
//    	world.register(block1);    	
//    	world.register(block2);
//    	world.register(block3);
    	world.register(overlayfranky);
    	world.register(jumper);
    	world.register(jumper2);
    }
    
}
