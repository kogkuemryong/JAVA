package network.Chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class PerClientThread extends Thread{
	static List<PrintWriter> list = 
			Collections.synchronizedList(new ArrayList<PrintWriter>());
	
	Socket socket;
	PrintWriter writer;
	
	PerClientThread(Socket socket){
		this.socket = socket;
		try {
			writer = new PrintWriter(socket.getOutputStream());
			list.add(writer);
		} catch (IOException e) {
			//e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		String name = null;
		try {
			BufferedReader reader =
					new BufferedReader(
							new InputStreamReader(socket.getInputStream()));
			
			name = reader.readLine();
			sendAll("# "+name+"님이 입장하셨습니다.");
			
			while(true) {
				String msg = reader.readLine();
				
				if(msg != null) {
					sendAll(name+">"+msg);
				}
			}
		} catch (IOException e) {
			//e.printStackTrace();
		}
		
	}

	private void sendAll(String msg) {
		for(PrintWriter e : list) {
			e.println(msg);
			e.flush();
		}

	}
}
