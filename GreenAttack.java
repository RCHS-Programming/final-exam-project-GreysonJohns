import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenAttack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenAttack extends Actor
{
    private int timer;
    private int wait;
    /**
     * Act - do whatever the GreenAttack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveTimer();
        delete();
    }    
    
    public void moveTimer()
    {
        //Makes the bot move forward and stop, forming a barrier from the enemies.
        if(wait < 1) 
        {
        if(Greenfoot.getRandomNumber(100) > 85)
        {
            setLocation(getX() + 50, getY());
            
            wait = Greenfoot.getRandomNumber(100);
        }
        }
        
        if (wait > 1)
        {
            wait = Greenfoot.getRandomNumber(50);
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
