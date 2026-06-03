import greenfoot.*;

public class MyWorld extends World {
    public int score = 0;
    Label scoreLabel;
    public MyWorld() {
        super(600, 400, 1);
        scoreLabel = new Label(0,40);
        addObject(scoreLabel, 20, 20);
        prepare();
        createEnemy();
    }
    public void increaseScore(){
        score++;
        scoreLabel.setValue(score);
        if(score % 5 == 0 && score != 0){
            spawnBoss();
        }
    }
    private void prepare(){
        Player player = new Player();
        addObject(player, 300, 350);
    }
    public void createEnemy(){
        Enemy newEnemy;
        int enemyType = Greenfoot.getRandomNumber(2);
        if (enemyType == 0) {
            newEnemy = new Enemy1(); 
        } else {
            newEnemy = new Enemy2(); 
        }
        int x = Greenfoot.getRandomNumber(getWidth());
        int y = 0;
        addObject(newEnemy, x, y);
    }
    private void spawnBoss(){
        Boss boss = new Boss();
        int x = getWidth() / 2;
        int y = 0;
        addObject(boss, x, y);
    }
}
