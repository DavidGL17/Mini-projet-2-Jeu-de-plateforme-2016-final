package platform.game.level;

import platform.game.Block;
import platform.game.BlockDeco;
import platform.game.Key;
import platform.game.LimiteTangible;
import platform.game.Limits;
import platform.game.Locker;
import platform.game.Mover;
import platform.game.Overlay;
import platform.game.Player;
import platform.game.Scie;
import platform.game.World;
import platform.util.Box;
import platform.util.Loader;
import platform.util.Vector;

public class Level_08 extends Level{
	 @Override
	    public void register(World world) {
	        super.register(world);
	Loader loader = world.getLoader();
    world.register(new LimiteTangible(new Vector(-4, 0), 2, 30));

	
	Player franky = new Player(new Vector(0, -4), new Vector(-2, 0), world.getLoader());
	world.register(franky);
	Overlay overlayfranky = new Overlay(franky);
	world.register(overlayfranky);
	world.register(new Limits(new Box(new Vector(0, -42) , 1000, 5)));
	
    world.register(new Block(new Box(new Vector(0, 4), 6, 6), world.getLoader().getSprite("castle.middle.right3")));
    world.register(new Block(new Box(new Vector(0, 10), 6, 6), world.getLoader().getSprite("castle.middle.right3")));
    world.register(new Block(new Box(new Vector(0, 26), 6, 6), world.getLoader().getSprite("castle.middle.right3")));
    world.register(new Block(new Box(new Vector(0, 32), 6, 6), world.getLoader().getSprite("castle.middle.right3")));
    world.register(new Block(new Box(new Vector(0, -12), 6, 6), world.getLoader().getSprite("castle.middle.right3")));
    world.register(new Block(new Box(new Vector(0, -18), 6, 6), world.getLoader().getSprite("castle.middle.right3")));
    world.register(new Block(new Box(new Vector(0, -24), 6, 6), world.getLoader().getSprite("castle.middle.right3")));
    world.register(new Block(new Box(new Vector(0, -30), 6, 6), world.getLoader().getSprite("castle.middle.right3")));
    world.register(new Block(new Box(new Vector(0, -36), 6, 6), world.getLoader().getSprite("castle.middle.right3")));
    world.register(new Block(new Box(new Vector(-6, -12), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-6, -18), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-6, -24), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-6, -30), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-6, -36), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-12, -12), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-12, -18), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-12, -24), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-12, -30), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-12, -36), 6, 6), world.getLoader().getSprite("castle.center3")));


    
    world.register(new Scie(new Box(new Vector(10, -6), 4,4), loader, "saw1"));
    
    world.register(new Block(new Box(new Vector(0, -6), 6, 6), world.getLoader().getSprite("castle.middle.corner3")));
    world.register(new Block(new Box(new Vector(-6, -6), 6, 6), world.getLoader().getSprite("castle.middle3")));
    world.register(new Block(new Box(new Vector(-12, -6), 6, 6), world.getLoader().getSprite("castle.middle3")));
    world.register(new Block(new Box(new Vector(-18, -6), 6, 6), world.getLoader().getSprite("castle.middle3")));
    world.register(new Block(new Box(new Vector(-18, -12), 6, 6), world.getLoader().getSprite("castle.center3")));


    world.register(new Block(new Box(new Vector(-12, -6), 6, 6), world.getLoader().getSprite("castle.middle3")));

    Key keyRed = new Key(new Vector(0, -2), world.getLoader(), Key.red);
	world.register(new Mover(new Vector(2.25, 0), new Vector(2.25, 4), 1.5, 6,1.0, world.getLoader(), keyRed, "stone.7"));
    world.register(keyRed);
    Locker locker2b = new Locker(new Vector(3.5, -8.5), world.getLoader(), Locker.red, keyRed, true, 0.2);
    Locker locker2c = new Locker(new Vector(3.5, -7.5), world.getLoader(), Locker.red, locker2b, true, 0.2);
    Locker locker2d = new Locker(new Vector(3.5, -6.5), world.getLoader(), Locker.red, locker2c, true, 0.2);
    Locker locker2e = new Locker(new Vector(3.5, -5.5), world.getLoader(), Locker.red, locker2d, true, 0.2);
    Locker locker2f = new Locker(new Vector(3.5, -4.5), world.getLoader(), Locker.red, locker2e, true, 0.2);

    Locker locker1 = new Locker(new Vector(3.5, -3.5), world.getLoader(), Locker.red, locker2f, true, 0.2);
    Locker locker2 = new Locker(new Vector(4.5, -3.5), world.getLoader(), Locker.red, locker1, true, 0.2);
    Locker locker3 = new Locker(new Vector(5.5, -3.5), world.getLoader(), Locker.red, locker2, true, 0.2);
    Locker locker4 = new Locker(new Vector(6.5, -3.5), world.getLoader(), Locker.red, locker3, true, 0.2);
    Locker locker5 = new Locker(new Vector(7.5, -3.5), world.getLoader(), Locker.red, locker4, true, 0.2);
    Locker locker6 = new Locker(new Vector(8.5, -3.5), world.getLoader(), Locker.red, locker5, true, 0.2);
    Locker locker7 = new Locker(new Vector(9.5, -3.5), world.getLoader(), Locker.red, locker6, true, 0.2);
    Locker locker8 = new Locker(new Vector(10.5, -3.5), world.getLoader(), Locker.red, locker7, true, 0.2);
    Locker locker9 = new Locker(new Vector(11.5, -3.5), world.getLoader(), Locker.red, locker8, true, 0.2);
    Locker locker10 = new Locker(new Vector(12.5, -3.5), world.getLoader(), Locker.red, locker9, true, 0.2);
    Locker locker11 = new Locker(new Vector(13.5, -3.5), world.getLoader(), Locker.red, locker10, true,0.2);
    Locker locker12 = new Locker(new Vector(14.5, -3.5), world.getLoader(), Locker.red, locker11, true,0.2);
    Locker locker13 = new Locker(new Vector(15.5, -3.5), world.getLoader(), Locker.red, locker12, true,0.2);
    Locker locker14 = new Locker(new Vector(16.5, -3.5), world.getLoader(), Locker.red, locker13, true,0.2);
    Locker locker15 = new Locker(new Vector(17.5, -3.5), world.getLoader(), Locker.red, locker14, true,0.2);
    Locker locker16 = new Locker(new Vector(18.5, -3.5), world.getLoader(), Locker.red, locker15, true,0.2);
    Locker locker17 = new Locker(new Vector(19.5, -3.5), world.getLoader(), Locker.red, locker16, true,0.2);
    Locker locker18 = new Locker(new Vector(20.5, -3.5), world.getLoader(), Locker.red, locker17, true,0.2);
    Locker locker19 = new Locker(new Vector(21.5, -3.5), world.getLoader(), Locker.red, locker18, true,0.2);
    Locker locker20 = new Locker(new Vector(22.5, -3.5), world.getLoader(), Locker.red, locker19, true,0.2);

    world.register(locker1);
    world.register(locker2);
    world.register(locker2b);
    world.register(locker2c);
    world.register(locker2d);
    world.register(locker2e);
    world.register(locker2f);

    world.register(locker3);
    world.register(locker4);
    world.register(locker5);
    world.register(locker6);
    world.register(locker7);
    world.register(locker8);
    world.register(locker9);
    world.register(locker10);
    world.register(locker11);
    world.register(locker12);
    world.register(locker13);
    world.register(locker14);
    world.register(locker15);
    world.register(locker16);
    world.register(locker17);
    world.register(locker18);
    world.register(locker19);
    world.register(locker20);
	
    world.register(new BlockDeco(new Vector(-7, 0), 18, 18, world.getLoader(), "bg_castle3"));
    world.register(new BlockDeco(new Vector(-25, 0), 18, 18, world.getLoader(), "bg_castle3"));
    world.register(new BlockDeco(new Vector(11, 0), 18, 18, world.getLoader(), "bg_castledark3"));
    world.register(new BlockDeco(new Vector(29, 0), 18, 18, world.getLoader(), "bg_castledark3"));
    world.register(new BlockDeco(new Vector(11, -18), 18, 18, world.getLoader(), "bg_castledark3"));
    world.register(new BlockDeco(new Vector(29, -18), 18, 18, world.getLoader(), "bg_castledark3"));

	
	
	
	
	
	
	 }
}
