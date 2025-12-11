// Map - HashMap
// - 키와 값(데이터)로 구성된 엔트리 객체 저장, 순서없음
//   - 키는 중복 저장 불가, 데이터는 중복 저장 가능
// - 데이터 검색에 효율적
// - 배열과 해쉬 함수 이용하여 Map의 특징을 구현한 자료구조
// - 비동기화 메소드로 구성, 싱글 쓰레드 환경에 효율적
// - 사용자 정의 객체 동등 비교 위해 hashcode() 및 equals() 재정의 필요

package ch08_Collection프레임워크.ex03_Map.ex01_HashMap;

import java.util.*;
import ch08_Collection프레임워크.common.Student;

public class Test {

	public static void main(String[] args) {
		// 객체 추가(Create)
		// - put(K key, V value):V
		// - putAll(Map m):void
		// - putIfAbsent(K key, V value):V
		
//		Map<Integer, Student> map = new HashMap<>();
//		System.out.println(map);
////		System.out.println(map.put(2, "lee")); //널 값이 찍힘
//		map.put(2, new Student(111,"lee"));
//		map.put(3, new Student(222, "koo"));
//		map.put(4, new Student(333, "sung"));
//		System.out.println(map);
		
		// - Map<Integer, Sting> 경우
//		Map<Integer, String> map = new HashMap<>(); 
//		map.put(2, "나나나"); map.put(1, "가가가"); map.put(3, "다다다");
//		System.out.println(map);	
//		
//		System.out.println(map.put(3, "DaDaDa")); // 키 중복 불가
//		System.out.println(map);
//		map.put(5, "가가가"); // 값 중복 가능
//		System.out.println(map);
		
		// - Map<String, Integer> 경우
//		Map<String, Integer> map = new HashMap<>(); 
//		map.put("나나나", 2); map.put("가가가", 1); map.put("다다다", 3);
//		System.out.println(map);
//		
//		System.out.println(map.put("DaDaDa", 3)); 
//		System.out.println(map);
//		map.put("가가가", 5);  // 키 중복 불가
//		System.out.println(map);
		
//		Map<Integer, String> map = new HashMap<>();
//		map.put(2, "lee");
//		map.put(1, "sung");
//		map.put(3, "koo");
//		System.out.println(map);
//		
//		map.replace(2, "kkkkk","leeee");
//		
//		System.out.println(map);
		
		
		
		
		// - Map<Integer, Student> 경우
//		Map<Integer, Student> map = new HashMap<>(); 
//		map.put(111, new Student(1, "성구")); 
//		System.out.println(map);
//		
//		System.out.println(map.put(222, new Student(2, "경미"))); 
//		System.out.println(map);
//		System.out.println(map.put(111, new Student(999, "지은"))); // 키 중복 불가
//		System.out.println(map);	
//		
//		System.out.println(map.putIfAbsent(111, new Student(3, "현우")));
//		System.out.println(map);
//		
//		Map<Integer, Student> add_map = new HashMap<>(); 
//		add_map.put(333, new Student(1, "성구")); 
//		add_map.put(444, new Student(1, "성구")); 
//		map.putAll(add_map);
//		System.out.println(map);

		// - Map<Student, Integer> 경우
//		Map<Student, Integer> map = new HashMap<>(); 
//		map.put(new Student(1, "성구"), 111); 
//		map.put(new Student(2, "경미"), 222); 
//		System.out.println(map);
//		
//		map.put(new Student(3, "지은"), 333);
//		System.out.println(map);
//		System.out.println(map.put(new Student(2, "성구"), 999)); // 키 중복 불가
//		System.out.println(map);	

		// 객체 수정(Update)
		// - replace(K key, V value):V
		// - replace(K key, V oldValue, V newValue):boolean		
		
		// - Map<Integer, Student> 경우
//		Map<Integer, Student> map = new HashMap<>();
//		map.put(1, new Student(111, "성구")); 
//		map.put(2, new Student(222, "경미")); 
//		map.put(3, new Student(333, "지은"));
//		System.out.println(map);
//		
//		System.out.println(map.replace(1, new Student(444, "길동")));
//		System.out.println(map);
//		System.out.println(map.replace(7, new Student(444, "한수")));
//		System.out.println(map.replace(3, new Student(333, "경미"), new Student(555, "현우")));
//		System.out.println(map);
		
		// - Map<Student, Integer> 경우
//		Map<Student, Integer> map = new HashMap<>(); 
//		map.put(new Student(1, "성구"), 111); 
//		map.put(new Student(2, "경미"), 222); 
//		System.out.println(map);
//		
//		System.out.println(map.replace(new Student(1, "짱구"), 777));
//		System.out.println(map);

		// 객체 제거(Remove)
		// - remove(Object key):value, clear():V
		// - remove(Object key, Object value):boolean
		// - clear():void
		
		// - Map<Integer, Student> 경우
//		Map<Integer, Student> map = new HashMap<>();
//		map.put(1, new Student(111, "성구")); 
//		map.put(2, new Student(222, "경미")); 
//		map.put(3, new Student(333, "지은"));
//		System.out.println(map);
//		
//		map.remove(2);
//		System.out.println(map);
//		System.out.println(map.remove(2, new Student(1, "성구")));
//		System.out.println(map);
//		map.clear();
//		System.out.println(map);
//		System.out.println(map.size());	
		
		// 객체 검색(Read) 
		// - get(Object key):V
		// - containsKey(Object key):boolean
		// - containsValue(Object value): boolean
		// - size():int, isEmpty():boolean
		
		
//		Map<Integer, String> map = new HashMap<>();
//		map.put(2, "lee");
//		map.put(1, "sung");
//		map.put(3, "koo");
//		System.out.println(map);
//		
//		String st = map.get(2);
//		System.out.println(st);
//		System.out.println(map.size());
		
		
		// - Map<Integer, String> 경우
//		Map<Integer, String> map = new HashMap<>();
//		map.put(2, "나나나"); map.put(1, "가가가"); map.put(3, "다다다");
//		System.out.println(map);
//
//		System.out.println(map.get(2));
//		System.out.println(map.containsKey(1));
//		System.out.println(map.containsValue("가가가"));
//		System.out.println(map.size());
//		System.out.println(map.isEmpty());
		
		// 기타 메소드
		// - keySet():Set<K>
		// - entrySet():Set<Map.Entry<K,V>>
		// - values():Collection<V>
		
		// - Map<Integer, Student> 경우
		Map<Integer, Student> map = new HashMap<>();
		map.put(1, new Student(111, "성구")); 
		map.put(2, new Student(222, "경미")); 
		map.put(3, new Student(333, "지은"));
		System.out.println(map);
		
		Set<Map.Entry<Integer, Student>> entry_set = map.entrySet();
		System.out.println(entry_set);
		
		for(Map.Entry<Integer, Student> entry : entry_set) {
			int key = entry.getKey();
			Student st = entry.getValue();
			String name = st.getName();
			
			System.out.println(key + name);
			
//			System.out.println(st);
		}
		
		
//		Map<Integer, String> map = new HashMap<>();
//		map.put(2, "lee");
//		map.put(1, "sung");
//		map.put(3, "koo");
//		System.out.println(map);
//		
//		Set<Integer> set = map.keySet();
//		System.out.println(set);
//		
//		for(Integer key : set) {
//			String value = map.get(key);
//			System.out.println(key + " " + value);
//		}
		
//		Map<Integer, String> map = new HashMap<>();
//		map.put(2, "lee");
//		map.put(1, "sung");
//		map.put(3, "koo");
//		System.out.println(map);
//		
//		Collection<String> col = map.values();
//		System.out.println(col);
//		
//		for(String val : col) {
//			System.out.println(val);
//		}
		
//		Map<Integer, String> map = new HashMap<>();
//		map.put(2, "lee");
//		map.put(1, "sung");
//		map.put(3, "koo");
//		System.out.println(map);
//		
//		Set<Map.Entry<Integer, String>> entry = map.entrySet();
//		System.out.println(entry);
//		
//		for(Map.Entry<Integer, String> ele : entry) {
//			System.out.println(ele);
//		}

		// - Map<Integer, String> 경우
//		Map<Integer, String> map = new HashMap<>();
//		map.put(2, "나나나"); map.put(1, "가가가"); map.put(3, "다다다");
//		System.out.println(map);
//		
//		Set<Integer> keySet = map.keySet();
//		System.out.println(keySet);
//		
//		Collection<String> values = map.values();
//		System.out.println(values);
//		
//		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
//		System.out.println(entrySet);
	
		// 모든 요소 접근: for-each
		// - keySet()에 의해 반환된 Set 컬렉션 이용
		// - entrySet()에 의해 반환된 Set 컬렉션 이용
		
		// - Map<Integer, Student> 경우: keySet() 이용
//		Map<Integer, Student> map = new HashMap<>();
//		map.put(1, new Student(111, "성구")); 
//		map.put(2, new Student(222, "경미")); 
//		map.put(3, new Student(333, "지은"));
//		System.out.println(map);
//		
//		Set<Integer> keySet = map.keySet();
//		
//		for (Integer key : keySet) { 
//			Student val = map.get(key);
//			String name = val.getName();
//			int id = val.getId();
//			System.out.println("ID " + id + "번 학생 이름은 " 
//								+ name + " 입니다.");
//		}

		// - Map<Integer, Student> 경우: entrySet() 이용
//		Map<Integer, Student> map = new HashMap<>();
//		map.put(1, new Student(111, "성구")); 
//		map.put(2, new Student(222, "경미")); 
//		map.put(3, new Student(333, "지은"));
//		System.out.println(map);
//		
//		Set<Map.Entry<Integer, Student>> entrySet = map.entrySet();
//		
//		for (Map.Entry<Integer, Student> entry : entrySet) { 
//			Integer key = entry.getKey();
//			Student val = entry.getValue();
//			System.out.println("Key=" + key + ", Value=" + val);
//		}
	}
}
