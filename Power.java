import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Power here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Power extends Actor
{
    private GifImage power;
    public MyWorld myWorld;
    
    public Power(GifImage gifPower, MyWorld word){
        power = gifPower;
        myWorld = word;
    }
    public void atWorldEdge() {
        if(this.getY() <= 10) {
            //myWorld.removeObject((FireBool)this);
            getWorld().removeObject(this);
        }
    }
    public abstract void move();
    
    public void setMissile(){
        setImage(power.getCurrentImage());
        getImage().scale(40,40);
    }
    public void collisionVerification(){
        Actor missile = getOneIntersectingObject(Missile.class);
        if(missile != null){
            myWorld.removeObject(missile);   
            myWorld.removeObject((FireBool)this);
            
        }
        
    }
}
