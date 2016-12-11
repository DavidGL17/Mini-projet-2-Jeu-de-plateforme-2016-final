package platform.game.Actors.levels;

import platform.game.Actors.Exit;
import platform.game.Actors.Heart;
import platform.game.Actors.Lava;
import platform.game.Actors.Overlay;
import platform.game.Actors.Player;
import platform.game.Actors.SignalInvisibleConstant;
import platform.game.Actors.World;
import platform.game.Actors.blocks.Block;
import platform.game.Actors.blocks.BlockDeco;
import platform.game.Actors.blocks.Mover;
import platform.game.Actors.blocks.MoverDamageFire;
import platform.game.Actors.blocks.MoverLava;
import platform.game.Actors.monsters.Boss;
import platform.game.Actors.monsters.Slime;
import platform.util.Box;
import platform.util.Loader;
import platform.util.Vector;

public class LevelBoss extends Level{
	 @Override
	 public void register(World world) {
	        super.register(world);
	        
	    	Player franky = new Player(new Vector(0, -4), new Vector(0, 0), world.getLoader());
	    	world.register(franky);
	    	Overlay overlayfranky = new Overlay(franky);
	    	world.register(overlayfranky);
		    Loader loader = world.getLoader();
		    

		    										// Couloir
		    
		    world.register(new Block(new Box(new Vector(0, 13), 20, 8), world.getLoader().getSprite("castle.top")));
		    world.register(new Block(new Box(new Vector(-2.64, 0), 0.75, 6), world.getLoader().getSprite("castle.wall.left")));
		    world.register(new Block(new Box(new Vector(0, 6), 6, 6), world.getLoader().getSprite("castle.middle.corner6.3")));
		    world.register(new Block(new Box(new Vector(6, 6), 6, 6), world.getLoader().getSprite("castle.middle2.3")));
		    world.register(new Block(new Box(new Vector(12, 6), 6, 6), world.getLoader().getSprite("castle.middle2.3")));
		    world.register(new Block(new Box(new Vector(18, 6), 6, 6), world.getLoader().getSprite("castle.middle2.3")));
		    world.register(new Block(new Box(new Vector(24, 6), 6, 6), world.getLoader().getSprite("castle.middle2.3")));
		    world.register(new Block(new Box(new Vector(30, 6), 6, 6), world.getLoader().getSprite("castle.middle2.3")));
		    world.register(new Block(new Box(new Vector(36, 6), 6, 6), world.getLoader().getSprite("castle.middle2.3")));
		    world.register(new Block(new Box(new Vector(42, 6), 6, 6), world.getLoader().getSprite("castle.middle2.3")));
		    world.register(new Block(new Box(new Vector(48, 6), 6, 6), world.getLoader().getSprite("castle.middle.corner2.3")));
		    world.register(new Block(new Box(new Vector(0, -6), 6, 6), world.getLoader().getSprite("castle.middle.corner5.3")));
		    world.register(new Block(new Box(new Vector(0, -12), 6, 6), world.getLoader().getSprite("castle.middle.left3")));
		    world.register(new Block(new Box(new Vector(6, -6), 6, 6), world.getLoader().getSprite("castle.middle3")));
		    world.register(new Block(new Box(new Vector(6, -12), 6, 6), world.getLoader().getSprite("castle.center3")));
		    world.register(new Block(new Box(new Vector(6, -18), 6, 6), world.getLoader().getSprite("castle.center3")));
		    world.register(new Block(new Box(new Vector(12, -6), 6, 6), world.getLoader().getSprite("castle.middle.corner3")));
		    world.register(new Block(new Box(new Vector(12, -12), 6, 6), world.getLoader().getSprite("castle.center3")));
		    world.register(new Block(new Box(new Vector(12, -18), 6, 6), world.getLoader().getSprite("castle.center3")));
		    world.register(new Block(new Box(new Vector(18, -12), 6, 6), world.getLoader().getSprite("castle.middle3")));
		    world.register(new Block(new Box(new Vector(18, -18), 6, 6), world.getLoader().getSprite("castle.center3")));
		    world.register(new Block(new Box(new Vector(24, -6), 6, 6), world.getLoader().getSprite("castle.middle.corner5.3")));
		    world.register(new Block(new Box(new Vector(24, -12), 6, 6), world.getLoader().getSprite("castle.center3")));
		    world.register(new Block(new Box(new Vector(24, -18), 6, 6), world.getLoader().getSprite("castle.center3")));
		    world.register(new Block(new Box(new Vector(30, -6), 6, 6), world.getLoader().getSprite("castle.middle.corner3")));
		    world.register(new Block(new Box(new Vector(30, -12), 6, 6), world.getLoader().getSprite("castle.center3")));
		    world.register(new Block(new Box(new Vector(30, -18), 6, 6), world.getLoader().getSprite("castle.center3")));
		    world.register(new Block(new Box(new Vector(36, -12), 6, 6), world.getLoader().getSprite("castle.middle3")));
		    world.register(new Block(new Box(new Vector(36, -18), 6, 6), world.getLoader().getSprite("castle.center3")));
		    world.register(new Block(new Box(new Vector(42, -6), 6, 6), world.getLoader().getSprite("castle.middle.corner5.3")));
		    world.register(new Block(new Box(new Vector(42, -12), 6, 6), world.getLoader().getSprite("castle.center3")));
		    world.register(new Block(new Box(new Vector(42, -18), 6, 6), world.getLoader().getSprite("castle.center3")));
		    world.register(new Block(new Box(new Vector(48, -6), 6, 6), world.getLoader().getSprite("castle.middle.corner3")));
		    world.register(new Block(new Box(new Vector(48, -12), 6, 6), world.getLoader().getSprite("castle.center3")));
		    world.register(new Block(new Box(new Vector(48, -18), 6, 6), world.getLoader().getSprite("castle.center3")));
		    SignalInvisibleConstant plaque = new SignalInvisibleConstant(new Box(new Vector(12, 0), 6, 6));
		    world.register(plaque);
		    SignalInvisibleConstant plaque2 = new SignalInvisibleConstant(new Box(new Vector(0, 0), 6, 6));
		    world.register(plaque2);
		    MoverDamageFire flame = new MoverDamageFire(new Vector(50, 0), new Vector(0 , 0), 1.5, 0.5, 0.1, world.getLoader(), plaque, "flame2");
			world.register(flame);
			MoverDamageFire flame2 = new MoverDamageFire(new Vector(50, -2), new Vector(0 , -2), 1.5, 0.5, 0.1, world.getLoader(), plaque2, "flame2");
			world.register(flame2);
			MoverDamageFire flame3 = new MoverDamageFire(new Vector(30, -2), new Vector(-20 , -2), 1.5, 0.5, 0.1, world.getLoader(), plaque2, "flame2");
			world.register(flame3);
			
													// Boss chamber
			
			SignalInvisibleConstant plaque3 = new SignalInvisibleConstant(new Box(new Vector(54, 0), 6, 6));
		    world.register(plaque3);
			world.register(new Mover(new Vector(50, 6), new Vector(50, 0), 2, 6, 1, world.getLoader(), plaque3, "castle.middle2_4"));
			world.register(new Block(new Box(new Vector(47.25, 19), 20, 8), world.getLoader().getSprite("castle.top")));
			world.register(new Block(new Box(new Vector(65.1, 19), 20, 8), world.getLoader().getSprite("castle.top")));
			world.register(new Block(new Box(new Vector(83, 19), 20, 8), world.getLoader().getSprite("castle.top")));
		    world.register(new Block(new Box(new Vector(48, 12), 6, 6), world.getLoader().getSprite("castle.middle.right3")));
		    world.register(new Block(new Box(new Vector(54, 18), 6, 6), world.getLoader().getSprite("castle.middle2.3")));
		    world.register(new Block(new Box(new Vector(60, 18), 6, 6), world.getLoader().getSprite("castle.middle2.3")));
		    world.register(new Block(new Box(new Vector(66, 18), 6, 6), world.getLoader().getSprite("castle.middle2.3")));
		    world.register(new Block(new Box(new Vector(72, 18), 6, 6), world.getLoader().getSprite("castle.middle2.3")));
		    world.register(new Block(new Box(new Vector(78, 18), 6, 6), world.getLoader().getSprite("castle.middle2.3")));
		    world.register(new Block(new Box(new Vector(84, 18), 6, 6), world.getLoader().getSprite("castle.center3")));
		    world.register(new Block(new Box(new Vector(48, 18), 6, 6), world.getLoader().getSprite("castle.center3")));
		    world.register(new Block(new Box(new Vector(42, 12), 6, 6), world.getLoader().getSprite("castle.center3")));
		    world.register(new Block(new Box(new Vector(42, 18), 6, 6), world.getLoader().getSprite("castle.center3")));
		    world.register(new Block(new Box(new Vector(36, 12), 6, 6), world.getLoader().getSprite("castle.center3")));
		    world.register(new Block(new Box(new Vector(36, 18), 6, 6), world.getLoader().getSprite("castle.center3")));
		    world.register(new Block(new Box(new Vector(57, -12), 6, 6), world.getLoader().getSprite("castle.middle3")));
		    world.register(new Block(new Box(new Vector(63, -12), 6, 6), world.getLoader().getSprite("castle.middle3")));
		    world.register(new Block(new Box(new Vector(69, -12), 6, 6), world.getLoader().getSprite("castle.middle3")));
		    world.register(new Block(new Box(new Vector(75, -12), 6, 6), world.getLoader().getSprite("castle.middle3")));
		    world.register(new Block(new Box(new Vector(84, -12), 6, 6), world.getLoader().getSprite("castle.center3")));
		    world.register(new Block(new Box(new Vector(84, -18), 6, 6), world.getLoader().getSprite("castle.center3")));
		    Block blockDisparaitra1 = new Block(new Box(new Vector(84, -6), 6, 6), world.getLoader().getSprite("castle.middle.left3"));
		    world.register(blockDisparaitra1);
		    world.register(new Block(new Box(new Vector(84, 0), 6, 6), world.getLoader().getSprite("castle.middle.left3")));
		    world.register(new Block(new Box(new Vector(84, 6), 6, 6), world.getLoader().getSprite("castle.middle.left3")));
		    world.register(new Block(new Box(new Vector(84, 12), 6, 6), world.getLoader().getSprite("castle.middle.left3")));
		    world.register(new Block(new Box(new Vector(90, 0), 6, 6), world.getLoader().getSprite("castle.middle.right3")));
		    Block blockDisparaitra2 = new Block(new Box(new Vector(90, -6), 6, 6), world.getLoader().getSprite("castle.middle.right3"));
		    world.register(blockDisparaitra2);
		    world.register(new Block(new Box(new Vector(90, -12), 6, 6), world.getLoader().getSprite("castle.middle.right3")));
		    world.register(new Block(new Box(new Vector(90, -18), 6, 6), world.getLoader().getSprite("castle.middle.right3")));
		    world.register(new Block(new Box(new Vector(90, 6), 6, 6), world.getLoader().getSprite("castle.middle.right3")));
		    world.register(new Block(new Box(new Vector(90, 12), 6, 6), world.getLoader().getSprite("castle.middle.right3")));
		    world.register(new Block(new Box(new Vector(90, 18), 6, 6), world.getLoader().getSprite("castle.middle.corner3")));
		    world.register(new Lava(new Box(new Vector(66, -22), 30, 16), loader, "liquidLavaTop_mid26x4"));

		    world.register(new Block(new Box(new Vector(78, 4), 6, 2), world.getLoader().getSprite("stone.3")));
		    world.register(new Block(new Box(new Vector(72, 4), 6, 2), world.getLoader().getSprite("stone.3")));
		    world.register(new Block(new Box(new Vector(68, 6), 2, 6), world.getLoader().getSprite("stone.7")));
		    world.register(new Block(new Box(new Vector(68, 12), 2, 6), world.getLoader().getSprite("stone.7")));
//		    world.register(new BlockIndecis(new Box(new Vector(65, -7), 3, 1), 2, 1, loader, "stone.broken.3", "stone.broken2.3"));
//		    world.register(new BlockIndecis(new Box(new Vector(70, -5), 3, 1), 2, 2, loader, "stone.broken.3", "stone.broken2.3"));
//		    world.register(new BlockIndecis(new Box(new Vector(63, -2), 3, 1), 3, 1, loader, "stone.broken.3", "stone.broken2.3"));
//		    world.register(new BlockIndecis(new Box(new Vector(58, 0), 3, 1), 2, 2, loader, "stone.broken.3", "stone.broken2.3"));

		    
		    										// Interphase 1

		    Slime minion1 = new Slime(new Vector(0, 0), new Vector(60, -8.5),0.01,4, new Box(new Vector(65.5, -8), 20, 5), loader, 1,1,false);
		    										// Interphase 2
	    
	   		MoverLava lava = new MoverLava(new Vector(66, -22), new Vector(66, 5), 30, 16,new Box(new Vector(66,-18), 30,13), 0.075, world.getLoader(), plaque3, "liquidLavaTop_mid26x4"); // 9s
	    	Heart coeurInterphase2 = new  Heart(new Vector(65, -8), world.getLoader());
		    										// Phase 3
		
			Lava lavaPhase3NoWalljump = new Lava(new Box(new Vector(52.5, -8), 3, 16), loader, "colonnelava");
		    
			Block blockDisparitionSignalDeadARemplacer[] = {blockDisparaitra1,blockDisparaitra2};
		    //Boss
		    Boss Donald = new Boss(new Vector(0, 0), new Vector(74.5, -5), new Vector(75, 9), 8, 8, plaque3,minion1.getBoxDAction(), minion1.getPosition(), coeurInterphase2.getPosition(), lava, 12, lavaPhase3NoWalljump, blockDisparitionSignalDeadARemplacer, loader);
		    world.register(Donald);
		    world.register(new Overlay(Donald));
		    
		    										// After Story (not a Clannad reference)
		    world.register(new Block(new Box(new Vector(132, 0), 6, 6), world.getLoader().getSprite("des1")));
		    world.register(new Block(new Box(new Vector(132, -10), 6, 6), world.getLoader().getSprite("des3")));
		    world.register(new Block(new Box(new Vector(132, -16), 6, 6), world.getLoader().getSprite("castle.center3")));
		    world.register(new Block(new Box(new Vector(138, -22), 6, 6), world.getLoader().getSprite("castle.center3")));
		    world.register(new Block(new Box(new Vector(138, -16), 6, 6), world.getLoader().getSprite("castle.center3")));
		    world.register(new Block(new Box(new Vector(138, -10), 6, 6), world.getLoader().getSprite("castle.center3")));
		    world.register(new Block(new Box(new Vector(138, -4), 6, 6), world.getLoader().getSprite("des2")));
		    world.register(new Block(new Box(new Vector(138, 2), 6, 6), world.getLoader().getSprite("castle.center3")));
		    world.register(new Block(new Box(new Vector(132, 4), 6, 6), world.getLoader().getSprite("des2")));

		    world.register(new Block(new Box(new Vector(126, -8.5), 1, 1), world.getLoader().getSprite("blocker.happy")));
		    world.register(new Block(new Box(new Vector(133, -6.5), 1, 1), world.getLoader().getSprite("blocker.happy")));
		    world.register(new Block(new Box(new Vector(131, -9.3), 1, 1), world.getLoader().getSprite("blocker.happy")));

		    
		    world.register(new Block(new Box(new Vector(111, -15), 36, 12), world.getLoader().getSprite("grass.middle.center36_12")));
	    	world.register(new BlockDeco(new Vector(103, -8), 2, 20, world.getLoader(), "longbush2"));
	    	world.register(new BlockDeco(new Vector(119, -8), 2, 20, world.getLoader(), "longbush2"));
	    	world.register(new Exit(new Vector(128, -8), 1.5, 2, world.getLoader(), plaque3));
	    
		    										// Background

		    world.register(new BlockDeco(new Vector(6, 0), 18, 18, world.getLoader(), "bg_castledark3"));
		    world.register(new BlockDeco(new Vector(24, 0), 18, 18, world.getLoader(), "bg_castledark3"));
		    world.register(new BlockDeco(new Vector(42, 0), 18, 18, world.getLoader(), "bg_castledark3"));
		    world.register(new BlockDeco(new Vector(60, 10), 18, 18, world.getLoader(), "bg_castledark3"));
		    world.register(new BlockDeco(new Vector(60, 0), 18, 18, world.getLoader(), "bg_castledark3"));
		    world.register(new BlockDeco(new Vector(60, -18), 18, 18, world.getLoader(), "bg_castledark3"));
		    world.register(new BlockDeco(new Vector(78, 10), 18, 18, world.getLoader(), "bg_castledark3"));
		    world.register(new BlockDeco(new Vector(78, 0), 18, 18, world.getLoader(), "bg_castledark3"));
		    world.register(new BlockDeco(new Vector(78, -18), 18, 18, world.getLoader(), "bg_castledark3"));
		    world.register(new BlockDeco(new Vector(120, 0), 20, 100, world.getLoader(), "Background_112"));

		    world.register(new BlockDeco(new Vector(80, 19), 20, 100, world.getLoader(), "Background_112"));
		    world.register(new BlockDeco(new Vector(111, -2), 15, 25, world.getLoader(), "Background_18"));

		    world.register(new BlockDeco(new Vector(0, 0), 20, 100, world.getLoader(), "Background_112"));
			world.register(new BlockDeco(new Vector(6, 0), 500, 505, world.getLoader(), "Background2_1"));
	 }
}
