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
    private Level level;


    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld(Level level)
    {
        super(800, 600, 1);
        p1Monster = new P1Monster(this);
        p2Monster = new P2Monster(this);
        
        addObject(p1Monster, 550,550);
        addObject(p2Monster, 110,550);
       
        this.level = level;      
        
        
        
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
            sound.setVolume(100);
            sound.playMusic();
        }
    }
    private void generateBlueMissile(){
        Random var = new Random();
        addObject(new MissileBlue(this), var.nextInt(800),10);
    }
    private void generateGreenMissile(){
        Random var = new Random();
        MissileGreen missile = new MissileGreen(this);
        addObject(missile, var.nextInt(800),10);
    }
    private void generateMissible(){
        Random var = new Random();
        System.out.println(level.countMissile);
        if(var.nextInt(100) < 5 && level.countMissile < level.maxMissile){
            if(var.nextInt(100) > level.probaMissileBlue){
                generateBlueMissile();
            }else{
                generateGreenMissile();
            }
            incrementMissile();
        }
            
    }
    
    private void generateMeteor(){
        Random var = new Random();
        int value = var.nextInt(101);
        
        if(var.nextInt(100) <= level.probMeteor && level.countMeteor < level.maxMeteor){
        
            if(value <= level.probaGoldMeteor)
                addObject(new GoldMeteor(), var.nextInt(800),10);
            else if(value <= level.probaGreenMeteor) 
                addObject(new GreenMeteor(), var.nextInt(800),10);
            else
               addObject(new RedMeteor(), var.nextInt(800),10);
            incrementMeteor();
        }
            
    }
    private void generateSatellite(){
        Random var = new Random();
        if(var.nextInt(51) == 50 && level.countSatellite < level.maxSatellite)
            addObject(new SatelliteGrey(this), var.nextInt(800),10);
            incrementSatellite();

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
    
    public void incrementMeteor(){
        level.countMeteor +=1;
    }
    
    public void decrementMeteor(){
        level.countMeteor -=1;
    }
    
    public void incrementMissile(){
        level.countMissile +=1;
    }
    
    public void decrementMissile(){
        level.countMissile -=1;
    }
    
    public void incrementSatellite(){
        level.countSatellite +=1;
    }
    
    public void decrementSatellite(){
        level.countSatellite -=1;
    }
        
}
