import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class P1Monster here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class P1Monster extends Monster {
    GifImage monster = new GifImage("Modelo1.gif");
    
 
    
    public P1Monster(MyWorld word){
        super.myWorld = word;
    }
    /**
     * Act - do whatever the P1Monster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        // Add your action code here.
        setMonster();
        move();
        collisionVerification();
        checkTimeSound();
    }
    public void move(){
        super.localizationX = getX();
        super.localizationY = getY();
        
        if(localizationX >= 435){
            if (Greenfoot.isKeyDown("left")) {
            setLocation(localizationX - 2, localizationY);
            }
        } 
        if (Greenfoot.isKeyDown("right")) {
                setLocation(localizationX + 2, localizationY);
        }
        if (Greenfoot.isKeyDown("up")) {
                setLocation(localizationX, localizationY - 2);
        }
        if (Greenfoot.isKeyDown("down")) {
                setLocation(localizationX, localizationY + 2);
        }
        if (Greenfoot.isKeyDown("space")) {
            fire(); 
        }
        
    }
    public void setMonster(){
        setImage(monster.getCurrentImage());     
        getImage().scale(60, 60);
    }
}
