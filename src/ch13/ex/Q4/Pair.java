package ch13.ex.Q4;

public class Pair<K, V> {
	private K key;
	private V value;
	
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getkey() { return key; }
	public V getValue() { return vaule; }
}
