package ch18.lecture.p6filter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class C09PrintStream {
	public static void main(String[] args) {
		String name = "C:\\Users\\user\\Desktop\\output\\output14.txt";

		try (
				FileOutputStream fis = new FileOutputStream(name);
				PrintStream ps = new PrintStream(fis);) {
			
			ps.write(97); // a출력
			ps.print(97); // b출력
			
			ps.println(3.14);
			ps.println('가');
			ps.println(true);

			System.out.println("hello world");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}