package Stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterClass {

	public static void main(String[] args) {
		
		try {
			PrintWriter out = new PrintWriter(new FileWriter("printf.txt")); 
			// PrintWriter 운영체제의 포멧에 맞게 문자와 문자열을 처리하게 기능이 구현되어있다. 
			
			 out.printf("제 이름은 %s 입니다." , "홍길동");
			 out.println("");
			 out.print("우리는 자바 입출력을 배우고 있어요.");
			 out.close();
			 
			
		} catch (IOException e) {	
			e.printStackTrace();
		}

	}

}
