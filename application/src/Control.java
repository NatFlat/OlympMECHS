import java.awt.geom.Rectangle2D;
import java.util.List;
import java.util.ListIterator;

import processing.core.PApplet;

class Control
{
    private PApplet canvas;
    private List<Entity> gameObjects;
    private ListIterator li;
    Rectangle2D box;

    private int gameState;

    public Control(PApplet pApplet)
    {
        canvas = pApplet;
        canvas.background(0);
        gameState=0;
    }

    public void draw()
    {
        //TODO TEMPORARY
        if(gameState==0){
            canvas.background(255,255,255);
            gameState=1;
        } else {
            gameState=0;
            canvas.background(0);
        }


        canvas.fill(0);
        canvas.textAlign(PApplet.CENTER);
        canvas.text("OLYMPMECHS", canvas.width/2, 40);
        //TODO TEMPORARY^^^^
    }

}
