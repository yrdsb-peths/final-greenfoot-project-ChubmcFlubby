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
    
    //Local variables: One keeps track of jump height and one keeps track of the time.
    private int jumpHeight = -10;
    private int time = 0;
    
    //The sound that will play when the game is over.
    GreenfootSound gameOverSound = new GreenfootSound("sounds/Sad-Trombone-A1-www.fesliyanstudios.com.mp3");
    
    public void act()
    {
        //Calling all of our methods here. We also keep track of some of our variables here as well.
        jumpHeight++;
        time++;
        fall();
        jump();
        collision();
    }
    
    public void jump()
    {
        //If the user presses the spacebar, the hero will perform a jump.
        if(Greenfoot.isKeyDown("space"))
        {
            jumpHeight = -10;
        }
    }
    
    public void fall()
    {
        //The fall method. Determines the time and rate at which the hero starts to fall.
        if(time % 2 == 0)
        {
            setLocation(getX(), getY() + jumpHeight);
        }
    }
    
    public void collision()
    {
        //This method is basically a death checker. If our hero comes into contact with anything, then the game is over.
        if(getY() >= getWorld().getHeight() || isTouching(FirstPipe.class) || isTouching(SecondPipe.class))
        {
            MyWorld world = (MyWorld) getWorld();
            world.gameOver();
            world.removeObject(this);
            gameOverSound.play();
            Greenfoot.stop();
        }
    }
}