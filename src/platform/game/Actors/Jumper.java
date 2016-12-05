package platform.game.Actors;

import platform.game.Actor;
import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;
import platform.util.Vector;

public class Jumper extends Actor{

	private Vector position; 
	private double cooldown;
	private final double COOLDOWN = 1;
	private final static String repos = "jumper.normal";
	private final static String retracte = "jumper.extended";
	private final int PRIORITY_COOLDOWN = 1320;
	private final int PRIORITY_NORMAL = 1340;
	
	public Jumper(Vector position, Loader loader){
		super(1340, new Box(position, 1.3, 2), loader, repos);
		this.position = position;
	}
	
	@Override
	public void update(Input input) {
		super.update(input);
		if (!(cooldown <= 0)){
			cooldown -= input.getDeltaTime();
			setSprite(retracte,getWorld().getLoader());
			setPriority(PRIORITY_COOLDOWN);
		} else {
			setSprite(repos,getWorld().getLoader());
			setPriority(PRIORITY_NORMAL);
		}
	}
	
	@Override
	public void interact(Actor other) {
		super.interact(other);
		if ((cooldown <= 0) && (getBox().isColliding(other.getBox()))){
			Vector below = new Vector(position.getX(), position.getY()) ;
			if (other.hurt(this , Damage.AIR, Damage.AIR.getDamage(), below)){
					cooldown = COOLDOWN;
			}
		}
	}
	public boolean isSolid(){
		return true;
	}
	public void draw(Input input, Output output){
		output.drawSprite(getSprite(), getBox());
	}
}
