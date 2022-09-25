import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GoldMeteor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoldMeteor extends Meteor
{
    GifImage goldMeteor = new GifImage("MeteoroDourado.gif");
    
    public GoldMeteor(){
        super(20);
    }
    /**
     * Act - do whatever the GoldMeteor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setImage(goldMeteor.getCurrentImage());
        getImage().scale(60,60);
        int x = getX();
        int y = getY();
        setLocation(x, y+2);
    }
}
