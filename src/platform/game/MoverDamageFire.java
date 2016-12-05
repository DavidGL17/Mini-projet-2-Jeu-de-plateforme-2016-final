package platform.game;

import platform.util.Loader;
import platform.util.Vector;

public class MoverDamageFire extends Mover{
	public MoverDamageFire(Vector off, Vector on, double Width, double Height, double vitesseDeMouvement, Loader loader,Signal signal, String dessin){
		super(off, on, Width, Height, vitesseDeMouvement, loader,signal, dessin);
	}
	
	public void interact(Actor other) {
		if (other.getBox().isColliding(getBox())){
			other.hurt(this, Damage.FIRE, Damage.FIRE.getDamage(), getPosition());
		}
	}
	public boolean isSolid(){
		return false;
	}
}
