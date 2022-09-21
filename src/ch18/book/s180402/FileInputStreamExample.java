package ch18.book.s180402;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream {

			String path = "src/ch18/lecture/p1inputStream/C04InputStream.java";
			 
			int data;
			
			while ( (data = fis.read() ) != -1 ) {
				System.out.write(data);
			}
			
			fis.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
	r*yu-jin r*boolssom r*j r*daon  eunjeong 