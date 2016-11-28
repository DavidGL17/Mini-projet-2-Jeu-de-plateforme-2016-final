package platform.game.level;

import platform.game.Block;
import platform.game.Exit;
import platform.game.Key;
import platform.game.LimiteTangible;
import platform.game.Limits;
import platform.game.Locker;
import platform.game.Overlay;
import platform.game.Player;
import platform.game.World;
import platform.util.Box;
import platform.util.Vector;

public class Level_02 extends Level{
	 @Override
	    public void register(World world) {
        super.register(world);

		Player franky = new Player(new Vector(0, 1), new Vector(0, 0), world.getLoader());
	    world.register(franky);
	    Overlay overlayfranky = new Overlay(franky);
	    world.register(overlayfranky);
	    world.register(new Limits(new Box(new Vector(0, -19), 300, 1)));
	    world.register(new LimiteTangible(new Vector(-4, 0), 2, 30));
	    world.register(new Block(new Box(new Vector(0, -3), 6, 6), world.getLoader().getSprite("grass.middle.center3")));
	    world.register(new Block(new Box(new Vector(0, -9), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(0, -15), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(6, -3), 6, 6), world.getLoader().getSprite("grass.middle.center3")));
	    world.register(new Block(new Box(new Vector(6, -9), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(6, -15), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(12, -3), 6, 6), world.getLoader().getSprite("grass.middle.center3")));
	    world.register(new Block(new Box(new Vector(12, -9), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(12, -15), 6, 6), world.getLoader().getSprite("grass.center3")));
	    
	    world.register(new Block(new Box(new Vector(18, -9), 6, 6), world.getLoader().getSprite("grass.middle.center3")));
	    world.register(new Block(new Box(new Vector(24, -9), 6, 6), world.getLoader().getSprite("grass.middle.center3")));
	    world.register(new Block(new Box(new Vector(18, -15), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(24, -15), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(30, -9), 6, 6), world.getLoader().getSprite("grass.middle.center3")));
	    world.register(new Block(new Box(new Vector(30, -15), 6, 6), world.getLoader().getSprite("grass.center3")));
	    
	    world.register(new Block(new Box(new Vector(36, -3), 6, 6), world.getLoader().getSprite("grass.middle.center3")));
	    world.register(new Block(new Box(new Vector(36, -9), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(36, -15), 6, 6), world.getLoader().getSprite("grass.center3")));
	    
	    world.register(new Block(new Box(new Vector(26, 15), 2, 6), world.getLoader().getSprite("grass.middle1_3")));
	    world.register(new Block(new Box(new Vector(26, 9), 2, 6), world.getLoader().getSprite("grass.center1_3")));
	    world.register(new Block(new Box(new Vector(26, 3), 2, 6), world.getLoader().getSprite("grass.center1_3")));
	    
	    world.register(new Block(new Box(new Vector(36, 9), 6, 6), world.getLoader().getSprite("grass.middle.center3")));
	    world.register(new Block(new Box(new Vector(42, 9), 6, 6), world.getLoader().getSprite("grass.middle.center3")));
	    world.register(new Block(new Box(new Vector(42, 3), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(42, -3), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(42, -9), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(42, -15), 6, 6), world.getLoader().getSprite("grass.center3")));
	    
	    world.register(new Block(new Box(new Vector(48, 9), 6, 6), world.getLoader().getSprite("grass.middle.center3")));
	    world.register(new Block(new Box(new Vector(48, 3), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(48, -3), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(48, -9), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(48, -15), 6, 6), world.getLoader().getSprite("grass.center3")));
	    
	    world.register(new Block(new Box(new Vector(52, -17), 2, 6), world.getLoader().getSprite("grass.center1_3")));
	    world.register(new Block(new Box(new Vector(54, -17), 2, 6), world.getLoader().getSprite("grass.center1_3")));
	    world.register(new Block(new Box(new Vector(52, -11), 2, 6), world.getLoader().getSprite("grass.center1_3")));
	    world.register(new Block(new Box(new Vector(54, -11), 2, 6), world.getLoader().getSprite("grass.center1_3")));
	    world.register(new Block(new Box(new Vector(52, -5), 2, 6), world.getLoader().getSprite("grass.center1_3")));
	    world.register(new Block(new Box(new Vector(54, -5), 2, 6), world.getLoader().getSprite("grass.center1_3")));
	    world.register(new Block(new Box(new Vector(52, 1), 2, 6), world.getLoader().getSprite("grass.center1_3")));
	    world.register(new Block(new Box(new Vector(54, 1), 2, 6), world.getLoader().getSprite("grass.center1_3")));
	    world.register(new Jumper(new Vector(54, 5), world.getLoader()));
	    Key keyRed = new Key(new Vector(52, 4.5), world.getLoader(), Key.red);
	    Locker locker1 = new Locker(new Vector(57, 12.5), world.getLoader(), Locker.red, keyRed);
	    Locker locker2 = new Locker(new Vector(59, 12.5), world.getLoader(), Locker.red, keyRed);
	    Locker locker3 = new Locker(new Vector(57, 13.5), world.getLoader(), Locker.red, keyRed);
	    Locker locker4 = new Locker(new Vector(59, 13.5), world.getLoader(), Locker.red, keyRed);
	    Locker locker5 = new Locker(new Vector(58, 14.5), world.getLoader(), Locker.red, keyRed);
	    world.register(locker1);
	    world.register(locker2);
	    world.register(locker3);
	    world.register(locker4);
	    world.register(locker5);
	    world.register(keyRed);
	    world.register(new Exit(new Vector(58, 13), 1, 2, world.getLoader(), keyRed));

	    
	    world.register(new Block(new Box(new Vector(58, 9), 6, 6), world.getLoader().getSprite("grass.middle.center3")));
	    world.register(new Block(new Box(new Vector(58, 3), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(58, -3), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(58, -9), 6, 6), world.getLoader().getSprite("grass.center3")));
	    world.register(new Block(new Box(new Vector(58, -15), 6, 6), world.getLoader().getSprite("grass.center3")));
	 }
}
