package platform.game.Actors.levels;

import platform.game.Actors.Key;
import platform.game.Actors.Lava;
import platform.game.Actors.LimiteTangible;
import platform.game.Actors.Limits;
import platform.game.Actors.Locker;
import platform.game.Actors.Overlay;
import platform.game.Actors.Player;
import platform.game.Actors.Scie;
import platform.game.Actors.World;
import platform.game.Actors.blocks.Block;
import platform.game.Actors.blocks.BlockDeco;
import platform.game.Actors.blocks.BlockIndecis;
import platform.game.Actors.blocks.Mover;
import platform.game.Actors.blocks.MoverDamageFire;
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

    world.register(new Lava(new Box(new Vector(145, -32), 24, 16), loader, "liquidLava2"));

    world.register(new Lava(new Box(new Vector(87, -40), 24, 16), loader, "liquidLava2"));
    world.register(new Lava(new Box(new Vector(111, -40), 24, 16), loader, "liquidLava2"));
    world.register(new Lava(new Box(new Vector(135, -40), 24, 16), loader, "liquidLava2"));
    world.register(new Lava(new Box(new Vector(63, -32), 24, 16), loader, "liquidLava2"));

    
    										// Lockers
    
    Key keyRed = new Key(new Vector(0, -2), world.getLoader(), Key.red);
	world.register(new Mover(new Vector(2.25, -1), new Vector(2.25, 4), 1.5, 4,1.0, world.getLoader(), keyRed, "stone.7"));
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
  
    Locker locker94 = new Locker(new Vector(77.5, 7.5), world.getLoader(), Locker.red, locker93, true,0.2);
    Locker locker95 = new Locker(new Vector(77.5, 6.5), world.getLoader(), Locker.red, locker94, true,0.2);
    Locker locker96 = new Locker(new Vector(77.5, 5.5), world.getLoader(), Locker.red, locker95, true,0.2);
    Locker locker97 = new Locker(new Vector(77.5, 4.5), world.getLoader(), Locker.red, locker96, true,0.2);
    Locker locker98 = new Locker(new Vector(77.5, 3.5), world.getLoader(), Locker.red, locker97, true,0.2);
    Locker locker99 = new Locker(new Vector(77.5, 2.5), world.getLoader(), Locker.red, locker98, true,0.2);
    Locker locker100 = new Locker(new Vector(77.5, 1.5), world.getLoader(), Locker.red, locker99, true,0.2);
    Locker locker101 = new Locker(new Vector(77.5, 0.5), world.getLoader(), Locker.red, locker100, true,0.2);
    Locker locker102 = new Locker(new Vector(77.5, -0.5), world.getLoader(), Locker.red, locker101, true,0.2);
    Locker locker103 = new Locker(new Vector(77.5, -1.5), world.getLoader(), Locker.red, locker102, true,0.2);
    Locker locker104 = new Locker(new Vector(77.5, -2.5), world.getLoader(), Locker.red, locker103, true,0.2);
    Locker locker105 = new Locker(new Vector(77.5, -3.5), world.getLoader(), Locker.red, locker104, true,0.2);
    Locker locker106 = new Locker(new Vector(77.5, -4.5), world.getLoader(), Locker.red, locker105, true,0.2);
    Locker locker107 = new Locker(new Vector(77.5, -5.5), world.getLoader(), Locker.red, locker106, true,0.2);
    Locker locker108 = new Locker(new Vector(77.5, -6.5), world.getLoader(), Locker.red, locker107, true,0.2);
    Locker locker109 = new Locker(new Vector(77.5, -7.5), world.getLoader(), Locker.red, locker108, true,0.2);
    Locker locker110 = new Locker(new Vector(77.5, -8.5), world.getLoader(), Locker.red, locker109, true,0.2);
    Locker locker111 = new Locker(new Vector(77.5, -9.5), world.getLoader(), Locker.red, locker110, true,0.2);
    Locker locker112 = new Locker(new Vector(77.5, -10.5), world.getLoader(), Locker.red, locker111, true,0.2);
    Locker locker113 = new Locker(new Vector(77.5, -11.5), world.getLoader(), Locker.red, locker112, true,0.2);
    Locker locker114 = new Locker(new Vector(77.5, -12.5), world.getLoader(), Locker.red, locker113, true,0.2);
    Locker locker115 = new Locker(new Vector(77.5, -13.5), world.getLoader(), Locker.red, locker114, true,0.2);
    Locker locker116 = new Locker(new Vector(77.5, -14.5), world.getLoader(), Locker.red, locker115, true,0.2);
    Locker locker117 = new Locker(new Vector(77.5, -15.5), world.getLoader(), Locker.red, locker116, true,0.2);
    Locker locker118 = new Locker(new Vector(77.5, -16.5), world.getLoader(), Locker.red, locker117, true,0.2);
    Locker locker119 = new Locker(new Vector(77.5, -17.5), world.getLoader(), Locker.red, locker118, true,0.2);
    Locker locker120 = new Locker(new Vector(77.5, -18.5), world.getLoader(), Locker.red, locker119, true,0.2);
    Locker locker121 = new Locker(new Vector(77.5, -19.5), world.getLoader(), Locker.red, locker120, true,0.2);
    Locker locker122 = new Locker(new Vector(77.5, -20.5), world.getLoader(), Locker.red, locker121, true,0.2);
    Locker locker123 = new Locker(new Vector(77.5, -21.5), world.getLoader(), Locker.red, locker122, true,0.2);
    Locker locker124 = new Locker(new Vector(77.5, -22.5), world.getLoader(), Locker.red, locker123, true,0.2);
    Locker locker125 = new Locker(new Vector(77.5, -23.5), world.getLoader(), Locker.red, locker124, true,0.2);
    Locker locker126 = new Locker(new Vector(77.5, -24.5), world.getLoader(), Locker.red, locker125, true,0.2);
    Locker locker127 = new Locker(new Vector(77.5, -25.5), world.getLoader(), Locker.red, locker126, true,0.2);
    Locker locker128 = new Locker(new Vector(77.5, -26.5), world.getLoader(), Locker.red, locker127, true,0.2);
    Locker locker129 = new Locker(new Vector(77.5, -27.5), world.getLoader(), Locker.red, locker128, true,0.2);
    Locker locker130 = new Locker(new Vector(77.5, -28.5), world.getLoader(), Locker.red, locker129, true,0.2);
   
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
    Locker locker145 = new Locker(new Vector(91.5, -27.5), world.getLoader(), Locker.red, locker144, true,0.2);
    Locker locker146 = new Locker(new Vector(91.5, -26.5), world.getLoader(), Locker.red, locker145, true,0.2);
    Locker locker147 = new Locker(new Vector(92.5, -26.5), world.getLoader(), Locker.red, locker146, true,0.2);
    Locker locker148 = new Locker(new Vector(93.5, -26.5), world.getLoader(), Locker.red, locker147, true,0.2);
    Locker locker149 = new Locker(new Vector(94.5, -26.5), world.getLoader(), Locker.red, locker148, true,0.2);
    Locker locker150 = new Locker(new Vector(94.5, -27.5), world.getLoader(), Locker.red, locker149, true,0.2);
    Locker locker151 = new Locker(new Vector(94.5, -28.5), world.getLoader(), Locker.red, locker150, true,0.2);
    Locker locker152 = new Locker(new Vector(94.5, -29.5), world.getLoader(), Locker.red, locker151, true,0.2);
    Locker locker153 = new Locker(new Vector(94.5, -30.5), world.getLoader(), Locker.red, locker152, true,0.2);
    Locker locker154 = new Locker(new Vector(95.5, -30.5), world.getLoader(), Locker.red, locker153, true,0.2);
    Locker locker155 = new Locker(new Vector(96.5, -30.5), world.getLoader(), Locker.red, locker154, true,0.2);
    Locker locker156 = new Locker(new Vector(97.5, -30.5), world.getLoader(), Locker.red, locker155, true,0.2);
    Locker locker157 = new Locker(new Vector(98.5, -30.5), world.getLoader(), Locker.red, locker156, true,0.2);
    Locker locker158 = new Locker(new Vector(99.5, -30.5), world.getLoader(), Locker.red, locker157, true,0.2);
    Locker locker159 = new Locker(new Vector(100.5, -30.5), world.getLoader(), Locker.red, locker158, true,0.2);
    Locker locker160 = new Locker(new Vector(101.5, -30.5), world.getLoader(), Locker.red, locker159, true,0.2);
    Locker locker161 = new Locker(new Vector(102.5, -30.5), world.getLoader(), Locker.red, locker160, true,0.2);
    Locker locker162 = new Locker(new Vector(103.5, -30.5), world.getLoader(), Locker.red, locker161, true,0.2);
    Locker locker163 = new Locker(new Vector(104.5, -30.5), world.getLoader(), Locker.red, locker162, true,0.2);
    Locker locker164 = new Locker(new Vector(105.5, -30.5), world.getLoader(), Locker.red, locker163, true,0.2);
    Locker locker165 = new Locker(new Vector(106.5, -30.5), world.getLoader(), Locker.red, locker164, true,0.2);
    Locker locker166 = new Locker(new Vector(107.5, -30.5), world.getLoader(), Locker.red, locker165, true,0.2);
    Locker locker167 = new Locker(new Vector(108.5, -30.5), world.getLoader(), Locker.red, locker166, true,0.2);
    Locker locker168 = new Locker(new Vector(109.5, -30.5), world.getLoader(), Locker.red, locker167, true,0.2);
    Locker locker169 = new Locker(new Vector(110.5, -30.5), world.getLoader(), Locker.red, locker168, true,0.2);
    Locker locker170 = new Locker(new Vector(111.5, -30.5), world.getLoader(), Locker.red, locker169, true,0.2);
    Locker locker171 = new Locker(new Vector(112.5, -30.5), world.getLoader(), Locker.red, locker170, true,0.2);
    Locker locker172 = new Locker(new Vector(113.5, -30.5), world.getLoader(), Locker.red, locker171, true,0.2);
    Locker locker173 = new Locker(new Vector(114.5, -30.5), world.getLoader(), Locker.red, locker172, true,0.2);
    Locker locker174 = new Locker(new Vector(115.5, -30.5), world.getLoader(), Locker.red, locker173, true,0.2);
    Locker locker175 = new Locker(new Vector(116.5, -30.5), world.getLoader(), Locker.red, locker174, true,0.2);
    Locker locker176 = new Locker(new Vector(117.5, -30.5), world.getLoader(), Locker.red, locker175, true,0.2);
    Locker locker177 = new Locker(new Vector(118.5, -30.5), world.getLoader(), Locker.red, locker176, true,0.2);
    Locker locker178 = new Locker(new Vector(119.5, -30.5), world.getLoader(), Locker.red, locker177, true,0.2);
    Locker locker179 = new Locker(new Vector(120.5, -30.5), world.getLoader(), Locker.red, locker178, true,0.2);
    Locker locker180 = new Locker(new Vector(121.5, -30.5), world.getLoader(), Locker.red, locker179, true,0.2);
    Locker locker181 = new Locker(new Vector(122.5, -30.5), world.getLoader(), Locker.red, locker180, true,0.2);
    Locker locker182 = new Locker(new Vector(123.5, -30.5), world.getLoader(), Locker.red, locker181, true,0.2);
    Locker locker183 = new Locker(new Vector(124.5, -30.5), world.getLoader(), Locker.red, locker182, true,0.2);
    Locker locker184 = new Locker(new Vector(125.5, -30.5), world.getLoader(), Locker.red, locker183, true,0.2);
    Locker locker185 = new Locker(new Vector(126.5, -30.5), world.getLoader(), Locker.red, locker184, true,0.2);
    Locker locker186 = new Locker(new Vector(127.5, -30.5), world.getLoader(), Locker.red, locker185, true,0.2);
    Locker locker187 = new Locker(new Vector(128.5, -30.5), world.getLoader(), Locker.red, locker186, true,0.2);
    Locker locker188 = new Locker(new Vector(129.5, -30.5), world.getLoader(), Locker.red, locker187, true,0.2);
    Locker locker189 = new Locker(new Vector(130.5, -30.5), world.getLoader(), Locker.red, locker188, true,0.2);
    Locker locker190 = new Locker(new Vector(131.5, -30.5), world.getLoader(), Locker.red, locker189, true,0.2);
    Locker locker191 = new Locker(new Vector(131.5, -29.5), world.getLoader(), Locker.red, locker190, true,0.2);
    Locker locker192 = new Locker(new Vector(131.5, -28.5), world.getLoader(), Locker.red, locker191, true,0.2);
    Locker locker193 = new Locker(new Vector(131.5, -27.5), world.getLoader(), Locker.red, locker192, true,0.2);
    Locker locker194 = new Locker(new Vector(131.5, -26.5), world.getLoader(), Locker.red, locker193, true,0.2);
    Locker locker195 = new Locker(new Vector(131.5, -25.5), world.getLoader(), Locker.red, locker194, true,0.2);
    Locker locker196 = new Locker(new Vector(131.5, -24.5), world.getLoader(), Locker.red, locker195, true,0.2);
    Locker locker197 = new Locker(new Vector(131.5, -23.5), world.getLoader(), Locker.red, locker196, true,0.2);
    Locker locker198 = new Locker(new Vector(131.5, -22.5), world.getLoader(), Locker.red, locker197, true,0.2);
    Locker locker199 = new Locker(new Vector(131.5, -21.5), world.getLoader(), Locker.red, locker198, true,0.2);
    Locker locker200 = new Locker(new Vector(131.5, -20.5), world.getLoader(), Locker.red, locker199, true,0.2);
    Locker locker201 = new Locker(new Vector(131.5, -19.5), world.getLoader(), Locker.red, locker200, true,0.2);
    Locker locker202 = new Locker(new Vector(131.5, -18.5), world.getLoader(), Locker.red, locker201, true,0.2);
    Locker locker203 = new Locker(new Vector(131.5, -17.5), world.getLoader(), Locker.red, locker202, true,0.2);
    Locker locker204 = new Locker(new Vector(131.5, -16.5), world.getLoader(), Locker.red, locker203, true,0.2);
    Locker locker205 = new Locker(new Vector(131.5, -15.5), world.getLoader(), Locker.red, locker204, true,0.2);
    Locker locker206 = new Locker(new Vector(131.5, -14.5), world.getLoader(), Locker.red, locker205, true,0.2);
    Locker locker207 = new Locker(new Vector(131.5, -13.5), world.getLoader(), Locker.red, locker206, true,0.2);
    Locker locker208 = new Locker(new Vector(131.5, -12.5), world.getLoader(), Locker.red, locker207, true,0.2);
    Locker locker209 = new Locker(new Vector(131.5, -11.5), world.getLoader(), Locker.red, locker208, true,0.2);
    Locker locker210 = new Locker(new Vector(131.5, -10.5), world.getLoader(), Locker.red, locker209, true,0.2);
    Locker locker211 = new Locker(new Vector(131.5, -9.5), world.getLoader(), Locker.red, locker210, true,0.2);
    Locker locker212 = new Locker(new Vector(131.5, -8.5), world.getLoader(), Locker.red, locker211, true,0.2);
    Locker locker213 = new Locker(new Vector(131.5, -7.5), world.getLoader(), Locker.red, locker212, true,0.2);
    Locker locker214 = new Locker(new Vector(132.5, -7.5), world.getLoader(), Locker.red, locker213, true,0.2);
    Locker locker215 = new Locker(new Vector(133.5, -7.5), world.getLoader(), Locker.red, locker214, true,0.2);
    Locker locker216 = new Locker(new Vector(134.5, -7.5), world.getLoader(), Locker.red, locker215, true,0.2);
    Locker locker217 = new Locker(new Vector(135.5, -7.5), world.getLoader(), Locker.red, locker216, true,0.2);
    Locker locker218 = new Locker(new Vector(136.5, -7.5), world.getLoader(), Locker.red, locker217, true,0.2);
    Locker locker219 = new Locker(new Vector(137.5, -7.5), world.getLoader(), Locker.red, locker218, true,0.2);
    Locker locker220 = new Locker(new Vector(138.5, -7.5), world.getLoader(), Locker.red, locker219, true,0.2);
    Locker locker221 = new Locker(new Vector(139.5, -7.5), world.getLoader(), Locker.red, locker220, true,0.2);
    Locker locker222 = new Locker(new Vector(140.5, -7.5), world.getLoader(), Locker.red, locker221, true,0.2);


   
   
    world.register(new Block(new Box(new Vector(22, 0), 2, 6), world.getLoader().getSprite("stone.broken.7")));
    world.register(new Scie(new Box(new Vector(36, -2), 2,2), loader, "saw1"));
    world.register(new Scie(new Box(new Vector(40, 1), 2,2), loader, "saw1"));
    world.register(new Scie(new Box(new Vector(44, -2), 2,2), loader, "saw1"));
    world.register(new Block(new Box(new Vector(51, 5.5), 2, 6), world.getLoader().getSprite("stone.broken.7")));
    world.register(new Scie(new Box(new Vector(90, -27), 2, 2), loader, "saw1"));

    world.register(new Scie(new Box(new Vector(99, -29), 2, 2), loader, "saw1"));
    world.register(new Scie(new Box(new Vector(99, -25), 2, 2), loader, "saw1"));
//    world.register(new Scie(new Box(new Vector(102, -29), 2, 2), loader, "saw1"));		// Ces deux-la sont
//    world.register(new Scie(new Box(new Vector(102, -25), 2, 2), loader, "saw1"));		// peut-�tre un peu chaud

    
    world.register(new Scie(new Box(new Vector(110, -30), 2, 2), loader, "saw1"));
    world.register(new Scie(new Box(new Vector(115, -30), 2, 2), loader, "saw1"));
    world.register(new Scie(new Box(new Vector(115, -25), 2, 2), loader, "saw1"));
    world.register(new Scie(new Box(new Vector(120, -30), 2, 2), loader, "saw1"));
    
    Mover mob = new Mover(new Vector(108, -22), new Vector(108, -25), 1.5, 4, 1, world.getLoader(), locker147 , "pokerMad2");
	world.register(mob);
    Key keytest2 = new Key(new Vector(105, -29), world.getLoader(), Key.red);
    world.register(keytest2);
	MoverDamageFire flame = new MoverDamageFire(new Vector(135, -29), new Vector(65, -29), 1.5, 0.5, 0.1, world.getLoader(), keytest2, "flame2");
	world.register(flame);
	MoverDamageFire flame2 = new MoverDamageFire(new Vector(145, -27), new Vector(75, -27), 1.5, 0.5, 0.1, world.getLoader(), keytest2, "flame2");
	MoverDamageFire flame3 = new MoverDamageFire(new Vector(155, -29), new Vector(85, -29), 1.5, 0.5, 0.1, world.getLoader(), keytest2, "flame2");
	MoverDamageFire flame4 = new MoverDamageFire(new Vector(165, -25), new Vector(95, -25), 1.5, 0.5, 0.1, world.getLoader(), keytest2, "flame2");

	world.register(flame2);
	world.register(flame3);
	world.register(flame4);
  
 
   
    
    										// Parcours
    

    world.register(new Block(new Box(new Vector(87, 13), 2, 8), world.getLoader().getSprite("stone.broken.7")));
    world.register(new Scie(new Box(new Vector(88, 16), 3, 3), loader, "saw1"));
    world.register(new Block(new Box(new Vector(87, 26), 2, 8), world.getLoader().getSprite("stone.broken.7")));
    world.register(new Block(new Box(new Vector(78, 16.5), 2, 2), world.getLoader().getSprite("stone.broken.1")));
    world.register(new Scie(new Box(new Vector(87, 22), 3, 3), loader, "saw1"));
    world.register(new Block(new Box(new Vector(97, 13), 2, 5), world.getLoader().getSprite("stone.broken.7")));
    world.register(new Scie(new Box(new Vector(97, 16), 3, 3), loader, "saw1"));
    world.register(new Scie(new Box(new Vector(93, 7), 5, 5), loader, "saw1"));
    world.register(new Block(new Box(new Vector(87, 5), 2, 8), world.getLoader().getSprite("stone.broken.7")));
    world.register(new Block(new Box(new Vector(87, -3), 2, 8), world.getLoader().getSprite("stone.broken.7")));
    world.register(new Scie(new Box(new Vector(95, 0), 5, 5), loader, "saw1"));
    world.register(new Block(new Box(new Vector(104, 3), 2, 10), world.getLoader().getSprite("stone.broken.7")));
    world.register(new Scie(new Box(new Vector(104, 8.5), 1.9, 1.9), loader, "saw1"));
    world.register(new Block(new Box(new Vector(115, 13), 10, 2), world.getLoader().getSprite("stone.broken.3")));
    world.register(new Scie(new Box(new Vector(104, 12), 3.5, 3.5), loader, "saw1"));
    world.register(new Block(new Box(new Vector(113, 8), 2, 8), world.getLoader().getSprite("stone.broken.7")));
    world.register(new Block(new Box(new Vector(113, -2), 2, 12), world.getLoader().getSprite("stone.broken.7")));
    world.register(new Block(new Box(new Vector(125, 16), 2, 8), world.getLoader().getSprite("stone.broken.7")));
    world.register(new Block(new Box(new Vector(125, 8), 2, 8), world.getLoader().getSprite("stone.broken.7")));
    world.register(new Scie(new Box(new Vector(114, 6), 6, 6), loader, "saw1"));
    world.register(new Scie(new Box(new Vector(124, 2), 6, 6), loader, "saw1"));

    
    										// The wall

    world.register(new BlockIndecis(new Box(new Vector(123, -7), 6, 2), 2, 1, loader, "stone.broken.3", "stone.broken2.3"));

    
    Key keytest = new Key(new Vector(160, -7), world.getLoader(), Key.red);
    world.register(keytest);
    world.register(new MoverDamageFire(new Vector(169, -16), new Vector(169, 50), 24, 16, 0.05, world.getLoader(), keytest, "liquidLavaTop_mid6x4"));
    world.register(new MoverDamageFire(new Vector(145, -16), new Vector(145, 50), 24, 16, 0.05, world.getLoader(), keytest, "liquidLavaTop_mid6x4"));
    
  
    world.register(new Block(new Box(new Vector(174, -5), 20, 12), world.getLoader().getSprite("thewall")));
    world.register(new Block(new Box(new Vector(174, 7), 20, 12), world.getLoader().getSprite("thewall")));
    world.register(new Block(new Box(new Vector(174, 19), 20, 12), world.getLoader().getSprite("thewall")));
    world.register(new Block(new Box(new Vector(174, 31), 20, 12), world.getLoader().getSprite("thewall")));
    world.register(new Block(new Box(new Vector(174, 43), 20, 12), world.getLoader().getSprite("thewall")));
    world.register(new Block(new Box(new Vector(174, 55), 20, 12), world.getLoader().getSprite("thewall")));

    world.register(new Block(new Box(new Vector(145, -8), 8, 2), world.getLoader().getSprite("stone.broken.3")));
    world.register(new Block(new Box(new Vector(153, -8), 8, 2), world.getLoader().getSprite("stone.broken.3")));
    world.register(new Block(new Box(new Vector(161, -8), 8, 2), world.getLoader().getSprite("stone.broken.3")));

    
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
    world.register(new BlockDeco(new Vector(83, 36), 18, 18, world.getLoader(), "bg_castledark3"));
    world.register(new BlockDeco(new Vector(65, 36), 18, 18, world.getLoader(), "bg_castledark3"));
    world.register(new BlockDeco(new Vector(101, 0), 18, 18, world.getLoader(), "bg_castledark3"));
    world.register(new BlockDeco(new Vector(101, 18), 18, 18, world.getLoader(), "bg_castledark3"));
    world.register(new BlockDeco(new Vector(101, 36), 18, 18, world.getLoader(), "bg_castledark3"));
    world.register(new BlockDeco(new Vector(101, -18), 18, 18, world.getLoader(), "bg_castledark3"));
    world.register(new BlockDeco(new Vector(119, 0), 18, 18, world.getLoader(), "bg_castledark3"));
    world.register(new BlockDeco(new Vector(119, -18), 18, 18, world.getLoader(), "bg_castledark3"));
    world.register(new BlockDeco(new Vector(119, 18), 18, 18, world.getLoader(), "bg_castledark3"));
    world.register(new BlockDeco(new Vector(119, 36), 18, 18, world.getLoader(), "bg_castledark3"));
    world.register(new BlockDeco(new Vector(137, 0), 18, 18, world.getLoader(), "bg_castledark3"));
    world.register(new BlockDeco(new Vector(137, 18), 18, 18, world.getLoader(), "bg_castledark3"));
    world.register(new BlockDeco(new Vector(137, 36), 18, 18, world.getLoader(), "bg_castledark3"));
    world.register(new BlockDeco(new Vector(137, -18), 18, 18, world.getLoader(), "bg_castledark3"));
    world.register(new BlockDeco(new Vector(155, 0), 18, 18, world.getLoader(), "bg_castledark3"));
    world.register(new BlockDeco(new Vector(155, -18), 18, 18, world.getLoader(), "bg_castledark3"));
    world.register(new BlockDeco(new Vector(155, 18), 18, 18, world.getLoader(), "bg_castledark3"));
    world.register(new BlockDeco(new Vector(155, 36), 18, 18, world.getLoader(), "bg_castledark3"));


    
    world.register(new BlockDeco(new Vector(6, 0), 500, 505, world.getLoader(), "Background3_0"));

	
											//Register
	
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
    world.register(locker145);
    world.register(locker146);
    world.register(locker147);
    world.register(locker148);
    world.register(locker149);
    world.register(locker150);
    world.register(locker151);
    world.register(locker152);
    world.register(locker153);
    world.register(locker154);
    world.register(locker155);
    world.register(locker156);
    world.register(locker157);
    world.register(locker158);
    world.register(locker159);
    world.register(locker160);
    world.register(locker161);
    world.register(locker162);
    world.register(locker163);
    world.register(locker164);
    world.register(locker165);
    world.register(locker166);
    world.register(locker167);
    world.register(locker168);
    world.register(locker169);
    world.register(locker170);
    world.register(locker171);
    world.register(locker172);
    world.register(locker173);
    world.register(locker174);
    world.register(locker175);
    world.register(locker176);
    world.register(locker177);
    world.register(locker178);
    world.register(locker179);
    world.register(locker180);
    world.register(locker181);
    world.register(locker182);
    world.register(locker183);
    world.register(locker184);
    world.register(locker185);
    world.register(locker186);
    world.register(locker187);
    world.register(locker188);
    world.register(locker189);
    world.register(locker190);
    world.register(locker191);
    world.register(locker192);
    world.register(locker193);
    world.register(locker194);
    world.register(locker195);
    world.register(locker196);
    world.register(locker197);
    world.register(locker198);
    world.register(locker199);
    world.register(locker200);
    world.register(locker201);
    world.register(locker202);
    world.register(locker203);
    world.register(locker204);
    world.register(locker205);
    world.register(locker206);
    world.register(locker207);
    world.register(locker208);
    world.register(locker209);
    world.register(locker210);
    world.register(locker211);
    world.register(locker212);
    world.register(locker213);
    world.register(locker214);
    world.register(locker215);
    world.register(locker216);
    world.register(locker217);
    world.register(locker218);
    world.register(locker219);
    world.register(locker220);
    world.register(locker221);
    world.register(locker222);

	
	
	 }
}
