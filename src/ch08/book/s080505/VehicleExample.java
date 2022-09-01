package ch08.book.s080505;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		// ▼vehicle 인터페이스엔 checkFare()가 없음 
		//vehicle.checkFare(); (x) 
		
		Bus bus = (Bus) vehicle; //강제타입 변환
		
		bus.run();
		// ▼BUs 클래스에는 checkFare()가 있음  
		bus.checkFare();
		
		
	}
}
