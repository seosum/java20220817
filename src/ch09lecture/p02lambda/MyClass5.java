package ch09lecture.p02lambda;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;

import ch08.book.s080701.MyInterface;

public class MyClass5 {
	public static void main(String[] args) {
		IntConsumer o1 = v -> System.out.println(v * v);
		
		o1.accept(3); // 9 제곱한 수가 출력이 됨
 		o1.accept(4); // 16
 		o1.accept(10); // 100
	
 		DoubleConsumer o2 = d -> System.out.println( d/ 2);
 		
 		o2.accept(5); // 2.5
 		o2.accept(10); // 5.0
 		o2.accept(7); // 3.5
	}
}
