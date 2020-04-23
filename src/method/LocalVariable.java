package method;

public class LocalVariable {

	public static void main(String[] args) {
		boolean scope = true;
		// int num = 1; // error 변수 할당을 해놨기 때문에 밑에서 같은 것을 할당하려고 하면 error를 낸다. 
		
		 if(scope) {
		     int num = 1;              // main 이라는 method에 변수의 이름이 같다.
		     num++;                    // if 의 num 과  else의 num   
		     System.out.println(num);  // if 와 else 둘다 자신의 영역을 가지고 있다. 
	     } else {                      // 프로그램 실행시에 메모리에 할당 되어지기고  
		    int num = 2;               // 자기 영역에서 벗어나면 num 값은 사라진다.
		    System.out.println(num);   // if 와 else 영역 안에서만 유효하기 때문에 가능하다. 
		 }                             // 조건문, 명령뭉, method 컨셉은 동일하다 : 영역 안에서만 유효하다.
		                               // 그러한 변수들을 지역 변수(localvariable) 이라 한다. 
		 simple(); // method 호출
	}
		
	public static void simple() {
		
		 int num = 3;
		 System.out.println(num);
		
	}

}
