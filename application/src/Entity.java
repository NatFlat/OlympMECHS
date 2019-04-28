import processing.core.*;

import java.awt.*;
import java.awt.geom.Point2D.*;
import java.awt.geom.Rectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public abstract class Entity
{
	protected PApplet screen;
	//protected Point position;
	protected int posX;
	protected int posY;
	protected int direction;
	protected Rectangle2D bounds;

	public Entity(PApplet screen){
	    this.screen = screen;
    }

    public Entity(){

    }

	public int getPosX() 			{return posX;}
	public int getPosY()			{return posY;}

	public abstract void update();

	public abstract void render();
}