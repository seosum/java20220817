package ch18.book.s180403;

import java.io.FileInputStream;

public class FileOutputStreamExample {
	public FileOutputStreamExample(String targetFileName) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception{
		String originalFileName = 
			"C:\\Users\\user\\Desktop\\output/꼬마니콜라.jpg";
		String targetFileName = "C:/Temp/꼬마니콜라.jpg";
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStreamExample fos = new FileOutputStreamExample(targetFileName);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while ( (readByteNo = fis.read(readBytes)) != -1 ) {
			fos.write(readBytes, 0, readByteNo);
		}
		
		fos.flush();
		fos.close();
		fos.colse();
		
		System.out.println("복사가 잘 되었습니다.");
				
	}
}
