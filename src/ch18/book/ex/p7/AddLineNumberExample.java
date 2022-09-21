package ch18.book.ex.p7;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception{
	// 정확한 경로를 수정하세요
		String name =
		"C:/JavaProgramming/source/chap18/src/sec05/exam04_bufferedreader/BufferedReaderExample.java";
		FileReader fr = new FileReader(name);
		BufferedReader br = new BufferedReader(fr);
		
		String line = null;
		
		int num = 1;
		while((line = br.readLine()) !=null) {
			System.out.println(num + ":" + line);
			num++;
		}
		
		br.close();
		fr.close();
	}
}
