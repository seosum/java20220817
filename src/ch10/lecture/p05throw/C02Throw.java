package ch10.lecture.p05throw;

public class C02Throw {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("예외 발생");
		}
	}
	
	private static void method1() throws Exception{
		System.out.println("코드1");
		
		// 의미상 여기서 발생시킨거니까 이 메소드에 발생시켜주는게 
		// 문맥상 정답
		throw new Exception(); 
	}
}
