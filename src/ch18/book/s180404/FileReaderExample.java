package ch18.book.s180404;

import java.io.FileReader;

public class FileReaderExample {
	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("src/ch18/lecture/p4reader/C03Reader.java";
				);
		
		
		int readCharNo;
		char[ ] cbuf = new char[100]; // 읽은 문자열을 저장할 배열
		// read메소드를 시작했을때, charbuffer를 넣어주어서 리턴하면
		// 마지막인게아니면 배열에있는값으로 string생성
		// 마지막data값을 읽을때까지 반본
		// 결론 = 파일이름이 콘솔에 찍힌다 !@
		while ((readCharNo=fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		fr.close();
	}
}
