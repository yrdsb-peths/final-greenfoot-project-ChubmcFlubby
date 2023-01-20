import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The first obstacle that our hero will pass through.
 * 
 * @author (Matthew Chiu) 
 * @version (January 2023 - Version 1.0.0)
 */
public class FirstPipe extends Actor
{
    //Local variables: One that keeps track of the score and one that keeps track of speed.
    boolean scoreCounted = false;
    int speed = -2;
    
    /**
     * Act - do whatever the FirstPipe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //Calling our method here.
        setSpeed();
        move(speed);
        
        //If the "pipe's" x location passed the location of the hero, increase score.
        if(getX() <= 300 && !scoreCounted)
        {
            getWorldOfType(MyWorld.class).increaseScore();
            scoreCounted = true;
        }
        
        //If the pipe reaches the end of the screen, it will remove the object.
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