package platform.game;

import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;
import platform.util.Vector;

public class Locker extends Block implements Signal{
	private Signal signal;
	private Vector position;
	private final static double SIZE =1;
	public final static String blue = "lock.blue";
	public final static String red = "lock.red";
	public final static String yellow = "lock.yellow";
	public final static String green = "lock.green";
	private boolean timer = false;
	private double cooldown;
	private boolean destructionBegins = false;
	private boolean destructionDone = false;

	
	public Locker(Vector position, Loader loader, String color,Signal signal){
		super(new Box(position, SIZE, SIZE), loader.getSprite(color));
		this.signal= signal;
		this.position=position;
	}
	public Locker(Vector position, Loader loader, String color,Signal signal, boolean timer, double cooldown) throws Exception{
		super(new Box(position, SIZE, SIZE), loader.getSprite(color));
		this.signal= signal;
		this.position=position;
		this.timer = timer;
		if (cooldown <=0){
			throw new Exception("Le cooldown de locker ne peut pas être 0 ou plus petit");
		}
		this.cooldown = cooldown;
	}
	
	public boolean isSolid(){
		return !destructionDone;
	}
	// pour évoluer au cours du temps :
	public void update(Input input) {
		if (signal.isActive()&&timer&&!destructionDone){
			destructionBegins = true;
			cooldown -= input.getDeltaTime();
		}
		if (!timer &&(signal.isActive())){
			setBox(null);
		}
		if (destructionBegins && (cooldown <=0)){
			setBox(null);
			destructionDone = true;
		}
	}
	// pour être dessiné
	public void draw(Input input , Output output) {
		if (!timer && !destructionBegins){
			if (!signal.isActive()){
				output.drawSprite(getSprite(), getBox());
			}
		} else {
			if (cooldown>0){
				output.drawSprite(getSprite(), getBox());
			}
		}
	}

	@Override
	public boolean isActive() {
		if (!timer){
			return signal.isActive();
		} else {
			return destructionDone;
		}
	}
}
