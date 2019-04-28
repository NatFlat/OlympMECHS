import processing.core.PApplet;
import java.awt.event.KeyEvent;

import java.awt.*;

public class PlayerMech extends Entity
{
	private int speed = 5;

	public PlayerMech(PApplet screen)
	{
	    super(screen);
		posX = 25;
		posY = 25;
		height = 50;
		width = 50;
	}

	public int getSpeed()
	{
		return speed;
	}

	public Rectangle getBoundingBox()
	{
		Rectangle bb = new Rectangle(posX, posY, width, height);
		return bb;
	}

	public Rectangle getBoundingBox(int transX, int transY)
	{
		Rectangle bb = new Rectangle((posX + transX), (posY + transY), width, height);
		return bb;
	}

	@Override
	public void update() {

	}

	public void render() {
        screen.fill(255,0,0);
        screen.rect(posX, posY, width, height);
    }


}