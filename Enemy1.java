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
        moveTimer();
        wait = wait - 1;
    }    
    
        public void moveTimer()
    {
        //Makes the bot move forward periodically.
        if(wait < 1) 
        {
        if(Greenfoot.getRandomNumber(100) > 75)
        {
            setLocation(getX() - 50, getY());
            
            wait = 100;
        }
        }
    }
}
