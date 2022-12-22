import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (Matthew Chiu) 
 * @version (1.0.0 - December 2022)
 */
public class Hero extends Actor
{
    int speed = 2;
    String facing = "right";
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-speed);
            facing = "left";
        }
        
        else if(Greenfoot.isKeyDown("right"))
        {
            move(speed);
            facing = "right";
        }
    }
}
