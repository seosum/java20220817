package ch16.lecture.p02stream;

import java.util.stream.IntStream;

public class C16MethodReference {
	public static void main(String[] args) {
		int max = IntStream.of(3, 9, 1, 0, 10)
			.boxed()
			// 아래와 같이 compare 메소드를 사용해도 무관 
			// .max((x,y) -> x.compareTo(y)) 
			.max(Integer::compareTo)
			.get();
	
		System.out.println(max);
		

		// Integer에 compare라는 static메소드도 있는데, 
		int max2 = InteStream.of(3,9,10,1,0)
			.boxed()
			//여기선 파라미터를 그대로 갖다 붙이는 형식인데
			//.max((a,b) -> Integer.compare(a,b))
			// 밑의 형식은 순서를 알아서 정리해준다.
			.max(Integer::compare)
			.get();
		System.out.println(max2);
	}
}