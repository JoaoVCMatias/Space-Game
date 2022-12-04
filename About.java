import greenfoot.*;

/**
 * Classe da tela "sobre" que mostra informacoes sobre o jogo. 
 *  
 * @version 2022-12-03
 */
public class About extends World
{
    /**
     * Construtor recebe uma instancia de World que sera a proxima tela
     * indicada pelo button NextLevel.
     * 
     */
    public About(World menu)
    {    
        super(800, 600, 1);
        addObject(new NextLevel(menu), 656, 451);

    }
}
