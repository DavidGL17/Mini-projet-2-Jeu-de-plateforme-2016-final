package platform.game.Actors.matrices;

import platform.game.Actor;
import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;
import platform.util.Vector;

public class Digit extends Actor{
	private String dessin;
	private int value;
	private final static String[] numbers = {"digit.0","digit.1","digit.2","digit.3","digit.4","digit.5","digit.6","digit.7","digit.8","digit.9"};
	private final static String dessinVide = "digitvide";
	private Vector position;
	
	private final static double width = 1;
	private final static double height = 1;
	
	public Digit(Vector position, Loader loader){
		super(10, new Box(position, width, height), loader, dessinVide);
		this.position=position;
		this.dessin = dessinVide;
	}
	public Digit(Vector position, Loader loader, int value){
		super(10, new Box(position, width, height), loader, chercherDessin(value));
		this.position=position;
		this.value = checkValue(value);
		this.dessin = chercherDessin(value);
	}
	
	//checks if the value is between 0 and 9, returns 0 if not
	private int checkValue(int value1){
		if (value1<0 && value1>=10){
			return 0;
		}
		return value1;
	}
	
	public int getValue(){
		return value;
	}
	
	protected void setValue(int value){
		this.value = checkValue(value);
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
	
	//cherche le dessin correspondant à un chiffre. si le chiffre est plus grand que 9 ou plus pedtit que 0 returns null
	private static String chercherDessin(int chiffre){
		if (chiffre>=0 && chiffre<10){
			return numbers[chiffre];
		}
		return null;
	}
	
	
	public void update(Input input){
		if (value != chercherChiffre(dessin)){
			dessin = chercherDessin(value)
		}
		setBox(new Box(position, width, height));
	}	
	
	public void draw(Input input, Output output){
		output.drawSprite(getWorld().getLoader().getSprite(dessin), getBox());
	}
}
