package Swing;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class ButtonTest extends JFrame{  // 컨테이너의 구조 형성(프로그램 시작과 동시에 ui 구현)
	
	ButtonTest(){ 
	// 버튼, 레이블 객체 생성 (컴포넌트의 요소-> 자료형)	(JButton, JLabel)
		JButton male = new JButton("남자"); // 남자 버튼
		JButton female = new JButton("여자"); // 여자 버튼
		JLabel label = new JLabel("당신의 성별은?"); // 문자열을 출력
		
		
		// Frame 컨테이너 객체 생성  (getContentPane())
		Container container = getContentPane(); // 안에서 new 해서 컨테이너를 만들어서 주소값을 준다. 
		                          // 컨테이너는 시작 될 때 하나만 만들어두면 전체 ui에 컴포넌트를 할 필요 없다. 
		                          // 최소 한개의 컨테이너가 생성이 되면 이 메서드를 통해서 new 하는 것이 아니라 하나의 컨테이너로 사용한다 (calender 컨셉 동일) 
		    
		//  배치관리자 생성: 자동 컴포넌트 요소 배치  (FlowLayout())
		FlowLayout layout = new FlowLayout(); 
		
		container.setLayout(layout); // 컨테이너는 컴포넌트를 플로우 레이아웃에 맞추어 배치해준다. 
		
		// 컨테이너에 컴포넌트 추가 (.add)
		container.add(male);
		container.add(female);
		container.add(label);
		
		// 컨테이너의 제목, 크기, 종료, 보이기(출력)
		
		setTitle("버튼 컴포넌트 테스트"); // 컨테이너 제목
		setSize(300,100); // 컨테이너 크기(가로, 세로)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 컨테이너 종료(안보이게만 되어 있던 기능 -> 완전 종료)
		setVisible(true); // 컨테이너 보이기(출력)
		
	}
}


public class Button_ {

	public static void main(String[] args) {
		
		new ButtonTest();
		

	}

}
