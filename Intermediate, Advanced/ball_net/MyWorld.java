import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class MyWorld extends World
{
    private Counter1 theCounter1;
    private Counter2 theCounter2;
    private ball1 theBall;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //this chunck of code should not be changes and MUST be included
        //in your solution
        super(600, 400, 1);
        for (int loop=0; loop<20; loop=loop+1)
        {
            addObject(new barrier(), 300, 20*loop);
        }
        addObject(new baby1(), 150, 200);
        addObject(new baby2(), 450, 200);
        //End of code that must be included in your solution
        
        addObject(new baby3(), 100, 300);
        addObject(new baby4(), 500, 300);
        addObject(new baby5(), 100, 100);
        addObject(new baby6(), 500, 100);
        
        theBall = new ball1();
        addObject(theBall, 200, 200);
        
        theCounter1 = new Counter1();
        addObject(theCounter1, 50, 30);
        theCounter2 = new Counter2();
        addObject(theCounter2, 550, 30);
    }
    public Counter1 getCounter1()
    {
        return theCounter1;
    }
    public Counter2 getCounter2()
    {
        return theCounter2;
    }
}
