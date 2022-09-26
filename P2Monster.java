import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class P2Monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P2Monster extends Monster
{
    GifImage monster = new GifImage("Modelo2.gif");
    /**
     * Act - do whatever the P2Monster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setImage(monster.getCurrentImage());
        int x = getX();
        int y = getY();
        getImage().scale(60, 60);
        if(x <= 365){
            if (Greenfoot.isKeyDown("D")) {
            setLocation(x + 2, y);
            }
        }
        if (Greenfoot.isKeyDown("A")) {
            setLocation(x - 2, y);
        }
        
        collisionVerification();
    }
}
