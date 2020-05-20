package network.Chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

class ReceiverThread extends Thread{
	Socket socket;

	ReceiverThread(Socket socket){
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			BufferedReader reader = 
					new BufferedReader(
							new InputStreamReader(socket.getInputStream()));
			
			while(true) {
				String msg = reader.readLine();
				
				if(msg != null) {
					System.out.println(msg);
				}
			}
		} catch (IOException e) {
			//e.printStackTrace();
		}
	}

}
