package Stream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderStream {

	public static void main(String[] args) { // 운영체제의 포멧으로 데이터를 저장하도록 하는 특징을 가지고 있다. 
	
        char[] cbuf = new char[10];
		
		try { 
			Reader in = new FileReader("hyper.txt"); 
			// 운영체제의 포멧에 맞춰서 저장했던 데이터를 java의 문자처리 포멧으로 변환해서 반환해준다. 
			
			int readCnt = in.read(cbuf, 0, cbuf.length); // 읽어온 개수만큼만 반환을 해준다. 
			
			for(int i=0; i < readCnt ; i++) {
				System.out.println(cbuf[i]);
			}
			
			in.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
