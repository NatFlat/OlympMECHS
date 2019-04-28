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
    PlayerMech player;
    private int gameState;

    public Control(PApplet pApplet)
    {
        canvas = pApplet;
        canvas.background(0);
        gameState=0;

        gameObjects = new ArrayList<>();
        player = new PlayerMech(pApplet);
        gameObjects.add(player);

    }

    public void keyPressed(KeyEvent key)
    {
        player.input(key);
    }

    public void draw()
    {
        canvas.background(0);
        for (Entity item : gameObjects)
        {
            item.render();
        }
    }

}
