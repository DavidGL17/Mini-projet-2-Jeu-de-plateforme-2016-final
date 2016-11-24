package platform.game;

import platform.util.Box;
import platform.util.Input;
import platform.util.Vector;
import platform.util.Output;
import platform.util.Sprite;
import platform.util.Loader;

public class Spikes extends Actor{

	private Vector position;
	private final static String spikeHaut = "spikes";
	private final static String spikeBas = "spikebas";
	private final static String spikeGauche = "spikegauche";
	private final static String spikeDroite = "spikedroite";
	
	public Spikes(Vector position, Loader loader){
		super(1300, new Box(position, 1.5, 1), loader, spikeHaut);
		this.position = position;
		
	}

	public void interact(Actor other) {
		super.interact(other);
		if (getBox().isColliding(other.getBox())){
			other.hurt(this , Damage.PHYSICAL , 2.0 ,Vector.ZERO);
		}
	}
	public void draw(Input input, Output output){
		output.drawSprite(getSprite(), getBox());
	}
	
	public boolean isSolid(){
		return true;
	}

	
}
