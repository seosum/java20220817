package ch08.book.s080505;

public interface Vehicle {
	public void run();
}

class Bus implements Vehicle{
	void run() { ... };
	void checkFare() { ... };
}


Vehicle vehicle = new Bus();

vehicle.run();		       // 가능
vehicle.checkFare();	       // 불가능

Bus bus = (Bus) vehicle;	// 강제타입변환
bus.run();			// 가능
bus.checkFare();		// 가능