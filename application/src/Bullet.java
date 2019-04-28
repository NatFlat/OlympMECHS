import processing.core.PApplet;

import static java.lang.Math.*;

public class Bullet extends Entity {

    public Bullet(PApplet screen,int posX,int posY,float direction)
    {
        this.posX = posX;
        this.posY = posY;
        this.direction = direction;
        this.screen=screen;
        this.screen.rect(posX, posY, 10, 10);
    }

    public void render()
    {
        posX = (int)(posX + (3 * sin(direction)));
        posY = (int)(posY - (3 * cos(direction)));
        screen.rect(posX, posY, 10, 10);
    }
}
