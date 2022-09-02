package ch09lecture.p01nestedClass;

public class MyClass4 {
	public static void main(String[] args) {
		// lamda expression (14장)
		// 클래스구현, 메소드 시그니처 생략 가능
		// 추상메소드가 하나인 경우만 사용 가능 
			MyInterface3 l = new MyInterface3() {
				@Override
				public void method() {
					System.out.println("재정의한 메소드!!!");
			}
		};
		
		l.method();
	}
}

interface MyInterface4 {
	void method();
	default void method3() {
		
	}
}