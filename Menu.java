import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    private Sound musicMenu;
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Cria novo mundo de resolucao 600x400 com celula de 1 pixel
        super(800, 600, 1);
        addObject(new Play(new MyWorld(Level.generateLevel1())), 350, 140);
        addObject(new Quit(new MyWorld(Level.generateLevel1())), 350, 448);
        addObject(new Info(new About(this)), 740, 560);
        
    }
    public void act()
    {
        if(musicMenu == null)
            musicMenu = new Sound("musicaMenu.mp3",50);
            musicMenu.playMusic();
    
    }
    
    public void StopMusic(){
        musicMenu.stopMusic();
    }
    
}
