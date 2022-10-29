import java.util.TimerTask;
import java.util.Timer;

/**
 * Write a description of class Time here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Time  
{
    // instance variables - replace the example below with your own
    private int time;
    private boolean pause;
    
    
    Timer cronometro = new Timer();
    TimerTask tarefa = new TimerTask() {
        public void run() {
            if(time > 0 && !pause)
                time--;
        }
    };
    
    /**
     * Constructor for objects of class Time
     */
    public Time(int time, int time1, int time2)
    {
        this.time = time;
        cronometro.schedule(tarefa, time1, time2);
    }
    
    public int getTime(){
        return time;
    }
    
    public void pause(){
        this.pause = true;
    }
    
    public void start(){
        this.pause = false;
    }

    
}
