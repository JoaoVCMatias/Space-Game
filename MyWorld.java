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
    private int incidenceMissile = 5;
    private NextLevel nextLevel;
    private Time waitLevel;


    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld(Level level) //É passado o level como parametro
    {
        //É construido o mundo de maneira padrão, de acordo com as caracteristicas de cada lvl
        super(800, 600, 1);
        p1Monster = new P1Monster(this);
        p2Monster = new P2Monster(this);
        
        addObject(p1Monster, 550,550);
        addObject(p2Monster, 110,550);
           
        this.level = level;
        setBackground(level.geturlImage());
        addObject(new Info(this), 25, 150);
        addObject(new SmallQuit(this), 25, 200);
        
        if(level.getIdLevel() == 3){
            addObject(new RedOvni(this), 110,50);
            addObject(new BlueOvni(this), 550,50);
            p1Monster.setScore(1000);
            p2Monster.setScore(1000);
        }
        
        
    }
    
    public void act()
    {
        showText("Level: " + level.getIdLevel(), 500,20);
        initializeTime();
        initializeSound();
        checkTime();
        updateTime();
        updateScore();
        if(timer.getTime() > 0 && level.getIdLevel() != 3){
            generateMissible();
            generateMeteor();
            generateSatellite();
            
        }
        else if (timer.getTime() == 0){ //Verifica se o tempo acabou
            if(waitLevel == null){ //Instancia um cronometro para o proximo lvl
                waitLevel = new Time(90,500,500);
            }
            if(waitLevel.getTime() == 0){
                nextLevel.click(this);
            }
            if(p1Monster.getScore() > p2Monster.getScore())
                showText("Parabéns Jogador Azul. O tempo acabou..." + waitLevel.getTime(), 400,150);
            else if(p1Monster.getScore() < p2Monster.getScore())
                showText("Parabéns Jogador Vermelho. O tempo acabou..." + waitLevel.getTime(), 400,150);
            else
                showText("Empate. O tempo acabou..." + waitLevel.getTime(), 400,150);
        }
        
        
        
        
        
    }
    
    public void initializeTime(){
        if(timer == null)
            timer = new Time(time,500,500);
    }
    
    public void initializeSound(){
        if(sound == null){
            sound = new Sound("MusicaEspacial01.wav",25);
            sound.setVolume(50);
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
        //System.out.println(level.countMissile);
        if(var.nextInt(100) < incidenceMissile  && level.countMissile < level.getMaxMissile()){
            if(var.nextInt(100) < level.getProbaMissileBlue()){
                generateBlueMissile();
            }else{
                generateGreenMissile();
            }
            incrementMissile();
        }
        if(level.countMissile == level.getMaxMissile())
            incidenceMissile = 1;
            
            
    }
    
    private void generateMeteor(){
        Random var = new Random();
        int value = var.nextInt(101);
        
        if(var.nextInt(100) <= level.getProbMeteor() && level.getCountMeteor() < level.getMaxMeteor()){
        
            if(value <= level.getProbaGoldMeteor())
                addObject(new GoldMeteor(this), var.nextInt(800),10);
            else if(value <= level.getProbaGreenMeteor()) 
                addObject(new GreenMeteor(this), var.nextInt(800),10);
            else
               addObject(new RedMeteor(this), var.nextInt(800),10);
            incrementMeteor();
        }
            
    }
    private void generateSatellite(){
        Random var = new Random();
        if(var.nextInt(51) == 50 && level.countSatellite < level.getMaxSatellite()){
            addObject(new SatelliteGrey(this), var.nextInt(800),10);
            incrementSatellite();

        }
            
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
            if(sound != null)
                sound.stopMusic();
            if(nextLevel == null){
                if(level.getIdLevel() == 1)
                    nextLevel = new NextLevel(new MyWorld(Level.generateLevel2()));
                if(level.getIdLevel() == 2)
                    nextLevel = new NextLevel(new MyWorld(Level.generateLevel3()));
                if(level.getIdLevel() == 3)
                    nextLevel = new NextLevel(new Menu());
                    
                addObject(nextLevel, 400, 300);
            }
                
        }  
                
            
    }
        
    
    
    public void pauseTime(){
        if(timer != null)
            timer.pause();
    }
    public void startTime(){
        if(timer != null)
            timer.start();
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
    
    public Level getLevel(){
        return this.level;
    }
}
