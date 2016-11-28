package platform.game.level;

import platform.game.Block;
import platform.game.Limits;
import platform.game.Overlay;
import platform.game.Player;
import platform.game.World;
import platform.util.Box;
import platform.util.Vector;

public class Level_01 extends Level {

	 @Override
	    public void register(World world) {
	        super.register(world);
	        
	        // Register a new instance, to restart level automatically
	        world.setNextLevel(new BasicLevel());
	    	Player franky = new Player(new Vector(0, -4), new Vector(-6, 6), world.getLoader());
	    	world.register(franky);
	    	Overlay overlayfranky = new Overlay(franky);
	    	world.register(overlayfranky);
	    	world.register(new Limits(new Box(new Vector(0, -15) , 1000, 5)));

	        													// Spawn
	    	
	    	world.register(new Block(new Box(new Vector(0, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));    
	    	world.register(new Block(new Box(new Vector(-6, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));    
	    	world.register(new Block(new Box(new Vector(6, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));    
	    	world.register(new Block(new Box(new Vector(14, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));    
	    	world.register(new Block(new Box(new Vector(20, 0), 6, 6), world.getLoader().getSprite("grass.middle.center3")));   
	    	world.register(new Block(new Box(new Vector(10, 0), 2, 6), world.getLoader().getSprite("grass.center1_3")));    
	    	world.register(new Block(new Box(new Vector(10, 4), 2, 2), world.getLoader().getSprite("grass.middle")));    
	    	world.register(new Block(new Box(new Vector(-6, -6), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(0, -6), 6, 6), world.getLoader().getSprite("grass.center3")));    	    	
	    	world.register(new Block(new Box(new Vector(6, -6), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(14, -6), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(20, -6), 6, 6), world.getLoader().getSprite("grass.center3")));    
	    	world.register(new Block(new Box(new Vector(10, -6), 2, 6), world.getLoader().getSprite("grass.center1_3")));    
	    	
	    														// Jump
	    	
	    	world.register(new Block(new Box(new Vector(32, 4), 2, 6), world.getLoader().getSprite("grass.center1_3")));    
	    	world.register(new Block(new Box(new Vector(32, 10), 2, 6), world.getLoader().getSprite("grass.middle1_3")));    





	    	


	        
	        
	 }
	
	
	
	
	
	
	
	
}
