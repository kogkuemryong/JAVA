package Stream;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomFileReadWrite {

	public static void main(String[] args) {
		// RandomAccessFile(양방향) : 사실상 자바 IO의 일부가 아니다. 다만 컨트롤 대상이 파일이기 때문에 IO와 함께 다뤄질 뿐이고, 
				// 편의상 스트림으로 분류하기도 하지만, 엄밀히 말해서 스트림이 아니다. 스트림은 임의의 위치에 데이터를 읽고 쓸 수 없다. 
				// 파일상의 위치 정보를 읽어 올 수 있으며, 임의의 위치로 이동해갈 수 있다. 
				
				try {
					RandomAccessFile raf = new RandomAccessFile("data.bin", "rw"); // rw(read/Write) , r(read) , w(write) 의 형태로 체크.
					
					System.out.println("Write...................................");
					System.out.printf("현재 입출력 위치 : %d바이트 \n", raf.getFilePointer()); // raf.getFilePointer() : 정수 값을 반환한다. 
					
					raf.writeInt(200); // 정수값을 저장한다. 정수형 literal(상수개념 - 변경불가) 은 default로 자료형을 int 로 잡아서 사용한다. 
					raf.writeInt(500);
					System.out.printf("현재 입출력 위치 : %d바이트 \n", raf.getFilePointer()); // 계산 단위 8byte로 저장되고 난 현재 위치 정보를 알려준다. 
					
					
					raf.writeDouble(3.14);
					System.out.printf("현재 입출력 위치 : %d바이트 \n", raf.getFilePointer()); // 계산 단위 16byte로 저장되고 난 현재 위치 정보를 알려준다. 
					
					raf.seek(0); // 임의의 위치로 이동. seek(0); 처음 위치로 이동. 
					System.out.printf("현재 입출력 위치 : %d바이트 \n", raf.getFilePointer()); // 현재 입출력 위치 : 0바이트 
					
				    System.out.println(raf.readInt()); // 200
				    System.out.println(raf.readInt()); // 500
				    System.out.println(raf.readDouble()); // 3.14
				    
				    raf.close();
				    
				} catch (IOException e) {
					e.printStackTrace();
				} 
				

	}

}
