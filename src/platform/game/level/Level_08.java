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
    world.register(new Lava(new Box(new Vector(92, -16), 24, 16), loader, "liquidLavaTop_mid6x4"));
    world.register(new Lava(new Box(new Vector(116, -16), 24, 16), loader, "liquidLavaTop_mid6x4"));

    world.register(new Lava(new Box(new Vector(145, -16), 24, 16), loader, "liquidLavaTop_mid6x4"));
    world.register(new Lava(new Box(new Vector(145, -32), 24, 16), loader, "liquidLava2"));

    world.register(new Lava(new Box(new Vector(87, -40), 24, 16), loader, "liquidLava2"));
    world.register(new Lava(new Box(new Vector(111, -40), 24, 16), loader, "liquidLava2"));
    world.register(new Lava(new Box(new Vector(135, -40), 24, 16), loader, "liquidLava2"));
    world.register(new Lava(new Box(new Vector(63, -32), 24, 16), loader, "liquidLava2"));

    
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
    
    Locker locker58 = new Locker(new Vector(59.5, -2.5), world.getLoader(), Locker.red, locker57, true,0.2);
    Locker locker59 = new Locker(new Vector(59.5, -1.5), world.getLoader(), Locker.red, locker58, true,0.2);
    Locker locker60 = new Locker(new Vector(59.5, -0.5), world.getLoader(), Locker.red, locker59, true,0.2);
    Locker locker61 = new Locker(new Vector(59.5, 0.5), world.getLoader(), Locker.red, locker60, true,0.2);
    Locker locker62 = new Locker(new Vector(59.5, 1.5), world.getLoader(), Locker.red, locker61, true,0.2);
    Locker locker63 = new Locker(new Vector(59.5, 2.5), world.getLoader(), Locker.red, locker62, true,0.2);
    Locker locker64 = new Locker(new Vector(59.5, 3.5), world.getLoader(), Locker.red, locker63, true,0.2);
    Locker locker65 = new Locker(new Vector(59.5, 4.5), world.getLoader(), Locker.red, locker64, true,0.2);
    Locker locker66 = new Locker(new Vector(58.5, 4.5), world.getLoader(), Locker.red, locker65, true,0.2);
    Locker locker67 = new Locker(new Vector(57.5, 4.5), world.getLoader(), Locker.red, locker66, true,0.2);
    Locker locker68 = new Locker(new Vector(56.5, 4.5), world.getLoader(), Locker.red, locker67, true,0.2);
    Locker locker69 = new Locker(new Vector(56.5, 5.5), world.getLoader(), Locker.red, locker68, true,0.2);
    Locker locker70 = new Locker(new Vector(56.5, 6.5), world.getLoader(), Locker.red, locker69, true,0.2);
    Locker locker71 = new Locker(new Vector(56.5, 7.5), world.getLoader(), Locker.red, locker70, true,0.2);
    Locker locker72 = new Locker(new Vector(56.5, 8.5), world.getLoader(), Locker.red, locker71, true,0.2);
    Locker locker73 = new Locker(new Vector(57.5, 8.5), world.getLoader(), Locker.red, locker72, true,0.2);
    Locker locker74 = new Locker(new Vector(58.5, 8.5), world.getLoader(), Locker.red, locker73, true,0.2);
    Locker locker75 = new Locker(new Vector(59.5, 8.5), world.getLoader(), Locker.red, locker74, true,0.2);
    Locker locker76 = new Locker(new Vector(60.5, 8.5), world.getLoader(), Locker.red, locker75, true,0.2);
    Locker locker77 = new Locker(new Vector(61.5, 8.5), world.getLoader(), Locker.red, locker76, true,0.2);
    Locker locker78 = new Locker(new Vector(62.5, 8.5), world.getLoader(), Locker.red, locker77, true,0.2);
    Locker locker79 = new Locker(new Vector(63.5, 8.5), world.getLoader(), Locker.red, locker78, true,0.2);
    Locker locker80 = new Locker(new Vector(64.5, 8.5), world.getLoader(), Locker.red, locker79, true,0.2);
    Locker locker81 = new Locker(new Vector(65.5, 8.5), world.getLoader(), Locker.red, locker80, true,0.2);
    Locker locker82 = new Locker(new Vector(66.5, 8.5), world.getLoader(), Locker.red, locker81, true,0.2);
    Locker locker83 = new Locker(new Vector(67.5, 8.5), world.getLoader(), Locker.red, locker82, true,0.2);
    Locker locker84 = new Locker(new Vector(68.5, 8.5), world.getLoader(), Locker.red, locker83, true,0.2);
    Locker locker85 = new Locker(new Vector(69.5, 8.5), world.getLoader(), Locker.red, locker84, true,0.2);
    Locker locker86 = new Locker(new Vector(70.5, 8.5), world.getLoader(), Locker.red, locker85, true,0.2);
    Locker locker87 = new Locker(new Vector(71.5, 8.5), world.getLoader(), Locker.red, locker86, true,0.2);
    Locker locker88 = new Locker(new Vector(72.5, 8.5), world.getLoader(), Locker.red, locker87, true,0.2);
    Locker locker89 = new Locker(new Vector(73.5, 8.5), world.getLoader(), Locker.red, locker88, true,0.2);
    Locker locker90 = new Locker(new Vector(74.5, 8.5), world.getLoader(), Locker.red, locker89, true,0.2);
    Locker locker91 = new Locker(new Vector(75.5, 8.5), world.getLoader(), Locker.red, locker90, true,0.2);
    Locker locker92 = new Locker(new Vector(76.5, 8.5), world.getLoader(), Locker.red, locker91, true,0.2);
    Locker locker93 = new Locker(new Vector(77.5, 8.5), world.getLoader(), Locker.red, locker92, true,0.2);
    Locker locker94 = new Locker(new Vector(77.5, 7.5), world.getLoader(), Locker.red, locker93, true,0.4);
    Locker locker95 = new Locker(new Vector(77.5, 6.5), world.getLoader(), Locker.red, locker94, true,0.4);
    Locker locker96 = new Locker(new Vector(77.5, 5.5), world.getLoader(), Locker.red, locker95, true,0.4);
    Locker locker97 = new Locker(new Vector(77.5, 4.5), world.getLoader(), Locker.red, locker96, true,0.4);
    Locker locker98 = new Locker(new Vector(77.5, 3.5), world.getLoader(), Locker.red, locker97, true,0.4);
    Locker locker99 = new Locker(new Vector(77.5, 2.5), world.getLoader(), Locker.red, locker98, true,0.4);
    Locker locker100 = new Locker(new Vector(77.5, 1.5), world.getLoader(), Locker.red, locker99, true,0.4);
    Locker locker101 = new Locker(new Vector(77.5, 0.5), world.getLoader(), Locker.red, locker100, true,0.4);
    Locker locker102 = new Locker(new Vector(77.5, -0.5), world.getLoader(), Locker.red, locker101, true,0.4);
    Locker locker103 = new Locker(new Vector(77.5, -1.5), world.getLoader(), Locker.red, locker102, true,0.4);
    Locker locker104 = new Locker(new Vector(77.5, -2.5), world.getLoader(), Locker.red, locker103, true,0.4);
    Locker locker105 = new Locker(new Vector(77.5, -3.5), world.getLoader(), Locker.red, locker104, true,0.4);
    Locker locker106 = new Locker(new Vector(77.5, -4.5), world.getLoader(), Locker.red, locker105, true,0.4);
    Locker locker107 = new Locker(new Vector(77.5, -5.5), world.getLoader(), Locker.red, locker106, true,0.4);
    Locker locker108 = new Locker(new Vector(77.5, -6.5), world.getLoader(), Locker.red, locker107, true,0.4);
    Locker locker109 = new Locker(new Vector(77.5, -7.5), world.getLoader(), Locker.red, locker108, true,0.4);
    Locker locker110 = new Locker(new Vector(77.5, -8.5), world.getLoader(), Locker.red, locker109, true,0.4);
    Locker locker111 = new Locker(new Vector(77.5, -9.5), world.getLoader(), Locker.red, locker110, true,0.4);
    Locker locker112 = new Locker(new Vector(77.5, -10.5), world.getLoader(), Locker.red, locker111, true,0.4);
    Locker locker113 = new Locker(new Vector(77.5, -11.5), world.getLoader(), Locker.red, locker112, true,0.4);
    Locker locker114 = new Locker(new Vector(77.5, -12.5), world.getLoader(), Locker.red, locker113, true,0.4);
    Locker locker115 = new Locker(new Vector(77.5, -13.5), world.getLoader(), Locker.red, locker114, true,0.4);
    Locker locker116 = new Locker(new Vector(77.5, -14.5), world.getLoader(), Locker.red, locker115, true,0.4);
    Locker locker117 = new Locker(new Vector(77.5, -15.5), world.getLoader(), Locker.red, locker116, true,0.4);
    Locker locker118 = new Locker(new Vector(77.5, -16.5), world.getLoader(), Locker.red, locker117, true,0.4);
    Locker locker119 = new Locker(new Vector(77.5, -17.5), world.getLoader(), Locker.red, locker118, true,0.4);
    Locker locker120 = new Locker(new Vector(77.5, -18.5), world.getLoader(), Locker.red, locker119, true,0.4);
    Locker locker121 = new Locker(new Vector(77.5, -19.5), world.getLoader(), Locker.red, locker120, true,0.4);
    Locker locker122 = new Locker(new Vector(77.5, -20.5), world.getLoader(), Locker.red, locker121, true,0.4);
    Locker locker123 = new Locker(new Vector(77.5, -21.5), world.getLoader(), Locker.red, locker122, true,0.4);
    Locker locker124 = new Locker(new Vector(77.5, -22.5), world.getLoader(), Locker.red, locker123, true,0.4);
    Locker locker125 = new Locker(new Vector(77.5, -23.5), world.getLoader(), Locker.red, locker124, true,0.4);
    Locker locker126 = new Locker(new Vector(77.5, -24.5), world.getLoader(), Locker.red, locker125, true,0.4);
    Locker locker127 = new Locker(new Vector(77.5, -25.5), world.getLoader(), Locker.red, locker126, true,0.4);
    Locker locker128 = new Locker(new Vector(77.5, -26.5), world.getLoader(), Locker.red, locker127, true,0.4);
    Locker locker129 = new Locker(new Vector(77.5, -27.5), world.getLoader(), Locker.red, locker128, true,0.4);
    Locker locker130 = new Locker(new Vector(77.5, -28.5), world.getLoader(), Locker.red, locker129, true,0.4);
    Locker locker131 = new Locker(new Vector(78.5, -28.5), world.getLoader(), Locker.red, locker130, true,0.2);
    Locker locker132 = new Locker(new Vector(79.5, -28.5), world.getLoader(), Locker.red, locker131, true,0.2);
    Locker locker133 = new Locker(new Vector(80.5, -28.5), world.getLoader(), Locker.red, locker132, true,0.2);
    Locker locker134 = new Locker(new Vector(81.5, -28.5), world.getLoader(), Locker.red, locker133, true,0.2);
    Locker locker135 = new Locker(new Vector(82.5, -28.5), world.getLoader(), Locker.red, locker134, true,0.2);
    Locker locker136 = new Locker(new Vector(83.5, -28.5), world.getLoader(), Locker.red, locker135, true,0.2);
    Locker locker137 = new Locker(new Vector(84.5, -28.5), world.getLoader(), Locker.red, locker136, true,0.2);
    Locker locker138 = new Locker(new Vector(85.5, -28.5), world.getLoader(), Locker.red, locker137, true,0.2);
    Locker locker139 = new Locker(new Vector(86.5, -28.5), world.getLoader(), Locker.red, locker138, true,0.2);
    Locker locker140 = new Locker(new Vector(87.5, -28.5), world.getLoader(), Locker.red, locker139, true,0.2);
    Locker locker141 = new Locker(new Vector(88.5, -28.5), world.getLoader(), Locker.red, locker140, true,0.2);
    Locker locker142 = new Locker(new Vector(89.5, -28.5), world.getLoader(), Locker.red, locker141, true,0.2);
    Locker locker143 = new Locker(new Vector(90.5, -28.5), world.getLoader(), Locker.red, locker142, true,0.2);
    Locker locker144 = new Locker(new Vector(91.5, -28.5), world.getLoader(), Locker.red, locker143, true,0.2);
   
    
    
    world.register(new Block(new Box(new Vector(22, 0), 2, 6), world.getLoader().getSprite("stone.broken.7")));
    world.register(new Scie(new Box(new Vector(36, -2), 2,2), loader, "saw1"));
    world.register(new Scie(new Box(new Vector(40, 1), 2,2), loader, "saw1"));
    world.register(new Scie(new Box(new Vector(44, -2), 2,2), loader, "saw1"));
//    world.register(new Scie(new Box(new Vector(21, 2), 1, 1), loader, "saw1"));
    world.register(new Block(new Box(new Vector(51, 5.5), 2, 6), world.getLoader().getSprite("stone.broken.7")));


    
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
    world.register(locker58);
    world.register(locker59);
    world.register(locker60);
    world.register(locker61);
    world.register(locker62);
    world.register(locker63);
    world.register(locker64);
    world.register(locker65);
    world.register(locker66);
    world.register(locker67);
    world.register(locker68);
    world.register(locker69);
    world.register(locker70);
    world.register(locker71);
    world.register(locker72);
    world.register(locker73);
    world.register(locker74);
    world.register(locker75);
    world.register(locker76);
    world.register(locker77);
    world.register(locker78);
    world.register(locker79);
    world.register(locker80);
    world.register(locker81);
    world.register(locker82);
    world.register(locker83);
    world.register(locker84);
    world.register(locker85);
    world.register(locker86);
    world.register(locker87);
    world.register(locker88);
    world.register(locker89);
    world.register(locker90);
    world.register(locker91);
    world.register(locker92);
    world.register(locker93);
    world.register(locker94);
    world.register(locker95);
    world.register(locker96);
    world.register(locker97);
    world.register(locker98);
    world.register(locker99);
    world.register(locker100);
    world.register(locker101);
    world.register(locker102);
    world.register(locker103);
    world.register(locker104);
    world.register(locker105);
    world.register(locker106);
    world.register(locker107);
    world.register(locker108);
    world.register(locker109);
    world.register(locker110);
    world.register(locker111);
    world.register(locker112);
    world.register(locker113);
    world.register(locker114);
    world.register(locker115);
    world.register(locker116);
    world.register(locker117);
    world.register(locker118);
    world.register(locker119);
    world.register(locker120);
    world.register(locker121);
    world.register(locker122);
    world.register(locker123);
    world.register(locker124);
    world.register(locker125);
    world.register(locker126);
    world.register(locker127);
    world.register(locker128);
    world.register(locker129);
    world.register(locker130);
    world.register(locker131);
    world.register(locker132);
    world.register(locker133);
    world.register(locker134);
    world.register(locker135);
    world.register(locker136);
    world.register(locker137);
    world.register(locker138);
    world.register(locker139);
    world.register(locker140);
    world.register(locker141);
    world.register(locker142);
    world.register(locker143);
    world.register(locker144);


    										// Background
    world.register(new BlockDeco(new Vector(15, -9), 10, 5, world.getLoader(), "pillier2"));
    world.register(new BlockDeco(new Vector(30, -9), 10, 5, world.getLoader(), "pillier2"));
    world.register(new BlockDeco(new Vector(45, -9), 10, 5, world.getLoader(), "pillier2"));

    world.register(new BlockDeco(new Vector(79, -28), 36, 36, world.getLoader(), "lavabackground"));
    world.register(new BlockDeco(new Vector(115, -28), 36, 36, world.getLoader(), "lavabackground"));

    
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
    world.register(new BlockDeco(new Vector(65, 18), 18, 18, world.getLoader(), "bg_castledark3"));
    world.register(new BlockDeco(new Vector(83, 18), 18, 18, world.getLoader(), "bg_castledark3"));
    world.register(new BlockDeco(new Vector(83, 0), 18, 18, world.getLoader(), "bg_castledark3"));
    world.register(new BlockDeco(new Vector(83, -18), 18, 18, world.getLoader(), "bg_castledark3"));

    
    world.register(new BlockDeco(new Vector(6, 0), 500, 505, world.getLoader(), "Background3_0"));

	
	
	
	
	
	
	 }
}
