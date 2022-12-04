import greenfoot.*;

/**
 * Derivado de Ovni com movimentacao limitada ao lado esquerdo da tela.
 * 
 * @version 2022-12-04
 */
public class RedOvni extends Ovni
{
    public RedOvni(MyWorld myWorld){
        super(myWorld);
    }
    
    /**
     * Act - do whatever the RedOvni wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setOvni();
        move();
        fire();
    }
    
    public void setOvni(){
        getImage().scale(60, 60);
    }
    
    public void move(){
        if(direction == 'r'){
            if(getX() <= 365){
                setLocation(getX() + 2, getY());
            }else{
                direction = 'l';
            }
        }else{
            if(getX() >= 25){
                setLocation(getX() - 2, getY());
            }else{
                direction = 'r';
            }
        }
    }
}
