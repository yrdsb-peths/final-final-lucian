import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartWorld extends World
{
    public StartWorld(){    
        super(600, 400, 1); 
        StartButton startBtn = new StartButton();
        addObject(startBtn, getWidth() / 2, getHeight() / 2);
    }
}
