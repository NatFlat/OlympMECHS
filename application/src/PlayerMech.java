import processing.core.PApplet;
import java.awt.event.KeyEvent;

import java.awt.*;

public class PlayerMech extends Entity
{
	private PApplet canvas;
	private int size = 50;
	private int speed = 5;

	public PlayerMech(PApplet papp)
	{
		canvas = papp;

	}

	public void input(KeyEvent ke)
	{
		switch (ke.getKeyCode())
		{
			case (KeyEvent.VK_LEFT):
				{
					this.posX -= speed;
					break;
				}
			case (KeyEvent.VK_RIGHT):
				{
					this.posX += speed;
					break;
				}
			case (KeyEvent.VK_UP):
				{
					this.posY -= speed;
					break;
				}
			case (KeyEvent.VK_DOWN):
				{
					this.posY += speed;
					break;
				}
		}
}


public void render()
{
	canvas.fill(255,0,0);
	canvas.rect(super.posX, super.posY, size, size);
}


}