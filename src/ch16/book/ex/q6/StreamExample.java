package ch16.book.ex.q6;

import java.util.Arrays;
import java.util.List;

import ch15.book.s150301.Member;

public class StreamExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
			new Member("홍길동", 30),
			new Member("신용권", 40),
			new Member("감자바", 26)
		);
		
		double avg = list.stream()
				.mapToInt(member -> member.getAge())
				.average()
				.getAsDouble();
		System.out.println("평균 나이: " + avg);
	}
	
	
	static class Member {
		private String name;
		private int age;
		
		public Member(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		public static getName() { return name; }
		public int getAge() { return age; }
	}
}
