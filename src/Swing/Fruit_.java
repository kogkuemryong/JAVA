package Swing;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Fruit extends JFrame implements ActionListener{
	
	JLabel label;
	
	Fruit(){
	
	ImageIcon  apple = new ImageIcon("./images/apple.jpg");
	ImageIcon  pear = new ImageIcon("./images/pear.jpg");
	ImageIcon  persimmon= new ImageIcon("./images/persimmon.jpg");
	ImageIcon  banana = new ImageIcon("./images/banana.jpg");
	ImageIcon  grape = new ImageIcon("./images/grape.jpg");
	
	JButton A_pple= new JButton("사과", apple); 
	JButton P_ear = new JButton("배", pear); 
	JButton P_ersimmon = new JButton("감", persimmon);
	JButton B_anana = new JButton("바나나", banana); 
	JButton G_rape = new JButton("포도", grape); 
	
	label = new JLabel();
	
	Container container = getContentPane();
	
	container.setLayout(new GridLayout(3,2));
	container.add(A_pple);
	container.add(P_ear);
	container.add(P_ersimmon);
	container.add(B_anana);
	container.add(G_rape);
	container.add(label);
	
	
	A_pple.addActionListener(this);
	P_ear.addActionListener(this);
	P_ersimmon.addActionListener(this);
	B_anana.addActionListener(this);
	G_rape.addActionListener(this);
	
	
	setTitle("5개 과일 이미지");
	setSize(500,180);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	

	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		label.setText(e.getActionCommand());
		
		
	}
}

public class Fruit_ {

	/*
	5개의 과일 이미지 (사과, 배, 감, 바나나 , 포도) 를
	이용하여 이미지 버튼을 생성한 후, 3행 2열 형태로 프레임에 배치한다.
	또한 특정미지 버튼을 클릭하는 이벤트가 발생하면 3행2열의 셀에 클릭한 
	버튼의 이름이 표시되도록 하세요.
	*/ 
	
	
	public static void main(String[] args) {
		new Fruit();

	}

}
