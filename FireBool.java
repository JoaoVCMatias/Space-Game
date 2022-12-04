import greenfoot.*;

/**
 * Derivado da classe Power que plota/representa uma bola de fogo.
 * 
 * @version 2022-12-04
 */
public class FireBool extends Power
{   
    public FireBool(MyWorld word){
        super(new GifImage("Tiro.gif"), word, new Sound("fireBoll.wav",50,1));
    }
    
    /**
     * Act - do whatever the FireBool wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        setMissile();
        move();
        atWorldEdge();
        checkTimeSound();
        if(this.getWorld() != null)
            collisionVerification();       
    }
    
    public void move(){
        setLocation(getX(), getY()-1);
    }
}
