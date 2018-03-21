import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Brick {
	private int x;
	private int y;
	private Game game;
	int cnt;
	
public Brick(int x, int y, Game game)
{
	this.x=x;
	this.y=y;
	this.game=game;
}
	
public void move(int count)
{
	if(x==0) { x=700;  count++;}
	x=x-1;
	if(collision()) game.gameOver();
	cnt=count;
}

public int getCount()
{
	return cnt;
}

public Rectangle getBounds()
{
	return new Rectangle(x,y,60,6);
}
	
	public void paint(Graphics2D g)
	{
		g.fillRect(x, y, 60, 6);
	}
	
	private boolean collision()
	{
		return game.human.getBounds().intersects(getBounds());
	}
	
}