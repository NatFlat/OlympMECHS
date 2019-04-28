import processing.core.*;
import java.awt.event.*;
import java.util.List;
import java.util.ListIterator;

public class main extends PApplet
{
    public Control game;
    //public PlayerMech player;
    //public EnemyMech enemy;

    public List<Entity> gameObjects;
    public ListIterator<Entity> iterator;
    CrossHair ch;

    Entity current;

    public static void main(String[] args)
    {
        PApplet.main(new String[] {"main"});
    }

    @Override
    public void setup()
    {
        size(800,800);
        ch = new CrossHair(this);
        game = new Control(this);
        rectMode(CENTER);
    }

    @Override
    public void draw()
    {
        background(255,0,0);
        ch.render();
        ch.step();
    }

    @Override
    public void keyPressed(KeyEvent e)
    {

    }

    @Override
    public void mousePressed()
    {
        ch.fire();
    }
}
