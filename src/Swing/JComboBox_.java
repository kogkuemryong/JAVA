package Swing;


import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

// 화면의 제약이 존재할 때 사용하며, 풀다운 형태의 리스트 컴포넌트를 만들어주는 클래스이다. 
// 항목(list)를 선택하는 이벤트 처리 ItemListener를 이용한다. 

class JComboBoxTest extends JFrame implements ItemListener{ 
	
	JLabel jl; 
	
	 JComboBoxTest(){
			
		 ImageIcon ii = new ImageIcon("./images/banana.jpg"); 
		 jl = new JLabel(ii);
		
		// 콤보박스 객체 생성 및 상목(Item) 추가.
		 JComboBox<String> jc = new JComboBox<String>(); // 제너릭으로 선언되어 있는데 그 이유는 콤보 안의 자료형을 다 같게 하기 위함이다. 
	                                                                               // 안정성을 확보하기 위함이다.  
		 jc.addItem("banana");
		 jc.addItem("pear");
		 jc.addItem("apple");
		 jc.addItem("grape");
		 
		 Container container = getContentPane();
		 container.setLayout(new FlowLayout());
		 
		 container.add(jl);
		 
		 container.add(jc);
	
		 // 이벤트 리스너 등록
		 jc.addItemListener(this);
		 
		 setTitle(" JComboBox 실습");
		 setSize(350,200);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setVisible(true);
		 
	 }

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		String fruit = (String)e.getItem();
		jl.setIcon(new ImageIcon("./images/"+fruit+".jpg"));
	
	}
}

public class JComboBox_ {

	public static void main(String[] args) {
		
		new  JComboBoxTest();

	}

}
