import greenfoot.*;

/**
 * Classe abstrata para a criacao de poderes que removem misseis do cenario.
 * 
 * @version 2022-12-04
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
    
    /**
     * Mediante a colisao com missil, remove ambos do cenario.
     */
    public void collisionVerification(){
        Actor missile = getOneIntersectingObject(Missile.class);
        if(missile != null){
            sound.stopMusic();
            myWorld.addObject(new Explosion(), getX(), getY());
            myWorld.removeObject(missile);   
            myWorld.decrementMissile();
            myWorld.removeObject((FireBool)this);
        }
    }
    
    public void checkTimeSound(){
        if(sound.getTimeSound() <=0){
            sound.stopMusic();
        }
    }
}
