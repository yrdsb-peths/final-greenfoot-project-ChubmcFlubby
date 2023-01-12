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
        super(600, 400, 1);

        Hero birdie = new Hero();
        addObject(birdie, 200, 300);

        createLand();
        prepare();
    }

    public void createLand()
    {
        Platforms platform = new Platforms();
        int x = Greenfoot.getRandomNumber(600);
        int y = Greenfoot.getRandomNumber(400);
        addObject(platform, x, y);
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
    }
}