import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SatelliteGrey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SatelliteGrey extends Satellite
{
    GifImage satellite = new GifImage("Satelite.gif");
    /**
     * Act - do whatever the SatelliteGrey wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public SatelliteGrey(MyWorld myWorld){
        super(myWorld);
    }
    public void act()
    {
        // Add your action code here.
        if(getMyWorld().getWorldTime() > 0){
            setSatellite();
            move();
            atWorldEdge();
        }
        
    }
    public void move(){
       setLocation(getX(), getY()+1);
    }
    public void setSatellite(){
        setImage(satellite.getCurrentImage());     
        getImage().scale(60, 60);
    }
}
