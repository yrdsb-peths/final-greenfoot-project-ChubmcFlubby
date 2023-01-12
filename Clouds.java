import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The clouds that will help the user think that the world is scrolling.
 * 
 * @author (Matthew Chiu) 
 * @version (January 2023 - 1.0.0)
 */
public class Clouds extends Actor
{
    /**
     * Act - do whatever the Clouds wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-1);
        if(getX() == 0)
        {
            setLocation(getWorld().getWidth() - 1, Greenfoot.getRandomNumber(170) + 30);
        }
    }
    
    public void Cloud()
    {
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/3);
    }
}
