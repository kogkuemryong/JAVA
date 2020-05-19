package Stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteBufferedFileCopy {

	public static void main(String[] args) {
		// 퍼포먼스의 문제를 최소화 하여 결과값을 가질 수 있도록 한다. 
		
				try { 
					int copyByte = 0;
					InputStream in= new FileInputStream("Fonts.zip");
					BufferedInputStream bufferIn =  new BufferedInputStream(in);
					
					OutputStream out = new FileOutputStream("Copy1.zip");
					BufferedOutputStream bufferOut = new BufferedOutputStream(out);
					
					
					
				    while(true) {
					    int bData = bufferIn.read(); 
					  
					    if(bData == -1) { 
						    break; 
					    }
					    bufferOut.write(bData); 
					    copyByte+= bData;
				    }
				    
				    bufferIn.close();
				    bufferOut.close();
				    
				    System.out.println("복사된 바이트 크기 : " + copyByte );
			
					
				} catch (IOException e) { 
					e.printStackTrace();
				} 
		

	}

}
