package frame03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//어디에선가 이 클래스로 객체를 생성하면 프레임 하나가 화면상에 나타난다.
public class Myframe extends JFrame{
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
		
		JButton btn1 = new JButton("버튼1");
		//프레임의 add() 메소드 호출하면서 JButton 객체의 참조값을 전달하면 프레임에 버튼이 배치된다
		this.add(btn1);
		
		//인터페이스 type
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("1번 버튼을 눌렀네요?");
			}
		};
		btn1.addActionListener(listener);
		
		//버튼 2개를 프레임에 추가로 배치해 보세요.
		JButton btn2 = new JButton("버튼2");
		
		add(btn2);
		
		btn2.addActionListener(e -> {
			System.out.println("2번 버튼을 눌렀네요?");
		});
		
		
//		JButton btn3 = new JButton("버튼3");
//		this.add(btn3);
		
		//화면상에 실제 보이도록 한다.
		setVisible(true);
	}
	public static void main(String[] args) {
		new Myframe();
	}
}
