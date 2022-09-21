package ch18.lecture.p2outputStream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class C010OutputStream {
	public static void main(String[] args) throws Exception {
		String name = "C:\\Users\\user\\Desktop\\output\\output1.txt";
		OutputStream os = new FileOutputStream(name);
	
		
		// write() : 한바이트 출력 메소드 
		os.write(0);
		i
		os.close();
	}
}
