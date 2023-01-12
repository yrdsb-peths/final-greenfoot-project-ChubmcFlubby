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
    private int jumpHeight = -5;
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            vSpeed = jumpHeight;
            fall();
        }
        checkFalling();
        
        if(isTouching(Platforms.class))
        {
            getWorld().removeObject(this);
        }
    }
    
    private void fall()
    {
        setLocation(getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
    }
    
    boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight() / 2, Platforms.class);
        return under != null;
    }
    
    public void checkFalling()
    {
        if(onGround() == false)
        {
            fall();
        }
    }
}