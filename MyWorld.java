import lang.stride.*;
import java.util.*;
import greenfoot.*;
import java.util.ArrayList;

/**
 * 
 */
public class MyWorld extends World
{
    //private ArrayList<Monster> players = new ArrayList<Monster>();
    private P1Monster p1Monster;
    private P2Monster p2Monster;
    private int time = 60;
    private Time timer;
    private Sound sound;


    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(800, 600, 1);
        p1Monster = new P1Monster(this);
        p2Monster = new P2Monster(this);
        
        //players.add(p1Monster);
        //players.add(p2Monster);
        
        addObject(p1Monster, 550,550);
        addObject(p2Monster, 110,550);
        //addObject(new NextLevel(this), 20, 20);
        
        
        
        
        
    }
    
    public void act()
    {
        initializeTime();
        initializeSound();
        if(timer.getTime() > 0){
            generateMissible();
            generateMeteor();
            generateSatellite();
            updateScore();
            
        
        }
        checkTime();
        
        updateTime();
        
    }
    
    public void initializeTime(){
        if(timer == null)
            timer = new Time(time,500,500);
    }
    
    public void initializeSound(){
        if(sound == null){
            sound = new Sound("MusicaEspacial01.wav",25);
            sound.playMusic();
        }
    }
    private void generateBlueMissile(){
        Random var = new Random();
        addObject(new MissileBlue(), var.nextInt(800),10);
    }
    private void generateGreenMissile(){
        Random var = new Random();
        MissileGreen missile = new MissileGreen(this);
        addObject(missile, var.nextInt(800),10);
    }
    private void generateMissible(){
        Random var = new Random();
        if(var.nextInt(100) < 5){
            if(var.nextInt(100) >60){
                generateBlueMissile();
            }else{
                generateGreenMissile();
            }
        }
            
    }
    
    private void generateMeteor(){
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
    private void generateSatellite(){
        Random var = new Random();
        if(var.nextInt(51) == 50)
            addObject(new SatelliteGrey(), var.nextInt(800),10);

    }
    private void updateScore(){
        
        showText("Score P1: " + p1Monster.getScore(), 700,20);
        showText("Score P2: " + p2Monster.getScore(), 100,20);
        
    }
    
    private void updateTime(){
        showText("Time: " + timer.getTime(), 390,20);
    }
    
    private void checkTime(){
        if(timer.getTime() == 0){
            sound.stopMusic();
            addObject(new NextLevel(this), 400, 300);
            
        }
        
    }
    public Monster getMonster1(){
        return p1Monster;
    }
    public Monster getMonster2(){
        return p2Monster;
    }
    
    public int getWorldTime(){
        return timer.getTime();
    }
        
}
