import java.awt.*;

public class PlayerMech extends GameObject
{
	PlayerMech()
	{
		position.setLocation(0.0f,0.0f);
		size = 128;
	}

	int size;
	Graphics playerRect;

	public void render()
	{
		playerRect.drawRect(position.x, position.y, size, size);
	}

}