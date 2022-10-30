import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlueOvni here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueOvni extends Ovni
{
    public BlueOvni(MyWorld myWorld){
        super(myWorld);
    }
    /**
     * Act - do whatever the BlueOvni wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setOvni();
        move();
        fire();
    }
    private void setOvni(){
        getImage().scale(60, 60);
    }
    
    public void move(){
        if(direction == 'r'){
            if(getX() <= 775){
                setLocation(getX() + 2, getY());
            }else{
                direction = 'l';
            }
        }else{
            if(getX() >= 435){
                setLocation(getX() - 2, getY());
            }else{
                direction = 'r';
            }
        }       
    }
}