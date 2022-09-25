import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenMeteor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenMeteor extends Meteor
{
    GifImage greenMeteor = new GifImage("MeteoroVerde.gif");
    
    public GreenMeteor(){
        super(5);
    }
    /**
     * Act - do whatever the GreenMeteor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setImage(greenMeteor.getCurrentImage());
        getImage().scale(60,60);
        int x = getX();
        int y = getY();
        setLocation(x, y+2);
    }
}
