import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PacmanLevel1 extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public PacmanLevel1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        for(int x = 200; x < 600; x+=72){
            this.addObject(new Wall(), x, 200);
        }
        
        addObject(new Pacman(), 40, 40);
        
        addObject(new Phantom(), 250, 40);
    }
}
