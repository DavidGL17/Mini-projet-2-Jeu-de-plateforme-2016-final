package platform.game;

import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Vector;

public class Mover extends Block{
	private Vector off;
	private Vector  on;
	private Vector currentPosition;
	private Signal signal;
	private static double Width;
	private static double Height;
	private double current = 0;
	private double vitesseDeMouvement;
	
	public Mover (Vector off, Vector on, double Width, double Height, double vitesseDeMouvement, Loader loader,Signal signal, String dessin){
		super(new Box(off, Width, Height), loader.getSprite(dessin));
		this.off = off;
		this.on = on;
		this.signal = signal;
		currentPosition = off;
		this.vitesseDeMouvement = vitesseDeMouvement;
	}
	public Box getBox(){
		return new Box(currentPosition, Width, Height);
	}

	@Override
	public void update(Input input) {
		super.update(input) ;
		if (signal.isActive()) {
			current += input.getDeltaTime () ;
			if (current > 1.0){
				current = 1.0 ;
				currentPosition=on;
			}
			currentPosition = new Vector(off.getX()+((vitesseDeMouvement*current*(on.getX()-off.getX()))), off.getY()+((vitesseDeMouvement*current*(on.getY()-off.getY()))));
		}
		if (!signal.isActive()){
			current -= input.getDeltaTime ();
			if (current < 0.0){
				current = 0.0 ;
				currentPosition = off;
			}
			currentPosition = new Vector(on.getX()-(((1-current)*vitesseDeMouvement)*(on.getX()-off.getX())), on.getY()-(((1-current)*vitesseDeMouvement)*(on.getY()-off.getY())));
		}
	}
}
