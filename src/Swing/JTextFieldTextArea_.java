package Swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class JTextFieldTextArea extends JFrame implements ActionListener{
	
	JTextField jtf;
	JTextArea jta;
	
	JTextFieldTextArea(){
		jtf = new JTextField(10); // 크기가 10인 텍스트 필드 객체 생성(10글자가 들어갈 수 있는 크기) / 한 라인의 입력을 받을 수 있는 컨퍼넌트이다. 입력되기 전에는 아주 작게 보여준다. 
		jta = new JTextArea(7,20); // (7,20) 7행 20열의 텍스트에어리어 생성 , 화면상 7줄이 보인다. 이쉬운점 : enter를 누르지 않으면 다음 줄로 넘어가지 않는다.  
		
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		container.add(jtf);
		container.add(jta);
		
		
		jtf.addActionListener(this);
		
		
		setTitle("텍스트 필드 & 텍스트 Area 실습");
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// System.out.println("이벤트 처리");
		// 텍스트 필드에 있는 내용을 텍스트에어리어 영역으로 이동시키고 텍스트 필드 내용을 지운다. 
		
		jta. append(e.getActionCommand()+ "\n"); // 입력되어 있는 문자열을 return 해준다. 
		jtf. setText("");
		// 기존 입력한 data가 사라진다. 
		
		
	}
}
public class JTextFieldTextArea_ {

	public static void main(String[] args) {
		new JTextFieldTextArea();

	}

}
