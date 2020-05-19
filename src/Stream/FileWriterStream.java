package Stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterStream { // 운영체제의 포멧으로 데이터를 저장하도록 하는 특징을 가지고 있다. 

	public static void main(String[] args) {// 문자의 양이 많아 질 수록 퍼포먼스 이슈가 생길 수 있다.
		
		
		char ch1 = 'A';
		char ch2 = 'B';
		// 윈도우 저장할 때,  영어는 1byte 로 처리 , 한국어는 2byte 다른 나라는 3byte로 처리되는 곳도 있다. 
		
		try {
			Writer out = new FileWriter("hyper.txt"); // FileWriter 운영체제가 관리하는 문자열 포멧으로 운영체제가 파일에 담게 처리한다. 
			out.write(ch1);                           // 윈도우가 저장하고 있기 때문에 깨지지 않고 저장된다. char 자료형 2개 이므로 2byte 로 저장된다.   
			out.write(ch2);                           // java의 형식으로 저장되는 것이 아니다. 만약 java의 형태였다면 4byte로 저장되고, 깨져보이게 나타난다. 
			out.close();                              // 운영체제의 포멧에 맞춰서 정의된다. 메모장으로 읽을 때는 깨지지 않고 잘 보이지만 java에서 그대로 읽어내면 깨져서 보이게 된다. 
			
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

}
