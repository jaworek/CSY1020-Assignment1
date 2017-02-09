import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class baby4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class baby4 extends Actor
{
    /**
     * Act - do whatever the baby4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        //Take location from one actor and apply it to the other one: http://www.greenfoot.org/topics/8561/0 date: 27.12.2016
        Actor theBall = (Actor)getWorld().getObjects(ball1.class).get(0);
        int ballX = theBall.getX();
        int ballY = theBall.getY();
        if(getX()>ballX)
        {
            //move(-1);
        }
        if(getX()<ballX)
        {
            //move(1);
        }
        if(getY()>ballY)
        {
            setLocation(getX(), getY()-1);
        }
        if(getY()<ballY)
        {
            setLocation(getX(), getY()+1);
        }
         //prevents baby from passing through the net
        Actor net = getOneIntersectingObject(barrier.class);
        if (net!=null)
        {
            move(1);
        }
    }    
    
}
