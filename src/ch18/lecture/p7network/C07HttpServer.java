package ch18.lecture.p7network;

import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class C07HttpServer {
	
	try ( 
			public static void main(String[] args) {
		ServerSocket server = new ServerSocket(8000);
		Socket socket = server.accept();
	
		Outputstream os = socket.getOutputStream();
		BufferedOutputStream bos = new BufferedOutputStream(os);
		PrintWriter pw = new PrintWriter(bos);) { 
		
		String data = "<h1>내일부터 jsp 책 가져오세요 </h1>";
		
		pw.println("HTTP/1.1 200 OK");
		pw.println("Content-Type: text/html; charset=utf-8");
		pw.println("Content-Length: " + data.getBytes().length);
		pw.println("");
	} catch(Exception e) {
		e.printStackTrace();
		}
	}
}
