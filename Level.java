import java.util.*;
import java.util.stream.Collectors;

/**
 * Level do jogo encapsula as probabilidades referentes a um level especifico do jogo.
 *  
 * @version 2022-12-04
 */
public class Level  
{
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
     * Construtor privado porque a criacao de um Level deve ser feita por meio de um dos
     * metodos "fabrica" que sao estaticos.
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
     * Gerador/fabrica do level 1.
     * 
     * @return     instancia de Level com valores e probabilidades referentes
     */
    public static Level generateLevel1(){
        ArrayList<Integer> levelProp = new ArrayList<Integer>();
        //idLevel, pMB, pMG, pM, pGM, pGM,pRM, pS, mMe, mMi, mS
        int[] intArray = {1,60,50,5,10,50,60,20,10,15,10};

        levelProp = (ArrayList<Integer>) Arrays.stream(intArray).boxed().collect(Collectors.toList());;
        return new Level(levelProp,"nivel01.png");
    }
    
    /**
     * Gerador/fabrica do level 2.
     * 
     * @return     instancia de Level com valores e probabilidades referentes
     */
    public static Level generateLevel2(){
        ArrayList<Integer> levelProp = new ArrayList<Integer>();
        //idLevel, pMB, pMG, pM, pGM, pGM,pRM, pS, mMe, mMi, mS
        int[] intArray = {2,60,50,5,10,50,60,20,10,15,10};

        levelProp = (ArrayList<Integer>) Arrays.stream(intArray).boxed().collect(Collectors.toList());;
        return new Level(levelProp,"nivel02.png");
    }
    
    /**
     * Gerador/fabrica do level 3.
     * 
     * @return     instancia de Level com valores e probabilidades referentes
     */
    public static Level generateLevel3(){
        ArrayList<Integer> levelProp = new ArrayList<Integer>();
        //idLevel, pMB, pMG, pM, pGM, pGM,pRM, pS, mMe, mMi, mS
        int[] intArray = {3,40,50,10,20,5,60,20,10,15,10};

        levelProp = (ArrayList<Integer>) Arrays.stream(intArray).boxed().collect(Collectors.toList());;
        return new Level(levelProp,"nivel03.png");
    }
    
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
