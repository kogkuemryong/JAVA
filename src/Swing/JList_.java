package Swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

class JListTest extends JFrame{
	
	String[] sport = {"농구" , "축구" , "배구" , "야구", "테니스", "핸드볼"};
	JListTest(){
		JList<String> jl = new JList<String> (sport); // 제너릭으로 정의해서 사용.
		jl.setVisibleRowCount(3); // 화면에 보여줄 행 수 정의.
		JScrollPane jp = new JScrollPane(jl); //  스크롤바 적용
	
		Container container = getContentPane();
	    container.setLayout(new FlowLayout());
	   
	    container.add(jp); // JList가 탑제된 JScrollPane을 저장시켜줘야 정상적으로 동작이 진행된다. 
	    
		setTitle("리스트 상자 실습");
		setSize(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
public class JList_ {
	public static void main(String[] args) {
		new JListTest();
	}
}
