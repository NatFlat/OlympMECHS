import java.awt.Point;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import processing.core.PApplet;

class GameLogic
{
    private PApplet canvas;
    private List<GameObject> gameObjects;
    private ListIterator li;

    private int gameState;

    public GameLogic(PApplet pApplet)
    {
        canvas = pApplet;

        //TEMPORARY
        canvas.background(0);
        canvas.fill(255,255,255);
        canvas.textAlign(PApplet.CENTER);
        canvas.text("OLYMPMECHS", canvas.width/2, 40);
    }

}
