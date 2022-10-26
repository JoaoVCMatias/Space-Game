import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class MissileGreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MissileGreen extends Missile
{
    
    /**
     * Act - do whatever the MissileGreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private Monster selectedMonster;
    
    public MissileGreen(MyWorld myWorld){
        super(new GifImage("MissilVerde.gif"),myWorld);
        setDamage(5);
    }
    public void act()
    {
        // Add your action code here.
        setMissile();
        move();
        atWorldEdge();
             
        
        
    }
    
    public void move(){
       setLocalizationX();
       setLocation(getX(), getY()+1);
    }
    private void setLocalizationX(){
        if(selectedMonster == null)
            selectMonster();
        if(selectedMonster.localizationX > getX()){
            setLocation(getX()+1, getY());
        }else if(selectedMonster.localizationX < getX()){
            setLocation(getX()-1, getY());
        }
    }
    public void selectMonster(){
        int p1x = myWorld.getMonster1().localizationX;
        int p2x = myWorld.getMonster2().localizationX;
        int x = getX();
        
        int distanceP1 = x - p1x;
        int distanceP2 = (x - p2x) *-1;
         
        if(distanceP1 > distanceP2){
            selectedMonster = myWorld.getMonster1();
        }else{
            selectedMonster = myWorld.getMonster2();
        }

        
    }
}
