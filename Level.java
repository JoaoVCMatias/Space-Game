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
    private int idLevel;
    private int probaMissileBlue;
    private int probaMissileGreen;
    
    private int probMeteor;
    private int probaGoldMeteor;
    private int probaGreenMeteor;
    private int probaRedMeteor;
    
    private int probaSatellite;
    
    public int countMeteor;
    public int countMissile;
    public int countSatellite;
    
    private int maxMeteor;
    private int maxMissile;
    private int maxSatellite;
    
    private String urlImage;
    

    /**
     * Constructor for objects of class Level
     */
    private Level(ArrayList<Integer> levelProp, String urlImage)
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
        
        this.urlImage = urlImage;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
    //São criados os geradores de level
    
    public static Level generateLevel1(){
        ArrayList<Integer> levelProp = new ArrayList<Integer>();
        //idLevel, pMB, pMG, pM, pGM, pGM,pRM, pS, mMe, mMi, mS
        int[] intArray = {1,60,50,5,10,50,60,20,10,15,10};

        
        levelProp = (ArrayList<Integer>) Arrays.stream(intArray).boxed().collect(Collectors.toList());;
        return new Level(levelProp,"nivel01.png");
    }
    
    public static Level generateLevel2(){
        ArrayList<Integer> levelProp = new ArrayList<Integer>();
        //idLevel, pMB, pMG, pM, pGM, pGM,pRM, pS, mMe, mMi, mS
        int[] intArray = {2,60,50,5,10,50,60,20,10,15,10};

        
        levelProp = (ArrayList<Integer>) Arrays.stream(intArray).boxed().collect(Collectors.toList());;
        return new Level(levelProp,"nivel02.png");
    }
    
    public static Level generateLevel3(){
        ArrayList<Integer> levelProp = new ArrayList<Integer>();
        //idLevel, pMB, pMG, pM, pGM, pGM,pRM, pS, mMe, mMi, mS
        int[] intArray = {3,40,50,10,20,5,60,20,10,15,10};

        
        levelProp = (ArrayList<Integer>) Arrays.stream(intArray).boxed().collect(Collectors.toList());;
        return new Level(levelProp,"nivel03.png");
    }
    
    
    //São criados os get's dos atributos do level
    public int getIdLevel(){
        return idLevel;
    }
    
    public int getProbaMissileBlue(){
        return probaMissileBlue;
    }
    
    public int getProbaMissileGreen(){
        return probaMissileGreen;
    }
    
    public int getProbMeteor(){
        return probMeteor;
    }
    
    public int getProbaGoldMeteor(){
        return probaGoldMeteor;
    }
    
    public int getProbaGreenMeteor(){
        return probaGreenMeteor;
    }
    
    public int getProbaRedMeteor(){
        return probaRedMeteor;
    }
    
    public int getProbaSatellite(){
        return probaSatellite;
    }
    
    public int getCountMeteor(){
        return countMeteor;
    }
    
    public int getCountMissile(){
        return countMissile;
    }

    public int getCountSatellite(){
        return countSatellite;
    }
    
    public int getMaxMeteor(){
        return maxMeteor;
    }
    
    public int getMaxMissile(){
        return maxMissile;
    }
    
    public int getMaxSatellite(){
        return maxSatellite;
    }
    
    public String geturlImage(){
        return urlImage;
    }
    
    
}
