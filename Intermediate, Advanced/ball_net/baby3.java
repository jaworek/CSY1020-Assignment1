import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class baby3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class baby3 extends Actor
{
    /**
     * Act - do whatever the baby3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        //Object follows mouse source: http://stackoverflow.com/questions/28513413/get-object-to-follow-mouse-in-java-greenfoot date: 27.12.2016
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null)
        {
            if(getX()>mouse.getX())
            {
                move(-1);
            }
            if(getX()<mouse.getX())
            {
                move(1);
            }
            if(getY()>mouse.getY())
            {
                setLocation(getX(), getY()-1);
            }
            if(getY()<mouse.getY())
            {
                setLocation(getX(), getY()+1);
            }
        }
        //prevents baby from passing through the net
        Actor net = getOneIntersectingObject(barrier.class);
        if (net!=null)
        {
            move(-1);
        }
    }    
}
