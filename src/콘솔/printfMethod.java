package 콘솔;

public class printfMethod {

	public static void main(String[] args) {
		int age = 20;
		double tall = 175.7;
		String name = "홍길동";

		System.out.println("제 이름은 " + name + " 입니다.");
		
		System.out.printf("제 이름은 %s 입니다.\n", name); 
		// 출력한 다음에 출력을 기다리고 있으므로 , 줄바꿈하고 싶을 땐 \n 을 사용한다. 
		
	    System.out.printf("나이는 %d살이고, 키는 %f입니다.\n", age, tall);	
	    
		System.out.printf("제 이름은 %s 이고, 나이는 %d 살이고, 키는 %.2f 입니다.\n",name, age, tall);
        // 문자열 %s , 정수 %d , 실수 %f (%.nf 소수점 n자리 까지 출력하게 만듬) 를 사용한다. 
		
		System.out.printf("%d, 0x%x,  0%o \n" , 100, 100,100);
		// 정수의 값을 16진수로 출력  0x%x , 8진수로 출력  0%o
		
		System.out.printf("%g, %g \n", 0.00014, 0.000014); 
		// 출력의 대상에 따라서 %e 또는 %f 형태로 출력한다. 
		
		// 출력과 관련 : ptrintln , print , printf , Escape Sequence
		
	}

}
