import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * Classe abstrata para a criacao dos monstros (jogadores). Encapsula pontuacoes e a
 * capacidade de ativacao de poderes.
 * 
 * @version 2022-12-04
 */
public abstract class Monster extends Actor {
    private int score;
    protected int localizationX;
    protected int localizationY;
    protected int fireBool;
    public MyWorld myWorld;
    private int shotDelay = 2;
    protected Time timeShot;
    private Sound sound = new Sound("Comendo.wav",50,1);
    
    public void act() {
        setMonster();
        move();
        collisionVerification();
        checkTimeSound();
    }
    
    public Monster(MyWorld myWorld){
        this.myWorld = myWorld;
    
    }
    
    public int getScore(){
        return score;
    }
    
    public void setScore(int value){
        score = value;
    }
    
    /**
     * Verifica colisao do jogador com missel, meteoro ou satelite, decrementando pontuacao,
     * incrementando pontuacao e adicionando quantidade de poderes disponiveis para 
     * utilizacao, respectivamente.
     * 
     * @version 2022-12-04
     */
    public void collisionVerification() {
        Actor meteor = getOneIntersectingObject(Meteor.class);
        Actor missile = getOneIntersectingObject(Missile.class);
        Actor monster = getOneIntersectingObject(Monster.class);  
        Actor satellite = getOneIntersectingObject(Satellite.class);
        
        if(this.myWorld.getWorldTime() > 0){
            if (meteor != null) {
                sound.playMusic();
                Meteor m = (Meteor) meteor;
                int value = m.getValue();
                myWorld.removeObject(meteor);
                setScore(getScore() + value);
                myWorld.decrementMeteor();
            
            }
            if (missile != null) {
                Missile m = (Missile)missile;
                m.detonate();
                int damege = m.getDamage();
                setScore(getScore() - damege);
                myWorld.removeObject(missile);
                myWorld.decrementMissile();
            }
            if(satellite != null){
                sound.playMusic();
                Satellite s = (Satellite)satellite;
                myWorld.removeObject(satellite);
                fireBoolIncrement();
                myWorld.decrementSatellite();
            }
        } 
    }
    
    public abstract void move();
    
    public abstract void setMonster();
    
    public void checkTimeSound(){
        if(sound.getTimeSound() <= 0){
            sound.stopMusic();
        }
    }
     
    /**
     * Dispara poder, decrementando a quantidade disponivel total.
     * 
     * @version 2022-12-04
     */
    public void fire(){
        if(firePower() && !delayShot()){
            myWorld.addObject(new FireBool(myWorld), localizationX,localizationY-5);
            fireBoolDecrement();
            timeShot = new Time(shotDelay,500,500);
        }
    }
    
    /**
     * Verifica (por tempo de delay predefinido) se um novo poder pode ser disparado.
     * 
     * @version 2022-12-04
     */
    public boolean delayShot(){
        if(timeShot == null){
            timeShot = new Time(shotDelay,500,500);
            return false;
        }
        if(timeShot.getTime() == 0){
            timeShot = null;
            return false;
        }if(timeShot.getTime() > 0){
            return true;
        }
        return true;
            
    }
    
    /**
     * Verifica se existe poder disponivel para ser disparado.
     * 
     * @version 2022-12-04
     */
    private boolean firePower(){
        if(fireBool <= 3 && fireBool > 0)
            return true;
        return false;
    }
    
    /**
     * Incrementa um poder ao total de poderes disponiveis.
     * 
     * @version 2022-12-04
     */
    private void fireBoolIncrement(){
        if(fireBool < 3)
            fireBool += 1;
    }
    
    /**
     * Decrementa um poder do total de poderes disponiveis.
     * 
     * @version 2022-12-04
     */
    private void fireBoolDecrement(){
        if(fireBool > 0)
            fireBool -= 1;
    }
}
