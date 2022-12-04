import greenfoot.*;

/**
 * Derivado de Monster com movimentacao limitada ao lado esquerdo da tela.
 * 
 * @version 2022-12-04
 */
public class P2Monster extends Monster
{
    GifImage monster = new GifImage("Modelo2.gif");
    
    public P2Monster(MyWorld world){
        super(world);
    }
    
    public void move(){
        super.localizationX = getX();
        super.localizationY = getY();
        
        if(localizationX <= 365){
            if (Greenfoot.isKeyDown("D")) {
            setLocation(localizationX + 2, localizationY);
            }
        }
        if(localizationX >= 25){
            if (Greenfoot.isKeyDown("A")) {
                setLocation(localizationX - 2, localizationY);
            }
        }
        if(localizationY > 20){
           if (Greenfoot.isKeyDown("W")) {
            setLocation(localizationX, localizationY - 2);
            } 
        }
        if(localizationY < 565){
            if (Greenfoot.isKeyDown("S")) {
                setLocation(localizationX, localizationY + 2);
            }
        }
        
        if (Greenfoot.isKeyDown("Q")) {
            fire();
        }
    }
    public void setMonster(){
        setImage(monster.getCurrentImage());     
        getImage().scale(60, 60);
    }
}
