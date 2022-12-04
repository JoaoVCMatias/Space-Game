import greenfoot.*;

/**
 * Classe derivada de Button que mediante ao click do jogador redireciona o mesmo
 * para a tela de informacoes.
 *  
 * @version 2022-12-03
 */
public class Info extends Button
{
    public Info(MyWorld myWorld){
        super(myWorld);
        myWorld.pauseTime();
    }
    
    public Info(World menu){
        super(menu);
    }

    public void act()
    {
        // Add your action code here.
        getImage().scale(50, 50);
        click();
        
    }
    
    public void click(){
        if(Greenfoot.mouseClicked(this))
        {
            if(getMenu() != null){
                Greenfoot.setWorld(getMenu());
            }   
            else if(getLevel() != null){
                getLevel().pauseTime();
                Greenfoot.setWorld(new Information(getLevel())); 
            }  
            
        }
    }
}
