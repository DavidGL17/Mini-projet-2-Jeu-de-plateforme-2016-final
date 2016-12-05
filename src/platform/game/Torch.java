package platform.game;

import platform.game.Signals.Signal;
import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;
import platform.util.Vector;

public class Torch extends Actor implements Signal {
	private Vector position;
	private final String TORCH_LIT_1 = "torch.lit.1";
	private final String TORCH_LIT_2 = "torch.lit.2";
	private final static String TORCH = "torch";
	private String currentTorch = TORCH;
	private final static double LARGEUR = 0.5;
	private final static double HAUTEUR = 1;
	private boolean lit = false;
	
	public Torch(Vector position, Loader loader){
		super(10,new Box(position, LARGEUR, HAUTEUR),loader.getSprite(TORCH));
		this.position = position;
	}
	public boolean isActive(){
		return lit;
	}
	public boolean isSignal(){
		return true;
	}
	
	private double variation = 0;
	private final double VARIATION_MAX = 1;
	private final double VARIATION_CHANGEMENT = 0.5;
	
	public void update(Input input) {
		variation -= input.getDeltaTime () ;
		if (variation < 0.0){
			variation = VARIATION_MAX;
		}
	}
	public boolean hurt(Actor instigator , Damage type , double amount , Vector location) {
		switch (type) {
		case AIR : 
			currentTorch = TORCH;
			lit = false;
			return true;
		case FIRE :
			currentTorch = TORCH_LIT_1;
			variation = VARIATION_MAX;
			lit =true;
			return true;
		default :
			return false;
		}
	}
	public void draw(Input input, Output output){
		if (lit){
			if (variation <VARIATION_CHANGEMENT){
				currentTorch = TORCH_LIT_2;
			} else {
				currentTorch = TORCH_LIT_1;
			}
		}
		output.drawSprite(getWorld().getLoader().getSprite(currentTorch), getBox());
	}
}
