package ch07.book.s070703;

import ch06.book.s061204.hankook.Tire;

public class Car {
	// 필드
	Tire[] tires = {
		new tire("앞왼쪽", 6);
		new tire("앞오른쪽", 2);
		new tire("뒤왼쪽", 3);
		new tire("뒤오른쪽", 4);
	};
	
	// 메소드
	int run() {
		System.out.println("자동차가 달립니다.");
		
		for(int i=0; i<tires.length; i++) {
			if(tires[i].roll()==false) {
				stop();
				return (i+1);
			}
		}
		return 0;
	}
	
	void stop() {
	}
}
