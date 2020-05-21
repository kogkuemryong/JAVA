package Swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class korea extends JFrame implements ActionListener{
	
	
	JLabel label;
	
	korea(){
		
		// 1. 이미지 파일을 이용한 아이콘화
		// ImageIcon ii = new ImageIcon("images/korea.gif"); ./ 뺀다고 해서 문제 되지 않는다. 
		ImageIcon ii = new ImageIcon("./images/korea.gif"); // (./) default 위치에서 시작하겠다.
		
		// "버튼 이름" 과 이미지 아이콘으로 버튼 객체 생성
		// 2. 버튼에 아이콘 삽입
		
		JButton korea = new JButton("클릭 ", ii); // 이미지를 넣을 때 ("입력할 text" , 이미지file);
		label = new JLabel();
		

		Container container = getContentPane(); // method를 통해서 container 객체를 가져온다. 
		
		container.setLayout(new FlowLayout()); 
		container.add(korea);
		container.add(label);
		
		korea.addActionListener(this);
		
		setTitle("여기는 대한민국 입니다.");
		setSize(500,180);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		label.setText("대한민국 버튼 클릭");
	}
	
	
}

public class jImage_korea {

	/*
	Swing 03 의 결과 화면에서 이미지 버튼을 클릭하면 "대한민국 버튼 클릭" 이라는 메세지가 버튼의 오른쪽에 
	표시되도록 이벤트를 적용하세요. 
	또한 프레임의 제목을 "여기는 대한민국 입니다. " 라고 변경하세요. 
	*/
	
	public static void main(String[] args) {
		new korea();
		

	}

}
