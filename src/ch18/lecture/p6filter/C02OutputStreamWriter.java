package ch18.lecture.p6filter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class C02OutputStreamWriter {
	public static void main(String[] args) throws Exception{

		String name = "C:\\Users\\user\\Desktop\\output\\output9.txt";
		
		FileOutputStream fos = getFileOutPutStream(name);
		Writer wr = new OutputStreamWriter(fos);
		
		fos.write('a');
		fos.write('b');
		fos.write('가');
		fos.write('나');
		
		wr.close();
		fos.close();
	}

}
