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
        //random number generator taken from Greenfoot API documentation: https://www.greenfoot.org/files/javadoc/greenfoot/Greenfoot.html access date: 18.11.2016
        int test = Greenfoot.getRandomNumber(3);
        int degree = 0;
        if(test == 0)
        {
            degree = 180;
        }
        if(test == 1)
        {
            degree = 135;
        }
        if(test == 2)
        {
            degree = 225;
        }
        move(2);
        Actor baby_1 = getOneIntersectingObject(baby1.class);
        Actor baby_2 = getOneIntersectingObject(baby2.class);
        Actor baby_3 = getOneIntersectingObject(baby3.class);
        Actor baby_4 = getOneIntersectingObject(baby4.class);
        Actor baby_5 = getOneIntersectingObject(baby5.class);
        Actor baby_6 = getOneIntersectingObject(baby6.class);
        if (baby_1!=null || baby_2!=null || baby_3!=null || baby_4!=null || baby_5!=null || baby_6!=null)
        {
            turn(degree);
            move(5);
        }
        
        //bouncing off the walls, source: http://www.greenfoot.org/topics/1481 access date: 18.11.2016
        if(getX() == 0)
        {
            hitWall2();
			setLocation(300, 200);
			turnTowards(599, 200);
        }
        if(getX() == 599)
        {
            hitWall1();
			setLocation(300, 200);
			turnTowards(0, 200);
        }
        if(getY() == 0 || getY() == 399)
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
