package platform.game;

import platform.util.Box;
import platform.util.Loader;
import platform.util.Vector;

public class Spikedroite extends Spikes{
	
	private Vector position;
	private final static String spikedroite = "spikesdroite";

	public Spikedroite(Vector position, Loader loader) {
		super(1400, new Box(position, 1, 1.5), loader, spikedroite);

	}
}


