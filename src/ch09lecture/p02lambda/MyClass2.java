package ch09lecture.p02lambda;

import ch08.lecture.p01interface.MyInterface2;

public class MyClass2 {
	public static void main(String[] args) {
		MyInterface2 o1 = () -> {
			System.out.println("코드작성!!");
		
			o1.method1();
			}
		}
	
	interface MyInterface2 {
		void method();
	}
}
