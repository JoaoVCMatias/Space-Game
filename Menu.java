import greenfoot.*;

/**
 * Responsavel pelo menu com as opcoes de jogar, sair e sobre.
 * 
 * @version 2022-12-03
 */
public class Menu extends World
{
    private Sound musicMenu;
    
    /**
     * Instancia o menu com seus botoes que redirecionam para a primeira fase,
     * sobre e sair do jogo
     * 
     */
    public Menu()
    {    
        super(800, 600, 1);
        addObject(new Play(new MyWorld(Level.generateLevel1())), 350, 140);
        addObject(new Quit(new MyWorld(Level.generateLevel1())), 350, 448);
        addObject(new Info(new About(this)), 740, 560);
        
    }

    /**
     * Inicia musica quando o menu estiver na tela
     * 
     */
    public void act()
    {
        if(musicMenu == null) {
            musicMenu = new Sound("musicaMenu.mp3",50);
            musicMenu.playMusic();
        }
    }
    
    public void StopMusic(){
        musicMenu.stopMusic();
    }
    
}
