package ch10.ex.p7;

public class WrongPasswordException extends Exception{
	public WrongPasswordException() {}
	public WrongPasswordException(String message) {
		// μμ±μμΉ
		super(message);
	}

}
