package platform.game.Actors;

import platform.game.Actor;
import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;
import platform.util.Vector;

public class Heart extends Actor {
	private double cooldown = 0;
	private final double COOLDOWN = 10;
	private Vector position;
	private final  static String HEART = "Heart.full";
	private final static double SIZE = 0.5;
	
	public Heart(Vector position,Loader loader){
		super(1400, new Box(position, SIZE, SIZE), loader, HEART);
		this.position = position;
	}
	
	@Override
	public void interact(Actor other) {
		super.interact(other);
		if ((cooldown <= 0) && (getBox().isColliding(other.getBox()))){
			if (other.hurt(this , Damage.HEAL, Damage.HEAL.getDamage(), position)){
					cooldown = COOLDOWN;
			}
		}
	}
	@Override
	public void update(Input input) {
		super.update(input);
		if (!(cooldown <= 0)){
			cooldown -= input.getDeltaTime();
		}
	}
	@Override
	public void draw(Input input, Output output){
		if (cooldown<=0){
			output.drawSprite(getSprite(), getBox());
		}
	}
}
