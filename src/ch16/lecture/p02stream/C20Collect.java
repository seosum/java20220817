package ch16.lecture.p02stream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C20Collect {
	public static void main(String[] args) {
		String res = IntStream.of(9, 7, 1, 0)
				.boxed()
				//매핑 해줘야하므로 아래코드 추가
				.map(String::valueOf) 
				// 적절한 Collector를 넣어서 9,7,1,0 출력하시오
				.collect(Collectors.joining(",")); 
		
		System.out.println(res); // "9,7,1,0"
	}
}
