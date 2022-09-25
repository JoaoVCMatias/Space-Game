import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedMeteor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedMeteor extends Meteor
{
    GifImage redMeteor = new GifImage("MeteoroVemelho.gif");
    
    public RedMeteor(){
        super(10);
    }
    /**
     * Act - do whatever the RedMeteor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setImage(redMeteor.getCurrentImage());
        getImage().scale(60,60);
        int x = getX();
        int y = getY();
        setLocation(x, y+2);
        atWorldEdge();
    }
}
