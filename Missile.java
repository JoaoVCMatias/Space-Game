import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Missile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Missile extends Actor
{
    GifImage missil = new GifImage("Missil.gif");
    /**
     * Act - do whatever the Missile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setImage(missil.getCurrentImage());
        getImage().scale(40,40);
        int x = getX();
        int y = getY();
        setLocation(x, y+2);
        atWorldEdge();
    }
    
    public void atWorldEdge() {
        if(getY() > getWorld().getHeight() - 5) {
            getWorld().removeObject(this);
        }
    }
}
