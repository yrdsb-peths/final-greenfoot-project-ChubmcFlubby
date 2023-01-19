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
    private int jumpHeight = -10;
    private int count = 0;
    
    public void act()
    {
        jumpHeight++;
        count++;
        fall();
        jump();
        collision();
    }
    
    public void jump()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            jumpHeight = -10;
        }
    }
    
    public void fall()
    {
        if(count % 2 == 0)
        {
            setLocation(getX(), getY() + jumpHeight);
        }
    }
    
    public void collision()
    {
        if(getY() >= getWorld().getHeight() || 
        isTouching(FirstPipe.class) || 
        isTouching(SecondPipe.class))
        {
            MyWorld world = (MyWorld) getWorld();
            world.gameOver();
            world.removeObject(this);
            Greenfoot.stop();
        }
    }
}