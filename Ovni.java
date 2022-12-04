import greenfoot.*;
import java.util.Random;

/**
 * Classe abstrata para a criacao dos ovnis (chefe final).
 * 
 * @version 2022-12-04
 */
public abstract class Ovni extends Actor
{
    private MyWorld myWorld;
    protected char direction = 'r';
    private int countMissile;
    
    public Ovni(MyWorld myWorld){
        this.myWorld = myWorld;
    }
    
    public abstract void move();
    
    /**
     * Dispara misseis de acordo com a probabilidade definida no level.
     */
    public void fire(){
        Random var = new Random();
        
        if(var.nextInt(1000) < 60 && myWorld.getLevel().countMissile <= 10){
            myWorld.addObject(new MissileBlue(myWorld),getX(),getY()-5);
            myWorld.getLevel().countMissile += 1;
        }
            
    }
}
