package network.Socket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(9001);
			
			while(true) {
				Socket socket = serverSocket.accept();
				
				ObjectInputStream inStream = 
						new ObjectInputStream(socket.getInputStream());
				
				String msg = inStream.readUTF();
				System.out.println("클라이언트가 전송해 온 메세지: "+msg);
				
				if(msg.equals("exit")) {
					break;
				}
				
				ObjectOutputStream outStream = 
						new ObjectOutputStream(socket.getOutputStream());
				
				outStream.writeUTF("홍길동이 전달한 메세지 : " +msg+ " 잘 받았어요.");
				outStream.flush();
				
				outStream.close();
				inStream.close();
				socket.close();
			}
			
			serverSocket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
