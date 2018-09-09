import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import Model.GameData;

public class Server {
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(9001);
			
			System.out.println("Listening...");
			while (true) {
				Socket socket = serverSocket.accept();// 받을준비

				// success connect
				PerClient client = new PerClient(socket);
				Thread thread = new Thread(client);
				thread.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
