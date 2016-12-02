package platform.game.level;

import platform.game.Limits;
import platform.game.Overlay;
import platform.game.Player;
import platform.game.World;
import platform.util.Box;
import platform.util.Vector;

public class Level_07 extends Level{
	 @Override
	    public void register(World world) {
	        super.register(world);
	
	
	Player franky = new Player(new Vector(0, -4), new Vector(0, 0), world.getLoader());
	world.register(franky);
	Overlay overlayfranky = new Overlay(franky);
	world.register(overlayfranky);
	world.register(new Limits(new Box(new Vector(0, -42) , 1000, 5)));
	
	
	 }
}
