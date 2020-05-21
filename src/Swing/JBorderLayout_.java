package Swing;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

class JBorderLayout extends JFrame{
	
	JBorderLayout(){
		
		Container container = getContentPane();
		
		// 정렬, 수평 간격 (픽셀수:10), 상하의 간격 (픽셀수 : 10)
		//container.setLayout(new BorderLayout());
		container.setLayout(new BorderLayout(10,10));
		
		
		container.add(new JButton("동쪽버튼"),  BorderLayout.EAST);
		container.add(new JButton("서쪽버튼"),  BorderLayout.WEST);
		container.add(new JButton("남쪽버튼"),  BorderLayout.SOUTH);
		container.add(new JButton("북쪽버튼"),  BorderLayout.NORTH);
		container.add(new JButton("중앙버튼"),  BorderLayout.CENTER);
		
		
		// 컨테이너 제목, 크기 , 졸료, 보이기 
		setTitle("BorderLayout 배치관리자 실습");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
}
public class JBorderLayout_ {

	public static void main(String[] args) {
		
		new JBorderLayout();

	}

}
