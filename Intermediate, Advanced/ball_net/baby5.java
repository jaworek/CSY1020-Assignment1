import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class baby5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class baby5 extends Actor
{
    /**
     * Act - do whatever the baby5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        //prevents baby from passing through the net
        Actor net = getOneIntersectingObject(barrier.class);
        if (net!=null)
        {
            move(-1);
        }
    }    
}
