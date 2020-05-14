package Object_Class;

import java.util.Random;

public class RandomNumberGenerator02 {

	public static void main(String[] args) {
		
        Random random = new Random();
		
		
		//1~100사이의 임의의 값
		random.nextInt(100); // 0~99까지의 정수가 출력. 
		int num = random.nextInt(100)+1;
		System.out.println(num);
		
		//10~20 사이
		
		int num1= random.nextInt(10)+11; //0~9 + 11 = 10~20사이 출력 (범위는 지정이 되어져야 한다.)
		System.out.println(num1);
		
		int num2= random.nextInt();
		System.out.println("임의의 정수 값 : "+num2);
		
		float f = random.nextFloat(); // default 일때 0.0~1.0 사이의 임의의 실수 값 : 
		System.out.println("default 일때 0.0~1.0 사이의 임의의 실수 값 : " + f);
		
		boolean b = random.nextBoolean();
		System.out.println("임의의 논리 값 : " + b);

	}

}
