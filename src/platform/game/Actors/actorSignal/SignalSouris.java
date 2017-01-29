package platform.game.Actors.actorSignal;

import java.awt.event.MouseEvent;

import platform.game.Actor;
import platform.game.Signals.Signal;
import platform.util.Box;
import platform.util.Input;

//S'active si la souris est sur la bonne position et si le clic gauche a été utilisé
public class SignalSouris extends Actor implements Signal {
	private boolean signal = false;
	private final Box positionClic;
	private final int clicGauche = MouseEvent.MOUSE_CLICKED;

	public SignalSouris(Box positionClic) {
		this.positionClic = positionClic;
		setPriority(10000);
	}

	@Override
	public void update(Input input) {
		if (positionClic.isColliding(getWorld().getSourisPosition())) {
			signal = true;
		} else{
			signal = false;
		}
	}

	@Override
	public boolean isActive() {
		return signal;
	}

}
