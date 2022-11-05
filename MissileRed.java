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
    
    public void move(){
        int x = getX();
        int y = getY();
        setLocation(x, y+2);
    }
}
