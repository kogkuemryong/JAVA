package Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteFileCopy {

	public static void main(String[] args) {
		

		// 파일을 대상으로 프로그램과 연결해주어 입출력을 가능하게 하는 통로 = stream
		// Stream의 최상위  Stream =  (InputStream, OutputStream) 
		
		// 예외처리는 참조 구문에도 가능하다. 
		
		try { 
			int copyByte = 0;
			InputStream in= new FileInputStream("Fonts.zip");// 입력용 stream (읽어오는 통로)
			OutputStream out = new FileOutputStream("Copy.zip"); // 출력용 stream 
			
		    while(true) {
			    int bData = in.read(); // 1byte 단위로 읽어온다. 
			    // read()는 byte 단위로 읽어오는데 모든 내용을 읽어오면 - 1이라는 값을 return 해준다. (= 전체 data를 읽어옴)
			    if(bData == -1) { 
				    break; 
			    }
			    out.write(bData); // 1byte 로 읽어서 처리 하기 때문에 많은 시간이 소요된다. 
			    copyByte++;
		    }
		    
		    in.close();
		    out.close();
		    
		    // close : Stream 을 통해서 할당 받았던 메모리에 저장했었던 자료들을 한번에 정리하여 재사용 할 수 있도록 해준다. 
		    
		    
		    System.out.println("복사된 바이트 크기 : " + copyByte );
		
		
		   
			
		} catch (IOException e) { // IOException 이 FileNotFoundException 을 상속하기 때문에 겹치므로 error 
			                                // FileNotFoundException 생략해도 문제 없이 이뤄진다. 
			e.printStackTrace();
		} 

		// 부모의 자료형으로 바라보는 이유: 어떤 대상이어도 InputStream, OutputStream 으로 바라본다.
		// 실제적인 controller 에서 해당 자료형의 내용으로 수행된다. 
		

	}

}
