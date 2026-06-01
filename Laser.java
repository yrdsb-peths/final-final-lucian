import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Actor
{
    public Laser(){
        GreenfootImage image = getImage();
        image.scale(20, 20);
    }
    public void act()
    {
        setLocation(getX(), getY() - 8);
        if(getY() <= 0){
            getWorld().removeObject(this);
            return;
        }
        beat();
    }
    public void beat(){
        if(isTouching(Apple.class)){
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
        }
    }
}
