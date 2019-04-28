import java.awt.*;
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
        Enemy enemy = new Enemy(pApplet);

        gameObjects.add(enemy);
        gameObjects.add(player);
        gameObjects.add(fuckBox);

    }

    public void controlPlayer(KeyEvent ke)
    {
        for (Entity entity :
                gameObjects) {
            switch (ke.getKeyCode())
            {
                case (KeyEvent.VK_LEFT):
                {
                    if (!player.getBoundingBox(-player.getSpeed(), 0).intersects(entity.getBounds()))
                    {
                        player.posX -= player.getSpeed();
                    }
                    break;
                }
                case (KeyEvent.VK_RIGHT):
                {
                    if (!player.getBoundingBox(player.getSpeed(), 0).intersects(entity.getBounds()))
                    {
                        player.posX += player.getSpeed();
                    }
                    break;
                }
                case (KeyEvent.VK_UP):
                {
                    if (!player.getBoundingBox(0, -player.getSpeed()).intersects(entity.getBounds()))
                    {
                        player.posY -= player.getSpeed();
                    }
                    break;
                }
                case (KeyEvent.VK_DOWN):
                {
                    if (!player.getBoundingBox(0, player.getSpeed()).intersects(entity.getBounds()))
                    {
                        player.posY += player.getSpeed();
                    }
                    break;
                }
            }
        }



    }

    public void draw()
    {
        canvas.background(0);
        for (Entity item : gameObjects)
        {
            item.update();
            item.render();
        }
    }

}
