package platform.game.Blocks;

import platform.game.Actor;
import platform.game.Actors.Damage;
import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;
import platform.util.Vector;

public class BlockDestructible extends Actor{
	private boolean destruction = false;
	private String dessinDestruction;
	private double cooldown = 1;
	
	public BlockDestructible(Vector position, double width, double height, Loader loader, String dessinIntact, String dessinDestruction){
		super(0, new Box(position, width, height), loader.getSprite(dessinIntact));
		this.dessinDestruction = dessinDestruction;
	}
	
	public boolean hurt(Actor instigator , Damage type , double amount , Vector location) {
		super.hurt(instigator, type, amount, location);
		switch(type) {
		case FIRE : 
			if (!destruction){
				getWorld().unregister(instigator);
			}
			setSprite(dessinDestruction, getWorld().getLoader());
			destruction = true;
			return true;
		default :
			return false;
		}
	}
	// pour évoluer au cours du temps :
	public void update(Input input) {
		if (destruction){
			cooldown -= input.getDeltaTime();
		}
		if (cooldown<=0){
			setBox(null);
			destruction = false;
		}
	}
	// pour être dessiné
	public void draw(Input input , Output output) {
		if (getBox()!=null){
			output.drawSprite(getSprite(), getBox());
		}
	}
}