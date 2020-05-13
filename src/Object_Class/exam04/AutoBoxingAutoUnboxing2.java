package Object_Class.exam04;

public class AutoBoxingAutoUnboxing2 {

	public static void main(String[] args) {
		
		Integer num1 = 10; // AutoBoxing 에 의해서  기본 자료형 처럼 사용. 
		Integer num2 = 20;
		
		num1++; // num1 = num1.intValue() + 1; (원래 이렇게 구현했어야 했다.)
		System.out.println(num1);
		
		num2 += 3; // num2 = num2.intValue() + 3;
		System.out.println(num2);
		
		int addResult = num1 + num2; // int addResult = num1.intValue() + num2.intValue();
	    System.out.println(addResult);
		

	}

}
