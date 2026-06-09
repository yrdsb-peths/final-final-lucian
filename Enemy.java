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
        if(getY() >= 390){
            MyWorld world = (MyWorld) getWorld();
            if (world != null){
                world.gameOver();
            }
        }
        if(getY() >= getWorld().getHeight() - 1){
            getWorld().removeObject(this);
            return;
        }
        checkLive();
    }
    private void checkLaserHit(){
        Actor laser = getOneIntersectingObject(Laser.class);
        if(laser != null && laser.getWorld() != null){
            getWorld().removeObject(laser);
            hp--;
        }
    }
    private void checkLive(){
        if(hp <= 0){
            MyWorld world = (MyWorld) getWorld();
            if(world != null){
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
}
