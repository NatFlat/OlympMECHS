import processing.core.PApplet;

public class CrossHair extends Entity
{
    private PApplet screen;
    private int size = 50;
    private float x;

    public CrossHair(PApplet screen)
    {
        this.screen = screen;
        posX=screen.width/2;
        posY=screen.height/2;
        direction = 0;
        x = 0;
    }

    public void render(){
        direction = (int) Math.toDegrees(Math.atan2((screen.mouseX-posX),(posY-screen.mouseY)));
        screen.pushMatrix();
        screen.fill(255,255,255);
        screen.translate(screen.width/2, screen.height/2);
        screen.rotate(screen.degrees(screen.radians(direction)));
        screen.rect(0, 0, size, size*2);
        screen.popMatrix();

    }

    public void step(){
//        posY+=5;
//        posX+=1+x;
//        x+=0.1;
    }


}
