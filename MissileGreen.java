import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Derivado da classe Missile com pontuacao (dano) equivalente a 5. Esse missil segue o
 * jogador pelo cenario.
 * 
 * @version 2022-12-03
 */
public class MissileGreen extends Missile
{
    private Monster selectedMonster;
    
    public MissileGreen(MyWorld myWorld){
        super(new GifImage("MissilVerde.gif"),myWorld);
        setDamage(5);
    }
    
    public void act()
    {
        if(this != null && myWorld.getWorldTime() > 0){
            setMissile();
            move();
            atWorldEdge();
            collisionVerification();
        }
    }
    
    public void move(){
       setLocalizationX();
       setLocation(getX(), getY()+1);
    }
    
    /**
     * Determina a posicao (eixo X) do missil com base na posicao do jogador alvo.
     */
    private void setLocalizationX(){
        if(selectedMonster == null)
            selectMonster();
        if(selectedMonster.localizationX > getX()){
            setLocation(getX()+1, getY());
        }else if(selectedMonster.localizationX < getX()){
            setLocation(getX()-1, getY());
        }
    }
    
     /**
     * Determina jogador alvo como jogador mais proximo do missil.
     */
    public void selectMonster(){
        int p1x = myWorld.getMonster1().localizationX;
        int p2x = myWorld.getMonster2().localizationX;
        int x = getX();
        
        int distanceP1 = x - p1x;
        int distanceP2 = (x - p2x) *-1;
         
        if(distanceP1 > distanceP2){
            selectedMonster = myWorld.getMonster1();
        }else{
            selectedMonster = myWorld.getMonster2();
        }
    }
    
    /**
     * Cria e plota um missil vermelho (tira mais pontos) caso um missil verde colida com
     * outro missil nao vermelho.
     */
    public void collisionVerification() {
        Actor missile = getOneIntersectingObject(Missile.class);
        
        if(this.myWorld.getWorldTime() > 0){
            if (missile != null) {
                myWorld.addObject(new MissileRed(myWorld), getX(), getY());
                myWorld.removeObject(missile);
                myWorld.removeObject(this);
                myWorld.decrementMissile();
            }
        }
    }
}
