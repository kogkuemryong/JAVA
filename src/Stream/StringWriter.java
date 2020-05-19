package Stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StringWriter {

	public static void main(String[] args) { // 일반적으로 문자역을 사용할 때, 퍼포먼스를 위해서 Buffered를 함께 사용한다. 
		
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("String.txt"));
			
			out.write("더조은 컴퓨터 아카데미"); 
			out.newLine();  
			out.write("서울시 종로구");
			out.newLine();
			out.write("데이터 입력 완료");
			out.close();
			// 줄바꿈에 대한 의미를 가지는 약속들이 운영체제별로 다른데 어떤 운영체제를 사용하더라도 out.newLine(); 범용적으로 줄바꿈 하도록 도와준다.
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
