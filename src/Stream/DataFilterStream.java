package Stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataFilterStream {

	public static void main(String[] args) {
		
		 try {
				OutputStream out = new FileOutputStream("data.bin"); 
				// file 이 없으면 입력한 이름으로 file 을 만들어준다. file이 이미 존재하면 원래 있던 내용을 다 지우고 내용을 입력한다.
				       
				DataOutputStream filterOut = new DataOutputStream(out);
				// 통로를 필터 스트림에 연결 
				
				// out.write(365); // 별도의 자료형 입력이 없을 때는 int로 저장된다. 
				// out.close();
				
				filterOut.writeInt(365); // : 정수값 저장
				filterOut.writeDouble(3.14); // : 실수값 저장 
				filterOut.close(); // 필터를 close 하면 연결된 Stream 도 close 된다. 
				
				
				InputStream in = new FileInputStream("data.bin");
				DataInputStream filterIn = new DataInputStream(in);
				// 통로를 필터 스트림에 연결 
				
				
				//System.out.println(in.read()); //  출력값 : 109
				//in.close();
				
				System.out.println(filterIn.readInt());
				System.out.println(filterIn.readDouble());
				
				filterIn.close();
				
						
			} catch (IOException e) { // 예외가 발생하는 경우 : 관리자 권한으로 연결되어지는 file 같은 경우(운영체제의 권한에 의해서)
				e.printStackTrace();
			}

	}

}
