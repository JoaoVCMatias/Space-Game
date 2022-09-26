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
    private int time = 60;
    
    Timer cronometro = new Timer();
    TimerTask tarefa = new TimerTask() {
        public void run() {
            time--;
        }
    };


    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(800, 600, 1);
        
        P1Monster p1Monster = new P1Monster();
        P2Monster p2Monster = new P2Monster();
        
        players.add(p1Monster);
        players.add(p2Monster);
        
        addObject(p1Monster, 550,550);
        addObject(p2Monster, 110,550);
        
        cronometro.schedule(tarefa, 500, 500);
    }
    
    public void act()
    {
        generateMissible();
        generateMeteor();
        updateScore();
        updateTime();
        checkTime();
    }
    
    public void generateMissible(){
        Random var = new Random();
        if(var.nextInt(100) < 5)
            addObject(new Missile(), var.nextInt(800),10);
    }
    
    public void generateMeteor(){
        Random var = new Random();
        int value = var.nextInt(101);
        //System.out.println(value);
        if(var.nextInt(51) == 50)
            if(value == 100)
                addObject(new GoldMeteor(), var.nextInt(800),10);
            else if(value < 60) 
                addObject(new GreenMeteor(), var.nextInt(800),10);
            else
               addObject(new RedMeteor(), var.nextInt(800),10); 
    }
    
    public void updateScore(){
        
        showText("Score P1: " + players.get(0).getScore(), 700,20);
        showText("Score P2: " + players.get(1).getScore(), 100,20);
        
    }
    
    public void updateTime(){
        showText("Time: " + time, 390,20);
    }
    
    public void checkTime(){
        if(time == 0){
            Greenfoot.stop();
        }
    }
}
