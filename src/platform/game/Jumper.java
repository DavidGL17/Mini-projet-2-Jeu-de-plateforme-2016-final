package platform.game;

import platform.util.Box;
import platform.util.Input;
import platform.util.Output;
import platform.util.Vector;
import platform.util.Loader;

public class Jumper extends Actor{

	private Vector position; 
	private double cooldown;
	private Box box;
	private final static String repos = "jumper.normal";
	private final static String retracte = "jumper.extended";
	
	public Jumper(Vector position, Loader loader){
		super(1340, loader, repos);
		this.position = position;
	box = new Box(position, 1.3, 1);
	}
	
	@Override
	public void update(Input input) {
		super.update(input);
		if (!(cooldown <= 0)){
			cooldown -= input.getDeltaTime();
			setSprite(retracte);
		} else {
			setSprite(repos);
		}
	}
	
	@Override
	public void interact(Actor other) {
		super.interact(other);
		if ((cooldown <= 0) && (getBox().isColliding(other.getBox()))){
			Vector below = new Vector(position.getX(), position.getY()-1) ;
			if (other.hurt(this , Damage.AIR, Damage.AIR.getDamage(), below)){
					cooldown = 0.5;
			}
		}
	}
	public boolean isSolid(){
		return true;
	}
	public Box getBox(){
		return box;
	}
	public void draw(Input input, Output output){
		output.drawSprite(getSprite(), getBox());
	}
}
