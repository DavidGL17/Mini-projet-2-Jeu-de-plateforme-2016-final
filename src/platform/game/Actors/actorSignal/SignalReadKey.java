package platform.game.Actors.actorSignal;

import java.awt.event.KeyEvent;

import platform.game.Actor;
import platform.game.Signals.Signal;
import platform.util.Input;

//Cette acteur invisible permet de lire une touche prédefinie. SI celle ci est appuyée, il renverra true
public class SignalReadKey extends Actor implements Signal{
	private boolean signal = false;
	private int code = KeyEvent.VK_B;
	
	public SignalReadKey(){
	}
	public SignalReadKey(int key){
		code = key;
	}
	@Override
	public void update(Input input){
		if (input.getKeyboardButton(code).isPressed()){
			signal = true;
		} else {
			signal = false;
		}
	}
	@Override
	public boolean isActive(){
		return signal;
	}
}
