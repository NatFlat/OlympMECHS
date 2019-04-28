import processing.core.PApplet;

import static java.lang.Math.PI;
import static processing.core.PConstants.TWO_PI;

public class CrossHair extends Entity
{
    private float angle;
    private PApplet screen;
    private int size = 50;
    private float x;
    private Bullet bullet;

    public CrossHair(PApplet screen)
    {
        this.screen = screen;
        posX=this.screen.width/2;
        posY=this.screen.height/2;
        direction = 0;
        angle = 0;
        x = 0;
    }

    public void render(){
        direction =(float)(Math.atan2((screen.mouseX-posX),(posY-screen.mouseY)));

        screen.pushMatrix();
        screen.fill(255,255,255);
        screen.translate(screen.width/2, screen.height/2);
        screen.rotate(screen.degrees(direction));
        screen.rect(0, 0, size, size*2);
        screen.popMatrix();

        if(bullet!=null){
            bullet.render();
        }

    }

    public void step(){
//        posY+=5;
//        posX+=1+x;
//        x+=0.1;
    }

    public void fire(){
        bullet = new Bullet(screen,screen.width/2,screen.height/2,direction);
    }


}
