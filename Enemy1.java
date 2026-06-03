import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy1 extends Enemy
{
    public Enemy1(){
        super();
        GreenfootImage image = getImage();
        image.scale(50, 50);
        this.hp = 2;
        
    }
    public void act()
    {
        super.act();
    }
}
