package Swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class JTextFieldTextArea extends JFrame{
	
	JTextField jtf;
	JTextArea jta;
	
	JTextFieldTextArea(){
		jtf = new JTextField(10); // 크기가 10인 텍스트 필드 객체 생성(10글자가 들어갈 수 있는 크기) / 한 라인의 입력을 받을 수 있는 컨퍼넌트이다. 입력되기 전에는 아주 작게 보여준다. 
		jta = new JTextArea(7,20); // (7,20) 7행 20열의 텍스트에어리어 생성 , 화면상 7줄이 보인다. 이쉬운점 : enter를 누르지 않으면 다음 줄로 넘어가지 않는다.  
		
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		container.add(jtf);
		container.add(jta);

		setTitle("텍스트 필드 & 텍스트 Area 실습");
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
public class JTextFieldTextArea_ {
	public static void main(String[] args) {
		new JTextFieldTextArea();
	}
}
