import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Our hero - the main character of the game.
 * 
 * @author (Matthew Chiu) 
 * @version (January 2023 - Version 1.0.0)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int vSpeed = 0;
    private int acceleration = 1;
    private boolean jumping = false;
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-2);
        }
        
        else if(Greenfoot.isKeyDown("right"))
        {
            move(2);
        }
        
        else if(Greenfoot.isKeyDown("space"))
        {
            jumping = true;
            if(jumping)
            {
                if(getY() == 400 - 10)
                {
                    jumping = false;
                }
                
                if(getY() > 400 && !jumping)
                {
                setLocation(getX(), getY() + 5);
                }
                
                else
                {
                    setLocation(getX(), getY() - 5);
                }
            }
        }
        fall();
    }
    
    private void fall()
    {
        setLocation(getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
    }
}