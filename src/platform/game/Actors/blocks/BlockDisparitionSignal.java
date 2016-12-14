package platform.game.Actors.blocks;

import platform.game.Signals.Signal;
import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;

public class BlockDisparitionSignal extends Block{
	private boolean apparait;
	private Signal signal;
	private Box box;
	
	public BlockDisparitionSignal(Box box, Loader loader, String dessin, Signal signal){
		super(box, loader.getSprite(dessin));
		this.signal = signal;
		apparait = !signal.isActive();
		this.box = box;
	}
	// Permet d'unregister un block si un signal est lancé
	@Override
	public void update(Input input){
		apparait = !signal.isActive();
		if (!apparait){
			setBox(null);
		} else {
			setBox(box);
		}
	}
	@Override
	public boolean isSolid(){
		if (apparait){
			return true;
		} else {
			 return false;
		}
	}
	@Override
	public void draw(Input input, Output output){
		if (apparait){
			output.drawSprite(getSprite(), getBox());
		}
	}
}
