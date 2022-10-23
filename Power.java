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
    private Sound sound;
    
    public Power(GifImage gifPower, MyWorld world, Sound sound){
        power = gifPower;
        myWorld = world;
        this.sound = sound;
        sound.playMusic();
    }
    public void atWorldEdge() {
        if(this.getY() <= 10) {
            myWorld.removeObject((FireBool)this);
            
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
            sound.stopMusic();
            myWorld.addObject(new Explosion(), getX(), getY());
            myWorld.removeObject(missile);   
            myWorld.removeObject((FireBool)this);
            
        }
        
    }
    
    public void checkTimeSound(){
        if(sound.getTimeSound() <=0){
            sound.stopMusic();
        }
    }
}
