package ch13.book.s1303;

public class Tv<T> {
	private T t;
	
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}
