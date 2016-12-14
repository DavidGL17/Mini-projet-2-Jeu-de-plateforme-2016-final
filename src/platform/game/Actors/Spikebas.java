package platform.game.Actors;

import platform.util.Box;
import platform.util.Loader;
import platform.util.Vector;

public class Spikebas extends Spikes {
	
	private final static String spikeBas = "spikesbas";
	
	public Spikebas(Vector position, Loader loader) {
		super(1400, new Box(position, 1.5, 1), loader, spikeBas);
	}

}
