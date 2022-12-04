import greenfoot.*;

/**
 * Derivado de Meteor com pontuacao equivalente a 20.
 * 
 * @version 2022-12-03
 */
public class GoldMeteor extends Meteor
{
    GifImage goldMeteor = new GifImage("MeteoroDourado.gif");
    
    public GoldMeteor(MyWorld myWorld){
        super(20, myWorld);
    }
    /**
     * Act - do whatever the GoldMeteor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
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
