package String;

import java.util.Scanner;

public class keyboardScanner {
	public static void main(String[] args) {
			Scanner keyboard = new Scanner(System.in);
				// keyboard 뿐 아니라 다른 곳에서도 data 를 입력 받을 수 있다. 
				// data를 읽어올 수 있는 통로를 만들어줘야 한다. 
				// (System.out.println) = out : 출력하겠다. println : 모니터 상으로 출력
				// (System.in) = in : 입력하도록 한다. keyboard 가 눌렸을 때 그 정보를 읽어 올 수 있는 연결통로가 되는 동작이다.
				
			System.out.println("덧셈 연산 수행 프로그램."); //println : 출력 이후 줄바꿈을 해서 다음 출력을 기다린다. 
			
			System.out.print("첫번째 정수값을 입력 : "); // print : 출력 이후 그 자리에서 다음 출력을 기다린다. 
			int num1 = keyboard.nextInt(); 
				
			System.out.print("두번째 정수값을 입력 : "); 
			int num2 = keyboard.nextInt(); 
			
			int resultint  = num1 + num2 ;
			
			System.out.println(num1 + " + " + num2 + " = " + resultint);
			System.out.println(resultint);
			
			//실행하기 위해서 대기 하고 있다(Enter key 가 눌려질 때까지) 입력 되면 keyboard 값으로 들어간다. /	//강제로 int화 시키고 바꾼 정수 값을 return 해서 keyboard로 호출해준다.
			// Scanner는 모두 문자열로 인식한다. 

			// 실수의 덧셈

			System.out.print("첫번째 실수 값 입력 : ");
			double num3 = keyboard.nextDouble();   // 실수로 강제로 변환 : nextDouble(); 
			
			System.out.print("첫번째 실수 값 입력 : ");
			double num4 = keyboard.nextDouble();
			
			double resultdouble = num3 +num4;
			
			System.out.println(num3 + " + " + num4 + " = " + resultdouble);
			System.out.println(resultdouble);
			
			keyboard.nextLine(); // dummy : 동작상의 원활함을 위해서 넣은 코드. 
			
			// 문자 + 문자열
			System.out.print("당신의 이름은?");
			String name  = keyboard.nextLine();  // 문자열로 출력 : NextLine();
			System.out.println("당신의 이름은" + name + "이군요.");
			
			// 위의 코드와 문자열 코드를 함께 출력 했을 때 오류가 일어난 이유는?
			// 같이 사용할 때, nextint과  nextdouble는 enter전 까지의 값을 반환하고 실행하지만 
			// nextLine은 문자열을 처리 하기 때문에 enter나 space가 문자처럼 처리 되기 때문에 위에서 사용된 enter를 문자 취급하여 실행된 것이다. 
			// 해결점 : keyboard.nextLine();을 위의 코드와 문자열 출력 코드 사이에 넣어서 enter가 수행되게 한다 = dummy code 라 한다. 
			
		

	}

}
