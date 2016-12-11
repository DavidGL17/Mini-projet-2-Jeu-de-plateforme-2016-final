package platform.game.Actors;

import platform.game.Actor;
import platform.util.Box;
import platform.util.Input;
import platform.util.Output;
import platform.util.Sprite;

public class Particle extends Actor{
	private double timer = 0;
	private final double COOLDOWN;
	
	public Particle(Box box, Sprite sprite,double Cooldown){
		super(20, box, sprite);
		this.COOLDOWN = Cooldown;
		timer = Cooldown;
	}
	
	@Override
	public void update(Input input) {
		super.update(input) ;
		timer += input.getDeltaTime () ;
		if (timer >= COOLDOWN)
			getWorld ().unregister(this) ;
	}
	@Override
	public void draw(Input input, Output output){
		output.drawSprite(getSprite(), getBox());
	}
}
