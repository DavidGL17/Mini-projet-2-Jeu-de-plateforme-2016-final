package platform.game.Actors.levels;

import platform.game.World;
import platform.game.Actors.actorSignal.SignalReadKey;
import platform.game.Actors.blocks.BlockDeco;
import platform.game.Actors.blocks.BlockDecoTexte;
import platform.util.Loader;
import platform.util.Vector;

public class Level_00 extends Level{
	@Override
    public void register(World world) {
		super.register(world);
		Loader loader = getWorld().getLoader();
		world.setView(new Vector(0 , 0), 6);
		SignalReadKey signal1 = new SignalReadKey();
		BlockDecoTexte texte = new BlockDecoTexte(signal1, true);
		texte.register(new BlockDeco(new Vector(0, 0), 10, 15, loader, "zoneTexteLevel00_1"));
		texte.register(new BlockDeco(new Vector(0, 0), 10, 15, loader, "zoneTexteLevel00_2"));
		texte.register(new BlockDeco(new Vector(0, 0), 10, 15, loader, "zoneTexteLevel00_3"));
		texte.register(new BlockDeco(new Vector(0, 0), 10, 15, loader, "zoneTexteLevel00_4"));

		world.register(texte);
		world.register(signal1);
	}
}
