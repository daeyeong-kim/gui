package guiTest;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class guiTest extends JFrame{
	
	private JTextArea textArea;
	private JButton buttonClear;
	private JTextField fieldMessage;
	private JButton buttonsubmit;
	
	
	public guiTest(){
		
		createView();
		setTitle("Text Area Test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,200);
		setLocationRelativeTo(null);
		setResizable(false);
	}
	
	private void createView(){
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		
		JLabel label = new JLabel("Enter some text:");
		panel.add(label);
		
		fieldMessage = new JTextField(12);
		panel.add(fieldMessage);
		
		buttonsubmit = new JButton("Submit");
		buttonsubmit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e){
				String message = fieldMessage.getText();
				fieldMessage.setText("");
				textArea.append(message+"\n");
				
			}
		});
		
		panel.add(buttonsubmit);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		
		//textArea.setPreferredSize(new Dimension(350,90));
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setPreferredSize(new Dimension(350,90));
		panel.add(scrollPane);
		
		buttonClear = new JButton("Clear Text Area");
		buttonClear.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textArea.setText("");
			}
		});
		panel.add(buttonClear);
	}
	
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(()  -> {new guiTest().setVisible(true);});
	}

}
