package gui;

import java.awt.*;
import javax.swing.*;

public class guitest {
	public static void main(String[] args){
		JFrame frame = new JFrame();				//프레임 생성
		
		
		JPanel panel = new JPanel();			//새로운 패널 생성
		panel.setBackground(Color.BLACK);			//패널 색깔 입력
		frame.getContentPane().add(panel);			//패널을  창 배경화면에 추가 
		
		JButton button = new JButton("Hello, world!!!!");		//버튼 생성
		panel.add(button);				//버튼을 패널에 삽입
		
		JTextField textfield = new JTextField();					//텍스트창 생성
		textfield.setPreferredSize(new Dimension(200,15));			//텍스트 창 크기 생성
		panel.add(textfield);						//패널에 텍스트 창 삽입
		
		JButton button2 = new JButton("This button is so long it has to be added on the next line");
		panel.add(button2);
		
		
		frame.setSize(new Dimension(500,400));			//사이즈 입력
		frame.setLocationRelativeTo(null);			//창을 가운데 뛰우는 역할	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Hi world");			//프레임 제목 입력
		frame.setResizable(false);  	//사이즈변경 불가 
		frame.setVisible(true);		
			
	}
}
