package ch15.lecture.p03map;

import java.util.HashMap;
import java.util.Map;

public class C04Equals {
	public static void main(String[] args) {
		// key는 equals 메소드 활용해서 같은 지 다른 지 확인
		Map<Book, Integer> map = new HashMap<>();
		map.put(new Book("java"), 30000);
		map.put(new Book("spring"), 50000);
		map.put(new Book("html"), 70000);
		map.put(new Book("java"), 80000);
		map.forEach((k,v) -> System.out.println(k + ":" + v));
		
	}
}

class Book {
	private String title;
	
	public Book(String title) {
		super();
		this.title = title;
	}
	
	@Override
	public String toString() {
		return title;
	}
}