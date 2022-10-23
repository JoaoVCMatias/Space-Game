import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FireBool here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        // Add your action code here.
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
