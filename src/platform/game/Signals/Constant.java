package platform.game.Signals;

public class Constant implements Signal{
	private boolean signal;
	
	public Constant(boolean signal){
		this.signal = signal;
	}
	public boolean isActive(){
		return signal;
	}
}
