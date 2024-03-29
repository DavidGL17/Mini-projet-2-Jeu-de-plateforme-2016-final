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
	public boolean isSolid(){
		return true;
	}
	
	//La priorité change si le jumper est en repos, pour que le joueur rentre en collision avec vu que Jumper est solid est solide
	@Override
	public void update(Input input) {
		super.update(input);
		if (!(cooldown <= 0)){
			cooldown -= input.getDeltaTime();
			setSprite(getWorld().getLoader().getSprite(retracte));
			setPriority(PRIORITY_COOLDOWN);
		} else {
			setSprite(getWorld().getLoader().getSprite(repos));
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
	@Override
	public void draw(Input input, Output output){
		output.drawSprite(getSprite(), getBox());
	}
}
