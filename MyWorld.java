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
    
    //Local variables and objects.
    int score = 0;
    int time = 0;
    int level = 1;
    Label scoreBoard;
    Label gameOverLabel;
    Label endScore;
    
    public MyWorld()
    {
        // Create a new world with 600x550 cells with a cell size of 1x1 pixels.
        super(600, 550, 1, false);
        
        //Add in our objects to the world.
        Hero seahorse = new Hero();
        addObject(seahorse, 300, 300);
        
        scoreBoard = new Label(0, 80);
        addObject(scoreBoard, 50, 50);
    }
    
    public void act()
    {
        //Here, we increase time and add pipes into the world throughout the game.
        time++;
        addObstacles();
    }
    
    public void increaseScore()
    {
        //Increase the score and set it to the scoreboard. If the score gets past 5, increase the level of difficulty by 1.
        scoreBoard.setValue(++score);
        if(score % 5 == 0)
        {
            level += 1;
        }
    }
    
    //A getter method for our level mechanic.
    public int getLevel()
    {
        return level;
    }
    
    //Add and remove objects when the game is over.
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over!", 100);
        addObject(gameOverLabel, getWidth()/2, getHeight()/2);
        Label endScore = new Label("Score: " + score, 100);
        addObject(endScore, 303, 351);
        removeObject(scoreBoard);
    }
    
    //Add pipes at randomly generated locations at set time increments.
    public void addObstacles()
    {
        if(time >= 200/level)
        {
            int randomNumber = Greenfoot.getRandomNumber(6);
            addObject(new FirstPipe(), getWidth()-1, 400 + 50 * randomNumber);
            addObject(new SecondPipe(), getWidth()-1, -175 + 50 * randomNumber);
            time = 0;
        }
    }
}