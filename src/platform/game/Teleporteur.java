package platform.game;

import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;
import platform.util.Vector;

public class Teleporteur extends Actor{
	private Vector positionDarrivee;
	private String dessin;
	
	public Teleporteur(Box box, Vector positionDarrivee, Loader loader, String dessin){
		super(10000, box, loader, dessin);
		this.positionDarrivee = positionDarrivee;
	}
	
	public void interact(Actor other) {
		if (other.getBox()!=null&& other.getBox().isColliding(getBox())){
			if (other.isPlayer()){
				((Player)other).setPosition(positionDarrivee);
			}
		}
	}
	// pour être dessiné
	public void draw(Input input , Output output) {
		output.drawSprite(getSprite(), getBox());
	}
}
