import processing.core.PApplet;

import java.util.Random;

public class Enemy extends Entity {

    Random rand;
    public Enemy(PApplet screen){
        super(screen);
        rand = new Random();
        posX = 100;
        posY = 100;
        width = 50;
        height = 50;
    }


    @Override
    public void update() {
        int randomNum = rand.nextInt(1000);

        if(randomNum < 25){
            posX+= -5;
        }

        if(randomNum > 25 && randomNum < 50){
            posX+=5;
        }

        if(randomNum > 50 && randomNum < 75){
            posY+=-5;
        }

        if(randomNum > 75 && randomNum < 100){
            posY+=5;
        }
    }

    @Override
    public void render() {
        screen.fill(255,0,0);
        screen.rect(posX, posY, width, height);
    }
}
