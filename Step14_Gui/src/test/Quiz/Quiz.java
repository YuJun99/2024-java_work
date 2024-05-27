package test.Quiz;

import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Quiz extends JFrame implements ActionListener{
	JTextField inputMsg;
	JTextField outputMsg;
	
	public Quiz() {
		setTitle("테스트");
		setBounds(500, 200, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
		setLayout(layout);
		
		inputMsg = new JTextField(10);
		add(inputMsg);
		
		JButton send = new JButton("전송");
		add(send);
		send.addActionListener(this);
		
		outputMsg = new JTextField(10);
		add(outputMsg);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Quiz();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = inputMsg.getText();
		
		outputMsg.setText(msg);
		
		inputMsg.setText("");
		
	}
}
