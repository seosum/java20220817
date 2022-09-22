package ch18.book.server;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

public class Server {
	public static void main(String[] args) {
		
	System.out.println("연결 기다림");
	// 172.30.1.60:60000
	try (
			// ServerSocket 만듦
			ServerSocket serverSocket = new ServerSocket(30000);) {
		
		AtomicInteger cnt = new AtomicInteger();
		while (cnt.get() < 50) {
			// 연결 기다림
			Socket socket = serverSocket.accept();
			cnt.incrementAndGet();
			
			Thread thread = new Thread(() -> {
				System.out.println(socket.getRemoteSocketAddress());
				
				System.out.println("연결 종료");
			});
			thread.start();
			
		}

	} catch (Exception e) {
		e.printStackTrace();
	}

}
}

