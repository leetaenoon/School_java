// Set - TreeSet
// - 순서 없음(인덱스 정보 없음), 중복 저장 불가
// - Set의 기본 기능에 정렬 및 검색 기능 추가
//   - 검색/정렬 기능 이용하기 위해 Set이 아닌 TreeSet으로 선언 필요
// - 균형 이진 검색 트리(binary search tree) 형태로 여러 노드가 서로 연결된 컬렉션 
// - 입력 순서와 관계 없이 크기 순으로 출력
// - 사용자 정의 객체 크기 비교 위해 Comparable/Comparator 인터페이스 구현 필요

package ch08_Collection프레임워크.ex02_Set.ex02_TreeSet;

import java.util.*;
import ch08_Collection프레임워크.common.Student;

public class Test {

	public static void main(String[] args) {
		Set<Student> set = new TreeSet<>();
		set.add(new Student(1, "성구"));
		set.add(new Student(2, "경미"));
		set.add(new Student(3, "성구")); 
		System.out.println(set);
		
		List<Student> add_list = new ArrayList<>();
		add_list.add(new Student(4, "lee"));
		add_list.add(new Student(1, "kim"));
		set.addAll(add_list);     
		//System.out.println(set.addAll(2, add_list)); // Set에서 인덱스 사용 불가	
		System.out.println(set);
		
		Student st1 = new Student(1, "성구");
		Student st2 = new Student(1, "한구");
		
		int i = st1.compareTo(st2);
		
		System.out.println(i);
		
		
	}
}
