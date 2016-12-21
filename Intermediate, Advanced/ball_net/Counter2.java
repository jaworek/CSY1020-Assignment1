import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Counter1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter2 extends Actor
{
    //counter reference: http://www.greenfoot.org/doc/howto-1 date: 21.12.2016
    private int totalCount = 0;

    public Counter2()
    {
        setImage(new GreenfootImage("0", 20, Color.WHITE, Color.BLACK));
    }

    /**
     * Increase the total amount displayed on the counter, by a given amount.
     */
    public void bumpCount(int amount)
    {
        totalCount += amount;
        setImage(new GreenfootImage("" + totalCount, 20, Color.WHITE, Color.BLACK));
    }
}    
