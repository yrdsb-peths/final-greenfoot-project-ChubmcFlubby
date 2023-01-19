import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (Matthew Chiu) 
 * @version (January 2023 - Version 1.0.0)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Flappy seahorse", 50);
    Label label2 = new Label("Press Spacebar to Jump!", 50);
    Label label = new Label("Jump between the seaweed!", 50);

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 550, 1, false); 
        addObject(titleLabel, 309, 71);
        addObject(label2, 309, 375);
        addObject(label, 299, 498);
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
    
    private void prepare()
    {
        Hero hero = new Hero();
        addObject(hero, 300, 300);
    }
}
