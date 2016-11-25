package platform.game.level;

import platform.game.World;
import platform.game.Block;
import platform.game.Heart;
import platform.util.Box;
import platform.util.Vector;
import platform.game.Player;
import platform.game.Spikebas;
import platform.game.Spikedroite;
import platform.game.Spikegauche;
import platform.game.Jumper;
import platform.game.Key;
import platform.game.Limits;
import platform.game.Overlay;
import platform.game.Spikes;
import platform.game.Torch;

public class BasicLevel extends Level {
    // UNCOMMENT ME WHEN NEEDED
    @Override
    public void register(World world) {
        super.register(world);
        
        // Register a new instance, to restart level automatically
        world.setNextLevel(new BasicLevel());
        
        // Create blocks
//        world.register(new Block(new Box(new Vector(0, 0), 4, 2), world.getLoader().getSprite("stone.broken.2")));
//        world.register(new Block(new Box(new Vector(-1.5, 1.5), 1, 1), world.getLoader().getSprite("stone.broken.1")));
        Block block1 = new Block(new Vector(-4, -1),new Vector(4, 0),world.getLoader());
    	Block block2 = new Block(new Vector(-2, 0),new Vector(-1, 1),world.getLoader());
    	Block block3 = new Block(new Vector(4, 0), new Vector(5, 5), world.getLoader());
    	Player franky = new Player(new Vector(0, -4), new Vector(-10, 12), world.getLoader());
    	world.register(franky);
    	Overlay overlayfranky = new Overlay(franky);
//    	Jumper jumper = new Jumper(new Vector(2,1.5), world.getLoader());    
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
    	world.register(new Block(new Box(new Vector(6, 6), 2, 2), world.getLoader().getSprite("castleCliffLeft")));    
    	world.register(new Block(new Box(new Vector(8, 6), 2, 2), world.getLoader().getSprite("castleMid")));   
    	world.register(new Block(new Box(new Vector(10, 6), 2, 2), world.getLoader().getSprite("castleMid")));
    	world.register(new Block(new Box(new Vector(12, 6), 2, 2), world.getLoader().getSprite("castleMid")));
    	world.register(new Block(new Box(new Vector(14, 6), 2, 2), world.getLoader().getSprite("castleMid")));
    	world.register(new Block(new Box(new Vector(16, 6), 2, 2), world.getLoader().getSprite("castleMid")));
    	world.register(new Block(new Box(new Vector(18, 6), 2, 2), world.getLoader().getSprite("castleCliffRight")));
    	world.register(new Block(new Box(new Vector(8, 1), 7, 2), world.getLoader().getSprite("liquidLavaTop")));
    	world.register(new Block(new Box(new Vector(15, 1), 7, 2), world.getLoader().getSprite("liquidLavaTop")));
    	world.register(new Spikes(new Vector(-10,1.5), world.getLoader()));
    	world.register(new Spikes(new Vector(-8.5,1.5), world.getLoader()));
    	world.register(new Spikes(new Vector(-7,1.5), world.getLoader()));
    	world.register(new Spikes(new Vector(-5.5,1.5), world.getLoader()));
    	world.register(new Spikes(new Vector(-4,1.5), world.getLoader()));
    	world.register(new Spikes(new Vector(-2.5,1.5), world.getLoader()));
    	world.register(new Spikes(new Vector(-1,1.5), world.getLoader()));
    	world.register(new Spikes(new Vector(0.5,1.5), world.getLoader()));
    	world.register(new Spikes(new Vector(2,1.5), world.getLoader()));
    	world.register(new Heart(new Vector(-3, 7), world.getLoader()));
    	world.register(new Heart(new Vector(-8, 7), world.getLoader()));
    	world.register(new Heart(new Vector(2, 7), world.getLoader()));
//    	world.register(new Spikebas(new Vector(-4,4.9), world.getLoader()));
//    	world.register(new Spikegauche(new Vector(-2.5,3.1), world.getLoader()));
//    	world.register(new Spikedroite(new Vector(-5.5,3.1), world.getLoader()));
    	Key key = new Key(new Vector(2, 8), world.getLoader(), Key.blue);
    	world.register(new Torch(new Vector(-10, 5), world.getLoader()));    	
    	world.register(new Torch(new Vector(2, 5), world.getLoader()));
    	world.register(key);
//    	world.register(block1);    	
//    	world.register(block2);
//    	world.register(block3);
    	world.register(overlayfranky);
//    	world.register(jumper);
    }
    
}
