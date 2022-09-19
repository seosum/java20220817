package ch16.lecture.p02stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class C08Mapping {
	public static void main(String[] args) {
		// IntStream (primitive type stream) -> Stream<Integer>
		// 원소가 참조타입 stream으로 변환해야 할 경우
		
		IntStream.of(3, 5, 9, 1, 0)
			.boxed()
			.sorted((a,b) -> b - a)
			.forEach((e) -> System.out.println(e));
		
		//
		// String res = IntStream.of(3, 5, 9, 1, 0)
		
		
		// 코드 작성
		Arrays.stream(new int[] {3, 5, 9, 1, 0 })
		.boxed()
		.sorted(Comparator.reverseOrder())
		.mapToInt(value -> value.intValue())
	    .forEach(value -> System.out.println(value));

		//
		//System.out.println(res); // "9, 5, 3, 1, 0"
	}
}
