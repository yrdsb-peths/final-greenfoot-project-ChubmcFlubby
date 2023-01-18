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
    
    public int score = 0;
    int time = 0;
    Label scoreBoard;
    Label gameOverLabel;
    
    public MyWorld()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 550, 1, false);

        Hero seahorse = new Hero();
        addObject(seahorse, 300, 300);
        
        Label scoreBoard = new Label(0, 80);
        addObject(scoreBoard, 50, 50);
        
        prepare();
    }
    
    public void act()
    {
        time++;
        addObstacles();
    }
    
    public void increaseScore()
    {
        score++;
        scoreBoard.setValue(score);
    }
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over!", 100);
        addObject(gameOverLabel, getWidth()/2, getHeight()/2);
    }
    
    public void addObstacles()
    {
        if(time % 100 == 0)
        {
            int randomNumber = Greenfoot.getRandomNumber(6);
            addObject(new FirstPipe(), getWidth()-1, 400 + 50 * randomNumber);
            addObject(new SecondPipe(), getWidth()-1, -175 + 50 * randomNumber);
        }
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
        
    }
}