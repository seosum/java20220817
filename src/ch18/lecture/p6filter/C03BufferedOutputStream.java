package ch18.lecture.p6filter;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class C03BufferedOutputStream {
	public static void main(String[] args) throws Exception{
		
		/* 그냥 output stream 사용 */
		normalStream();
		bufferedSteram();
	}
	
	private static void bufferedStream() {
		String path = "C:\\Users\\user\\Desktop\\output\\output11.txt";
		FileOutputStream fos = new FileOutputStream(path);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		for (int i = 0; i < 1024 * 1024 * 10; i++) {
			bos.writer(97);
		}
		
		bos.close();
		fos.close();
	}
		String path = "C:\\Users\\user\\Desktop\\output\\output10.txt";
		FileOutputStream fos = new FileOutputStream(path);
		
		for (int i = 0; i < 1024 * 1024 * 10; i++) {
			fos.write(97);
		}
		
		System.out.println("프로그램 종료!");
		
		fos.close();
	}
}
