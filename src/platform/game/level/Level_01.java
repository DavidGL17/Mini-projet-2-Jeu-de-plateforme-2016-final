package platform.game.level;

import platform.game.Player;
import platform.game.World;
import platform.util.Vector;

public class Level_01 extends Level {

	 @Override
	    public void register(World world) {
	        super.register(world);
	        
	        // Register a new instance, to restart level automatically
	        world.setNextLevel(new BasicLevel());
	    	Player franky = new Player(new Vector(0, -4), new Vector(-10, 12), world.getLoader());
	    	world.register(franky);
	        
	        
	        
	        
	 }
	
	
	
	
	
	
	
	
}
