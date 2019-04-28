import org.w3c.dom.css.Rect;
import processing.core.PApplet;

import java.awt.*;

public class Obstacle extends Entity
{
	private PApplet canvas;

	private int speed = 5;

	public Obstacle(PApplet papp)
	{
		canvas = papp;
		posX = 100;
		posY = 100;
		height = 50;
		width = 50;
	}


	@Override
	public void update() {

	}


	public void render()
	{
		canvas.fill(0,255,0);
		canvas.rect(super.posX, super.posY, width, height);
	}

	public Rectangle getBoundingBox()
	{

		Rectangle bb = new Rectangle(posX, posY, width, height);
		return bb;
	}



}
