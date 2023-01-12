import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The platforms that our hero will hop on.
 * 
 * @author (Matthew Chiu) 
 * @version (January 2023 - Version 1.0.0)
 */
public class Platforms extends Actor
{
    /**
     * Act - do whatever the Platforms wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-1);
        if(getX() == 0)
        {
            setLocation(getWorld().getWidth() - 1, Greenfoot.getRandomNumber(250) + 30);
        }
    }
    
    public void Ground()
    {
        getImage().scale(getImage().getWidth()*6, getImage().getHeight());
    }
}
