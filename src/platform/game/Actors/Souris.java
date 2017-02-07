package platform.game.Actors;

import platform.game.Actor;
import platform.game.Actors.matrices.Numbers;
import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Vector;

//Modélise la souris du joueur, qui est disponible de base dans le world
public class Souris extends Actor{
	private static Vector position = new Vector(0, 0);
	private final int width = 1;
	private final int height = 1;
	
	//Si la souris n'a pas de chiffre sur elle, elle le prend. sinon elle le lache sur la position d'un number vide
	private Numbers number = null;
	private boolean hasANumber = false;
	
	public Souris(Loader loader){
		super(10000, new Box(position, 2, 1),loader, "star");
	}
	
	/**
	 * @return the hasANumber
	 */
	public boolean hasANumber() {
		return hasANumber;
	}
	public Numbers getSourisNumber(){
		return number.copy();
	}
	public void setSourisNumber(Numbers number){
		if (number != null){
			this.number = number;
		}
	}
	//permet de vider le nombre de la souris après l'avoir déposé
	public void vider(){
		number = null;
	}

	public Vector getPosition(){
		return position;
	}
	
	public void update(Input input){
		position = getWorld().getView().convertToView(input.getMouseLocation());
		setBox(new Box(position, width, height));
		if (number == null){
			hasANumber = false;
		} else {
			hasANumber = true;
		}
	}
	
//	public void draw(Input input, Output output){
//		
//	}
}
