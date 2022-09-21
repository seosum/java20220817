package ch18.lecture.p3exception;

import java.io.OutputStream;

public class C02Exception {
public static void main(String[] args){
	Output
		String name = "C:\\Users\\user\\Desktop\\output\\output5.txt";
		OutputStream os = new FileOutputStream(name);

		os.write(99); // 만약 exception 발생시 close코드까지 실행되지 못함
		os.write(88);

	}catch(

	Exception e)
	{
		e.printStackTrace();
	}finally
	{
		
		os.close에서 null pointexception이 날수도 있으니 
		os != null 을 작성해줘야함 
		
	꼭 실행해야 하는 코드는 finally 블럭에 작성
	os.close(); // close도 checkexception으로 발생할수있어서 try~catch문으로 잡아줘야함

	// 안전하지 않은 방식 
	}
}
