import greenfoot.*;

/**
 * Sua instancia encapsula a pontuacao a ser adquirida pelos jogadores.
 * 
 * @version 2022-12-03
 */
public class Meteor extends Actor
{
    private int value;
    private MyWorld myWorld;
    
    public Meteor(int value, MyWorld myWorld){
        this.value = value;
        this.myWorld = myWorld;
    }
    
    public int getValue(){
        return value;
    }
    
    /**
     * Elimina o objeto do cenario (World) atual caso o mesmo chegue no final do campo
     * visivel.
     */
    public void atWorldEdge() {
        if(getY() > myWorld.getHeight() - 5) {
            myWorld.decrementMeteor();
            myWorld.removeObject(this);
        }
    }
    
    public MyWorld getMyWorld(){
        return myWorld;
    }
}
