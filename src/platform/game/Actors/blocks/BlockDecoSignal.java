package platform.game.Actors.blocks;

import platform.game.Signals.Signal;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;
import platform.util.Vector;

//Nous utilisons cette classe pour display du texte principalement
public class BlockDecoSignal extends BlockDeco{
	private final Signal signal;
	private boolean permission = false;
	
	public BlockDecoSignal(Vector position, double width, double height, Loader loader,String dessin,Signal signal){
		super(position, height, width, loader, dessin);
		this.signal = signal;
		permission = signal.isActive();
	}
	public void update (Input input){
		permission = signal.isActive();
	}
	public void draw (Input input, Output output){
		if (permission){
			output.drawSprite(getSprite(), getBox());
		}
	}
}