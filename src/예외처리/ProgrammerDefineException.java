package 예외처리;

import java.util.Scanner;

//java는 문법적으로나 수학적으로 문제가 일어났을 때에만 예외처리 할 수 있다. 

//문법적으로는 문제는 없지만 논리적으로나 물리적으로 문제가 되는 경우는 ex) 나이 값을 음수로 넣었다면?? 
//프로그래머 스스로 예외상황이 발생했을 때 처리하도록 문법 구문을 제공한다.  

//<사용자 정의 예외 처리 자료문>


class AAA /*extends Object*/{	
	AAA(){}
	
}

class BBB{
	
	public void method() {
		AAA aaa = new AAA();
				
		try {
			aaa.wait(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}


class AgeInputException extends Exception{ //Exception 예외처리 기능 
	AgeInputException(){
		
		super("유효하지 않은 나이를 입력하셨습니다."); 
	}
}


public class ProgrammerDefineException {

	public static void main(String[] args) {
		System.out.println("나이를 입력하세요 : ");

		int age;
		try {
			age = readAge();
			System.out.println("당신의 나이는 : " +  age + " 살 이군요.");
			
		} catch (AgeInputException e) {
			//e.printStackTrace(); // printStackTrace() 의 기능 : 예외가 발생했을 때 메세지를 출력해준다. 
			System.out.println(e.getMessage()); 
			
		}

	}
	
	 public static int readAge() throws AgeInputException{ // throws AgeInputException 실행과정에서 예외가 발생할 수 있는 method 임을 명시한 것이다. 
		 Scanner input = new Scanner(System.in);              //  throws AgeInputException 가 있는 method 를 받을 때는 try catch 문으로 받아야하낟. 
		 int age = input.nextInt();
		 
		 if(age < 0) {
			 AgeInputException except =  new AgeInputException(); 
			 throw except; // throws catch 문을 찾겠다. throw가 제공 되는 method는  나타나면 try , catch 문으로 받아야한다는 의미를 담고 있다.
			                     
			 
		 }
		 
		 return age; 
		 
	 }

}
	

