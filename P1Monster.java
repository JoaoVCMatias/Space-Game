import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class P1Monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P1Monster extends Monster
{
    GifImage monster = new GifImage("Modelo1.gif");
    
    
    /**
     * Act - do whatever the P1Monster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setImage(monster.getCurrentImage());
        int x = getX();
        int y = getY();
        getImage().scale(60,60);
        if(Greenfoot.isKeyDown("left")){
            setLocation(x-2, y);
        }else if(Greenfoot.isKeyDown("right")){
            setLocation(x+2, y);
        }
        //removeTouching(Meteor.class);
        collisionVerification();
    }
    
    public void collisionVerification(){
        Actor meteor = getOneIntersectingObject(Meteor.class);
        Actor missile = getOneIntersectingObject(Missile.class);
        Actor monster = getOneIntersectingObject(Monster.class);
        
        World myWorld = getWorld();
        if(meteor!=null){
            Meteor m = (Meteor)meteor;
            int value = m.getValue();
            myWorld.removeObject(meteor);
            setScore(getScore() + value);
        }     
        if(missile!=null){
            myWorld.removeObject(missile);
            setScore(getScore() - 5);
        } 
    }
    
}
