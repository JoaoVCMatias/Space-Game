import greenfoot.*;

/**
 * Derivado de Meteor com pontuacao equivalente a 10.
 * 
 * @version 2022-12-03
 */
public class RedMeteor extends Meteor
{
    GifImage redMeteor = new GifImage("MeteoroVemelho.gif");
    
    public RedMeteor(MyWorld myWorld){
        super(10, myWorld);
    }
    
    /**
     * Act - do whatever the RedMeteor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(getMyWorld().getWorldTime() > 0){
            setImage(redMeteor.getCurrentImage());
            getImage().scale(30,30);
            int x = getX();
            int y = getY();
            setLocation(x, y+2);
            atWorldEdge();
        }
    }
}
