package EnumTest;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class penApp extends Frame{
	public int oldx = 0;
	public int oldy = 0;
	public int newx = 0;
	public int newy = 0;
	
	public static void main(String[] args) {
		penApp window = new penApp();	
		window.setVisible(true);		//window 상에 표현해줌
	}
	
	public penApp()
	{
		setSize(600,500);					//size 지정
		setTitle("Pen 응용");					//title 이름 적어넣음
		MouseKeeper mouse = new MouseKeeper();		
		addMouseListener(mouse);				//마우스 이벤트 삽입
	}
	
	private class MouseKeeper extends MouseAdapter
	{
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			newx = e.getX();
			newy = e.getY();
			repaint();
		}
	}
	
	public void paint(Graphics g)
	{
		g.drawLine(oldx,oldy,newx,newy);
		g.setColor(Color.red);					//글씨색깔 빨간색으로
		g.drawString("Hello",newx,newy);		//헬로우 적기
		oldx = newx;			//그리고 난후 올드포인트에 클릭한 값 넣기
		oldy = newy;
	}

}
