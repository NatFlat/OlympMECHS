import processing.core.PApplet;

public class CrossHair extends GameObject
{
    protected int posX;
    protected int posY;
    protected int direction;

    public CrossHair(PApplet papp)
    {
        posX=papp.width/2;
        posY=papp.height/2;
        direction = 0;
    }

    void setup()
    {

    }
}
