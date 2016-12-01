package platform.game;

import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;
import platform.util.Vector;

public class Teleporteur extends Actor{
	private Vector positionDarrivee;
	private final String dessin1 = "teleporter1";
	private final String dessin2 = "teleporter2";
	private final String dessin3 = "teleporter3";
	private final String dessin4 = "teleporter4";
	private double cooldown = 1;
	
	public Teleporteur(Box box, Vector positionDarrivee){
		super(box,10000);
		this.positionDarrivee = positionDarrivee;
	}
	
	public void interact(Actor other) {
		if (other.getBox()!=null&& other.getBox().isColliding(getBox())){
			if (other.isPlayer()){
				((Player)other).setPosition(positionDarrivee);
			}
		}
	}
	//Pour évoluer au cours du temps
	public void update(Input input){
		cooldown -= input.getDeltaTime();
		if (cooldown<0.75){
			setSprite(dessin2, getWorld().getLoader());
		} else {
			if (cooldown<0.5){
				setSprite(dessin3, getWorld().getLoader());
			} else {
				if (cooldown<0.25){
					setSprite(dessin4, getWorld().getLoader());
				} else {
					if (cooldown<0){
						setSprite(dessin1, getWorld().getLoader());
						cooldown = 1;
					}
				}
			}
		}
	}
	// pour être dessiné
	public void draw(Input input , Output output) {
		output.drawSprite(getSprite(), getBox());
	}
}