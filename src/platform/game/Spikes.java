package platform.game;

import platform.util.Box;
import platform.util.Input;
import platform.util.Vector;
import platform.util.Output;
import platform.util.Sprite;
import platform.util.Loader;

public class Spikes extends Actor{

	private Vector position;
	private final static String spikeHaut = "spikeshaut";
	private final static String spikeBas = "spikesbas";
	private final static String spikeGauche = "spikesgauche";
	private final static String spikeDroite = "spikesdroite";
	private double cooldown;
	private final double COOLDOWN = 1;
	private final int PRIORITY_COOLDOWN = 1320;
	private final int PRIORITY_NORMAL = 1340;
	
	public Spikes(Vector position, Loader loader){
		super(1400, new Box(position, 1.5, 1), loader, spikeHaut);
		this.position = position;
		
	}
	@Override
	public void update(Input input) {
		super.update(input);
		if (!(cooldown <= 0)){
			cooldown -= input.getDeltaTime();
			setPriority(PRIORITY_COOLDOWN);
		} else {
			setPriority(PRIORITY_NORMAL);
		}
	}

	public void interact(Actor other) {
		super.interact(other);
		if ((cooldown <= 0) && (getBox().isColliding(other.getBox()))){
			if (getBox().isColliding(other.getBox())){
			other.hurt(this , Damage.PHYSICAL , Damage.PHYSICAL.getDamage() ,Vector.ZERO);
			cooldown = COOLDOWN;

			}
		}
	}
	public void draw(Input input, Output output){
		output.drawSprite(getSprite(), getBox());
	}
	
	public boolean isSolid(){
		return true;
	}

	
}
