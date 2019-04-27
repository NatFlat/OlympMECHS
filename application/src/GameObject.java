import processing.core.*;

import java.awt.*;
import java.awt.geom.Point2D.*;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


class GameObject
{
	protected PApplet screen;
	protected Point position;

	protected Image sprite;			//TODO: implement container for all possible animations, beyond scope of game jam

	protected void loadImage(String spriteFilePath)
	{
		ImageIcon ii = new ImageIcon(spriteFilePath);
		sprite = ii.getImage();
	}

	//Game Loops
	protected void input()
	{

	}
	protected void update()
	{

	}
	protected void render()
	{

	}
}