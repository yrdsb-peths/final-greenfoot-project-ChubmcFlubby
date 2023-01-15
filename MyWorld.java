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
        addObstacles();
    }
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over!", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    public void addObstacles()
    {
        int randomNumber = Greenfoot.getRandomNumber(6);
        addObject(new FirstPipe(), getWidth()-1, 650);
        addObject(new SecondPipe(), getWidth()-1, -50);
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
        FirstPipe platforms = new FirstPipe();
        addObject(platforms,285,169);
        platforms.setLocation(292,252);
        platforms.setLocation(483,268);
        SecondPipe secondPipe = new SecondPipe();
        addObject(secondPipe,538,392);
        platforms.setLocation(464,354);
        removeObject(platforms);
        FirstPipe platform1 = new FirstPipe();
        addObject(platforms,464,394);
        removeObject(platforms);
        removeObject(secondPipe);
        FirstPipe firstPipe2 = new FirstPipe();
        addObject(firstPipe2,571,393);
    }
}