import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MissileBlue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MissileBlue extends Missile
{
    /**
     * Act - do whatever the MissileBlue wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public MissileBlue(){
        super(new GifImage("MissilAzul.gif"));
        setDamage(5);
    }
    public void act()
    {
        // Add your action code here.
        setMissile();
        move();
        atWorldEdge();
    }
    public void move(){
        int x = getX();
        int y = getY();
        setLocation(x, y+2);
    }
    
}
