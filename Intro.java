import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Intro extends World
{

    /**
     * Constructor for objects of class Intro.
     * 
     */
    public Intro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        showText("Orbus Defense", 300, 100);
        showText("Press ENTER to Start", 300, 200);
        
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("ENTER"))
        {
            Greenfoot.setWorld(new Tutorial());
        }
    }
}
