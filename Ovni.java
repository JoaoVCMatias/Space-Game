import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class Ovni here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class  Ovni extends Actor
{
    private MyWorld myWorld;
    protected char direction = 'r';
    private int countMissile;
    
    public Ovni(MyWorld myWorld){
        this.myWorld = myWorld;
    }
    
    public abstract void move();
    
    public void fire(){
        Random var = new Random();
        
        if(var.nextInt(1000) < 60 && myWorld.getLevel().countMissile <= 10){
            myWorld.addObject(new MissileBlue(myWorld),getX(),getY()-5);
            myWorld.getLevel().countMissile += 1;
        }
            
    }
}
