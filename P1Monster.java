import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class P1Monster here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class P1Monster extends Monster {
    GifImage monster = new GifImage("Modelo1.gif");
    
 
    
    public P1Monster(MyWorld world){
        super(world);
    }
    /**
     * Act - do whatever the P1Monster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void move(){
        super.localizationX = getX();
        super.localizationY = getY();
        
        if(localizationX >= 435){
            if (Greenfoot.isKeyDown("left")) {
            setLocation(localizationX - 2, localizationY);
            }
        } 
        if(localizationX <= 775){
            if (Greenfoot.isKeyDown("right")) {
                setLocation(localizationX + 2, localizationY);
            }
        }
        if(localizationY > 20){
            if (Greenfoot.isKeyDown("up")) {
                setLocation(localizationX, localizationY - 2);
            }
        }
        if(localizationY < 565){
            if (Greenfoot.isKeyDown("down")) {
                setLocation(localizationX, localizationY + 2);
            }
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
