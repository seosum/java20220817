package ch18.lecture.p3exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class C03Exception {
	public static void main(String[] args) {
		// try - with - resources (Java 7부터 가능)
		// try - with - resources 와 사용 가능한 type은
		// AutoCloseable만 가능 
		
		// finally블럭에서 닫혀야하는 자원들을 try 괄호()안에 작성하면
		// finally블럭을 생략해도 사용할수 있도록 
		// 즉, 자동으로 닫아주는 코드가 생긴다.
		
		// 밑에 (), {}랑 섞여서 사용해서 불편하니까 
		// 자바 9부터 사용하는 코드도 있음. --> 버전에 따라 다르다 
		try (
			// 여기서 선언된 자원은 자동으로 닫아줌 
			OutputStream os = new FileOutputStream("");
			InputStream is = new FileInputStream("");
				) {
			// 읽고 쓰는 작업
			os.write(3);
			is.read();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
