package Swing;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.w3c.dom.events.MouseEvent;

class JTableDemo extends JFrame implements MouseListener{
	
	
	 JTableDemo(){
		 
		 String[] colHeads = {"학과", "학번", "이름"};
		 
		//1행에 3개의 데이터 - 행렬의 2차원 데이터 
		 Object[][] data = { 
					{ "IT응용공학전공", "201095029", "김지연" },
					{ "컴퓨터응용공학전공", "201195007", "김대연" },
					{ "인터넷응용공학전공", "201195072", "이현덕" },
					{ "멀티미디어공학전공", "201096041", "김기창" },
					{ "IT응용공학전공", "201198001", "이명찬" },
					{ "정보통신공학전공", "201198074", "강재근" },
					{ "인터넷응용공학전공", "201195012", "임자용" },
					{ "멀티미디어공학전공", "201196025", "문정숙" },
					{ "IT응용공학전공", "201198016", "하종섭" },
					{ "데이타베이스공학전공", "201197011", "안진숙" },
					{ "IT응용공학전공", "201198009", "서은실" },
					{ "데이타베이스공학전공", "201197008", "장희숙" },
					{ "멀티미디어공학전공", "201196033", "장현석" }
					};
		
		JTable table = new JTable(data , colHeads); // 행렬의 형태로 담기면서 맨위에 타이틀이 들어간다. 
		JScrollPane jsp = new JScrollPane(table);
		
		Container container = getContentPane();
		container.setLayout(new BorderLayout());// 화면자체가 data를 추력해주는 하나의 이미지로 되어 있기 때문에 
		                                                         // BorderLayout() 사용한다. 
		container.add(jsp, BorderLayout.CENTER);
		
		table.addMouseListener(this);
		
		setTitle(" JTable 실습");
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	 }

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		System.out.println("mouseClicked()");
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		System.out.println("mousePressed()");
		
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		System.out.println("mouseReleased()");
		
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		System.out.println("mouseEntered()");
		
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		System.out.println("mouseExited()");
	}
}

public class JTable_ {

	public static void main(String[] args) {

		 new JTableDemo();
	}

}
