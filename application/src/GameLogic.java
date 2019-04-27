import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.geom.Rectangle2D;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import processing.core.PApplet;

import static java.lang.Math.PI;

class GameLogic
{
    private PApplet canvas;
    private List<GameObject> gameObjects;
    private ListIterator li;
    Rectangle2D box;

    private int gameState;

    public GameLogic(PApplet pApplet)
    {
        canvas = pApplet;
        canvas.background(0);
        gameState=0;
        box = new Rectangle2D.Float(canvas.width/2, canvas.height/2, 20, 20);
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


        canvas.fill(255,255,255);
        canvas.textAlign(PApplet.CENTER);
        canvas.text("OLYMPMECHS", canvas.width/2, 40);
        //TODO TEMPORARY^^^^
    }

}
