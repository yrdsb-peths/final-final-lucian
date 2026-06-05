import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Boss extends Enemy
{
    public Boss(){
        this(1);
    }
    public Boss(int currentWeaponLevel){
        super();
        GreenfootImage image = getImage();
        image.scale(100,100);
        this.hp = 5 + (currentWeaponLevel - 1) * 3;
    }
    public void act()
    {
        super.act();
    }

}
