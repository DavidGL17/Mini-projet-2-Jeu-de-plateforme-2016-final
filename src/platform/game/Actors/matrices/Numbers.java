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
	private ArrayList<String> dessins = new ArrayList<String>();
	private final static String dessinVide = "digitvide";
	private final String[] numbers = {"digit.0","digit.1","digit.2","digit.3","digit.4","digit.5","digit.6","digit.7","digit.8","digit.9"};
	
	private SignalSouris signal;
	private int nombreDeDigit = 0;
	private boolean isEmpty = true;
	private boolean isMoving = false;
	//permet de savoir si le nombre doit pouvoir changer de chiffre ou pas
	private boolean immuable;
	private final static double width = 1;
	private final static double height = 1;
	private final double distanceEntreDigit = 0.25;

	public Numbers(Vector position, Loader loader, boolean immuable){
		super(10, new Box(position, width, height), loader, dessinVide);
		signal = new SignalSouris(new Box(position, width, height), true);
	}
	public Numbers(Vector position, Loader loader, boolean immuable, int number){
		super(10, new Box(position, width, height), loader, dessinVide);
		if (0 <= number && number <=9){
			setSprite(loader.getSprite(numbers[number]));
			dessins.add(numbers[number]);
		}
		signal = new SignalSouris(new Box(position, width, height), true);
	}
	
	//permet de dire au number qu'il bouge
	public void confirmMovement(){
		isMoving = true;
	}
	
	public boolean isEmpty(){
		return isEmpty;
	}
	
	public int getNbrDigit(){
		return nombreDeDigit;
	}
	
	//gets a digit at the number position. if number is bigger than the max digit, returns 0
	public String getDigit(){
		return dessins.get(dessins.size()-1);
	}
	
	//permet de calculer la valeur du nombre
	public int getValue(){
		int value = 0;
		for (int i = 0;i<dessins.size();++i){
			double x = Math.pow(10, dessins.size()-1-i);
			value += chercherChiffre(dessins.get(i))*x;
		}
		return value;
	}
	
	//permet de définir la valeur du number 
	protected void setValue(int value, int nbrDeDigit){
		dessins.clear();
		for (int i = 0;i<nbrDeDigit;++i){
			double x = Math.pow(10, nbrDeDigit-1-i);
			int digit = (int) (value/x);
			addADigit(digit);
		}
	}
	
	//permet de trouver a quel digit correspond un dessin
	private int chercherChiffre(String dessin){
		for (int i = 0;i<numbers.length;++i){
			if (dessin == numbers[i]){
				return i;
			}
		}
		return 0;
	}
	//cherche le dessin correspondant à un chiffre. si le chaiffre est plus grand que 9 ou plus pedtit que 0 returns null
	private String chercherDessin(int chiffre){
		if (chiffre>=0 && chiffre<10){
			return numbers[chiffre];
		}
		return null;
	}
	//ajoute un digit a dessin
	private void addADigit(int digit){
		String dessinDigit = chercherDessin(digit);
		dessins.add(dessinDigit);
	}
	
	
	public Numbers copy(){
		Numbers x = new Numbers(getBox().getCenter(), getWorld().getLoader(), false);
		x.setSprite(getSprite());
		x.dessins = dessins;
		x.setValue(getValue(), getNbrDigit());
		return x;
	}
	
	protected void setPosition(Vector vector){
		setBox(new Box(vector, width, height));
	}
	
	public void update(Input input){
		if (signal.isActive()){
			if (getWorld().sourisHasANumber()){
//				//Si la souris a un chiffre mais que this est vide alors il prend le chiffre, sinon il remplace le chiffre de la souris s'il est immuable
				if (isEmpty){
					setSprite(getWorld().getLoader().getSprite(getWorld().getSourisNumber().getDigit()));
					dessins.clear();
					dessins.add(getWorld().getSourisNumber().getDigit());
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
						dessins.add(getWorld().getSourisNumber().getDigit());
						getWorld().viderSouris();
					}
				}
			} else {
				if (!isEmpty && immuable){
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
			setBox(new Box(getWorld().getSourisPosition(), width, height));
			output.drawSprite(getSprite(), getBox());
		}
	}
}
