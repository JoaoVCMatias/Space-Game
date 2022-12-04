import greenfoot.*;

/**
 * Classe da tela que mostra informacoes de como jogar o jogo.
 * 
 * @version 2022-12-03
 */
public class Information extends World
{
    private MyWorld myWorld;
    
    /**
     * Construtor recebe uma instancia de MyWorld que sera o cenario (level) do
     * jogo indicado pelo button NextLevel.
     */
    public Information(MyWorld myWorld)
    {    
        super(800, 600, 1);
        addObject(new NextLevel(myWorld), 700, 510);
    }
}
