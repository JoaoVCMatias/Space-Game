import greenfoot.*;

/**
 * Classe derivada de Button que mediante ao click do jogador finaliza o jogo. A diferenca
 * do SmallQuit para Quit esta no tamanho da imagem utilizada.
 *  
 * @version 2022-12-03
 */
public class SmallQuit extends Button
{
    public SmallQuit(MyWorld myWorld){
        super(myWorld);
    }
    
    public SmallQuit(World menu){
        super(menu);
    }
    
    /**
     * Act - do whatever the SmallQuit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        getImage().scale(50, 50);
        click();
    }
    
    public void click(){
        if(Greenfoot.mouseClicked(this))
        {
            System.exit(0);
        }
    }
}
