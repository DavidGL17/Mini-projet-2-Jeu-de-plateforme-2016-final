package platform.game.Actors.levels;

import platform.game.Actors.Exit;
import platform.game.Actors.Player;
import platform.game.Actors.World;
import platform.game.Actors.blocks.Block;
import platform.game.Signals.Constant;
import platform.util.Box;
import platform.util.Loader;
import platform.util.Vector;

public class LevelIntro extends Level{
	@Override
    public void register(World world) {
        super.register(world);
        Loader loader = getWorld().getLoader();
        Player franky = new Player(new Vector(0, 0), new Vector(-2, 3), world.getLoader());
        world.register(franky);
        world.register(new Block(new Box(new Vector(0, -1), 10, 2), loader.getSprite("stone.3")));
        world.register(new Exit(new Vector(4, 1), 1.5, 2, loader, new Constant(true),1));
	}
}
