package platform.game.Actors.actorSignal;

import java.awt.event.MouseEvent;

import platform.game.Actor;
import platform.game.Signals.Signal;
import platform.util.Box;
import platform.util.Input;

//S'active si la souris est sur la bonne position et si le clic gauche a été utilisé
public class SignalSouris extends Actor implements Signal {
	private boolean signal = false;
	private final Box zoneClic;
	private final int clicGauche = MouseEvent.BUTTON1;
	private boolean clic;

	public SignalSouris(Box zoneClic, boolean clic) {
		this.zoneClic = zoneClic;
		this.clic = clic;
		setPriority(10000);
	}
	
	//Vérifie si la souris est sur la position et, si demandé, si le bouton gauche de la souris est pressé
	@Override
	public void update(Input input) {
		if (zoneClic.isColliding(getWorld().getSourisPosition())) {
			if (clic){
				if (input.getMouseButton(clicGauche).isPressed()){
					signal = true;
				} else {
					signal = false;
				}
			} else {
				signal = true;
			}
		} else{
			signal = false;
		}
	}

	@Override
	public boolean isActive() {
		return signal;
	}

}
