package platform.game.Actors;

import platform.game.Actor;
import platform.game.Signals.Signal;
import platform.util.Box;

//Nous utilisons cette classe principalement pour afficher des sprites contemnant du texte (pour notre histoire ainsi que pour le tutoriel)
//Lorsque le player est en contacte avec la box, celle-ci renvoie true, sinon elle renvoie false (A différence du signalInvisibleCOnstant qui renvoie true
//des qu'il est touché et ne change plus après)
public class SignalInvisibleCollision extends Actor implements Signal{
	private boolean signal = false;
	public SignalInvisibleCollision(Box box){
		super(box, 1500);
	}
	public void interact(Actor other){
		if (getBox().isColliding(other.getBox())&&other.isPlayer()){
			signal = true;
		}
	}
	public void preUpdate(){
		signal = false;
	}
	public boolean isActive(){
		return signal;
	}
}