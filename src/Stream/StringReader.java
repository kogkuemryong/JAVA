package Stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringReader {

	public static void main(String[] args) {


		try {
			BufferedReader in = new BufferedReader(new FileReader("String.txt"));
			String str = null;
			
			 while(true) {
				str = in.readLine(); // 한라인에 있는 문자를 한번에 읽어온다. (라인별로 읽어올 수 있으므로 빠른 처리를 한다.)
				 if(str == null) { // 더이상 입력할 값이 없으면 null을 출력한다.
					 break; 
				 }
				 
				 System.out.println(str); 
					
			 }
		
			 in.close();
			
		} catch (IOException e) {
	
			e.printStackTrace();
		}
		
	}

}
