import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The screen that the user sees before the actual game starts.
 * 
 * @author (Matthew Chiu) 
 * @version (January 2023 - Version 1.0.0)
 */
public class TitleScreen extends World
{
    //Create new label objects that will be displayed on screen on the title screen.
    Label titleLabel = new Label("Flappy Seahorse", 50);
    Label instruction = new Label("Press Spacebar to Jump / Start!", 50);
    Label instruction2 = new Label("Jump between the seaweed!", 50);

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x550 cells with a cell size of 1x1 pixels.
        // Add labels / instructions to the title screen.
        super(600, 550, 1, false); 
        addObject(titleLabel, 310, 60);
        addObject(instruction, 302, 433);
        addObject(instruction2, 300, 502);
        prepare();
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
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    
    //Adds objects to the title screen of the game.
    private void prepare()
    {
        Hero hero = new Hero();
        addObject(hero,284,130);
    }
}
