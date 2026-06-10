import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage;

/**
 * Write a description of class StartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartButton extends Actor
{
    public StartButton(){
        GreenfootImage image = getImage();
        image.scale(200,200);
    }
    public void act()
    {
        if (Greenfoot.mousePressed(this)) {
            StartWorld world = (StartWorld) getWorld();
            if (world != null){
                world.stopAllSounds();
            }
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
