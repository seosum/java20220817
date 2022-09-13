package ch13.book.s1302;

public class BoxExample {
 public static void main(String[] args) {
	Box box = new box();
	// box에 set메소드로 넣고싶었다.
	box.set("홍길동"); 
	String name = (String) box.get();
	
	box.set(new Apple());
	Apple apple = (Apple) box.get();
 }
}
