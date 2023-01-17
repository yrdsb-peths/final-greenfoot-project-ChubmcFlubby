import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The second obstacle that our hero must pass through.
 * 
 * @author (Matthew Chiu) 
 * @version (January 2023 - 1.0.0)
 */
public class SecondPipe extends Actor
{
    /**
     * Act - do whatever the SecondPipe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-2);
        if(getX() == 0)
        {
            setLocation(getWorld().getWidth() - 1, Greenfoot.getRandomNumber(200) + 30);
        }
    }
    
    public void Ground()
    {
        getImage().scale(getImage().getWidth()*6, getImage().getHeight());
    }
    
}
