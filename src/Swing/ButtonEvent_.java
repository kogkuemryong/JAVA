package Swing;

//java 에서 이벤트 처리를 interface 로 한다. 
//마우스의 움직임은 운영체제가 가장 먼저 알고 운영체제가 java에게 클릭한 것을 전달해준다. 
//java가 우리에게 클릭한 것을 알려준다.(implements ActionListener) - 다형성을 통한 오버라이딩 되어진 method를 통해서 기능 구현한다. 


import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


class ButtonEvent extends JFrame implements ActionListener{
	
	JLabel result; // 생성자 밖에서도 사용하기 위해서 field에 선언
	
	ButtonEvent(){  
		
		JButton male = new JButton("남자");
		JButton female = new JButton("여자");
		JLabel label = new JLabel("당신의 성별은?");
		result = new JLabel();
		
		Container container = getContentPane();
		
		
		FlowLayout layout = new FlowLayout();
		
		container.setLayout(layout);
		
		container.add(male);
		container.add(female);
		container.add(label);
		container.add(result);
		
		// 이벤트 처리를 위한 버튼에 리스너 등록
		male.addActionListener(this); // 자신 객체 안에서 이벤트 처리의 동작을 처리해준다. 리스터 등록이 끝이 나면 actionPerformed(); method가 호출된다. 
		female.addActionListener(this);
		
		setTitle("버튼 컴포넌트 테스트");
		setSize(300,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override 
	
	// male.addActionListener(this) 을 통해서 이벤트를 자기 자신으로 등록한다. 리스터 등록이 끝이 나면 actionPerformed(); method가 호출된다. 
	public void actionPerformed(ActionEvent e) {  // (ActionEvent e) : java가 선언한 참조변수의 e 의 주소값을 불러온다. 
		
		// 버튼이 눌렸다 라는 의미로 해석,  ActionListener 정의 되어 있는 추상메서드 : 다형성에 의한 오버라이딩 , 버튼이 눌렸을 때의  기능을 Method를 통해서 구현.  
		// 메서드만 오버라이딩해서 기능만 정의가 된것이지 실질적인 이벤트 기능이 탑재 된 것이 아니다. 
		
		// System.out.println("버튼 클릭");	
		// 클릭한 버튼의 이름을 결과 레이블에 표시한다. 
		
		result.setText(e.getActionCommand()); // getActionCommand() : 정의해 놓은 문자열을 출력해준다. 
		
		
		
		
		
		
		
	}
}

public class ButtonEvent_ {

	public static void main(String[] args) {
		
		new ButtonEvent();

	}

}
