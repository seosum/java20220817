package ch04.lecture.p04enum;
import java.util.Calendar;

public class EnumWeekExample {
	public static void main(String[] args) {
		Week today = null; // 열거 타입 변수 선언
	
		Calendar cal = Calendar.getInstance();
		// 일(1) ~ 토(7) 까지의 숫자를 리턴
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.TUESDAY; break;
		case 3:
			today = Week.WEDNESDAY; break;
		case 4:
			today = Week.THURSDAY; break;
		case 5:
			today = Week.FRIDAY; break;
		case 6:
			today = Week.SATURDAY; break;
		}
		
		
		System.out.println("오늘 요일: " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부합니다.");
		}
	}
}
