package ch16.lecture.p02stream;
// 생성자 참조

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C18ConstructorReference {
	// treeset을 만들어서 아이템을 collect하는일 
	// 람다가 하는일이 객체생성하는 일밖에 없다면,  ::new 키워드만 사용해도 됨
	
	Set<String> set2 = Stream.of("java","css","spring","html", "jsp", "html")
			.collect(Collectors.toSet());
	
	System.out.println(set2);
}
