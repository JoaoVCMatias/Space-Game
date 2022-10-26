import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Satellite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Satellite extends Actor
{
    private MyWorld myWorld;
    
    public Satellite(MyWorld myWorld){
        this.myWorld = myWorld;
    }
    public void atWorldEdge() {
        if(getY() > getWorld().getHeight() - 5) {
            myWorld.decrementSatellite();
            myWorld.removeObject(this);
        }
    }
    public abstract void move();
}
