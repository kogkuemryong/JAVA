package 객체지향언어;

class dder{
	public int add(int n1, int n2){  // 기능만 수행하도록 만들었다. (정수의 값만 수행하도록 되어 있다.)
		return n1+n2;
	}
	
	public int add(int n1, int n2, int n3){  // 기능만 수행하도록 만들었다. (정수의 값만 수행하도록 되어 있다.)
		return n1+n2+n3;
	}
	
	public double add(double n1, double n2){ 
		return n1+n2;
		                                            // 같은 이름으로 만들어져있는데 error가 나지 않고 있다. 
	}   public double add(int n1, double n2){       // (실수의 값만 수행하도록 되어 있다.)
		return n1+n2;                                // method overloading를 이름을 똑같이 정의 할 수 있다. 
	}		                                         // 1) 입렵의 매개변수의 자료형이 서로 다르게 정의 되어 있을 때 허용한다. 
		public double add(double n1, int n2){        // 자동형변환이 연산 작동시 자동으로 수행되어서 error 가 발생하지 않는다. 
		return n1+n2;                                // int 가 double 로 자동변환된다.  
}	                                                 // 2) 자료형이 같아도 개수가 다를때 사용가능하다. 
	}


public class MethodOverloading {
	public static void main(String[] args) {
		dder adder = new dder();
		int result = 0;
		double resultDouble = 0;
		int resultInt =0;
      
		 result = adder.add(100,2000);
		 System.out.println("100 + 200 = " + result);
		 
		 resultDouble =  adder.add(3.14,5.12); 
		 System.out.println("3.14 + 5.12 = "  + resultDouble);
		 
		 resultDouble =  adder.add(3,5.12); 
		 System.out.println("3 + 5.12 = "  + resultDouble);
		
		 resultDouble =  adder.add(3.25,5); 
		 System.out.println("3.25 + 5 = "  + resultDouble);
		 
		 
		 resultInt = adder.add(100,200,300);
		 System.out.println("100 + 200 + 300 = "  + resultInt);
		 
	

	}

}
