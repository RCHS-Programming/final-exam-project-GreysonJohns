import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy3 extends Actor
{
    private int wait;
    /**
     * Act - do whatever the Enemy3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        wait = wait - 1;
        moveTimer();
        delete();
    }    
    
    public void moveTimer()
    {
        //Makes the balloon move forward periodically.
        if(wait < 1) 
        {
        if(Greenfoot.getRandomNumber(100) > 75)
        {
            setLocation(getX() - 50, getY());
            
            wait = 25;
        }
        }
    }
    
    public void delete()
    {
        if(getX() < 25  || isTouching(YellowAttack.class))
        {
            removeTouching(YellowAttack.class);
            getWorld().removeObject(this);
        }
    }
}
