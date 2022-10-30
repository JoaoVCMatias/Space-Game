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
    private MyWorld myWorld;
    
    public Meteor(int value, MyWorld myWorld){
        this.value = value;
        this.myWorld = myWorld;
    }
    
    public int getValue(){
        return value;
    }
    
    public void atWorldEdge() {
        if(getY() > myWorld.getHeight() - 5) {
            myWorld.decrementMeteor();
            myWorld.removeObject(this);
        }
    }
    
    public MyWorld getMyWorld(){
        return myWorld;
    }
}
