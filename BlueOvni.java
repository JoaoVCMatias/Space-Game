import greenfoot.*;

/**
 * Derivado de Ovni com movimentacao limitada ao lado direito da tela.
 * 
 * @version 2022-12-04
 */
public class BlueOvni extends Ovni
{
    public BlueOvni(MyWorld myWorld){
        super(myWorld);
    }
    
    /**
     * Act - do whatever the BlueOvni wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setOvni();
        move();
        fire();
    }
    
    private void setOvni(){
        getImage().scale(60, 60);
    }
    
    public void move(){
        if(direction == 'r'){
            if(getX() <= 775){
                setLocation(getX() + 2, getY());
            }else{
                direction = 'l';
            }
        }else{
            if(getX() >= 435){
                setLocation(getX() - 2, getY());
            }else{
                direction = 'r';
            }
        }       
    }
}