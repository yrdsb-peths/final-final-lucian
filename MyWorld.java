import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        prepare();
    }
    private void prepare(){
        Player player = new Player();
        addObject(player, 300, 350);
    }
}
