package platform.game.Actors.blocks;

import platform.game.Actor;
import platform.game.Actors.Damage;
import platform.game.Signals.Signal;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Vector;

public class MoverDamageFire extends Mover{
	public MoverDamageFire(Vector off, Vector on, double Width, double Height, double vitesseDeMouvement, Loader loader,Signal signal, String dessin){
		super(off, on, Width, Height, vitesseDeMouvement, loader,signal, dessin);
		setPriority(1400);
	}
	private final double COOLDOWN_MAX = 0.5;
	private double cooldownDegats = COOLDOWN_MAX;
	
	public void interact(Actor other) {
		if (getBox().isColliding(other.getBox())){
			if (cooldownDegats <= 0){
				other.hurt(this, Damage.FIRE, Damage.FIRE.getDamage(), getPosition());
				cooldownDegats = COOLDOWN_MAX;
			}
		}
	}
	public void update (Input input){
		super.update(input);
		cooldownDegats -= input.getDeltaTime();
		if (cooldownDegats < 0){
			cooldownDegats = 0;
		}
	}
	public boolean isSolid(){
		return false;
	}
}
