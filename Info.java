import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Info here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Info extends Button
{
    public Info(MyWorld myWorld){
        super(myWorld);
        myWorld.pauseTime();
    }
    
    /**
     * Act - do whatever the Info wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        getImage().scale(50, 50);
        
        if(Greenfoot.mouseClicked(this))
        {
            getLevel().pauseTime();
            Greenfoot.setWorld(new Information(getLevel())); 
        }
    }
}
