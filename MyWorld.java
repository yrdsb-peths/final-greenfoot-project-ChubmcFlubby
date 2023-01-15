import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The world that our game takes place in.
 * 
 * @author (Matthew Chiu) 
 * @version (January 2023 - Version 1.0.0)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);

        Hero birdie = new Hero();
        addObject(birdie, 200, 300);
        
        prepare();
    }
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over!", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    public void addObstacles()
    {
        int randomNumber = Greenfoot.getRandomNumber(6);
        addObject(new Platforms(), getWidth() - 1, 450 + 0 * randomNumber);
        addObject(new Platforms(), getWidth() - 1, -200 + 50 + randomNumber);
    }
    
    /**
     * Counstructor - The code that gets run one time when object is created.
     */
    /**
    * Prepare the world for the start of the program.
    * That is: create the initial objects and add them to the world.
    */
    private void prepare()
    {
        Clouds clouds = new Clouds();
        addObject(clouds,115,95);
        Clouds clouds2 = new Clouds();
        addObject(clouds2,426,108);
        removeObject(clouds);
        removeObject(clouds2);
        Platforms platforms = new Platforms();
        addObject(platforms,285,169);
        platforms.setLocation(292,252);
        platforms.setLocation(483,268);
    }
}