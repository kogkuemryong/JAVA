package network.Chatting;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerChatting {

	public static void main(String[] args) {
		
		try {
			ServerSocket serverSocket = new ServerSocket(9002);
			
			while(true) {
				Socket socket = serverSocket.accept();
				Thread client = new PerClientThread(socket);
				client.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
