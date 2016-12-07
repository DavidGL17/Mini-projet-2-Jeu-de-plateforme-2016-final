package platform.game.Actors.blocks;

import platform.game.Signals.Signal;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;
import platform.util.Vector;

//Nous utilisons cette classe pour display du texte principalement
public class BlockDecoSignal extends BlockDeco{
	private final Signal signal;
	
	public BlockDecoSignal(Vector position, double height, double width, Loader loader,String dessin,Signal signal){
		super(position, height, width, loader, dessin);
		this.signal = signal;
	}
	public void draw (Input input, Output output){
		if (signal.isActive()){
			output.drawSprite(getSprite(), getBox());
		}
	}
}