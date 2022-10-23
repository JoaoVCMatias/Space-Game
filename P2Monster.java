import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class P2Monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P2Monster extends Monster
{
    GifImage monster = new GifImage("Modelo2.gif");
    
    public P2Monster(MyWorld world){
        super(world);
    }
    /**
     * Act - do whatever the P2Monster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setMonster();
        move();
        collisionVerification();
        checkTimeSound();
    }
    public void move(){
        super.localizationX = getX();
        super.localizationY = getY();
        
        if(localizationX <= 365){
            if (Greenfoot.isKeyDown("D")) {
            setLocation(localizationX + 2, localizationY);
            }
        }
        if (Greenfoot.isKeyDown("A")) {
            setLocation(localizationX - 2, localizationY);
        }
        if (Greenfoot.isKeyDown("W")) {
            setLocation(localizationX, localizationY - 2);
        }
        if (Greenfoot.isKeyDown("S")) {
            setLocation(localizationX, localizationY + 2);
        }
        if (Greenfoot.isKeyDown("Q")) {
            fire();
        }
    }
    public void setMonster(){
        setImage(monster.getCurrentImage());     
        getImage().scale(60, 60);
    }
}
