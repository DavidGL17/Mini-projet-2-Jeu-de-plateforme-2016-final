package platform.game;

import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;

public class BlockIndecis extends Block{
	private double timerDisparition;
	private final double timerDisparitionMax;
	private double timerApparition;
	private final double timerApparitionMax;
	private boolean apparait = true;
	private final String dessinApparait;
	private final String dessinDisparait;
	
	public BlockIndecis(Box box, double timerDisparition, double timerApparition,Loader loader, String dessinApparait, String dessinDisparait){
		super(box, loader.getSprite(dessinApparait));
		this.timerApparition = timerApparition;
		this.timerApparitionMax = timerApparition;
		this.timerDisparition = timerDisparition;
		this.timerDisparitionMax = timerDisparition;
		this.dessinApparait = dessinApparait;
		this.dessinDisparait = dessinDisparait;
	}
	
	public boolean isSolid(){
		if (apparait){
			return super.isSolid();
		} else {
			return false;
		}
	}
	// pour évoluer au cours du temps :
	public void update(Input input) {
		if (apparait){
			timerDisparition -= input.getDeltaTime();
			if (timerDisparition<=0){
				apparait = false;
				timerDisparition = timerDisparitionMax;
			}
		} else {
			timerApparition -= input.getDeltaTime();
			if (timerApparition<=0){
				apparait = true;
				timerApparition = timerApparitionMax;
			}
		}
	}
	public void draw(Input input , Output output) {
		if (apparait){
			output.drawSprite(getWorld().getLoader().getSprite(dessinApparait), getBox());
		} else {
			output.drawSprite(getWorld().getLoader().getSprite(dessinDisparait), getBox());
		}
	}
}
