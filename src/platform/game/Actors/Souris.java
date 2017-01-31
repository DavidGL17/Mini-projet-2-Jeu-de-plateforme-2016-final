package platform.game.Actors;

import platform.game.Actor;
import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Vector;

//Modélise la souris du joueur, qui est disponible de base dans le world
public class Souris extends Actor{
	private static Vector position = new Vector(0, 0);
	private final int width = 1;
	private final int height = 1;
	
	public Souris(Loader loader){
		super(10000, new Box(position, 2, 1),loader, "star");
	}
	
	public Vector getPosition(){
		return position;
	}
	
	public void update(Input input){
		position = getWorld().getView().convertToView(input.getMouseLocation());
		setBox(new Box(position, width, height));
	}
}
