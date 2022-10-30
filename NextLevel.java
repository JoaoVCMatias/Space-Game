import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NextLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NextLevel extends Button
{
    private Time time;
    public NextLevel(MyWorld myWorld){
        super(myWorld);
    }
    
    public NextLevel(World menu){
        super(menu);
    }
        
        
    /**
     * Act - do whatever the NextLevel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        getImage().scale(200, 200);
        click();
        
    }
    
    public void click(){
        if(Greenfoot.mouseClicked(this)){
            if(getMenu() != null){
                Greenfoot.setWorld(getMenu());
            }   
            else if(getLevel() != null){
                Greenfoot.setWorld(getLevel());
                getLevel().startTime();
            }           
              
        }
    }
    
    public void click(MyWorld myWorld){
                
        //myWorld = null;
        if(getMenu() != null){
            Greenfoot.setWorld(getMenu());
        }   
        else if(getLevel() != null){
            Greenfoot.setWorld(getLevel());
            getLevel().startTime();
        }
        //getLevel().startTime();
        
    
    }
}
