package ch15.book.s150401;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		// 저장된 총 Entry 수 얻기
		System.out.println("총 Entry 수: " + map.size());
		
		// 객체 찾기 - 이름(키)으로 점수(값)을 검색
		System.out.println("\t홍길동 : " + map.get("홍길동"));
		System.out.println();
		
		// 객체를 하나씩 처리
		Set<String> KeySet = map.keySet(); // keyset 얻기
		Iterator<String> keyIterator = KeySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Iterator value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
	
		// 객체 삭제
		// 키로 MapEntry를 제거
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " + map.size());
		
		// 객체를 하나씩 제거
		// MapEntry Set 얻기
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while
		
		
	}
}
