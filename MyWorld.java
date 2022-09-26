import lang.stride.*;
import java.util.*;
import greenfoot.*;
import java.util.ArrayList;

/**
 * 
 */
public class MyWorld extends World
{
    ArrayList<Monster> players = new ArrayList<Monster>();
    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        
        P1Monster p1Monster = new P1Monster();
        players.add(p1Monster);
        addObject(p1Monster, 550,365);
    
        
    }
    
    public void act()
    {
        generateMissible();
        generateMeteor();
        updateScore();
        
    }
    
    public void generateMissible(){
        Random var = new Random();
        if(var.nextInt(100) == 1)
            addObject(new Missile(), var.nextInt(600),10);
    }
    
    public void generateMeteor(){
        Random var = new Random();
        int value = var.nextInt(101);
        //System.out.println(value);
        if(var.nextInt(51) == 50)
            if(value == 100)
                addObject(new GoldMeteor(), var.nextInt(600),10);
            else if(value < 60) 
                addObject(new GreenMeteor(), var.nextInt(600),10);
            else
               addObject(new RedMeteor(), var.nextInt(600),10); 
    }
    
    public void updateScore(){
        for(Monster m : players){
            showText("Score P1: " + m.getScore(), 500,20);
        }
    }
}
