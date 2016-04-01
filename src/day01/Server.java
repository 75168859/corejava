package day01;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args)throws Exception {
		try {
			ServerSocket s = new ServerSocket(8080);
			while(true){
				Socket socket = s.accept();
				new Thread(new Runnable() {
					
					@Override
					public void run() {
						//socket.getInputStream();
						//socket.getOutputStream();
						//BIO  ---->IO多路复用Reactor模式
					}
						
				}).start();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
