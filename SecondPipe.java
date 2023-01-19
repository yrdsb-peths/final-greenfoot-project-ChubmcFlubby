import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The second obstacle that our hero must pass through.
 * 
 * @author (Matthew Chiu) 
 * @version (January 2023 - 1.0.0)
 */
public class SecondPipe extends Actor
{
    int speed2 = -2;
    /**
     * Act - do whatever the SecondPipe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-2);
        if(getX() <= 1)
        {
            getWorld().removeObject(this);
        }
    }
    
    public void setSpeed(int spd)
    {
        speed2 = spd;
    }
    
    public void Ground()
    {
        getImage().scale(getImage().getWidth()*6, getImage().getHeight());
    }
    
}