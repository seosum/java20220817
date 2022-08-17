package ch02.lecture;

public class C01variable {
	public static void main(String[] args) {
		// 변수 : 값을 저장하는 공간의 이름
		// 타입명 변수명;
		int a; // a라는 int 타입 변수 선언
		a = 3; // a 변수에 3대입(할당)
		
		int b = 3; // b라는 int 타입 변수 선언 및 값 할당
		
		// 변수명 작성 규칙
		// 사용할 수 있는 문자 : 영문 대소문자, 숫자, $, _(9부턴 안됨)
		// 숫자로 시작하면 안됨,
		// 키워드 사용하면 안됨 
		// 같은 이름의 변수명 재선언 안됨
		int b;
		
		int c;; // o
		int $;
		int _;
		int A;
		int C; // ▲ 위에까진 다 됨.
		int 3; // x
		int a3; // o
		
		// 변수명 작성 관습: lowerCamelCase
		int studentNumber;
		int yourCar;
		int MyCar; // x
		int our_home; // x
		
		
		
	}
}
