// 한글 
package ch18.lecture.p6filter;

import java.io.FileInputStream;
import java.io.Reader;
import java.io.InputStreamReader;


public class C01InputStreamReader {
	public static void main(String[] args) throws Exception{
		String name = "src/ch18/lecture/p6filter/C01InputStreamReader.java";
		
		FileInputStream fis = getFileInputStream(name);
	
		
		Reader rd = new InputStreamReader(fis);

		// 원래는 fis.read로 읽어주는건데 rd로 읽을 수 있음 
//		int c1 = fis.read();
//		int c2 = fis.read();
//		int c3 = fis.read();
		
		int c1 = rd.read();
		int c2 = rd.read();
		int c3 = rd.read();

		// 결론 : 다른스트림을 다른스트림으로 감쌀 수 있다. 
		
		System.out.println((char) c1);
		System.out.println((char) c2);
		System.out.println((char) c3);
		
		fis.close(); 
		}
	
	private static FileInputStream getFileInputStream(String fileName) throws Exception{
		
		return new FileInputStream(fileName);
		
	}
}
