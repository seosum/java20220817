package ch18.lecture.p6filter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class C07Filter {
	public static void main(String[] args) throws Exception {
		File src = new File("src/ch18/lecture/p6filter/C07Filter.java");
		File dec = new File("C:\\Users\\user\\Desktop\\output\\output13.txt");
		
		FileReader fr = new FileReader(src);
		FileWriter fw = new FileWriter(dec);
		
//		 잘읽은다음 fileoutputstream , outputstreamwriter , bufferedwriter를 사용해서
//		 읽은걸 13번째 파일에 복사하는 코드 만들어보기
		char[] buf = new char[100];
		int len = 0;
		
		while ((len = fr.read(buf)) != -1) {
			fw.write(buf, 0, len);
		}
		
		System.out.println("복사 완료");
		
		fr.close();
		fw.close();
	}
}