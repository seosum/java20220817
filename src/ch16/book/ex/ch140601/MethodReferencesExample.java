package ch16.book.ex.ch140601;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {
	public static void main(String[] args) {
		IntBinaryOperator operator;
		
		// 정적메소드 참조
		// 파라미터 2개 받아와서 그대로 같은 파라미터를 쓰는 일 
		operator = (x,y) -> Calculator.staticMethod(x,y);
		System.out.println("결과1: " + operator.applyAsInt(1, 2));
		
		operator = Calculator :: staticMethod;
		System.out.println("결과2: " + operator.applyAsInt(3, 4));
		
		// 인스턴스 메소드 참조
		// 파라미터 순서가 같은데 인스턴스 메소드들은 메소드 참조할때, 객체명 써주면 됨 
		Calculator obj = new Calculator();
		operator = (x, y) -> obj.instanceMethod(x, y);
		System.out.println("결과3: " + operator.applyAsInt(5,6));
		
		operator = obj :: instanceMethod;
		System.out.println("결과4: " + operator.applyAsInt(7,8));
		
	}
}
