import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutorial extends World
{
    private int redSpawnTimer;
    private int greenSpawnTimer;
    private int yellowSpawnTimer;
    
    int enemySpawn[] = {25, 75, 125, 175, 225, 275, 325, 375};
    /**
     * Constructor for objects of class Tutorial.
     * 
     */
    public Tutorial()
    {    
        // Create a new world with 800x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 

        addObject(new Orb(), 425, 325);
    }
    
    public void act()
    {
        spawnEnemies();
        
        redSpawnTimer = redSpawnTimer - 1;
        greenSpawnTimer = greenSpawnTimer - 1;
        yellowSpawnTimer = yellowSpawnTimer - 1;
    }
    
    public void spawnEnemies()
    {
        if(redSpawnTimer <= 0)
        {
            addObject(new Enemy1(), 775, enemySpawn[Greenfoot.getRandomNumber(8)]);
            
            redSpawnTimer = Greenfoot.getRandomNumber(150);
        }
        
        if (yellowSpawnTimer <=0)
        {
            addObject(new Enemy3(), 775, enemySpawn[Greenfoot.getRandomNumber(8)]);
            
            yellowSpawnTimer = Greenfoot.getRandomNumber(300);
        }
    }
}
