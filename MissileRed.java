import greenfoot.*;

/**
 * Derivado da classe Missile com pontuacao (dano) equivalente a 10.
 * 
 * @version 2022-12-03
 */
public class MissileRed extends Missile
{
    public MissileRed(MyWorld myWorld){
        super(new GifImage("MissilVermelho.gif"),myWorld);
        setDamage(10);
    }
    
    public void move(){
        int x = getX();
        int y = getY();
        setLocation(x, y+2);
    }
}
