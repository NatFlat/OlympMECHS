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
    Entity current;

    public static void main(String[] args)
    {
        PApplet.main(new String[] {"main"});
    }

    @Override
    public void setup()
    {
        game = new Control(this);
        size(800,800);
        rectMode(CENTER);
    }

    @Override
    public void draw()
    {

    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        //game.keyPress(e);
    }

    @Override
    public void mouseMoved()
    {
        //game.aim(mouseX,mouseY);
    }

    @Override
    public void mousePressed()
    {
        //game.mouseClick(mouseX,mouseY);
        game.draw();
    }
}
