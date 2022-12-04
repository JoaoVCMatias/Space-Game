import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe derivada de Button que mediante ao click do jogador redireciona o mesmo 
 * para o inicio do jogo.
 *  
 * @version 2022-12-03
 */
public class Play extends Button
{
    public Play(MyWorld myWorld){
        super(myWorld);
    }
    
    /**
     * Act - do whatever the Play wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        getImage().scale(491,321);
        click();
    }
    
    public void click(){
        if(Greenfoot.mouseClicked(this)){
            Menu m = (Menu)getWorld();
            m.StopMusic();
            Greenfoot.setWorld(getLevel());     
        }
    }
}
