package platform.game.Actors;

import java.awt.event.KeyEvent;

import platform.game.Actor;
import platform.game.Signals.Signal;
import platform.util.Input;

//Cette acteur invisible permet de lire une touche prédefinie. SI celle ci est appuyée, il renverra true
public class SignalReadKey extends Actor implements Signal{
	private boolean signal = false;
	
	public void update(Input input){
		if (input.getKeyboardButton(KeyEvent.VK_B).isPressed()){
			signal = true;
		} else {
			signal = false;
		}
	}
	public boolean isActive(){
		return signal;
	}
}
