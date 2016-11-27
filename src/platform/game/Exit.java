package platform.game;

import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;
import platform.util.Vector;

public class Exit extends Actor{
	private Vector position;
	private double Height;
	private double Width;
	private Signal signal;
	public final static String fermee = "door.closed";
	public final static String ouverte = "door.ouverte";

	public Exit(Vector position, double Width, double Height,Loader loader, Signal signal, int niveauSuivant){
		super(1500, new Box(position, Width, Height), loader.getSprite(fermee));
		this.Height=Height;
		this.Width=Width;
		this.position=position;
		this.signal=signal;
	}
	
	public void interact(Actor other) {
		if (other.getBox().isColliding(getBox())){
			if (other.isPlayer()){
				if (signal.isActive()){
					getWorld().nextLevel();
				}
			}
		}
	}
	public void update(Input input) {
		if (signal.isActive()){
			setSprite(ouverte);
		} else {
			setSprite(fermee);
		}
	}
	// pour être dessiné
	public void draw(Input input , Output output) {
		if (signal.isActive()){
			output.drawSprite(getSprite(), getBox());
		} else {
			output.drawSprite(getSprite(), getBox());
		}
	}
}
