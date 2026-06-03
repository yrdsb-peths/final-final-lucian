import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
public class Prop extends Actor
{
    public void act()
    {
        if (getWorld() == null){
            return;
        }
        setLocation(getX(),getY() + 2);
        checkLaserHit();
        if (getWorld() == null){
            return;
        }
        if(getY() >= getWorld().getHeight() - 1){
            getWorld().removeObject(this);
        }
    }
    private void checkLaserHit(){
        if(isTouching(Laser.class)){
            removeTouching(Laser.class);
            List<Player> players = getWorld().getObjects(Player.class); //Search for players in the world
            if (!players.isEmpty()) {
                Player player = players.get(0); // Get the player object
                player.upgradeWeapon();        
            }
            getWorld().removeObject(this);
        }
    }
}
