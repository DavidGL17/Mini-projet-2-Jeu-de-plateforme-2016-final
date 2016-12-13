package platform.game.Actors.levels;

import platform.game.Actor;
import platform.util.Input;
import platform.util.Output;
import platform.util.Sprite;

/**
 * Base class for level factories, which provides fade in transition. Subclasses
 * are requires to override <code>register</code>.
 */
public abstract class Level extends Actor {
// UNCOMMENT ME WHEN NEEDED
    private double fadein;

    public Level() {
    	super();
        fadein = 1.0;
    }
    
    @Override
    public int getPriority() {
        return Integer.MAX_VALUE;
    }

    @Override
    public void update(Input input) {
        fadein -= input.getDeltaTime();
        if (fadein <= 0.0)
            getWorld().unregister(this);
    }

    @Override
    public void draw(Input input, Output output){
        Sprite sprite = getWorld().getLoader().getSprite("pixel.black");
        output.drawSprite(sprite, output.getBox(), 0.0, fadein);
    }
}
