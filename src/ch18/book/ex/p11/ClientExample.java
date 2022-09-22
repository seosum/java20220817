package ch18.book.ex.p11;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;

public class ClientExample {

	public static void main(String[] args) throws Exception{
		Socket socket = new Socket("localhost", 20);
		OutputStream os = socket.getOutputStream();
		
		String filePath = "C:\\Users\\user\\Desktop\\output\\꼬마니콜라.jpg";

		File file = new File(filePath);
		
		String fileName = file.getName();
		byte[] fileNameBytes = fileName.getBytes("UTF-8"); // utf-8로 변환
		fileNameBytes = Arrays.copyOf(fileNameBytes, 100); 
		os.write(fileNameBytes); 
		
		System.out.println("[파일 보내기 시작]" + fileName);
		FileInputStream fis = new FileInputStream(file); 
		byte[] bytes = new byte[1000]; 
		int readByteCount = -1; 
		while((readByteCount = fis.read(bytes)) != -1 ) { 
			os.write(bytes, 0, readByteCount);
		}
		
		os.flush();
		System.out.println("[파일 보내기 완료]");
		
		fis.close();
		os.close();
		socket.close();
		
	}
}
