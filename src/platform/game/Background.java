package platform.game;

import java.util.ArrayList;

import platform.util.Input;
import platform.util.Output;
import platform.util.Vector;

public class Background extends Actor{
	private ArrayList<BlockDeco> blocks = new ArrayList<BlockDeco>();
	private Player owner;
	private Vector lastOwnersPosition;
	
	public Background(Player owner){
		super(null, 0);
		this.owner = owner;
		lastOwnersPosition = owner.getPosition();
	}
	
	// pour évoluer au cours du temps :
	public void update(Input input) {
		Vector ownersPosition = owner.getPosition();
		double xDifference = lastOwnersPosition.getX()-ownersPosition.getX();
		double yDifference = lastOwnersPosition.getY()-ownersPosition.getY();
		for (BlockDeco b : blocks){
			Vector newPosition = new Vector(b.getPosition().getX()+xDifference, b.getPosition().getY()+yDifference);
			b.setPosition(newPosition);
		}
	}
}
