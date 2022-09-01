package ch07.book.s070706;

public class InstanceofExample { // 객체 타입 변환 
	public static void method1(Parent parent) { // 인자값 넘겨받음
		if(parent instanceof Child) { /*객체타입확인 -- instanceof가 
		parent의 주소값을 찾아가면 child객체가 있니?라고 물어보는것 */
			Child child = (Child) parent; /*parent에 있던 주소값을 child로 주니까
			child객체의 주소값을 child 참조 변수에 저장된다 
			= Child 타입으로 변환 성공 */
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child(); /* parent객체를 생성해 그 주소값을 
		parentA에 넣으려고 했으나, Child 객체 생성해서 그 주소값을 
		parent A에 넣은 것임. */
		method1(parentA); // parentA -> child객체와 주소값을 인자값으로 넘겨줌
		method2(parentA);
	
		Parent parentB = new Parent(); /* Parent객체를 생성하여 parentB에 주고
		값을 저장하고 싶어 실제로 Parent 객체를 생성해 참조변수 parentB에
		힙 영역에 생성된 메모리의 주소값을 저장 */
		method1(parentB); /* 인자값 넘겨줌,
		 parentB에는 Child객체의 주소값이 아니라 parent 객체의
		 주소값이 들어가 있으니까 오류처리 된것이다.*/
		method2(parentB); // 예외발생 --> 오류처리 안되는 메소드 
	}
	
}
