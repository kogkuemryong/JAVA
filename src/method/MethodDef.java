package method;

public class MethodDef {

	public static void main(String[] args) {
gugudan(2); // 사용자가 정의한 메서드 호출 방법
		
		gugudan(5); // 사용자가 정의한 메서드 호출 방법
		
		multiple(3,7); // 사용자가 정의한 메서드 호출 방법
		
	}	
		
	public static void gugudan(int num) {	   //() 괄호 안에 데이터를 넣어서 활용 가능하다. 
		                                                           // 조건문 , 반복문을 쓸때와 같은 형태와 형식을 가지고 있다. 
		// 1. 메서드 정의 
		
		 for(int n = 1;n<=9;n++) {
			System.out.println(num + " x " + n + " = " + (n*num));
		 
		 }
    }
	
	        // public static void (       ) : 괄호의 자리는 method의 이름을 의미한다.
			// gugu2dan 이라는 method 2단을 정의하여 내가 필요할 때마다 가져 갈 수 있도록 한다. 
			// javac 를 통해서 컴파일을 하기 때문에 .class 라는 확장자로 저장이 되서 그 값을 컴파일해준다. 
			// main 안에 있지 않으면 실행이 되지 않는다. 
		    // 추가될 수 있는 method의 개수는 제한이 없다. 
		     	
		// 2. 메서드 호출 
		// main 안에서  gugu2dan(); 입력해준다. 
		
		//method 정의 장점:
		// 필요할 때마다 언제든지 호출해서 사용 가능하다.  코드도 짧아지고, 프로그램의 가독성고 지고, 활용성이 높아진다. 
			
	public static void multiple(int num1, int num2) {
			 
			 System.out.println("1~100 사이의 "+num1+"의 배수이고, "+num2+"의 배수를 출력.");
			 
			 for(int i = 1; i<=100 ; i++) {
				 if ((i%num1==0)&&(i%num2==0)){
					 System.out.println(i);
				 }	 
			 }
		
		

	}

}
