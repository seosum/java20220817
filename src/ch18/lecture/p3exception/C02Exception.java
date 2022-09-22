package ch18.lecture.p3exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class C02Exception {
public static void main(String[] args){
	OutputStream os = null;
	InputStream is = null;
	try {
		String name = "C:\\Users\\user\\Desktop\\output\\output5.txt";
		os = new FileOutputStream(name);
		is = new FileInputStream("");

		os.write(99); // 만약 exception 발생시 close코드까지 실행되지 못함
		os.write(88);

	}catch (Exception e) {
		e.printStackTrace();
	}finally { 
	// 꼭 실행해야 하는 코드는 finally 블럭에 작성
	// os.close에서 null pointexception이 날수도 있으니 
	//	os != null 을 작성해줘야함 
		try {
			if (os != null) {
				os.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			if (is != null) {	
				is.close(); 
			}
	// close도 checkexception으로 발생할수있어서 try~catch문으로 잡아줘야함

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
}