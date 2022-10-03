import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public abstract class Monster extends Actor {
    private int score;
    protected int localizationX;
    protected int localizationY;
    protected int fireBool;
    public MyWorld myWorld;
 
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
        Actor satellite = getOneIntersectingObject(Satellite.class);
        
        World myWorld = getWorld();
        if (meteor != null) {
            Meteor m = (Meteor) meteor;
            int value = m.getValue();
            myWorld.removeObject(meteor);
            setScore(getScore() + value);
            
        }
        if (missile != null) {
            Missile m = (Missile)missile;
            m.detonate();
            int damege = m.getDamage();
            setScore(getScore() - damege);
            myWorld.removeObject(missile);
        }
        if(satellite != null){
            Satellite s = (Satellite)satellite;
            myWorld.removeObject(satellite);
        }
    }
    public abstract void move();
    
    public abstract void setMonster();
    
    public void fire(){
        myWorld.addObject(new FireBool(myWorld), localizationX,localizationY-5);
    }
    
   
    
    
}
