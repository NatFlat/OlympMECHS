import java.awt.event.KeyEvent;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import processing.core.PApplet;

class Control
{
    private PApplet canvas;
    private List<Entity> gameObjects;
    private ListIterator li;
    TestBoy player;
    private int gameState;

    public Control(PApplet pApplet)
    {
        canvas = pApplet;
        canvas.background(0);
        gameState=0;

        gameObjects = new ArrayList<>();
        player = new TestBoy(pApplet);
        gameObjects.add(player);

    }

    public void keyPressed(KeyEvent key)
    {

    }

    public void draw()
    {
        for (Entity item : gameObjects)
        {
            item.render();
        }
    }

}
