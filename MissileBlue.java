import greenfoot.*;

/**
 * Derivado da classe Missile com pontuacao (dano) equivalente a 5.
 * 
 * @version 2022-12-03
 */
public class MissileBlue extends Missile
{
    /**
     * Act - do whatever the MissileBlue wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public MissileBlue(MyWorld myWorld){
        super(new GifImage("MissilAzul.gif"),myWorld);
        setDamage(5);
    }
    
    public void move(){
        int x = getX();
        int y = getY();
        setLocation(x, y+2);
    }
}
