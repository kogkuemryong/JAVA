package Swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class JRadioButtonTest extends JFrame implements ActionListener{
	
	
	JTextField jtf;
	JRadioButtonTest(){

		// 버튼 그룹 객체를 생성하여 그룹화할 컴포넌트 추가 (하나만 선택된다)
		ButtonGroup bg = new ButtonGroup(); // 버튼을 그룹화 
		JRadioButton jrb1 = new  JRadioButton("승마");
		JRadioButton jrb2 = new  JRadioButton("골프");
		JRadioButton jrb3 = new  JRadioButton("스쿠버");
		JRadioButton jrb4 = new  JRadioButton("글라이딩");
	    jtf = new JTextField(10);
		
		// JRadioButton은 그룹화 하여 하나만 선택되게 한다. 
		bg.add(jrb1); bg.add(jrb2); bg.add(jrb3); bg.add(jrb4);

		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		container.add(jrb1);
		container.add(jrb2);
		container.add(jrb3);
		container.add(jrb4);
		container.add(jtf);
		
		jrb1.addActionListener(this);
		jrb2.addActionListener(this);
		jrb3.addActionListener(this);
		jrb4.addActionListener(this);
	
		setTitle("JRadioButton");
		setSize(350,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		jtf.setText(e.getActionCommand());
	}
}
public class JRadioButton_ {
	public static void main(String[] args) {	
		new JRadioButtonTest();
	}
}
