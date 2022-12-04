import java.util.TimerTask;
import java.util.Timer;

/**
 * Cronometro que pode ser utilizado para determinar o tempo entre uma acao e outra.
 *  
 * @version 2022-12-04
 */
public class Time  
{
    private int time;
    private boolean pause;
    
    Timer cronometro = new Timer();
    TimerTask tarefa = new TimerTask() {
        public void run() {
            if(time > 0 && !pause)
                time--;
        }
    };
    
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
