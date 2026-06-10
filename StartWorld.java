import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class StartWorld extends World
{
    private GreenfootSound bgm = new GreenfootSound("background.wav");
    public StartWorld(){    
        super(600, 400, 1); 
        StartButton startBtn = new StartButton();
        addObject(startBtn, getWidth() / 2, getHeight() / 2);
        bgm.playLoop();
    }
    public void act(){
    }
    public void stopAllSounds(){
        if (bgm != null && bgm.isPlaying()){
            bgm.stop();
        }
    }
}
