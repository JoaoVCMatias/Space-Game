import greenfoot.*;

/**
 * Derivado de Monster com movimentacao limitada ao lado direito da tela.
 * 
 * @version 2022-12-04
 */
public class P1Monster extends Monster {
    GifImage monster = new GifImage("Modelo1.gif");
    
    public P1Monster(MyWorld world){
        super(world);
    }
    
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
