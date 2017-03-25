package platform.game.Actors.matrices;

import java.util.ArrayList;

import platform.game.Actor;
import platform.game.Actors.actorSignal.SignalSouris;
import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;
import platform.util.Vector;

public class Numbers extends Actor{
	//le premier dessin de digit dans dessins est le premier digit du chiffre
	private ArrayList<Digit> digits = new ArrayList<Digit>();
//	private final static String dessinVide = "digitvide";
//	private final String[] numbers = {"digit.0","digit.1","digit.2","digit.3","digit.4","digit.5","digit.6","digit.7","digit.8","digit.9"};
	
	private SignalSouris signal;
	private int nombreDeDigit = 0;
	//permet de savoir si le nombre doit pouvoir changer de chiffre ou pas
	private boolean immuable;
	private final static double width = 1;
	private final static double height = 1;
	private final double distanceEntreDigit = 0.25;
	
	private Vector positionVide;
	private Vector centreNumber;

	public Numbers(Vector position, Loader loader, boolean immuable){
		super(new Box(position, width, height),10);
		signal = new SignalSouris(new Box(position, width, height), true);
		centreNumber = position;
	}
	
	
	
	public int getNbrDigit(){
		return nombreDeDigit;
	}
	
	//gets a digit at the number position. if number is bigger than the max digit, returns 0
//	public String getDigit(){
//		return dessins.get(dessins.size()-1);
//	}
	
	//permet de calculer la valeur du nombre
	public int getValue(){
		int value = 0;
		for (int i = 0;i<digits.size();++i){
			double x = Math.pow(10, digits.size()-1-i);
			value += digits.get(i).getValue()	*x;
		}
		return value;
	}
	
	//permet de définir la valeur du number 
	//a modifier
	ad
	protected void setValue(int value, int nbrDeDigit){
		if (immuable && value<0 && value>=10){
			return;
		}
		digits.clear();
		for (int i = 0;i<nbrDeDigit;++i){
			double x = Math.pow(10, nbrDeDigit-1-i);
			int digit = (int) (value/x);
			addADigit(digit);
		}
	}
	
	
	
	//ajoute un digit a dessin
	private void addADigit(int digit){
		Digit d = new Digit(positionVide, getWorld().getLoader(), digit);
		digits.add(d);
	}
	
	
	public Numbers copy(){
		Numbers x = new Numbers(getBox().getCenter(), getWorld().getLoader(), false);
		x.setSprite(getSprite());
		x.digits = digits;
		x.setValue(getValue(), getNbrDigit());
		return x;
	}
	
	protected void setCentre(Vector vector){
		setBox(new Box(vector, width, height));
	}
	
	private void calculerPositionDigitVide(){
		
	}
	
	public void update(Input input){
		if (signal.isActive()){
			if (getWorld().sourisHasANumber()){
//				//Si la souris a un chiffre mais que this est vide alors il prend le chiffre, sinon il remplace le chiffre de la souris s'il est immuable
//				if (isEmpty){
//					setSprite(getWorld().getLoader().getSprite(getWorld().getSourisNumber().getDigit()));
//					dessins.clear();
//					dessins.add(getWorld().getSourisNumber().getDigit());
//					getWorld().viderSouris();
//					isEmpty = false;
				} else {
					if (immuable){
//						getWorld().viderSouris();
//						Numbers x = this.copy();
//						x.confirmMovement();
//						getWorld().setSourisNumber(x);
					} else {
//						setSprite(getWorld().getSourisNumber().getSprite());
//						dessins.add(getWorld().getSourisNumber().getDigit());
//						getWorld().viderSouris();
					}
				}
			} else {
//				if (!isEmpty && immuable){
//					Numbers x = this.copy();
//					x.confirmMovement();
//					getWorld().setSourisNumber(x);
				}
//			}
//		}
		nombreDeDigit = digits.size();
		
	}
	
	public void draw(Input input, Output output){
//		if (!isMoving){
//			output.drawSprite(getSprite(), getBox());
//		} else {
//			setBox(new Box(getWorld().getSourisPosition(), width, height));
//			output.drawSprite(getSprite(), getBox());
//		}
	}
}
