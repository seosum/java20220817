package ch04.lecture.p04enum;

public class C01Enum {
	public static void main(String[] args) {
		Object o1 = new Object();
		MyEnum1 v1 = MyEnum1.CONSTANT_VALUE1;
		MyEnum1 v2 = MyEnum1.CONSTANT_VALUE2;
		
		Enum v3 = MyEnum1.CONSTANT_VALUE1;
		Object v4 = MyEnum1.CONSTANT_VALUE1;
		
		System.out.println(v1.name());
		System.out.println(v2.ordinal());
		System.out.println(v1.compareTo(v2));
		System.out.println(v2.compareTo(v1));
		
		
	}
}