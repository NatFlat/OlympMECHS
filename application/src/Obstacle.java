import org.w3c.dom.css.Rect;
import processing.core.PApplet;

import java.awt.*;

public class Obstacle extends Entity
{
	private PApplet canvas;
	private int size = 50;
	private int speed = 5;

	public Obstacle(PApplet papp)
	{
		canvas = papp;
		posX = 100;
		posY = 100;
	}

	public void update()
	{
		//THERE'S NOTHING HERE! YET!
	}

	public void render()
	{
		canvas.fill(0,255,0);
		canvas.rect(super.posX, super.posY, size, size);
	}

	public Rectangle getBoundingBox()
	{

		Rectangle bb = new Rectangle(posX, posY, size, size);
		return bb;
	}



}
