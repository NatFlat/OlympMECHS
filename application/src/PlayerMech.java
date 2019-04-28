import processing.core.PApplet;
import java.awt.event.KeyEvent;

import java.awt.*;

public class PlayerMech extends Entity
{
	private int size = 50;
	private int speed = 15;
	private CrossHair crossHair;

	public PlayerMech(PApplet screen)
	{
	    super(screen);
		posX = 25;
		posY = 25;
		crossHair = new CrossHair(screen,posX,posY);

	}

	public void input(KeyEvent ke)
	{
		switch (ke.getKeyCode())
		{
			case (KeyEvent.VK_LEFT):
				{
					this.posX -= speed;
					crossHair.stepX((-1)*speed);
					break;
				}
			case (KeyEvent.VK_RIGHT):
				{
					this.posX += speed;
					crossHair.stepX(speed);
					break;
				}
			case (KeyEvent.VK_UP):
				{
					this.posY -= speed;
					crossHair.stepY((-1)*speed);
					break;
				}
			case (KeyEvent.VK_DOWN):
				{
					this.posY += speed;
					crossHair.stepY(speed);
					break;
				}
		}

}

	public int getSpeed()		{return speed;}

	public Rectangle getBoundingBox()
	{
		Rectangle bb = new Rectangle(posX, posY, size, size);
		return bb;
	}

	public Rectangle getBoundingBox(int transX, int transY)
	{
		Rectangle bb = new Rectangle((posX + transX), (posY + transY), size, size);
		return bb;
	}

	@Override
	public void update() {

	}

	public void render() {
        screen.fill(255,0,0);
        screen.rect(super.posX, super.posY, size, size);
        if(crossHair!=null)
        {
			crossHair.render();
		}
    }

    public void fire() {
		crossHair.fire();
	}


}