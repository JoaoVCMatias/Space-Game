import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Presentation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Presentation extends World
{
    private NextLevel menu;
    /**
     * Constructor for objects of class Presentation.
     * 
     */
    public Presentation()
    {    
        // Cria novo mundo de resolucao 600x400 com celula de 1 pixel
        super(800, 600, 1);
        menu = new NextLevel(new Menu());
        addObject(menu, 700, 450);
        
    }
}
