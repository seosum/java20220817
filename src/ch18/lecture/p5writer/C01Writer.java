package ch18.lecture.p5writer;


import java.io.FileWriter;
import java.io.Writer;

public class C01Writer {
	public static void main(String[] args) throws Exception{
		// Writer : 문자단위로 출력하는 스트림
		// 주요 : write 
		
		// 바탕화면에 있는 폴더 
		String fileName = "C:\\Users\\user\\Desktop\\output\\output5.txt";
		// filename을 받는 생성자
		Writer wr = new FileWriter(fileName);
		
		// write(int) : 문자 하나 출력하는 메소드
		wr.write('a');
		wr.write('b');
		wr.write('한');
		wr.write(9742);
		
		wr.close();
	}
}
