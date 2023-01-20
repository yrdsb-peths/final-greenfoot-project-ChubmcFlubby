import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The second obstacle that our hero must pass through.
 * 
 * @author (Matthew Chiu) 
 * @version (January 2023 - 1.0.0)
 */
public class SecondPipe extends Actor
{
    int speed = -2;
    /**
     * Act - do whatever the SecondPipe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setSpeed();
        move(speed);
        if(getX() <= 1)
        {
            getWorld().removeObject(this);
        }
    }
    
    private void setSpeed()
    {
        speed = getWorldOfType(MyWorld.class).getLevel() * -1;
    }
    
    public void Ground()
    {
        getImage().scale(getImage().getWidth()*6, getImage().getHeight());
    }
    
}