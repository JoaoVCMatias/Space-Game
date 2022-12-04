import greenfoot.*;

/**
 * Derivado de Meteor com pontuacao equivalente a 5.
 * 
 * @version 2022-12-03
 */
public class GreenMeteor extends Meteor
{
    GifImage greenMeteor = new GifImage("MeteoroVerde.gif");
    
    public GreenMeteor(MyWorld myWorld){
        super(5, myWorld);
    }
    /**
     * Act - do whatever the GreenMeteor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(getMyWorld().getWorldTime() > 0){
            setImage(greenMeteor.getCurrentImage());
            getImage().scale(30,30);
            int x = getX();
            int y = getY();
            setLocation(x, y+2);
            atWorldEdge();
        
        }
    }
}
