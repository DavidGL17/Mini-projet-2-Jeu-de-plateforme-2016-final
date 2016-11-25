package platform.game;

import platform.util.Box;
import platform.util.Loader;
import platform.util.Vector;

public class Mover extends Block{
	private Vector off;
	private Vector  on;
	private Box offBox;
	private Box onBox;
	private Signal signal;
	private static double Width;
	private static double Height;
	
	public Mover (Vector off, Vector on, double Width, double Height,Loader loader,Signal signal, String dessin){
		super(new Box(off, Width, Height), loader.getSprite(dessin));
		this.off = off;
		this.on = on;
		this.signal = signal;
		offBox = new Box(off, Width, Height);
		onBox = new Box(on, Width, Height);
		this.Width = Width;
		this.Height = Height;
	}
	public Box getBox(){
		if (signal.isActive()){
			return onBox;
		} else {
			return offBox;
		}
	}
}
