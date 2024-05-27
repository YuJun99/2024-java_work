package frame07;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

//어디에선가 이 클래스로 객체를 생성하면 프레임 하나가 화면상에 나타난다.
public class Myframe extends JFrame implements ActionListener{
	
	JTextField inputMsg;
	//생성자
	public Myframe() {
		//프레임의 제목 설정
		setTitle("나의 프레임");
		//프레임의 위치와 크기 설정 setBounds(x, y, width, height)
		setBounds(500, 200, 500, 500);
		//종료 버튼을 눌렀을 때 프로세스 전체가 종료 되도록 한다
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
		
		//프레임의 레이아웃 매니저 설정
		setLayout(layout);
		//JTextField 객체의 참조값을 필드에 저장 (다른 메소드에서 사용가능하도록)
		inputMsg = new JTextField(10);
		add(inputMsg);
		
		JButton sendBtn = new JButton("전송");
		add(sendBtn);
		//버튼에 액션 리스너를 MyFrame 객체로 등록하기
		sendBtn.addActionListener(this);
		
		//화면상에 실제 보이도록 한다.
		setVisible(true);
	}
	public static void main(String[] args) {
		new Myframe();
	}
	// implements ActionListener 했기 때문에 강제로 구현된 메소드 
		@Override
		public void actionPerformed(ActionEvent e) {
			//JTextField 에 입력한 문자열 읽어오기
			String msg = inputMsg.getText();
			//알림창에 띄우기
			JOptionPane.showMessageDialog(this, msg);
		}
}
