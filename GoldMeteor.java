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
    
    public GoldMeteor(MyWorld myWorld){
        super(20,myWorld);
    }
    /**
     * Act - do whatever the GoldMeteor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        //System.out.println(getMyWorld().getWorldTime());
        if(getMyWorld().getWorldTime() > 0){
            setImage(goldMeteor.getCurrentImage());
            getImage().scale(30,30);
            int x = getX();
            int y = getY();
            setLocation(x, y+2);
            atWorldEdge();
        }
        
    }
}
