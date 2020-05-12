package 예외처리;

import java.util.Scanner;

class AgeException extends Exception{ //Exception 예외처리 기능 4
	
	AgeException(){
		
		super("유효하지 않은 나이를 입력하셨습니다."); 
	}
}

public class ThrowsFromUpperMethod {

	public static void main(String[] args) {
	
			System.out.println("나이를 입력하세요 : ");

			try {
				int age = callAge();
				System.out.println("당신의 나이는" +  age  + " 이군요.");
				
			} catch (AgeException e) {
				System.out.println(e.getMessage());
				
			}
			
		}
		
		public static int callAge() throws AgeException {   // 예외를 한곳으로 몰아서 처리할 수 있다. 
			
			int age = readAge();
			
		
			return age; 
		}
		
		public static int readAge() throws AgeException{ // throws AgeInputException 실행과정에서 예외가 발생할 수 있는 method 임을 명시한 것이다. 
			 Scanner input = new Scanner(System.in);              //  throws AgeInputException 가 있는 method 를 받을 때는 try catch 문으로 받아야하낟. 
			 int age = input.nextInt();
			 
			 if(age < 0) {
				 AgeException except =  new AgeException(); 
				 throw except; // throws catch 문을 찾겠다. throw가 제공 되는 method는  나타나면 try , catch 문으로 받아야한다는 의미를 담고 있다.
				                     
				 
			 }
			 
			 return age; 
		}
	}


		

	