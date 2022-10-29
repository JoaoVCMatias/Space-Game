import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Information here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Information extends World
{
    private MyWorld myWorld;
    /**
     * Constructor for objects of class Information.
     * 
     */
    public Information(MyWorld myWorld)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        addObject(new NextLevel(myWorld), 700, 510);
    }
}
