import java.util.*;
import java.util.stream.Collectors;

/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level  
{
    // instance variables - replace the example below with your own
    public int idLevel;
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
    private Level(ArrayList<Integer> levelProp)
    {
        idLevel = levelProp.get(0);
        probaMissileBlue = levelProp.get(1);
        probaMissileGreen = levelProp.get(2);
        
        probMeteor = levelProp.get(3);
        probaGoldMeteor = levelProp.get(4);
        probaGreenMeteor = levelProp.get(5);
        probaRedMeteor = levelProp.get(6);
    
        probaSatellite = levelProp.get(7);
        
        maxMeteor = levelProp.get(8);
        maxMissile = levelProp.get(9);
        maxSatellite = levelProp.get(10);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static Level generateLevel1(){
        ArrayList<Integer> levelProp = new ArrayList<Integer>();
        //idLevel, pMB, pMG, pM, pGM, pGM,pRM, pS, mMe, mMi, mS
        int[] intArray = {1,60,50,5,10,50,60,20,10,15,10};

        
        levelProp = (ArrayList<Integer>) Arrays.stream(intArray).boxed().collect(Collectors.toList());;
        return new Level(levelProp);
    }
    
    public static Level generateLevel2(){
        ArrayList<Integer> levelProp = new ArrayList<Integer>();
        //idLevel, pMB, pMG, pM, pGM, pGM,pRM, pS, mMe, mMi, mS
        int[] intArray = {2,60,50,5,10,50,60,20,10,15,10};

        
        levelProp = (ArrayList<Integer>) Arrays.stream(intArray).boxed().collect(Collectors.toList());;
        return new Level(levelProp);
    }
    
    public static Level generateLevel3(){
        ArrayList<Integer> levelProp = new ArrayList<Integer>();
        //idLevel, pMB, pMG, pM, pGM, pGM,pRM, pS, mMe, mMi, mS
        int[] intArray = {3,40,50,10,20,5,60,20,10,15,10};

        
        levelProp = (ArrayList<Integer>) Arrays.stream(intArray).boxed().collect(Collectors.toList());;
        return new Level(levelProp);
    }
    

}
