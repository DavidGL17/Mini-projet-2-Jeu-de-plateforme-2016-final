package platform.game;

public class And implements Signal{
	private Signal signal1;
	private Signal signal2;

	public And(Signal signal1, Signal signal2){
		this.signal1 = signal1;
		this.signal2 = signal2;
	}
	@Override
	public boolean isActive () {
		return ((signal1.isActive()) && (signal2.isActive()));
	}
}
