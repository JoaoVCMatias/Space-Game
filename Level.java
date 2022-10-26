/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level  
{
    // instance variables - replace the example below with your own
    public int probaMissileBlue;
    public int probaMissileGreen;
    
    public int probMeteor;
    public int probaGoldMeteor;
    public int probaGreenMeteor;
    public int probaRedMeteor;
    
    public int probaSatellite;
    
    public int countMeteor;
    public int countMissile;
    public int countSatellite;
    
    public int maxMeteor;
    public int maxMissile;
    public int maxSatellite;

    /**
     * Constructor for objects of class Level
     */
    private Level(int value1, int value2, int value3, int value4, int value5, int value6, int value7, int value8, int value9, int value10)
    {
        probaMissileBlue = value1;
        probaMissileGreen = value2;
        
        probMeteor = value3;
        probaGoldMeteor = value4;
        probaGreenMeteor = value5;
        probaRedMeteor = value6;
    
        probaSatellite = value7;
        
        maxMeteor = value8;
        maxMissile = value9;
        maxSatellite = value10;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static Level generateLevel1(){
        return new Level(80,50,5,10,50,60,20,10,15,10);
    }
}
