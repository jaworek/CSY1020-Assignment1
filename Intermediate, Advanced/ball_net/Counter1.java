import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Counter1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter1 extends Actor
{
    //counter reference: http://www.greenfoot.org/doc/howto-1 access date: 21.12.2016
    private int totalCount = 0;

    public Counter1()
    {
        setImage(new GreenfootImage("Score: " + totalCount, 20, Color.BLACK, Color.WHITE));
    }

    /**
     * Increase the total amount displayed on the counter, by a given amount.
     */
    public void bumpCount(int amount)
    {
        totalCount += amount;
        setImage(new GreenfootImage("Score: " + totalCount, 20, Color.BLACK, Color.WHITE));
        if(totalCount == 10)
        {
            Greenfoot.stop();
            setImage(new GreenfootImage("Team 1 won!", 20, Color.BLACK, Color.WHITE));
        }
    }
}    
