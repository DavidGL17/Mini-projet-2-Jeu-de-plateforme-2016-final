package platform.game.monsters;

import platform.game.Actor;
import platform.game.Damage;
import platform.game.Monster;
import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;
import platform.util.Vector;

//Cette classe permet de modeliser le comportement de slimes. 

public class Slime extends Monster{
	private final static double width = 1;
	private final static double height = 1;
	private final static String dessin = "blocker.happy";
	private double HPMax = 8;
	private double HP = HPMax;
	
	public Slime(Vector vitesse, Vector position, Box boxDAction, Loader loader){
		super(vitesse, position, width, height, boxDAction, 0.1,loader, dessin);
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
	@Override
	public void interact(Actor other){
		super.interact(other);
		//Blesse le player
		if (other.isPlayer()&&other.getBox().isColliding(getBox())){
			other.hurt(this, Damage.SMALLMONSTER, Damage.SMALLMONSTER.getDamage(), getPosition());
		}
	}

	@Override
	public void update(Input input) {
		super.update(input);
		if (HP<0){
			getWorld().unregister(this);
		}
	}

	@Override
	public void draw(Input input, Output output) {
		// TODO Auto-generated method stub
		
	}
}
