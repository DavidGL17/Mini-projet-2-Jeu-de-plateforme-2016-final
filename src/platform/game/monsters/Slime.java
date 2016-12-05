package platform.game.monsters;

import platform.game.Actor;
import platform.game.Damage;
import platform.game.Monster;
import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;
import platform.util.Vector;

//Cette classe permet de modeliser le comportement de slimes. Le slime est d'abbord un gros monstre qui bouge lentement. 
//Lors de sa mort, il fera apparaitre deux plus petit slimes

public class Slime extends Monster{
	private final double width;
	private final double height;
	private final static String droite1 = "slime.right.1";
	private final static String droite2 = "slime.right.2";
	private final static String droite3 = "slime.right.3";
	private final static String gauche1 = "slime.left.1";
	private final static String gauche2 = "slime.left.2";
	private final static String gauche3 = "slime.left.3";
	private double HP;
	private final double HP_MAX;
	
	public Slime(Vector vitesse, Vector position, double movement, double HPMax,Box boxDAction, Loader loader, double width, double height, boolean showMustGoOn){
		super(vitesse, position, width, height, boxDAction, movement,loader, droite1);
		this.height = height;
		this.width = width;
		this.showMustGoOn = showMustGoOn;
		HP = HPMax;
		this.HP_MAX = HPMax;
	}
	
	@Override
	public boolean hurt(Actor instigator , Damage type, double amount , Vector location){
		switch (type){
			case FIRE :
				HP -= amount;
				return true;
			case VOID :
				HP = 0;
				return true;
			default :
				return false;
		}
	}
	
	//permet de donner un cooldown aux dégats du slime, afin d'éviter de mourir instantanément
	private final double COOLDOWN_MAX_DEGATS = 0.5;
	private double cooldownDegats = 0;
	//permet de faire apparaitre les slimes (1 fois)
	private boolean bigBrotherIsDead = false;
	private boolean showMustGoOn;
	
	@Override
	public void interact(Actor other){
		super.interact(other);
		//Blesse le player
		if (other.isPlayer()&&other.getBox().isColliding(getBox())){
			if(cooldownDegats<=0){
				if (other.hurt(this, Damage.SMALLMONSTER, Damage.SMALLMONSTER.getDamage(), getPosition())){
					cooldownDegats = COOLDOWN_MAX_DEGATS;
				}
			}
		}
	}
	
	//permet de gérer le dessin du slime
	private final double COOLDOWN_MAX_DESSIN = 0.9;
	private double cooldownDessin = COOLDOWN_MAX_DESSIN;
	
	@Override
	public void update(Input input) {
		super.update(input);
		cooldownDessin -= input.getDeltaTime();
		if (cooldownDessin<0){
			cooldownDessin = COOLDOWN_MAX_DESSIN;
		}
		cooldownDegats -=input.getDeltaTime();
		if (cooldownDegats<0){
			cooldownDegats = 0;
		}
		if (HP<0){
			getWorld().unregister(this);
			bigBrotherIsDead = true;
		}
		if (bigBrotherIsDead&&showMustGoOn){
			getWorld().register(new Slime(getVitesse(), new Vector(getPosition().getX(), getPosition().getY()-(height/4)),getMovement()*2, HP_MAX/2,getBoxDAction(), getWorld().getLoader(), width/2, height/2, false));
			getWorld().register(new Slime(getVitesse(), new Vector(getPosition().getX()-getBoxDAction().getWidth()/4, getPosition().getY()-(height/4)),getMovement()*2, HP_MAX/2,getBoxDAction(), getWorld().getLoader(), width/2, height/2, false));
		}
	}

	@Override
	public void draw(Input input, Output output) {
		if (getDirectionDroite()){
			if (cooldownDessin>0.6){
				output.drawSprite(getWorld().getLoader().getSprite(droite1), getBox());
			} else {
				if (cooldownDessin>0.3){
					output.drawSprite(getWorld().getLoader().getSprite(droite2), getBox());
				} else {
					output.drawSprite(getWorld().getLoader().getSprite(droite3), getBox());
				}
			}
		} else {
			if (cooldownDessin>0.6){
				output.drawSprite(getWorld().getLoader().getSprite(gauche1), getBox());
			} else {
				if (cooldownDessin>0.3){
					output.drawSprite(getWorld().getLoader().getSprite(gauche2), getBox());
				} else {
					output.drawSprite(getWorld().getLoader().getSprite(gauche3), getBox());
				}
			}
		}
	}
}
