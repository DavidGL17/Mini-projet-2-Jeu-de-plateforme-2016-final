package platform.game.Actors;

import platform.game.Actor;
import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Vector;

//Ces fireball sont celles utilisée par le bosse. Elles sont différentes des fireball normales par le fait qu'els ne sont pas sensibles à la gravité
public class FireballBoss extends Fireball{
	private final double SIZE = 0.8;
	private Vector position;
	private Vector vitesse;
	
	public FireballBoss(Vector vitesse, Vector position, Loader loader, ActeurOverlay owner){
		super(vitesse, position, loader, owner);
		setBox(new Box(getPosition(), SIZE, SIZE));
		this.vitesse = vitesse;
		this.position = position;
	}
	//cette fireball ne suvit pas la gravité, nous devons donc redéfinir interact et update
	@Override
	public void interact(Actor other){
		super.interact(other);
		if (other.isSolid()&&other.getBox()!=null) {
			Vector delta = other.getBox().getCollision(position);
			if (delta != null) {
					position = position.add(delta) ;
					vitesse = vitesse.mirrored(delta) ;
			}
		}
	}
	@Override
	public void update(Input input){
		setCooldown(getCooldown()-input.getDeltaTime());
		if (getCooldown()<=0){
			getWorld().unregister(this);
		}
		double delta = input.getDeltaTime();
		position = position.add(vitesse.mul(delta));
		setBox(new Box(position, SIZE, SIZE));
	}
}
