import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe derivada de Button que mediante ao click do jogador redireciona o mesmo
 * para o proximo level do jogo.
 *  
 * @version 2022-12-03
 */
public class NextLevel extends Button
{
    private Time time;
    
    public NextLevel(MyWorld myWorld){
        super(myWorld);
    }
    
    public NextLevel(World menu){
        super(menu);
    }
        
    /**
     * Act - do whatever the NextLevel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        getImage().scale(200, 200);
        click();
    }
    
    public void click(){
        if(Greenfoot.mouseClicked(this)){
            if(getMenu() != null){
                Greenfoot.setWorld(getMenu());
            }   
            else if(getLevel() != null){
                Greenfoot.setWorld(getLevel());
                getLevel().startTime();
            }           
        }
    }
    
    public void click(MyWorld myWorld){
        if(getMenu() != null){
            Greenfoot.setWorld(getMenu());
        }   
        else if(getLevel() != null){
            Greenfoot.setWorld(getLevel());
            getLevel().startTime();
        }
    }
}
