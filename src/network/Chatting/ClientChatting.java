package network.Chatting;

import java.io.IOException;
import java.net.Socket;

public class ClientChatting {

	public static void main(String[] args) {
        String name = "홍길동";
		
		try {
			Socket socket = new Socket("192.168.0.101", 9002);
			Thread sender = new SenderThread(socket, name);
			Thread receiver = new ReceiverThread(socket);
			
			sender.start();
			receiver.start();
			
		} catch (IOException e) {
			//e.printStackTrace();
		}

	}

}
