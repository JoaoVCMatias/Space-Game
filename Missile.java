import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Missile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Missile  extends Actor
{
    private GifImage missile;
    private int damage;
    /**
     * Act - do whatever the Missile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Missile(GifImage gifMissile){
        missile = gifMissile;
    }
    public void atWorldEdge() {
        if(getY() > getWorld().getHeight() - 5) {
            getWorld().removeObject(this);
        }
    }
    
    public int getDamage(){
        return damage;
    }
    public void setDamage(int value){
        damage = value;
    }
    
    public void setMissile(){
        setImage(missile.getCurrentImage());
        getImage().scale(40,40);
    }
    protected void detonate(){
        missile = new GifImage("Explosao.gif");
        getWorld().addObject(new Explosion(),getX(),getY());
    }
    public abstract void move();
        
}
