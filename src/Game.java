import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Game extends JPanel
{
	Human human=new Human();
	static int count=0;
	Brick brick1=new Brick(700,170, this);
	Brick brick2=new Brick(830,220, this);
	Brick brick3=new Brick(960,170, this);
	Brick brick4=new Brick(1090, 220, this);
	Brick brick5=new Brick(1230, 170, this);
	//Brick brick6=new Brick(1700, 220, this);
	
	public Game()
	{
		addKeyListener(new KeyListener()
		{
			public void keyTyped(KeyEvent e)
			{
				
			}
			public void keyReleased(KeyEvent e)
			{
				human.keyReleased(e);
			}
			public void keyPressed(KeyEvent e)
			{
				human.keyPressed(e);
			}
		});
		setFocusable(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2d=(Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,  RenderingHints.VALUE_ANTIALIAS_ON);
	g2d.setColor(Color.BLUE);
	human.paint(g2d);
	g2d.setColor(Color.magenta);
	brick1.paint(g2d);
	brick2.paint(g2d);
	brick3.paint(g2d);
	brick4.paint(g2d);
	brick5.paint(g2d);
	//brick6.paint(g2d);

	}
	
	
	public void gameOver()
	{
		JOptionPane.showMessageDialog(this,  "You died !\nYour score is "+count, "Game Over", JOptionPane.YES_NO_OPTION);
		System.exit(ABORT);
	}
	

		
	
	
	public static void main(String[] args) throws InterruptedException
	{
		//FREE MEMORY !!!
		JFrame frame=new JFrame("HumanPlay");
		 Game game = new Game();
		frame.add(game);
		frame.setSize(700,350);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//	frame.getContentPane().setBackground(Color.BLUE); 
		JLabel onscreen = new JLabel("Score : "+count, SwingConstants.CENTER);
		frame.getContentPane().add(onscreen, BorderLayout.PAGE_START);
		Sound.music();
		
		while(true)
		{		
			game.brick1.move(count);
			count=game.brick1.getCount();
			game.brick2.move(count);
			count=game.brick2.getCount();
			game.brick3.move(count);
			count=game.brick3.getCount();
			game.brick4.move(count);
			count=game.brick4.getCount();
			game.brick5.move(count);
			count=game.brick5.getCount();
		//	game.brick6.move();
			onscreen.setText("Score : "+count);
			game.repaint();
			Thread.sleep(10);
		}
	}
}