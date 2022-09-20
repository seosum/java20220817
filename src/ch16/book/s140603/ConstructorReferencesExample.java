package ch16.book.s140603;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {
	public static void main(String[] args) { // 생성자 참조
		Function<String, Member> function1 = Member :: new;
		Member member1 = function1.apply("angel"); 
						// ▲ 매개값 1개 
		BiFunction<String, String, Member> function2 = Member :: new;
		Member member2 = function2.apply("신천사", "angel");
						// ▲ 매개값 2개 
	}
}
