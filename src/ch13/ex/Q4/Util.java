package ch13.ex.Q4;

public class Util {
	public static <K,V> V getValue(Pair<K,V> p, K k) {
		if (p.getkey() == k) {
			return p.getValue();
		} else {
			return null;
		}
	}
}
