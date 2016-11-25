package EnumTest;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HelloWinApp extends Frame {
	public static void main(String[] args) {
		HelloWinApp window = new HelloWinApp();
		window.setVisible(true);
	}
	
	public HelloWinApp()
	{
		setSize(600,500);
		setTitle("Hello Window 응용");
		MouseKeep mouse = new MouseKeep();
		addMouseListener(mouse);
	}
	
	private class MouseKeep extends MouseAdapter
	{
		public void mousePressed(MouseEvent e)
		{
			repaint();
		}
	}
	
	public void paint(Graphics g)
	{
		g.drawString("Hello",100,100);
	}

}
