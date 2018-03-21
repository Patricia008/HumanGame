import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import com.sun.prism.Image;

public class Human
{

int aux=0;
	
	
	public void paint(Graphics2D g)
	{
		java.awt.Image pat = Toolkit.getDefaultToolkit().getImage("src/data/pat.png");
		if(aux==0)
		{
		g.drawImage(pat, 33, 135,null);
		g.fillRect(40, 230, 3, 40);
		g.fillRect(60, 230, 3, 40);
		g.fillRect(40, 180, 23, 45);
		//g.fillOval(42, 148, 20, 20);
		g.fillRect(50, 170, 3, 7);
		g.fillRect(75, 160, 20, 2);
		g.fillRect(75, 160, 2, 22);
		g.fillRect(55, 180, 20, 2);
		g.fillRect(25, 180, 20, 2);
		g.fillRect(25, 180, 2, 20);
		g.fillRect(15, 200, 12, 2);
		}
		else if(aux==1)
		{
			g.drawImage(pat, 32, 83,null);
			g.fillRect(40, 177, 3, 40);
			g.fillRect(60, 177, 3, 40);
			g.fillRect(40, 127, 23, 45);
			//g.fillOval(42, 95, 20, 20);
			g.fillRect(50, 117, 3, 7);
			g.fillRect(55, 137, 2, 10);	
			g.fillRect(59, 127, 18, 2);
			g.fillRect(75, 110, 2, 19);
			g.fillRect(75, 110, 20, 2);
			g.fillRect(15, 110, 12, 2);
			g.fillRect(27, 110, 2,18);
			g.fillRect(27, 127, 20, 2);
		}
		else if(aux==2)
		{
			g.drawImage(pat, 32, 170,null);
			g.fillRect(40, 230, 3, 40);
			g.fillRect(60, 230, 3, 40);
			g.fillRect(40, 210, 23, 45);
		//	g.fillOval(42, 180, 20, 20);
			g.fillRect(50, 201, 3, 7);
			g.fillRect(36, 210, 2, 40);
			g.fillRect(65, 210, 2, 40);
		}
	}
	
	public void keyReleased(KeyEvent e)
	{
		aux=0;
	}
	
	public void keyPressed(KeyEvent e)
	{
		if(e.getKeyCode() == KeyEvent.VK_UP)
		{
		Sound1.music("src/data/Speech Misrecognition.wav");
			aux=1;
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			Sound1.music("src/data/ir_begin.wav");
			aux=2;
		}
	}
	
	
	
	
	public Rectangle getBounds()
	{
		 if(aux==1)
			return new Rectangle(36,95,31,122);
			else if(aux==2)
				return new Rectangle(36,180,31,122);
			return new Rectangle(36,148,41,122);
	}
	
}