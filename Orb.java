import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Orb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orb extends Actor
{
    private boolean isUpPress;
    private boolean isDownPress;
    private boolean isRightPress;
    private boolean isLeftPress;
    
    private boolean isWPress;
    private boolean isSPress;
    private boolean isDPress;
    public Orb()
    {
        isUpPress = false;
        isDownPress = false;
        isRightPress = false;
        isLeftPress = false;
        
        isWPress = false;
        isSPress = false;
        isDPress = false;
    }

    /**
     * Act - do whatever the Orb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        keyMove();
        attacks();
    }    
    
        public void keyMove()
    {
        //Check for the up key
        if( isUpPress == false && Greenfoot.isKeyDown("up") && getY() > 60)
        {
            setLocation( getX() , getY() - 50);
            isUpPress = true;
        }
        
        if( isUpPress && !Greenfoot.isKeyDown("up"))
        {
            isUpPress = false;
        }
        
        //Check for the down key
        if(isDownPress == false && Greenfoot.isKeyDown("down") && getY() < 350)
        {
            setLocation(getX(), getY() + 50);
            isDownPress = true;
        }
        
        if(isDownPress && !Greenfoot.isKeyDown("down"))
        {
            isDownPress=false;
        }
        
        
        
        //Check for the right key
        if(isRightPress == false && Greenfoot.isKeyDown("right") && getX() < 740)
        {
            setLocation(getX() + 50, getY());
            isRightPress = true;
        }
        
        if(isRightPress && !Greenfoot.isKeyDown("right"))
        {
            isRightPress=false;
        }
        
        
        //Check for the left key
        if(isLeftPress == false && Greenfoot.isKeyDown("left") && getX() > 60)
        {
            setLocation(getX() - 50, getY());
            isLeftPress = true;
        }
        
        if(isLeftPress && !Greenfoot.isKeyDown("left"))
        {
            isLeftPress=false;
        }
    }
    
    public void attacks()
    {
        // Bullet
        if(isWPress == false && Greenfoot.isKeyDown("W"))
        {
            getWorld().addObject(new RedAttack(), getX() + 50, getY());
            isWPress = true;
        }  
        
        if(isWPress && !Greenfoot.isKeyDown("W"))
        {
            isWPress = false;
        }
        
        // Bot
        if( isSPress == false && Greenfoot.isKeyDown("S"))
        {
            getWorld().addObject(new GreenAttack(), getX() + 50, getY());
            isSPress = true;
        }
        
        if(isSPress && !Greenfoot.isKeyDown("S"))
        {
            isSPress = false;
        }
        
        // Bomb
        if(isDPress == false && Greenfoot.isKeyDown("D"))
        {
            getWorld().addObject(new YellowAttack(), getX() + 50, getY());
            isDPress = true;
        } 
        
        if(isDPress && !Greenfoot.isKeyDown("D"))
        {
            isDPress = false;
        }
    }
}
