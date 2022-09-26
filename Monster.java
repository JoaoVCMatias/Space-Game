import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Monster extends Actor {
    private int score;
 
    public int getScore(){
        return score;
    }
    
    public void setScore(int value){
        score = value;
    }
    public void collisionVerification() {
        Actor meteor = getOneIntersectingObject(Meteor.class);
        Actor missile = getOneIntersectingObject(Missile.class);
        Actor monster = getOneIntersectingObject(Monster.class);

        World myWorld = getWorld();
        if (meteor != null) {
            Meteor m = (Meteor) meteor;
            int value = m.getValue();
            myWorld.removeObject(meteor);
            setScore(getScore() + value);
        }
        if (missile != null) {
            myWorld.removeObject(missile);
            setScore(getScore() - 5);
        }
    }
}
