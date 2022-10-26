import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Meteor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Meteor extends Actor
{
    private int value;
    
    public Meteor(int value){
        this.value = value;
    }
    
    public int getValue(){
        return value;
    }
    
    public void atWorldEdge() {
        if(getY() > getWorld().getHeight() - 5) {
            MyWorld myWorld = (MyWorld)getWorld();
            myWorld.decrementMeteor();
            getWorld().removeObject(this);
        }
    }
}
