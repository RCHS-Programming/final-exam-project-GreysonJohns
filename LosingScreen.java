import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LosingScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LosingScreen extends World
{

    /**
     * Constructor for objects of class LosingScreen.
     * 
     */
    public LosingScreen(int score)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        showText("Game Over", 300, 200);
        
        showText("Score: " + score, 300, 300);
    }
}
