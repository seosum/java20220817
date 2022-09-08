package ch06.book.s061504;
class Solution {
    public void reverseString(char[] s) {
        reverseString(s, 0);
    }
    
    public void reverseString(char[] s, int idx) {
    	if(idx < s.length / 2) {
            char temp1 = s[idx];
            s[idx] = s[(s.length - 1) - idx];
            s[(s.length - 1) - idx] = temp1;
            reverseString(s, idx + 1);
    	}
    }
}
public class Service {
	@PrintAnnotation
	public void method1() {
		System.out.println("실행 내용1");
	}
	
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("실행 내용2");
	}
	
	@PrintAnnotation(value="#", number=20)
	public void method3() {
		System.out.println("실행 내용3");
	}
}
