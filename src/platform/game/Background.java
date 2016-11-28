package platform.game;

import java.util.ArrayList;

import platform.util.Input;
import platform.util.Output;
import platform.util.Vector;

public class Background extends Actor{
	private BlockDeco block;
	private Player owner;
	private Vector lastOwnersPosition;
	
	public Background(Player owner, BlockDeco block){
		super(null, 0);
		this.owner = owner;
		this.block = block;
		lastOwnersPosition = owner.getPosition();
	}
	
	// pour évoluer au cours du temps :
	public void update(Input input) {
		Vector ownersPosition = owner.getPosition();
		double xDifference = lastOwnersPosition.getX()-ownersPosition.getX();
		double yDifference = lastOwnersPosition.getY()-ownersPosition.getY();
		Vector newPosition = new Vector(block.getPosition().getX()-xDifference, block.getPosition().getY()-yDifference);
		block.setPosition(newPosition);
		lastOwnersPosition = owner.getPosition();
	}
	public void draw(Input input, Output output){
		block.draw(input, output);
	}
}
