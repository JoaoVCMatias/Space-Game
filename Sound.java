import greenfoot.GreenfootSound;

/**
 * Write a description of class Sound here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sound  
{
    // instance variables - replace the example below with your own
    private int volume = 50;
    private GreenfootSound sound;
    private int secTime;
    private Time soundTime;
    
    /**
     * Constructor for objects of class Sound
     */
    public Sound(String url, int volume)
    {
        sound = new GreenfootSound(url);
        setVolume(volume);
        sound.setVolume(volume);
    }
    public Sound(String url, int volume, int time)
    {
        sound = new GreenfootSound(url);
        setVolume(volume);
        sound.setVolume(volume);
        secTime = time;
    }
    
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
