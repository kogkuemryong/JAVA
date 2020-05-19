package Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferFileCopy {

	public static void main(String[] args) {
		
		try { 
			byte[] buf = new byte[1024]; // 1024 byte = 1kb (1kb씩 저장하도록 만듬)
			int copyByte = 0;
			InputStream in= new FileInputStream("Fonts.zip");
			OutputStream out = new FileOutputStream("CopyBuffer.zip");
			
		    while(true) {
			    int readLen = in.read(buf); // 아무것도 넣지 않았을 때 1byte 씩 읽어오지만 
			                                          // buf을 넣어주면 읽어온 데이터를 1024개까지 쌓아준다. 
			                                          // buf가 꽉차면 읽어온 data의 개수 만큼 return 해준다.
			   
			    if(readLen == -1) {  // return 할 때 -1 이 돌아오는것은 그대로 이다. 
				    break; 
			    }
			    out.write(buf, 0, readLen);  // buf 배열(크기) - 1024개  ,  0번째부터 , readLen 의 개수까지 write
			    copyByte+=readLen;  // 전체읽어온 개수 확인 
		    }
		    
		    in.close();
		    out.close();
		    
		    System.out.println("복사된 바이트 크기 : " + copyByte );
		
		
		   
			
		} catch (IOException e) { 
			                               
			e.printStackTrace();
		} 

	}

}
