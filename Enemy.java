import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Enemy extends Actor
{
    protected int hp = 1;
    
    public Enemy(){
        setRotation(180);
    }
    public void act()
    {
        setLocation(getX(),getY() + 1);
        checkLaserHit();
        if(getY() >= getWorld().getHeight() - 1){
            getWorld().removeObject(this);
        }
        checkLive();
    }
    private void checkLaserHit(){
        if(isTouching(Laser.class)){
            removeTouching(Laser.class);
            hp--;
        }
    }
    private void checkLive(){
        if(hp <= 0){
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
            world.createEnemy();
            getWorld().removeObject(this);
        }
    }
}
