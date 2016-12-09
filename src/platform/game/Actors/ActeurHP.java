package platform.game.Actors;

import platform.util.Vector;

//Cette interface est utilisée par Player et les sous classe de monster(surtout Boss). Elle permet de que tout ces Acteurs puissent avoir un overlay
public interface ActeurHP {
	public double getHP();
	public double getHPMax();
	public Vector getPosition();
	public World getWorld();
}
