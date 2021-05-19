import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy1 extends Actor
{
    private char axis;
    private int wait;
    /**
     * Act - do whatever the Enemy1 wants to do. This method is called whenever
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
            
            wait = 75;
        }
        }
    }
    
    public void delete()
    {
        if(getX() < 25)
        {
            ((Tutorial)getWorld()).loseLife(1);
            getWorld().removeObject(this);
        }
        
        else if(isTouching(RedAttack.class))
        {
            ((Tutorial)getWorld()).gainScore(1);
            removeTouching(RedAttack.class);
            getWorld().removeObject(this);
        }
    }
}
