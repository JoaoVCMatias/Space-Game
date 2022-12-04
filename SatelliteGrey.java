import greenfoot.*;

/**
 * Derivado da classe Satellite que plota/representa um satelite cinza.
 * 
 * @version 2022-12-04
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
