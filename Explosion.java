import greenfoot.*;
import java.util.TimerTask;
import java.util.Timer;

/**
 * Cria uma explosao para ser utilizada em um cenario (level).
 *  
 * @version 2022-12-03
 */
public class Explosion extends Actor
{
    private GifImage explosion = new GifImage("Explosao.gif");
    private Sound sound = new Sound("Explosao.wav");
    private Time time;

    public Explosion(){
        sound.playMusic();
        time = new Time(1,500,500);
    }
    
    /**
     * Act - do whatever the Explosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setExplosion();
        
        if(time.getTime() == 0){
            sound.stopMusic();
            getWorld().removeObject(this);
        }
    }
    
    public void setExplosion(){
        setImage(explosion.getCurrentImage());
        getImage().scale(40,40);
    }
}
