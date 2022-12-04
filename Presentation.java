import greenfoot.*;

/**
 * Tela inicial do jogo.
 * 
 * @version 2022-12-03
 */
public class Presentation extends World
{
    private NextLevel menu;

    public Presentation()
    {    
        super(800, 600, 1);
        menu = new NextLevel(new Menu());
        addObject(menu, 700, 450);
        
    }
}
