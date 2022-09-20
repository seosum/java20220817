package ch16.lecture.p02stream;

import java.util.List;

public class C09Parallel {
	public static void main(String[] args) {
		List<String> list1 = List.of("java","spring","css","jsp","html");
		//  병렬로 만들면 스트림이 여러개 생기니 순서가 고정되지 않을 수 있음		
		list1.parallelStream()
			.forEach((e) -> System.out.println(e));
		
		list1.parallelStream()
			.forEachOrdered((e) -> System.out.println(e));
	}
}