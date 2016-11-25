package platform.game;

import platform.game.level.Level;
import platform.util.Box;
import platform.util.Loader;
import platform.util.Vector;;

/**
 * Represents an environment populated by actors.
 */
public interface World {

    /** @return associated loader, not null */
    public Loader getLoader();
    /**
    * Set viewport location and size.
    * @param center viewport center , not null
    * @param radius viewport radius , positive
    */
    public void setView(Vector center , double radius);
    public void register(Actor actor);
    public void unregister(Actor actor);
    default public Vector getGravity(){
    	Vector gravity = new Vector(0.0, -9.81);
    	return gravity;
    }
    public int hurt(Box area , Actor instigator , Damage type ,double amount , Vector location);
    // permet d'indiquer que la transition à un autre niveau
    // doit se faire :
    public void nextLevel () ;
    // permet de passer au niveau level :
    public void setNextLevel(Level level) ;
    public void tryAgain();
}
