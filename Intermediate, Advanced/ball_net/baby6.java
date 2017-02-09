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
    int test = 0;
    public void act() 
    {
        // Add your action code here.
        if(test == 0)
        {
            setLocation(getX()-1, getY()+1);
        }
        if(test == 1)
        {
            setLocation(getX()+1, getY()+1);
        }
        if(test == 2)
        {
            setLocation(getX()+1, getY()-1);
        }
        if(test == 3)
        {
            setLocation(getX()-1, getY()-1);
        }
        if(getX() == 599 || getY() == 399 || getY() == 1)
        {
            test++;
        }
        if(test>3)
        {
            test = 0;
        }
        
        //prevents baby from passing through the net
        Actor net = getOneIntersectingObject(barrier.class);
        if (net!=null)
        {
            move(1);
        }
    }    
}
