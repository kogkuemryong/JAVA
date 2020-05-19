package Stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataBufferedFilterStream {

	public static void main(String[] args) {
		
		// 방법 1
		
					/// Stream -> Buffer -> Data
				    try {
					OutputStream out = new FileOutputStream("data.bin");
					BufferedOutputStream bOut = new BufferedOutputStream(out);
					DataOutputStream dOut = new DataOutputStream(bOut);
					// DataOutputStream은 byte에 대해서 자료형에 맞춰서 재가공 처리 해준다.  
					
					dOut.writeInt(2048);
					dOut.writeDouble(3.14);
					dOut.close();
					
					// 방법 2 Stream -> Data -> Buffer = error
					
					/*
					OutputStream out = new FileOutputStream("data.bin");
					DataOutputStream dOut = new DataOutputStream(out);
					BufferedOutputStream bOut = new BufferedOutputStream(dOut);
					*/
					// BufferedOutputStream은 byte 에 대해서 재가공 처리 할 수 없기 때문에 문제 . 
					
					InputStream in = new FileInputStream("data.bin");
					BufferedInputStream bIn = new BufferedInputStream(in);
					DataInputStream dIn = new DataInputStream(bIn);
					
					System.out.println(dIn.readInt());
					System.out.println(dIn.readDouble());
					dIn.close();
					
					
				} catch ( IOException e) {
					
					e.printStackTrace();
				}
	}

}
