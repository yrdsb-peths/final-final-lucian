import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Boss extends Enemy
{
    public Boss(){
        super();
        GreenfootImage image = getImage();
        image.scale(100,100);
        this.hp = 5;
    }
    public void act()
    {
        super.act();
    }
}
