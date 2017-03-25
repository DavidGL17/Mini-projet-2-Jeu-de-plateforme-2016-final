package platform.game;

import platform.game.Actors.Damage;
import platform.game.Actors.levels.Level;
import platform.util.Box;
import platform.util.Loader;
import platform.util.Vector;
import platform.util.View;;

/**
 * Represents an environment populated by actors.
 */
public interface World {

    /** @return associated loader, not null */
    public Loader getLoader();
    //permet d'acceder a des méthodes pour la souris notamment
	public View getView();
	//permet d'obtenir la position de la souris
	public Vector getSourisPosition();
	
	
    /**
    * Set viewport location and size.
    * @param center viewport center , not null
    * @param radius viewport radius , positive
    */
    public void setView(Vector center , double radius);
	public double getExpectedRadius();
    public void register(Actor actor);
    public void unregister(Actor actor);
    //permet de recuperer le vecteur gravité
    public Vector getGravity();
    //inverse la gravité
    public void switchGravity();
    //remet la gravité à la normale
    public void gravityNormal();
    //Permet d'infliger des effets dans une zone
    public int hurt(Box area , Actor instigator , Damage type ,double amount , Vector location);
    
    // permet d'indiquer que la transition à un autre niveau doit se faire :
    public void nextLevel () ;
	//Lorsque cette méthode est appelée, on changera le mode de jeu puis on activera le changement de niveau
    public void changeLevelMode(int levelMode);
    public int getLevelMode();
    // permet de passer au niveau level :
    public void setNextLevel(Level level) ;
    public void tryAgain();
    //permet d'acceder à la variable checkpoint
    public boolean getCheckpoint();
    public void setCheckpoint(boolean checkpoint);
    public void thereIsNoPlayer();
    
    
    
    
    
    
    
    //méthodes pour les matrices, à mettre de coter
//	//Permet de savoir si la souris transporte un chiffre
//	public boolean sourisHasANumber();
//	//Pemret d'obtenir le number que la souris transporte
//	public Numbers getSourisNumber();
//	//Permet de vider la souris après que le nombre ai été déposé
//	public void viderSouris();
//	//Permet de rajouter un nombre à la souris
//	public void setSourisNumber(Numbers number);
	
}
