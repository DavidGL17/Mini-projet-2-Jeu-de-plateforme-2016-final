package platform.game.Actors;

import platform.game.Actor;
import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;
import platform.util.Vector;

public class Teleporteur extends Actor{
	private Vector positionDarrivee;
	private static final String dessin1 = "portal1";
	private final String dessin2 = "portal2";
	private final String dessin3 = "portal3";
	private final String dessin4 = "portal4";
	private double cooldown = 1;
	
	public Teleporteur(Box box, Vector positionDarrivee, Loader loader){
		super(10000, box, loader, dessin1);
		this.positionDarrivee = positionDarrivee;
	}
	@Override
	//Lorsque le joueur rentre en contacte il est teléporté à la position voulue
	public void interact(Actor other) {
		if (getBox().isColliding(other.getBox())&&other.isPlayer()){
			((Player)other).setPosition(positionDarrivee);
		}
	}
	@Override
	//Pour évoluer au cours du temps
	public void update(Input input){
		cooldown -= input.getDeltaTime()/2;
		if (cooldown<0){
			cooldown = 1;
		}
	}
	@Override
	// pour être dessiné. Le teleporteur a 4 sprites, il alterne entre elles grâce à cooldown
	public void draw(Input input , Output output) {
		if (cooldown<0.75){
			output.drawSprite(getWorld().getLoader().getSprite(dessin2), getBox());
		} else {
			if (cooldown<0.5){
				output.drawSprite(getWorld().getLoader().getSprite(dessin3), getBox());
			} else {
				if (cooldown<0.25){
					output.drawSprite(getWorld().getLoader().getSprite(dessin4), getBox());
				} else {
					if (cooldown>=0.75){
						output.drawSprite(getWorld().getLoader().getSprite(dessin1), getBox());
					}
				}
			}
		}
	}
}