package 객체지향언어;

public class Calculator { // Calculator 의 기능이 필요 할 때,  Adder, Subtractor 존재가 필요하다. 
	//참조 변수를 field로 넣어줘서 지역변수로 사라지지 않고 field가  된다. 
		Adder adder; 
		Subtractor subtractor; 
		
		public Calculator(){       // 생성자 정의 , 사용하고자 할 때 Adder , Subtractor 가 자동으로 호출 되도록 한다. 
			 adder = new Adder();
			 subtractor = new Subtractor();	 
		}
		 
		 public int addNum(int n1, int n2) {
			return adder.addTwoNumber(n1, n2); // error : adder 이 지역변수로 calulator(생성자) 안에서만 유효하기 때문이다. 
		 }
		 
	    public int subNum(int n1, int n2) { 
	    	return subtractor.subTwoNumber(n1,n2); // error : subtractor 이 지역변수로 calulator(생성자) 안에서만 유효하기 때문이다.  
	    }
	}

	class Adder{  // 가산기 기능
		// 호출된 횟수 기록
		private int cntAdd; 
		
		Adder(){  // 생성자를 적용 + 필드를 초기화 
			cntAdd = 0;
		}
		int addTwoNumber(int num1, int num2) { // default 값이 적용되기 때문에 같은 package에서만 사용이 가능.
			cntAdd++;
			return num1 + num2 ; // ( + ) 연산을 먼저 하고 num1 + num2 최종적으로 이 값을 제공해줄 것이다. 수행한 값을 return 할 것이다. 
			// return 연산식, method 무엇이든 최종의 값이 하나로만 반환 된다면 그 값이 올 수 있다. 
		}
		int getCntAdd() {  // counting 하는 값을 변경하지 못하게 method로 정의 한 것이다. 
			return cntAdd;
		}	
	}

	class Subtractor{ // 뺄셈 연산기
		private int cntsub;
		 Subtractor(){
			cntsub = 0;
		}	
		int subTwoNumber(int num1, int num2) {
			cntsub++;
	     	return num1 - num2;			
		}
		int getCutSub() {
			return cntsub;
		}
	}

	// 자료형을 다루는 것이 어렵기 때문에 고참들이 많이 하고, 그 외의 운영하는 역할을 신참 또는 미숙지 된 사람들이 다루는 경우가 많다. 
	// 자료형의 대한 구조의 의미는 계산기라는 껍데기만 만들고 기능들은 자료형으로 만들겠다. 
	// 덧셈기능 안에 method , counting 기능을 구현해놨다. (별도의 자료형으로 구성)
	// 뺄셈기능 안에 method , counting 기능을 구현해놨다. (별도의 자료형으로 구성)
	// 계산기는 덧셈기능과 뺄셈 기능을 그대로 사용하겠다. 
	// 덧셈이나 뺼셈을 사용하고 싶으면 덧셈 method 와 뺄셈 method 를 호출 할 수 있어야 하니깐
	// 메모리의 할당이 되어 있어야 호출이 가능하다. 

    // Calculator(){       // 생성자 정의 , 사용하고자 할 때 Adder , Subtractor 가 자동으로 호출 되도록 한다. 
	// Adder adder = new Adder();
	// Subtractor subtractor = new Subtractor();	 
	// } 그대로 이용하기 위해서 메모리를 할당한다.

	//public int addNum(int n1, int n2) {
	//adder.addTwoNumber(n1, n2);
	//}
	//public int subNum(int n1, int n2) {
	//subtractor.subTwoNumber(n1,n2);
	//}
	// 각각 밑으로 내려가서 값을 return 해준다. 
	
	//Subtractor 는 덧셈(adder)과 뺄셈(subtractor)기능이 사용 가능 해진다. 
	//자료형을 정의 할 때, 세분화한 자료형이 한다면 독립적으로 사용할 수 있게 된다. 


