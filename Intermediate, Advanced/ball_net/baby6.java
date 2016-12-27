import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class baby6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class baby6 extends Actor
{
    /**
     * Act - do whatever the baby6 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        //prevents baby from passing through the net
        Actor net = getOneIntersectingObject(barrier.class);
        if (net!=null)
        {
            move(1);
        }
    }    
}
