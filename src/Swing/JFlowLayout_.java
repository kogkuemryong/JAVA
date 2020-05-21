package Swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class JFlowLayout extends JFrame{
	
	
	JFlowLayout(){
		
		Container  container = getContentPane(); 
		//  getContentPane(); 를 통해서 Container 반환 받아올 수 있다. 
		
		// 1. 기본 정렬은 Center
		// container.setLayout(new FlowLayout()); // 크기를 변경하면 버튼을 재배치 해준다.(default : 가운데 정렬)
		
		// 2. Left 정렬
		// container.setLayout(new FlowLayout(FlowLayout.LEFT)); // 왼쪽 정렬
		
		// 3. Right 정렬
		// container.setLayout(new FlowLayout(FlowLayout.RIGHT)); // 오른쪽 정렬
		
		// 4. Left 정렬(정렬, 수평 간격 (픽셀수:10) , 상하의 간격 (픽셀수 : 50)) 픽셀 : 모니터상 나타나는 칸의 단위
		container.setLayout(new FlowLayout(FlowLayout.LEFT,10,50)); // 왼쪽 정렬 + 
				
		
		
		for(int i = 1; i <=15;i++ ) { //15개 컨퍼넌트
			container.add(new JButton("버튼" + i)); //  "버튼1" 을 가지고 문자열을 호출하게 된다.  container에 포홤 시켜준다. 
		}
		
		// 컨테이너 제목, 크기 , 졸료, 보이기 
		setTitle("FlowLayout 배치관리자 실습");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
		
	}
}

public class JFlowLayout_ {

	public static void main(String[] args) {
		new JFlowLayout();

	}

}
