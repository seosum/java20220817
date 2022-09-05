package ch10.ex.p7;

public class WrongPasswordException extends Exception{
	public WrongPasswordException() {}
	public WrongPasswordException(String message) {
		// 작성위치
		super(message);
	}

}
