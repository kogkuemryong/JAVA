package Swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

class JImageTest extends JFrame{
	
	JImageTest(){
		


		
		// ImageIcon ii = new ImageIcon("images/korea.gif"); ./ 뺀다고 해서 문제 되지 않는다. 
		ImageIcon ii = new ImageIcon("./images/korea.gif"); // (./) default 위치에서 시작하겠다.
		
		// "버튼 이름" 과 이미지 아이콘으로 버튼 객체 생성
		// 2. 버튼에 아이콘 삽입
		
		JButton korea = new JButton("클릭", ii); // 이미지를 넣을 때 ("입력할 text" , 이미지file);
		
		Container container = getContentPane(); // method를 통해서 container 객체를 가져온다. 
		
		container.setLayout(new FlowLayout()); 
		
		container.add(korea);
		
		setTitle("대한민국");
		setSize(500,180);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		

	}
	
	
}

public class JImage_ {

	public static void main(String[] args) {
		
		   new JImageTest();

	}

}
