import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    public Player(){
        GreenfootImage image = getImage();
        image.scale(50, 50);
    }
    private GreenfootImage[] thrusterAnimation;
    private int animationIndex = 0;
    private int count = 0;
    public void act()
    {
        
    }
}
