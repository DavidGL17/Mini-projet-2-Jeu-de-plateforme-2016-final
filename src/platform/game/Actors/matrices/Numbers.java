package platform.game.Actors.matrices;

import java.util.ArrayList;

import platform.game.Actor;
import platform.game.Actors.actorSignal.SignalSouris;
import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;

public class Numbers extends Actor{
	private ArrayList<String> dessins = new ArrayList<String>();
	private final static String dessinVide = "digitvide";
	private final String[] numbers = {"digit.0","digit.1","digit.2","digit.3","digit.4","digit.5","digit.6","digit.7","digit.8","digit.9"};
	private SignalSouris signal;
	private int nombreDeDigit = 0;
	private boolean isEmpty = true;
	private boolean isMoving = false;
	//permet de savoir si le nombre doit pouvoir changer de chiffre ou pas
	private boolean immuable;

	public Numbers(Box box, Loader loader, boolean immuable){
		super(10, box, loader, dessinVide);
		signal = new SignalSouris(box, true);
	}
	public Numbers(Box box, Loader loader, boolean immuable, int number){
		super(10, box, loader, dessinVide);
		if (0 <= number && number <=9){
			setSprite(loader.getSprite(numbers[number]));
		}
		signal = new SignalSouris(box, true);
	}
	
	//permet de dire au number qu'il bouge
	public void confirmMovement(){
		isMoving = true;
	}
	
	public boolean isEmpty(){
		return isEmpty;
	}
	
//	public Sprite getNumberSprite(){
//		return getSprite();
//	}
	
	public Numbers copy(){
		Numbers x = new Numbers(getBox(), getWorld().getLoader(), false);
		x.setSprite(getSprite());
		return x;
	}
	
	public void update(Input input){
		if (signal.isActive()){
			if (getWorld().sourisHasANumber()){
//				//Si la souris a un chiffre mais que this est vide alors il prend le chiffre, sinon il remplace le chiffre de la souris par soit
				if (isEmpty){
					setSprite(getWorld().getSourisNumber().getSprite());
					getWorld().viderSouris();
					isEmpty = false;
				} else {
					if (immuable){
						getWorld().viderSouris();
						Numbers x = this.copy();
						x.confirmMovement();
						getWorld().setSourisNumber(x);
					} else {
						setSprite(getWorld().getSourisNumber().getSprite());
						getWorld().viderSouris();
					}
				}
			} else {
				if (!isEmpty){
					Numbers x = this.copy();
					x.confirmMovement();
					getWorld().setSourisNumber(x);
				}
			}
		}
	}
	
	public void draw(Input input, Output output){
		if (!isMoving){
			output.drawSprite(getSprite(), getBox());
		} else {
			setBox(new Box(getWorld().getSourisPosition(), getBox().getWidth(), getBox().getHeight()));
			output.drawSprite(getSprite(), getBox());
		}
	}
}
