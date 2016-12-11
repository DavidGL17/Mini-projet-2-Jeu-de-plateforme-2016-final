package platform.game.Actors;

import platform.util.Box;
import platform.util.Vector;

//Cette interface est utilisée par Player et les sous classe de monster(surtout Boss). Elle permet de que tout ces Acteurs puissent avoir un overlay
public interface ActeurOverlay {
	//Permet d'obtenir les HP et HPMax
	public double getHP();
	public double getHPMax();
	//Permet d'avoir la position et la hauteur (à travers de la box, pour calculer la position des coeurs par overlay. 
	//getWorld permet de réduire les paramètres du constructeur d'overlay
	public Vector getPosition();
	public World getWorld();
	public Box getBox();
}
