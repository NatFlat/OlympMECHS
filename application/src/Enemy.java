import processing.core.PApplet;

public class Enemy extends Entity {

    private int size = 50;
    public Enemy(PApplet screen){
        super(screen);
    }


    @Override
    public void update() {

    }

    @Override
    public void render() {
        screen.fill(255,0,0);
        screen.triangle(50, 0, 100, 100, 0, 100);
    }
}
