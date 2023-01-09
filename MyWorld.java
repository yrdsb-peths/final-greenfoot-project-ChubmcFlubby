import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Matthew Chiu) 
 * @version (1.0.0. - December 2022)
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
        
        Hero seahorse = new Hero();
        addObject(seahorse, 300, 300);
    }
    /**
     * Counstructor - The code that gets run one time when object is created.
     */
}