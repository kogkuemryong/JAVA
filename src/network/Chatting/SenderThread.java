package network.Chatting;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

class SenderThread extends Thread{
	Socket socket;
	String name;

	SenderThread(Socket socket, String name){
		this.socket = socket;
		this.name = name;
	}
	@Override
	public void run() {
		PrintWriter writer;
		Scanner input = new Scanner(System.in);
		
		try {
			writer = new PrintWriter(socket.getOutputStream());
			writer.println(name);
			writer.flush();
			
			while(true) {
				String msg = input.nextLine();
				
				writer.println(msg);
				writer.flush();
				
				if(msg.equals("exit")) {
					break;
				}
			}
		} catch (IOException e) {
			//e.printStackTrace();
		}
		
		
	}

}
