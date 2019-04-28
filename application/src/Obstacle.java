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
		posX = 25;
		posY = 25;
	}


	public void render()
	{
		canvas.fill(255,0,0);
		canvas.rect(super.posX, super.posY, size, size);
	}

	public Rectangle getBoundingBox()
	{
		Rectangle bb = new Rectangle(posX, posY, size, size);
		return bb;
	}



}
