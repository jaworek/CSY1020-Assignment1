import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ball1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ball1 extends Actor
{
    /**
     * Act - do whatever the ball1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //random number generator taken from Greenfoot API documentation: https://www.greenfoot.org/files/javadoc/greenfoot/Greenfoot.html
        int degree = Greenfoot.getRandomNumber(91);
        move(1);
        Actor net = getOneIntersectingObject(barrier.class);
        if (net!=null)
        {
        }
            
        Actor baby_1 = getOneIntersectingObject(baby1.class);
        if (baby_1!=null)
        {
            turn(degree);
            move(1);
        }
        Actor baby_2 = getOneIntersectingObject(baby2.class);
        if (baby_2!=null)
        {
            turn(degree);
            move(1);
        }
        
        //bouncing of the walls, source: http://www.greenfoot.org/topics/1481
        if(getX() == 0)
        {
            turn(degree);
            hitWall2();
        }
        if(getX() == 599)
        {
            turn(degree);
            hitWall1();
        }
        if(getY() == 0)
        {
            turn(degree);
        }
        if(getY() == 399)
        {
            turn(degree);
        }
    } 
    private void hitWall1()
    {
        MyWorld spaceWorld = (MyWorld) getWorld();
        Counter1 counter = spaceWorld.getCounter1();
        counter.bumpCount(1);
    }
    private void hitWall2()
    {
        MyWorld spaceWorld = (MyWorld) getWorld();
        Counter2 counter = spaceWorld.getCounter2();
        counter.bumpCount(1);
    }
}
