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
    Obstacle fuckBox;
    private int gameState;

    public Control(PApplet pApplet)
    {
        canvas = pApplet;
        canvas.background(0);
        gameState=0;

        gameObjects = new ArrayList<>();
        player = new PlayerMech(pApplet);
        fuckBox = new Obstacle(pApplet);
        gameObjects.add(player);
        gameObjects.add(fuckBox);

    }

    public void keyPressed(KeyEvent ke)
    {
        switch (ke.getKeyCode())
        {
            case (KeyEvent.VK_LEFT):
            {
                if (!player.getBoundingBox(-player.getSpeed(), 0).intersects(fuckBox.getBoundingBox()))
                {
                    player.input(ke);
                }
                break;
            }
            case (KeyEvent.VK_RIGHT):
            {
                if (!player.getBoundingBox(player.getSpeed(), 0).intersects(fuckBox.getBoundingBox()))
                {
                    player.input(ke);
                }
                break;
            }
            case (KeyEvent.VK_UP):
            {
                if (!player.getBoundingBox(0, -player.getSpeed()).intersects(fuckBox.getBoundingBox()))
                {
                    player.input(ke);
                }
                break;
            }
            case (KeyEvent.VK_DOWN):
            {
                if (!player.getBoundingBox(0, player.getSpeed()).intersects(fuckBox.getBoundingBox()))
                {
                    player.input(ke);
                }
                break;
            }
        }
    }

    public void draw()
    {
        canvas.background(0);
        for (Entity item : gameObjects)
        {
            item.render();
        }
    }

    public void click()
    {
        player.fire();
    }

}
