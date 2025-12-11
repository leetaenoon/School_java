// List, Set, Map 정적 메소드 (불변 구조)
// - of( ) 메소드
//   - List.of(E e1, E e2, ...): List<E> 
//   - Set.of(E e1, E e2, ...): Set<E> 
//   - Map.of(K k1, V v1, K k2, V v2, ...): Map<K, V> 
// - copyOf( ) 메소드
//   - List.copyOf(Collection c): List<E>	
//   - Set.copyOf(Collection c): Set<E>	
//   - Map.copyOf(Map map): Map<K, V> 
// Arrays 유틸리티 클래스의 정적 메소드 
// - sort(Object[] a): void
// - asList(T... a): List<T> (고정길이 구조)
// - toString(Object[] a): String
// Collections 유틸리티 클래스의 정적 메소드
// - sort(List list): void
// - reverse(List list): void
// - shuffle(List list): void
// - max(Collection c): T
// - min(Collection c): T
// - frequency(Collection c, Object o): int

package ch08_Collection프레임워크.ex05_정적메소드;

import java.util.*;
import ch08_Collection프레임워크.common.Student;

public class Test {

	public static void main(String[] args) {	
		// List, Set, Map 정적 메소드 (불변 구조) - 이건 패스
		// - of(E e1, E e2, ...): List<E>
		// - of(E e1, E e2, ...): Set<E> 
		// - of(K k1, V v1, K k2, V v2, ...): Map<K, V>
		// - copyOf(Collection c): List<E>
		// - copyOf(Collection c): Set<E>
		// - copyOf(Map map): Map<K, V>
	
		// - List<String> 경우
//		List<String> a = List.of("B", "A", "C");        // 불변 리스트
//		List<String> b = new ArrayList<>(a);            // 가변 복사본
//		List<String> c = List.copyOf(b);                // 불변 복사본
//		a.add("kkk"); //오류
//		b.add("kkk");
//		System.out.println(a);
//		System.out.println(b);
//		c.add("kkk"); // 오류
		
		// - Set<String> 경우
//		Set<String> a = Set.of("A", "B", "C");           // 불변 셋
//		Set<String> b = new HashSet<>(a);                // 가변 복사본
//		Set<String> c = Set.copyOf(b);                   // 불변 복사본
//		a.add("kkk"); //오류
//		b.add("kkk");
//		System.out.println(a);
//		System.out.println(b);
//		c.add("kkk"); // 오류
		
		// - Map<Integer, String> 경우
//		Map<Integer, String> a = Map.of(2, "lee", 5, "koo", 3, "sung"); // 불변 맵
//		Map<Integer, String> b = new HashMap<>(a);        // 가변 복사본
//		Map<Integer, String> c = Map.copyOf(b);           // 불변 복사본
//		a.put(4, "kkk"); // 오류
//		b.put(4, "kkk");
//		System.out.println(a);
//		System.out.println(b);	
//		c.put(4, "kkk"); // 오류	
		
		// Arrays 정적 메소드
		// - sort(Object[] a): void
		// - asList(T... a): List<T> (고정길이 구조)
		// - toString(Object[] a): String
		
//		String[] a = {"lee", "koo", "sung"};              // 고정 길이
//		List<String> b = Arrays.asList(a);                // 고정 길이
//		List<String> c = new ArrayList<>(b);              // 가변 복사본
//
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
//		
//		a[3] = "kkk"; // 오류: 고정길이
//		
//		b.add("kkk"); // 오류: 고정길이
//		
//		c.add("kkk");
//		System.out.println(c);
		
		// Collections 정적 메소드 - 이거 수업함
		// - sort(List list): void
		// - reverse(List list): void
		// - shuffle(List list): void
		// - max(Collection c): T
		// - min(Collection c): T
		// - frequency(Collection c, Object o): int
		
		
		List<String> list = new ArrayList<>();
		list.add("sung");
		list.add("aaaaaa");
		list.add("kkkkkk");
		list.add("hhhhhh");
		Collections.sort(list);
		
		System.out.println(list);
		
		String max = Collections.max(list);
		System.out.println(max);
		
		
		
//		List<String> a = List.of("성구", "현우", "지은");       // 불변 리스트
//		List<String> b = new ArrayList<>(a);               // 가변 복사본
//		List<String> c = List.copyOf(b);                   // 불변 복사본
//		
//		Collections.sort(b);
//		System.out.println(b);
//		
//		Collections.reverse(b);
//		System.out.println(b);
//		
//		Collections.shuffle(b);
//		System.out.println(b);
//		
//		String max = Collections.max(b);
//		String min = Collections.min(b);
//		System.out.println(max);
//		System.out.println(min);
//		
//		int num = Collections.frequency(b, "성구");
//		System.out.println(num);
	}
}
