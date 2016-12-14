package platform.game.Actors;

import platform.game.Actor;
import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;
import platform.util.Vector;

public class Spikes extends Actor{

	private final static String spikeHaut = "spikes";
	private double cooldown;
	private final double COOLDOWN = 1;
	private final int PRIORITY_COOLDOWN = 1320;
	private final int PRIORITY_NORMAL = 1340;
	
	
	public Spikes(Vector position, Loader loader){
		super(1400, new Box(position, 1.5, 1), loader, spikeHaut);
		
	}
	//Ce constructeur est utilisé par les sous classes
	public Spikes(int i, Box box, Loader loader, String sprite) {
		super(1400,box,loader, sprite);
	}
	@Override
	public void update(Input input) {
		super.update(input);
		if (!(cooldown <= 0)){
			cooldown -= input.getDeltaTime();
			setPriority(PRIORITY_COOLDOWN);
		} else {
			setPriority(PRIORITY_NORMAL);
			cooldown = 0;
		}
	}
	@Override
	public void interact(Actor other) {
		super.interact(other);
		if ((cooldown <= 0) && (getBox().isColliding(other.getBox()))){
			if (other.hurt(this , Damage.PHYSICAL , Damage.PHYSICAL.getDamage() ,Vector.ZERO)){
				cooldown = COOLDOWN;
			}
		}
	}
	@Override
	public void draw(Input input, Output output){
		output.drawSprite(getSprite(), getBox());
	}
	@Override
	public boolean isSolid(){
		return true;
	}

	
}
