package ch10.lecture.p06message;

public class C01Message {
	public static void main(String[] args) {
		System.out.println("메인 코드 1");
		method1();
		
		System.out.println("메인 실행 이어감~");
	}
	
	private static void method1() {
		System.out.println("메소드1 코드");
		try {
			method2();
		// Exception 객체는 정보를 다 가지고 있음
		// 어떤 메세지가 있는지 - null
		// Exception이 발생한다면 어떤이유로 발생하였는지 남기기
		} catch (Exception e) {
			// 로그(메세지) 곡 남기기
			// syso로 남기든 객체를 사용하든 ~~
			//System.out.println("익셉션 발생함");
			//▼ 에러메세지를 다 출력해준다. 지우지말고 놔두기 !
			e.printStackTrace();
		}
		System.out.println("메소드 1 실행 이어감");
	}
	
	private static void method2() throws Exception {
		throw new Exception("어떤 이유로 발생했는지 ");
	}
}													