package ch02.lecture;

public class FloatDoubleExample {
	public static void main(String[] args) {
		//실수값 저장
		double var1 = 3.14;
		//float var2 = 3.14; -> 컴파일에러
		float var3 = 3.14f;
		
		//정밀도 테스트
		double var4 = 0.123454479817947941;
		float var5 = 0.123978943988729807F;
		
		System.out.println("var1: " + var1);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
		//e 사용하기
		int var6 = 3000000;
		double var7 = 3e6; // 3 * 10의 6승
		float var8 = 3e6F; // 위와 동일
		double var9 = 2e-3; // 2 * 10의 -3승
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
		System.out.println("var9: " + var9);
	}
}
