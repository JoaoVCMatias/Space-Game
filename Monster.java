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
    private int shotDelay = 2;
    private Time timeShot;
    private Sound sound = new Sound("Comendo.wav",50,1);
 
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
            sound.playMusic();
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
            sound.playMusic();
            Satellite s = (Satellite)satellite;
            myWorld.removeObject(satellite);
            fireBoolIncrement();
        }
    }
    public abstract void move();
    
    public abstract void setMonster();
    
    public void checkTimeSound(){
        if(sound.getTimeSound() <= 0){
            sound.stopMusic();
        }
    }
    
    public void fire(){
        if(!delayShot() && firePower()){
            myWorld.addObject(new FireBool(myWorld), localizationX,localizationY-5);
            fireBoolDecrement();
        }
            
    }
    
    public boolean delayShot(){
        if(timeShot == null){
            timeShot = new Time(shotDelay,500,500);
            return false;
        }
        if(timeShot.getTime() == 0){
            timeShot = null;
            return false;
        }
        return true;
            
    }
    
    private boolean firePower(){
        if(fireBool <= 3 && fireBool > 0)
            return true;
        return false;
    }
    
    private void fireBoolIncrement(){
        if(fireBool < 3)
            fireBool += 1;
    }
    
    private void fireBoolDecrement(){
        if(fireBool > 0)
            fireBool -= 1;
    }
    
   
    
    
}
