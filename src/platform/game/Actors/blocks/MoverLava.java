package platform.game.Actors.blocks;

import platform.game.Actor;
import platform.game.Actors.Damage;
import platform.game.Signals.Signal;
import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;
import platform.util.Vector;

//Ce mover est spécifique au blocks de lave puvant bouger. Il a deux box car nos sprites onts une partie transparents, il nous faut donc redefinir 
//la hitbox pour que le joueur ne meurt pas alors qu'il n'a pas touché la lave (la partie visible)
public class MoverLava extends Mover{
	private Box boxDraw;
	private Box hitBox;
	public MoverLava(Vector off, Vector on, double Width, double Height,Box hitBox, double vitesseDeMouvement, Loader loader,Signal signal, String dessin){
		super(off, on, Width, Height, vitesseDeMouvement, loader, signal, dessin);
		this.hitBox = hitBox;
		this.boxDraw = new Box(off, Width, Height);
	}
	//return la box utile pour les collisions
	public Box getBox(){
		return hitBox;
	}
	public void interact(Actor other) {
		if (getBox().isColliding(other.getBox())){
			other.hurt(this, Damage.VOID, Damage.VOID.getDamage(), getPosition());
		}
	}
	public void update (Input input){
		super.update(input);
		hitBox = new Box(getCurrentPosition(), hitBox.getWidth(), hitBox.getHeight());
		boxDraw = new Box(getCurrentPosition(), boxDraw.getWidth(), boxDraw.getHeight());
	}
	public void draw (Input input, Output output){
		output.drawSprite(getSprite(), boxDraw);
	}
}
