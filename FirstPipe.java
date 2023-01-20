import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The platforms that our hero will hop on.
 * 
 * @author (Matthew Chiu) 
 * @version (January 2023 - Version 1.0.0)
 */
public class FirstPipe extends Actor
{
    boolean scoreCounted = false;
    int speed = -2;
    /**
     * Act - do whatever the FirstPipe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setSpeed();
        move(speed);
        if(getX() <= 300 && !scoreCounted)
        {
            getWorldOfType(MyWorld.class).increaseScore();
            scoreCounted = true;
        }
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