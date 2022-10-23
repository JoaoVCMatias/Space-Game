import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NextLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NextLevel extends Button
{
    public NextLevel(MyWorld myWorld){
        super(myWorld);
    }
        
        
    /**
     * Act - do whatever the NextLevel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        getImage().scale(200, 200);
        
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Menu());
              
        }
    }
}
