package network.Socket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class SocketClient {

	public static void main(String[] args) {
		
		try {
			Socket socket = new Socket("localhost", 9001);
			
			
			ObjectOutputStream outStream = 
					new ObjectOutputStream(socket.getOutputStream());
			
			outStream.writeUTF("홍길동");
			outStream.flush();
			
			ObjectInputStream inStream = 
					new ObjectInputStream(socket.getInputStream()); 
			
			String msg = inStream.readUTF();
			
			System.out.println("서버로부터 전송되어진 메세지 :");
			System.out.println(msg);
			
			inStream.close();
			outStream.close();
			socket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
