import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        prepare();
        createApple();
    }
    private void prepare(){
        Player player = new Player();
        addObject(player, 300, 350);
    }
    publi void createApple(){
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
}
