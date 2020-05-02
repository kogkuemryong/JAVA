/*
    문제)아래의 예제를 switch문을 활용하여 변경해 보자.
 */

package 예제;

public class 예제2 {
	public static void main(String[] args) {
		
			int n = 24;
			
		if(n >= 0 && n< 10) {
			System.out.println("0이상 10미만의 수");
		}else if(n >=10 && n<20) {
			System.out.println("10이상 20미만의 수");
		}else if(n>=20 && n<30) {
			System.out.println("20이상 30미만의 수");
		}else {
			System.out.println("음수 혹은 30이상의 수");
		}
		
		System.out.println("=== switch ===");
		
		switch (n / 10) {
			
			case 0:
				System.out.println("0이상 10미만의 수");
				break;
			case 1:
				System.out.println("10이상 20미만의 수");
				break;
			case 2:
				System.out.println("20이상 30미만의 수");
				break;
			default:
				System.out.println("30이상의 수");
				break;	
		}


	}

}
