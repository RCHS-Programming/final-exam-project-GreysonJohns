import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutorial extends World
{
    private int spawnTimer;
    int enemySpawn[] = {25, 75, 125, 175, 225, 275, 325, 375};
    /**
     * Constructor for objects of class Tutorial.
     * 
     */
    public Tutorial()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 

        addObject(new Orb(), 425, 325);
    }
    
    public void act()
    {
        spawnEnemies();
        
        spawnTimer = spawnTimer - 1;
    }
    
    public void spawnEnemies()
    {
        if(spawnTimer <= 0)
        {
            addObject(new Enemy1(), 775, enemySpawn[Greenfoot.getRandomNumber(8)]);
            
            spawnTimer = Greenfoot.getRandomNumber(100);
        }
    }
}
