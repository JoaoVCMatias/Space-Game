import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe abstrata para a criacao de botoes, objetos responsaveis pelo encapsulamento
 * de possiveis cenarios a serem imprimidos em tela mediante click.
 * 
 * @version 2022-12-03
 */
public abstract class Button extends Actor
{
    private MyWorld myWorld;
    private World menu;
    
    public abstract void click();
    
    public Button(MyWorld myWorld){
        this.myWorld = myWorld;
    }
    
    public Button(World menu){
        this.menu = menu;
    }
    
    public MyWorld getLevel(){
        return myWorld;
    }
    
    public World getMenu(){
        return menu;
    }
}
