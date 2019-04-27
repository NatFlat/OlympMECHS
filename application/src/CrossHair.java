import processing.core.PApplet;

public class CrossHair extends Entity
{
    private PApplet canvas;
    private int size = 50;

    public CrossHair(PApplet papp)
    {
        canvas = papp;
        posX=papp.width/2;
        posY=papp.height/2;
        direction = 0;
    }

    public void render(){
        canvas.fill(0);
        canvas.ellipse(posX, posY, size, size);
    }

    public void step(){
        posY+=5;
    }

}
