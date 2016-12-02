package platform.game.level;

import platform.game.Block;
import platform.game.BlockDeco;
import platform.game.Key;
import platform.game.Lava;
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
	
											// Castle
	
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
    world.register(new Block(new Box(new Vector(0, -6), 6, 6), world.getLoader().getSprite("castle.middle.corner3")));
    world.register(new Block(new Box(new Vector(-6, -6), 6, 6), world.getLoader().getSprite("castle.middle3")));
    world.register(new Block(new Box(new Vector(-12, -6), 6, 6), world.getLoader().getSprite("castle.middle3")));
    world.register(new Block(new Box(new Vector(-18, -6), 6, 6), world.getLoader().getSprite("castle.middle3")));
    world.register(new Block(new Box(new Vector(-18, -12), 6, 6), world.getLoader().getSprite("castle.center3")));
    world.register(new Block(new Box(new Vector(-12, -6), 6, 6), world.getLoader().getSprite("castle.middle3")));

    										// Lava

    world.register(new Lava(new Box(new Vector(15, -16), 24, 16), loader, "liquidLavaTop_mid6x4"));
    world.register(new Lava(new Box(new Vector(39, -16), 24, 16), loader, "liquidLavaTop_mid6x4"));
    world.register(new Lava(new Box(new Vector(63, -16), 24, 16), loader, "liquidLavaTop_mid6x4"));

    
    										// Lockers
    
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
    
    Locker locker21 = new Locker(new Vector(23.5, -3.5), world.getLoader(), Locker.red, locker20, true,0.2);
    Locker locker22 = new Locker(new Vector(24.5, -3.5), world.getLoader(), Locker.red, locker21, true,0.2);
    Locker locker23 = new Locker(new Vector(25.5, -3.5), world.getLoader(), Locker.red, locker22, true,0.2);
    Locker locker24 = new Locker(new Vector(26.5, -3.5), world.getLoader(), Locker.red, locker23, true,0.2);
    Locker locker25 = new Locker(new Vector(27.5, -3.5), world.getLoader(), Locker.red, locker24, true,0.2);
    Locker locker26 = new Locker(new Vector(28.5, -3.5), world.getLoader(), Locker.red, locker25, true,0.2);
    Locker locker27 = new Locker(new Vector(29.5, -3.5), world.getLoader(), Locker.red, locker26, true,0.2);
    Locker locker28 = new Locker(new Vector(30.5, -3.5), world.getLoader(), Locker.red, locker27, true,0.2);
    Locker locker29 = new Locker(new Vector(31.5, -3.5), world.getLoader(), Locker.red, locker28, true,0.2);
    Locker locker30 = new Locker(new Vector(32.5, -3.5), world.getLoader(), Locker.red, locker29, true,0.2);
    Locker locker31 = new Locker(new Vector(33.5, -3.5), world.getLoader(), Locker.red, locker30, true,0.2);
    Locker locker32 = new Locker(new Vector(34.5, -3.5), world.getLoader(), Locker.red, locker31, true,0.2);
    Locker locker33 = new Locker(new Vector(35.5, -3.5), world.getLoader(), Locker.red, locker32, true,0.2);
    Locker locker34 = new Locker(new Vector(36.5, -3.5), world.getLoader(), Locker.red, locker33, true,0.2);
    Locker locker35 = new Locker(new Vector(37.5, -3.5), world.getLoader(), Locker.red, locker34, true,0.2);
    Locker locker36 = new Locker(new Vector(38.5, -3.5), world.getLoader(), Locker.red, locker35, true,0.2);
    Locker locker37 = new Locker(new Vector(39.5, -3.5), world.getLoader(), Locker.red, locker36, true,0.2);
    Locker locker38 = new Locker(new Vector(40.5, -3.5), world.getLoader(), Locker.red, locker37, true,0.2);
    Locker locker39 = new Locker(new Vector(41.5, -3.5), world.getLoader(), Locker.red, locker38, true,0.2);
    Locker locker40 = new Locker(new Vector(42.5, -3.5), world.getLoader(), Locker.red, locker39, true,0.2);
    Locker locker41 = new Locker(new Vector(43.5, -3.5), world.getLoader(), Locker.red, locker40, true,0.2);
    Locker locker42 = new Locker(new Vector(44.5, -3.5), world.getLoader(), Locker.red, locker41, true,0.2);
    Locker locker43 = new Locker(new Vector(45.5, -3.5), world.getLoader(), Locker.red, locker42, true,0.2);
    Locker locker44 = new Locker(new Vector(46.5, -3.5), world.getLoader(), Locker.red, locker43, true,0.2);
    Locker locker45 = new Locker(new Vector(47.5, -3.5), world.getLoader(), Locker.red, locker44, true,0.2);
    Locker locker46 = new Locker(new Vector(48.5, -3.5), world.getLoader(), Locker.red, locker45, true,0.2);
    Locker locker47 = new Locker(new Vector(49.5, -3.5), world.getLoader(), Locker.red, locker46, true,0.2);
    Locker locker48 = new Locker(new Vector(50.5, -3.5), world.getLoader(), Locker.red, locker47, true,0.2);
    Locker locker49 = new Locker(new Vector(51.5, -3.5), world.getLoader(), Locker.red, locker48, true,0.2);
    Locker locker50 = new Locker(new Vector(52.5, -3.5), world.getLoader(), Locker.red, locker49, true,0.2);
    Locker locker51 = new Locker(new Vector(53.5, -3.5), world.getLoader(), Locker.red, locker50, true,0.2);
    Locker locker52 = new Locker(new Vector(54.5, -3.5), world.getLoader(), Locker.red, locker51, true,0.2);
    Locker locker53 = new Locker(new Vector(55.5, -3.5), world.getLoader(), Locker.red, locker52, true,0.2);
    Locker locker54 = new Locker(new Vector(56.5, -3.5), world.getLoader(), Locker.red, locker53, true,0.2);
    Locker locker55 = new Locker(new Vector(57.5, -3.5), world.getLoader(), Locker.red, locker54, true,0.2);
    Locker locker56 = new Locker(new Vector(58.5, -3.5), world.getLoader(), Locker.red, locker55, true,0.2);
    Locker locker57 = new Locker(new Vector(59.5, -3.5), world.getLoader(), Locker.red, locker56, true,0.2);

    
    
    world.register(new Block(new Box(new Vector(22, 0), 2, 6), world.getLoader().getSprite("stone.broken.7")));
    world.register(new Scie(new Box(new Vector(36, -2), 2,2), loader, "saw1"));
    world.register(new Scie(new Box(new Vector(40, 1), 2,2), loader, "saw1"));
    world.register(new Scie(new Box(new Vector(44, -2), 2,2), loader, "saw1"));

    
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
    world.register(locker21);
    world.register(locker22);
    world.register(locker23);
    world.register(locker24);
    world.register(locker25);
    world.register(locker26);
    world.register(locker27);
    world.register(locker28);
    world.register(locker29);
    world.register(locker30);
    world.register(locker31);
    world.register(locker32);
    world.register(locker33);
    world.register(locker34);
    world.register(locker35);
    world.register(locker36);
    world.register(locker37);
    world.register(locker38);
    world.register(locker39);
    world.register(locker40);
    world.register(locker41);
    world.register(locker42);
    world.register(locker43);
    world.register(locker44);
    world.register(locker45);
    world.register(locker46);
    world.register(locker47);
    world.register(locker48);
    world.register(locker49);
    world.register(locker50);
    world.register(locker51);
    world.register(locker52);
    world.register(locker53);
    world.register(locker54);
    world.register(locker55);
    world.register(locker56);
    world.register(locker57);

    										// Background
    
    world.register(new BlockDeco(new Vector(-7, 0), 18, 18, world.getLoader(), "bg_castle3"));
    world.register(new BlockDeco(new Vector(-25, 0), 18, 18, world.getLoader(), "bg_castle3"));
    world.register(new BlockDeco(new Vector(11, 0), 18, 18, world.getLoader(), "bg_castledark3"));
    world.register(new BlockDeco(new Vector(29, 0), 18, 18, world.getLoader(), "bg_castledark3"));
    world.register(new BlockDeco(new Vector(11, -18), 18, 18, world.getLoader(), "bg_castledark3"));
    world.register(new BlockDeco(new Vector(29, -18), 18, 18, world.getLoader(), "bg_castledark3"));
    world.register(new BlockDeco(new Vector(47, 0), 18, 18, world.getLoader(), "bg_castledark3"));
    world.register(new BlockDeco(new Vector(47, -18), 18, 18, world.getLoader(), "bg_castledark3"));
    world.register(new BlockDeco(new Vector(65, -18), 18, 18, world.getLoader(), "bg_castledark3"));
    world.register(new BlockDeco(new Vector(65, 0), 18, 18, world.getLoader(), "bg_castledark3"));
    world.register(new BlockDeco(new Vector(-7, 18), 18, 18, world.getLoader(), "bg_castledark3"));
    world.register(new BlockDeco(new Vector(11, 18), 18, 18, world.getLoader(), "bg_castledark3"));
    world.register(new BlockDeco(new Vector(29, 18), 18, 18, world.getLoader(), "bg_castledark3"));
    world.register(new BlockDeco(new Vector(47, 18), 18, 18, world.getLoader(), "bg_castledark3"));

    
    world.register(new BlockDeco(new Vector(6, 0), 500, 505, world.getLoader(), "Background3_0"));

	
	
	
	
	
	
	 }
}
