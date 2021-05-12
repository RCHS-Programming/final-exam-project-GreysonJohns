import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedAttack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedAttack extends Actor
{
    /**
     * Act - do whatever the RedAttack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        attack();
    }    
    
    public void attack()
    {
        //Makes the dot move in a basic forward movement Space Invaders style.
        setLocation(getX() + 50, getY());
        
        if (getX() > 798)
        {
            getWorld().removeObject(this);
        }
    }
}
