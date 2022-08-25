package ch05.lecture.p02reference;

import java.util.Arrays;

public class C10Reference {
	public static void main(String[] args) {
	int a = 3;
	int b = 3;

	System.out.println(); // true
	
	int[] c = new int[] {3,4,5};
	int[] d = new int[] {3,4,5};
	
	System.out.println(c == d); // false
	// 같은값을 비교할때 참조값을 가지게 된다. 
	// content 비교 = > true
	System.out.println(Arrays.equals(c, d)); // true
	// 내용물 비교할때는 메소드를 사용해야한다.
	// 그 메소드가 equals냐 ? 그건 또 아님 
	// 결론은 내용물비교할떄 == 사용하면 안됨
	
	
	
	int[] e = c;
	
	e[0] = 33;
	System.out.println(c[0]);

	System.out.println(e == c); // true
	System.out.println(Arrays.equals(c, d));

	}
}
