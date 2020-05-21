package Swing;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class JGridLayout extends JFrame{
	
	JGridLayout(){
		
		Container container = getContentPane();
		
		// GridLayout(행, 열)
		// container.setLayout(new GridLayout(3,5)); 
		// container.setLayout(new GridLayout(4,4)); // 버튼의 개수가 맞지 않아도 행,열에 맞추어 술력한다. 
		
		// GridLayout(행, 열, 수평, 수직)
		container.setLayout(new GridLayout(3,5,5,10));
		
		
		for(int i = 1; i <=15; i++) {
			container.add(new JButton("버튼" + i));
		}
		
	
		// 컨테이너 제목, 크기 , 졸료, 보이기 
		setTitle("GridLayout 배치관리자 실습");
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
		
	}
	
}

public class JGridLayout_ {

	public static void main(String[] args) {
		new JGridLayout();
	}

}
