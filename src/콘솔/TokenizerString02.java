package 콘솔;

import java.util.StringTokenizer; // ctrl + shift + o

public class TokenizerString02 {

	public static void main(String[] args) {
String PhoneNum = "TEL 82-02-1234-5678";
		
		System.out.println("First result == ");
		StringTokenizer st1 = new StringTokenizer(PhoneNum); // 구분 단위를 생략하면
		                                                    // 여백으로 체크
		
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken()); 
		}
		
		System.out.println("Second result == ");
		StringTokenizer st2 = new StringTokenizer(PhoneNum, "  -"); // 구분단위 여러 개 가능(여백 & - )
		
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken()); 
		}
	
		System.out.println("Third result == ");
		StringTokenizer st3 = new StringTokenizer(PhoneNum, "  -", true); // (String str, String delim, boolean returnDelims)
		
		while(st3.hasMoreTokens()) {
			System.out.println(st3.nextToken()); 
		}
		

	}

}
