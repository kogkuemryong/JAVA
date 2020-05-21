package Swing;


import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

class JButtonEvent extends JFrame{
	
	
	JButtonEvent(){
		
		//3개국 이미지 아이콘화 
		ImageIcon korea = new ImageIcon("./images/korea1.gif");
		ImageIcon usa = new ImageIcon("./images/usa.gif");
		ImageIcon germany = new ImageIcon("./images/germany.gif");
		
	    // 1. korea 이미지 아이콘으로 버튼 생성
		JButton  event = new JButton(korea); // "text" 없이 가능 
		                                                     // JButton 안에도 event 처리 기능이 있다. 
		
		// 2. 버튼 오버시 usa 표시 
		event.setRolloverIcon(usa); 
		// (자체 event 처리)마우스가 위치하게 되면 입력으로 전달 이미지를 출력한다. 
		
		// 3. 버튼 글릭시 germany 표시 
		event.setPressedIcon(germany);
		
		
		
		// JFrame 객체 생성
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		container.add(event);
		
		setTitle("JButton 자체 event 처리");
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
		
	}
	
}
public class JButtonEvent_ {

	public static void main(String[] args) {
		
		new JButtonEvent();
		
	}

}
