package Swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

class JCheckBoxText extends JFrame implements ItemListener{
	
	JTextField jtf ;
	
	JCheckBoxText(){
		
		JCheckBox jcb1 = new JCheckBox("java");  // 중복선택 가능 
		JCheckBox jcb2 = new JCheckBox("r");
		JCheckBox jcb3 = new JCheckBox("python");
		JCheckBox jcb4 = new JCheckBox("db");
		
		jtf = new JTextField(10); 
		
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		container.add(jcb1);
		container.add(jcb2);
		container.add(jcb3);
		container.add(jcb4);
		container.add(jtf);
		
		// 리스너 등록
		jcb1.addItemListener(this);
		jcb2.addItemListener(this);
		jcb3.addItemListener(this);
		jcb4.addItemListener(this);
		
		setTitle("JChecjBox 실습");
		setSize(500,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// System.out.println("이벤트 발생");
		// 체크 박스를 선택하면 텍스트 상자에 선택한 내용이 표시된다. 
		
		JCheckBox selectCB = (JCheckBox)e.getItem();
		// 반환형이 object 이다 = 어떤 컴퍼넌트라도 처리 가능하다.
		// 반환형이 obhect 이므로  강제 형변형을 해준다.                                                                 
		
		jtf.setText(selectCB.getText());
		
		switch(selectCB.getText()){
		case "java":
			System.out.println("java해보자");
			break;
		case "r":
			System.out.println("r해보자");
			break;
		case "python":
			System.out.println("python해보자");
			break;
		case "db":
			System.out.println("db해보자");
			break;

		}
	}
} 
public class JCheckBoxText_ {

	public static void main(String[] args) {
		new JCheckBoxText();
	}
}
