import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Enemy extends Actor
{
    protected int hp = 1;
    
    public Enemy(){
        setRotation(180);
    }
    public void act()
    {
        if (getWorld() == null) return;
        setLocation(getX(),getY() + 1);
        checkLaserHit();
        if (getWorld() == null) return;
        if(getY() >= getWorld().getHeight() - 1){
            getWorld().removeObject(this);
            return;
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
            if(this instanceof Boss) {
                Prop speedPacket = new Prop();
                getWorld().addObject(speedPacket, getX(), getY());
            }
            getWorld().removeObject(this);
        }
    }
}
