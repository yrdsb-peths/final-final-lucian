import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy2 extends Enemy
{
    public Enemy2(){
        super();
        GreenfootImage image = getImage();
        image.scale(50, 50);
        this.hp = 3;
    }
    public void act()
    {
        super.act();
    }
}
