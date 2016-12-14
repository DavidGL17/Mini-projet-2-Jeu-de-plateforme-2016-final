package platform.game.Actors;

import platform.game.Actor;
import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;
import platform.util.Vector;

//Cetta classe est utilisée dans les niveaux trop longs afin de ne pas avoir à tout recommencer depuis le début
public class Checkpoint extends Actor{
	private  final String drapeauBas;
	private final static double widthNotCheckpoint = 2;
	private final static double heightNotCheckpoint = 2;
	private final String drapeauHaut1;
	private final String drapeauHaut2;
	private final static double widthCheckpoint = 2;
	private final static double heightCheckpoint = 2;
	private boolean checkpointDone = false;
	//pour le dessin du checkpoint
	private final double COOLDOWN_MAX = 0.4;
	private double cooldown = COOLDOWN_MAX;
	
	public Checkpoint(Vector center, Loader loader, String drapeauBas, String drapeauHaut1, String drapeauHaut2){
		super(1400, new Box(center, widthNotCheckpoint, heightNotCheckpoint), loader.getSprite(drapeauBas));
		this.drapeauBas = drapeauBas;
		this.drapeauHaut1 = drapeauHaut1;
		this.drapeauHaut2 = drapeauHaut2;
	}
	//Si le joueur rentre en collision avec Checkpoint, sont attribut checkpointDone va passer à true et il va mettre set le checkpoint de World à true 
	public void interact(Actor other){
		if (getBox().isColliding(other.getBox())&&other.isPlayer()&&!checkpointDone){
			checkpointDone = true;
			getWorld().setCheckpoint(checkpointDone);
		}
	}
	public void update(Input input){
		//Dans le cas ou le joueur à déjà passé le checkpoint, celui ci va automatiquement se mettre checkpointDone à true
		if (getWorld().getCheckpoint()){
			checkpointDone = true;
		}
		if (checkpointDone){
			cooldown -= input.getDeltaTime();
			setBox(new Box(getPosition(), widthCheckpoint, heightCheckpoint));
			setPriority(10);
			if (cooldown<0){
				cooldown = COOLDOWN_MAX;
			}
		}
	}
	public void draw (Input input, Output output){
		if (checkpointDone){
			if (cooldown >0.2){
				output.drawSprite(getWorld().getLoader().getSprite(drapeauHaut1), getBox());
			} else {
				output.drawSprite(getWorld().getLoader().getSprite(drapeauHaut2), getBox());
			}
		} else {
			output.drawSprite(getWorld().getLoader().getSprite(drapeauBas), getBox());
		}
	}
}
