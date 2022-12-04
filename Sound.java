import greenfoot.GreenfootSound;

/**
 * Permite a execucao de musicas com volume e tempo de delay personalizados.
 * 
 * @version 2022-12-04
 */
public class Sound  
{
    private int volume = 50;
    private GreenfootSound sound;
    private int secTime;
    private Time soundTime;
    
    /**
     * Construtor para objetos da classe Sound.
     * 
     * @param  String url   local do arquivo
     * @param  int volume   volume que sera usado para tocar o som
     */
    public Sound(String url, int volume)
    {
        sound = new GreenfootSound(url);
        setVolume(volume);
        sound.setVolume(volume);
    }
    
    /**
     * Construtor para objetos da classe Sound.
     * 
     * @param  String url   local do arquivo
     * @param  int volume   volume que sera usado para tocar o som
     * @param  int time     tempo de delay para inicio do som
     */
    public Sound(String url, int volume, int time)
    {
        sound = new GreenfootSound(url);
        setVolume(volume);
        sound.setVolume(volume);
        secTime = time;
    }
    
    /**
     * Construtor para objetos da classe Sound.
     * 
     * @param  String url   local do arquivo
     */
    public Sound(String url)
    {
        sound = new GreenfootSound(url);
        sound.setVolume(volume);
    }
    
    public void setVolume(int volume){
        sound.setVolume(volume);
    }
    
    public void playMusic(){
        soundTime = new Time(secTime,500,500);
        sound.playLoop();
    }
    
    public void stopMusic(){
        sound.stop();
    }
    
    public int getTimeSound(){
        if(soundTime != null)
            return soundTime.getTime();
        return 0;
    }
}
