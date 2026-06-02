import greenfoot.*;

public class MyWorld extends World {
    public int score = 0;
    Label scoreLabel;
    public MyWorld() {
        super(600, 400, 1);
        prepare();
        createApple();
        scoreLabel = new Label(0,40);
        addObject(scoreLabel, 20, 20);
    }
    public void increaseScore(){
        score++;
        scoreLabel.setValue(score);
    }
    private void prepare(){
        Player player = new Player();
        addObject(player, 300, 350);
    }
    public void createApple(){
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
}
