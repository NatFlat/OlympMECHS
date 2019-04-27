import java.awt.geom.Rectangle2D;
import java.util.List;
import java.util.ListIterator;

import processing.core.PApplet;

class Control
{
    private PApplet canvas;
    private List<Entity> gameObjects;
    private ListIterator li;

    private int gameState;

    public Control(PApplet pApplet)
    {
        canvas = pApplet;
        canvas.background(0);
        gameState=0;

        PlayerMech player = new PlayerMech();
        addGameObject(player);
    }

    public void addGameObject(GameObject o)
    {
        gameObjects.add(o);
    }

    public void draw()
    {
        for (int i = 0; i < gameObjects.size(); i++)
        {
//            gameObjects.get(i).render();
        }
//      //TODO TEMPORARY
//      if(gameState==0){
//          canvas.background(255,255,255);
//          gameState=1;
//      } else {
//          gameState=0;
//          canvas.background(0);
//      }
//
//
//      canvas.fill(255,255,255);
//      canvas.textAlign(PApplet.CENTER);
//      canvas.text("OLYMPMECHS", canvas.width/2, 40);
        //TODO TEMPORARY^^^^
    }

}
