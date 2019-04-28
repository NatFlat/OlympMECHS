import processing.core.PApplet;

import static java.lang.Math.PI;
import static processing.core.PConstants.HALF_PI;
import static processing.core.PConstants.TWO_PI;

public class CrossHair extends Entity
{
    private float angle;
    private PApplet screen;
    private int size = 50;
    private int x;
    private Bullet bullet;

    public CrossHair(PApplet screen)
    {
        posX=screen.width/2;
        posY=screen.height/2;
        this.screen = screen;
        direction = 0;
        angle = 0;
        x = 0;
    }

    public void render()
    {
        direction =(float)(Math.atan2((screen.mouseX-screen.width/2),(screen.height/2-screen.mouseY)));

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

    public void step()
    {
        if(x==0){
            if(posX<=0)
            {
                x=1;
            }else{
                posX--;
            }
        } else {
            if(posX>=screen.width)
            {
                x=0;
            } else {
                posX++;
            }
        }
    }

    public void fire()
    {
        bullet = new Bullet(screen,posX,posY,direction);
    }


}
