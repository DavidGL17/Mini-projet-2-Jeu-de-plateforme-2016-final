package platform.game.level;

import platform.game.World;
import platform.game.Block;
import platform.util.Box;
import platform.util.Vector;
import platform.game.Player;
import platform.game.Jumper;
import platform.game.Limits;
import platform.game.Overlay;
import platform.game.Spikes;

public class BasicLevel extends Level {
    // UNCOMMENT ME WHEN NEEDED
    @Override
    public void register(World world) {
        super.register(world);
        
        // Register a new instance, to restart level automatically
        world.setNextLevel(new BasicLevel());
        
        // Create blocks
        world.register(new Block(new Box(new Vector(0, 0), 4, 2), world.getLoader().getSprite("stone.broken.2")));
        world.register(new Block(new Box(new Vector(-1.5, 1.5), 1, 1), world.getLoader().getSprite("stone.broken.1")));
        Block block1 = new Block(new Vector(-4, -1),new Vector(4, 0),world.getLoader());
    	Block block2 = new Block(new Vector(-2, 0),new Vector(-1, 1),world.getLoader());
    	Block block3 = new Block(new Vector(4, 0), new Vector(5, 5), world.getLoader());
    	Player franky = new Player(new Vector(0, -4), new Vector(2, 3), world.getLoader());
    	world.register(franky);
    	Overlay overlayfranky = new Overlay(franky);
    	Jumper jumper = new Jumper(new Vector(3,1.5), world.getLoader());    
    	world.register(new Limits(new Box(new Vector(0, -15) , 1000, 5)));
    	world.register(new Block(new Box(new Vector(-10, 0), 30, 2), world.getLoader().getSprite("stone.broken.2")));
    	world.register(new Spikes(new Vector(-4,1.5), world.getLoader()));
    	world.register(block1);    	
    	world.register(block2);
    	world.register(block3);
    	world.register(overlayfranky);
    	world.register(jumper);
    }
    
}
