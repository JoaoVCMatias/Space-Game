import greenfoot.*;

/**
 * Classe derivada de Button que mediante ao click do jogador finaliza o jogo.
 *  
 * @version 2022-12-03
 */
public class Quit extends Button
{
    public Quit(MyWorld myWorld){
        super(myWorld);
    }
    /**
     * Act - do whatever the Quit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        getImage().scale(491,321);
        click();
    }
    
    public void click(){
        if(Greenfoot.mouseClicked(this))
        {
            System.exit(0);
              
        }
    }
}
