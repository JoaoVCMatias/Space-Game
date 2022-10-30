import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Button extends Actor
{
    private MyWorld myWorld;
    private World menu;
    
    public abstract void click();
    
    public Button(MyWorld myWorld){
        this.myWorld = myWorld;
    }
    
    public Button(World menu){
        this.menu = menu;
    }
    
    public MyWorld getLevel(){
        return myWorld;
    }
    
    public World getMenu(){
        return menu;
    }
}
