import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private int laserTimer = 0; //set a varble which contorl the laser shoot frequence
    private GreenfootImage[] thrusterAnimation;
    private int animationIndex = 0;
    private int count = 0;
    private int weaponLevel = 1;
    public Player(){
        GreenfootImage image = getImage();
        image.scale(50, 50);
        //make animation 
        thrusterAnimation = new GreenfootImage[2];
        thrusterAnimation[0] = new GreenfootImage("warcraft.png");
        thrusterAnimation[0].scale(50, 50);
        thrusterAnimation[1] = new GreenfootImage("warcraft2.png");
        thrusterAnimation[1].scale(50, 50);
        setImage(thrusterAnimation[0]);
    }
    
    public void act()
    {
        checkKeyPress();
        laserTimer++;
        int shootInterval = 15;
        if(weaponLevel == 2){
            shootInterval = 10;
        }
        if(weaponLevel == 3){
            shootInterval = 6;
        }
        if(laserTimer >= shootInterval){
            shootLaser();
            laserTimer = 0;
        }
        count++;
        //Contorl the speed of animation
        if(count % 10 == 0){
            animationIndex = (animationIndex + 1) % thrusterAnimation.length;
            setImage(thrusterAnimation[animationIndex]);
        }
    }
    private void checkKeyPress(){
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX() - 5, getY());
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX() + 5, getY());
        }
    }
    private void shootLaser(){
        Laser laser = new Laser();
        getWorld().addObject(laser, getX(), getY() - 30);
    }
    public void upgradeWeapon() {
        weaponLevel++; 
        System.out.println("Weapon upgrade! Current level: " + weaponLevel); 
    }
}
