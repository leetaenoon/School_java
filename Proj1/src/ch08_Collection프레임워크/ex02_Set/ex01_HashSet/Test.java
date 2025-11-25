// Set - HashSet
// - 순서 없음(인덱스 정보 없음), 중복 저장 불가
// - HashMap을 이용하여 Set의 특징을 구현한 자료구조
// - 입력 순서와 관계 없이 출력
// - 사용자 정의 객체 동등 비교 위해 hashcode() 및 equals() 재정의 필요
// - Hash 자료구조의 동일 객체 확인 방법
//   - hashcode() 값이 동일한지 확인 -> equals() 결과가 true인지 확인

package ch08_Collection프레임워크.ex02_Set.ex01_HashSet;

import java.util.*;
import ch08_Collection프레임워크.common.Student;

public class Test {
	
	public static void main(String[] args) {
		// 객체 추가(Create)
		// - add(E element):boolean
		// - add(int index, E element):void // Set에서 인덱스 사용 불가   
		// - addAll(Collection c):boolean
		// - addAll(int index, Collection c):boolean  // Set에서 인덱스 사용 불가   

//		Set<Student> set = new HashSet<>();
//		set.add(new Student(1, "성구"));
//		set.add(new Student(2, "경미"));
//		set.add(new Student(3, "성구")); 
//		System.out.println(set);
//		
//		List<Student> add_list = new ArrayList<>();
//		add_list.add(new Student(4, "lee"));
//		add_list.add(new Student(1, "kim"));
//		System.out.println(set.addAll(add_list));     
//		System.out.println(set);
//		//System.out.println(set.addAll(2, add_list)); // Set에서 인덱스 사용 불가
//		System.out.println(set);
		
		// 객체 수정(Update)
		// - Set에서 인덱스에 수정 메소드 없음
		// - 수정하기 위해 원소 제거후 새로운 원소 추가 필요

//		Set<Student> set = new HashSet<>();
//		set.add(new Student(1, "성구"));
//		set.add(new Student(2, "경미"));
//		set.add(new Student(1, "성구"));
//		set.add(new Student(3, "지은"));
//		System.out.println(set);
//		
//		//System.out.println(set.set(1, new Student("길동", 5))); // 오류 
//		System.out.println(set.remove(new Student(1, "성구")));
//		System.out.println(set.add(new Student(5, "길동")));
//		System.out.println(set);
		
		// 객체 제거(Remove)
		// - remove(int index):E // Set에서 인덱스 사용 불가
		// - remove(Object o):boolean
		// - removeAll(Collection c):boolean
		// - retainAll(Collection c):boolean
		// - clear():void

//		Set<Student> set = new HashSet<>();
//		set.add(new Student(1, "성구"));
//		set.add(new Student(2, "경미"));
//		set.add(new Student(1, "성구"));
//		set.add(new Student(3, "지은"));
//		System.out.println(set);
//		
//		//System.out.println(set.remove(1)); // 오류                    
//		System.out.println(set.remove(new Student(1, "성구")));                     
//		System.out.println(set);
//		System.out.println(set.remove(new Student(1, "성구"))); 
//		System.out.println(set);
		
//		Set<Student> set = new HashSet<>();
//		set.add(new Student(1, "성구"));
//		set.add(new Student(2, "경미"));
//		set.add(new Student(1, "성구"));
//		set.add(new Student(3, "지은"));
//		System.out.println(set);
//		
//		Set<Student> remove_set = new HashSet<>();
//		remove_set.add(new Student(2, "경미"));
//		remove_set.add(new Student(1, "성구"));
//		System.out.println(set.removeAll(remove_set)); 
//		System.out.println(set);
		
//		Set<Student> set = new HashSet<>();
//		set.add(new Student(1, "성구"));
//		set.add(new Student(2, "경미"));
//		set.add(new Student(1, "성구"));
//		set.add(new Student(3, "지은"));
//		System.out.println(set);
//		
//		Set<Student> retain_set = new HashSet<>();
//		retain_set.add(new Student(1, "성구"));
//		System.out.println(set.retainAll(retain_set));  
//		System.out.println(set);
//		set.clear();  
//		System.out.println(set);	
		
		// 객체 검색(Read)
		// - contains(Object o):boolean
		// - containsAll(Collection c):boolean
		// - get(int index):E // 없음
		// - indexOf(Object o):int // 없음
		// - lastIndexOf(Object o):int  // 없음
		// - isEmpty():boolean, size():int

//		Set<Student> set = new HashSet<>();
//		set.add(new Student(1, "성구"));
//		set.add(new Student(2, "경미"));
//		set.add(new Student(1, "성구"));
//		set.add(new Student(3, "지은"));
//		System.out.println(set);
//		
//		System.out.println(set.contains(new Student(1, "성구"))); 
//		System.out.println(set.isEmpty());
//		System.out.println(set.size());
//		//System.out.println(set.get(2)); // 오류
//		//System.out.println(set.indexOf(new Student("지은", 1))); // 오류
//		//System.out.println(set.lastIndexOf(new Student("성구", 1))); //오류
//		
//		Set<Student> contain_set = new HashSet<>();
//		contain_set.add(new Student(1, "성구"));
//		contain_set.add(new Student(2, "경미"));
//		System.out.println(set.containsAll(contain_set)); 
//		System.out.println(set);

		// 기타 메소드
		// - toArray():Object[]
		// - toArray(T[] a): T[]

//		Set<Student> set = new HashSet<>();
//		set.add(new Student(1, "성구")); 
//		set.add(new Student(2, "경미")); 
//		set.add(new Student(3, "지은")); 
//		System.out.println(set);
//		
//		Object[] objs = set.toArray();               
//		System.out.println(Arrays.toString(objs));
//		System.out.println(objs[1]);
//		
//		Student[] stu1 = set.toArray(new Student[6]); 
//		System.out.println(Arrays.toString(stu1));	
//		Student[] stu2 = set.toArray(new Student[2]); 
//		System.out.println(Arrays.toString(stu2));	
//		Student[] stu3 = set.toArray(new Student[0]); 
//		System.out.println(Arrays.toString(stu3));
		
		// 모든 요소 접근: for(불가), for-each, iterator():Iterator<E>
		// - 반복자(iterator): 컬렉션에 저장된 요소를 읽어오는 표준화된 방법

//		HashSet<Student> set = new HashSet<>();
//		set.add(new Student(1, "성구"));
//		set.add(new Student(2, "경미"));
//		set.add(new Student(1, "만구"));
//		set.add(new Student(3, "지은"));
//		System.out.println(set);
//		
//		//for (int i = 0; i < set.size(); i++) //for 사용 불가
//		//	System.out.print(set.get(i) + " ");
//		//System.out.println();
//		
//		for(Student ele : set)
//			System.out.print(ele + " ");
//		System.out.println();
//
//		Iterator<Student> iter = set.iterator();
//		while (iter.hasNext()) {
//			Student ele = iter.next();
//			System.out.print(ele + " ");
//		}
		
		// 모든 동일 원소 제거 3가지 방법
		// - remove(Object o):boolean 사용
		// - removeAll(Collection c):boolean 사용
		// - Iterator의 remove() 사용 : Set은 중복 허락하지 않으므로 불필요
		
		// - remove(Object o):boolean 사용
//		Set<Student> set = new HashSet<>();
//		set.add(new Student(1, "성구"));
//		set.add(new Student(2, "경미"));
//		set.add(new Student(1, "성구"));
//		set.add(new Student(3, "지은"));
//		System.out.println(set.size());
//		System.out.println(set);
//		
//		Student st = new Student(1, "성구");
//		System.out.println(set.remove(st)); // Set은 중복 허락하지 않으므로 반복문 불필요
//		System.out.println(set.size());
//		System.out.println(set);
		
		// - removeAll(Collection c):boolean 사용
//		Set<Student> set = new HashSet<>();
//		set.add(new Student(1, "성구"));
//		set.add(new Student(2, "경미"));
//		set.add(new Student(1, "성구"));
//		set.add(new Student(3, "지은"));
//		System.out.println(set.size());
//		System.out.println(set);
//		
//		Set<Student> remove_set = new HashSet<>();
//		remove_set.add(new Student(1, "성구"));
//		remove_set.add(new Student(2, "경미"));
//		System.out.println(set.removeAll(remove_set));
//		System.out.println(set.size());
//		System.out.println(set);

		// Object 객체 다루기
		// - instanceof 키워드 이용
		
		// - 배열에서 Object 객체 다루기
//		Object[] objs = new Object[4];
//		objs[0] = "lee";
//		objs[1] = new Student(1, "성구");
//		objs[2] = 35;
//		objs[3] = new Student(2, "경미");
//		System.out.println(Arrays.toString(objs));
//		
//		for(Object obj : objs) {
//			if(obj instanceof Student) { // - instanceOf 필요
//				Student st = (Student)obj;
//				System.out.println(st.getName());
//			}
//		}

		// - Set에서 Object 객체 다루기
//		Set set = new HashSet(); // = Set<Object> set = new HashSet<>();
//		set.add("lee");
//		set.add(new Student(1, "성구"));
//		set.add(35);
//		set.add(new Student(2, "경미"));
//		System.out.println(set);
//
//		for(Object ele : set) {
//			if(ele instanceof Student) { // - instanceOf 필요
//				Student st = (Student)ele;
//				System.out.println(st.getName());
//			}
//		}
	}
}


