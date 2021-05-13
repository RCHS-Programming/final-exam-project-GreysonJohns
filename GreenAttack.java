import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenAttack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenAttack extends Actor
{
    private int wait;
    /**
     * Act - do whatever the GreenAttack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveTimer();
        delete();
        
        wait = wait - 1;
    }    
    
    public void moveTimer()
    {
        //Makes the bot move forward periodically.
        if(wait < 1) 
        {
        if(Greenfoot.getRandomNumber(100) > 75)
        {
            setLocation(getX() + 50, getY());
            
            wait = 100;
        }
        }
    }
    
    public void delete()
    {
        if (getX() > 798)
        {
            getWorld().removeObject(this);
        }
    }
}
