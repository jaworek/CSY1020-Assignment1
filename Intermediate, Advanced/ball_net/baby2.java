import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class baby2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class baby2 extends Actor
{
    /**
     * Act - do whatever the baby2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int test = 0;
    public void act() 
    {
        // Add your action code here.
        
        //prevents baby from passing through the net
        Actor net = getOneIntersectingObject(barrier.class);
        if (net!=null)
        {
            move(1);
        }
        
        //automatic movement of a baby
        if(test == 0)
        {
            setLocation(getX(), getY()-1);
        }
        if(getY() == 1)
        {
            test = 1;
        }
        if(test == 1)
        {
            setLocation(getX(), getY()+1);
        }
        if(getY() == 399)
        {
            test = 0;
        }
    }    
}
