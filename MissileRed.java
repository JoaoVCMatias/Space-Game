import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MissileRed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MissileRed extends Missile
{
    public MissileRed(MyWorld myWorld){
        super(new GifImage("MissilVermelho.gif"),myWorld);
        setDamage(10);
    }
    /**
     * Act - do whatever the MissileRed wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(myWorld.getWorldTime() > 0){
            setMissile();
            move();
            atWorldEdge();
        }
    }
    public void move(){
        int x = getX();
        int y = getY();
        setLocation(x, y+2);
    }
}
