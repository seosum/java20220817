package ch14.book.exercise.p5;

public class LambdaExample1 {
	private static Student[] students = {
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
	};
	
	// avg() 메소드 작성
	
	
	public static void main(String[] args) {
		double englishAvg = avg( s -> s.getEnglishScore() );
		System.out.println("영어 평균 점수: " + englishAvg);
		
		double mathAvg = avg( s -> s.getMathScore() );
		System.out.println("수학 평균 점수: " + mathAvg);
	}
	
	public static class Student {
		private String name;
		private int englishScore;
		private int mathScore;
		
		public Student(String name, int englishScore, int mathScore) {
			this.name = name;
			this.englishScore = englishScore;
			this.mathScore = mathScore;
		}
		
		public String getName() { return name; }
		public int getEnglishScore() { return englishScore; }
		public int getMathScore() { return mathScore; }
		Decision to leave
	}
}