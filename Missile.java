import greenfoot.*;

/**
 * Classe abstrata para a criacao de misseis, objetos responsaveis pelo encapsulamento
 * das pontuacoes a serem perdidas pelo jogador em caso de colisao.
 * 
 * @version 2022-12-03
 */
public abstract class Missile  extends Actor
{
    private GifImage missile;
    private int damage;
    protected MyWorld myWorld;
    
    /**
     * Act - do whatever the Missile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(myWorld.getWorldTime() > 0){
            setMissile();
            move();
            atWorldEdge();
        }
    }
    
    public Missile(GifImage gifMissile, MyWorld myWorld){
        missile = gifMissile;
        this.myWorld = myWorld;
    }
    
    /**
     * Elimina o objeto do cenario (World) atual caso o mesmo chegue no final do campo
     * visivel.
     */
    public void atWorldEdge() {
        if(getY() > getWorld().getHeight() - 5) {
            myWorld.removeObject(this);
            myWorld.decrementMissile();
        }
    }
    
    public int getDamage(){
        return damage;
    }
    public void setDamage(int value){
        damage = value;
    }
    
    public void setMissile(){
        setImage(missile.getCurrentImage());
        getImage().scale(40,40);
    }
    
    protected void detonate(){
        missile = new GifImage("Explosao.gif");
        getWorld().addObject(new Explosion(),getX(),getY());
    }
    
    public abstract void move();
}
