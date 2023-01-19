import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (Matthew Chiu) 
 * @version (January 2023 - Version 1.0.0)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Flappy Seahorse", 50);
    Label instruction = new Label("Press Spacebar to Jump!", 50);
    Label instruction2 = new Label("Jump between the seaweed!", 50);
    
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 550, 1, false); 
        addObject(titleLabel, 310, 60);
        addObject(instruction, 305, 430);
        addObject(instruction2, 300, 502);
    }
    
    public void act()
    {
        //Starts the game if user presses the space bar.
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
