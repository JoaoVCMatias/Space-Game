import greenfoot.*;

/**
 * Classe abstrata para a criacao de satelites. Objetos de classes filhas de Satellite
 * representam o item necessario para que os jogadores possam usar poderes. Um satelite
 * incrementa o total de poderes disponiveis em 1.
 * 
 * @version 2022-12-04
 */
public abstract class Satellite extends Actor
{
    private MyWorld myWorld;
    
    public Satellite(MyWorld myWorld){
        this.myWorld = myWorld;
    }
    
    public void atWorldEdge() {
        if(getY() > getWorld().getHeight() - 5) {
            myWorld.decrementSatellite();
            myWorld.removeObject(this);
        }
    }
    
    public abstract void move();
    
    public MyWorld getMyWorld(){
        return myWorld;
    }
}
