import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The second obstacle that our hero must pass through.
 * 
 * @author (Matthew Chiu) 
 * @version (January 2023 - 1.0.0)
 */
public class SecondPipe extends Actor
{
    //Variable that tracks the speed of this pipe.
    int speed = -2;
    /**
     * Act - do whatever the SecondPipe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //The method is called here.
        setSpeed();
        move(speed);
        
        //If the pipe reaches the end of the screen, the object will be removed.
        if(getX() <= 1)
        {
            getWorld().removeObject(this);
        }
    }
    
    //This method increases the speed of the pipe depending on the level of the game.
    private void setSpeed()
    {
        speed = getWorldOfType(MyWorld.class).getLevel() * -1;
    }
}