import processing.core.PApplet;

import static java.lang.Math.PI;
import static processing.core.PConstants.HALF_PI;
import static processing.core.PConstants.TWO_PI;

public class CrossHair extends Entity
{
    private float angle;
    private int size = 50;
    private int x;
    private Bullet bullet;

    public CrossHair(PApplet screen,int posX,int posY)
    {
        super(screen);
        this.posX=posX;
        this.posY=posY;
        direction = 0;
        angle = 0;
        x = 0;
    }

    public void render()
    {
        direction =(float)(Math.atan2((screen.mouseX-posX),(posY-screen.mouseY)));

        screen.pushMatrix();
        screen.fill(255,255,255);
        screen.translate(posX, posY);
        screen.rotate(direction);
        screen.rect(0, 0, size, size*2);
        screen.popMatrix();

        if(bullet!=null)
        {
            bullet.render();
        }

    }

    public void stepX(int dif)
    {
        posX+=dif;
    }

    public void stepY(int dif)
    {
        posY+=dif;
    }

    public void update()
    {

    }

    public void fire()
    {
        bullet = new Bullet(screen,posX,posY,direction);
    }


}