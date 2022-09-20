import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Monster extends Actor
{
    GifImage monster = new GifImage("Monster1.gif");
    /**
     * Act - do whatever the Monster wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(monster.getCurrentImage());
    }
}
