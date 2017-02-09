import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class baby1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class baby5 extends Actor
{
    /**
     * Act - do whatever the baby1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        //set up for baby movement, sources: http://www.greenfoot.org/doc/tut-2 http://www.greenfoot.org/topics/310 date accesssed: 10.11.2016
        if(Greenfoot.isKeyDown("a"))
        {
            move(-1);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            move(1);
        }
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY()-1);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY()+1);
        }
        
        //prevents baby from passing through the net
        Actor net = getOneIntersectingObject(barrier.class);
        if (net!=null)
        {
            move(-1);
        }
    }
    
}
