import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Prop extends Actor
{
    public void act()
    {
        setLocation(getX(),getY() + 2);
        if(getY() >= getWorld().getHeight() - 1){
            getWorld().removeObject(this);
        }
    }
}
