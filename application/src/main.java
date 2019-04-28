import processing.core.*;
import java.awt.event.*;
import java.util.List;
import java.util.ListIterator;

public class main extends PApplet
{
    public Control control;
    //public PlayerMech player;
    //public EnemyMech enemy;
    public List<Entity> gameObjects;
    public ListIterator<Entity> iterator;
    Entity current;

    public static void main(String[] args)
    {
        PApplet.main(new String[] {"main"});
    }

    @Override
    public void setup()
    {
        control = new Control(this);
        size(800,800);
        rectMode(CENTER);
    }

    @Override
    public void draw()
    {
        control.draw();
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        control.controlPlayer(e);
    }

    @Override
    public void mouseMoved()
    {

    }

    @Override
    public void mousePressed()
    {

    }
}
