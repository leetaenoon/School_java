// List - ArrayList
// - 순서유지(연속적/순차적 저장), 중복저장 가능
// - 배열을 이용하여 List의 특징을 구현한 자료구조
// - 배열과 같이 인덱스로 원소 관리
// - 비동기화 메소드로 구성, 싱글 쓰레드 환경에 효율적
// - contains(), remove(), indexOf() 메소드 위해 사용자 정의 객체에 대한 equals() 재정의 필요
//   - ArrayList 구조에서 hashCode(), compareTo() 재정의 불필요, 
//   - 그러나, 구조 사이의 유연한 변경을 위해 위 메소드 재정의 필요

package ch08_Collection프레임워크.ex01_List.ex01_ArrayList;

import java.util.*;
import ch08_Collection프레임워크.common.Student;

public class Test {

	public static void main(String[] args) {
		// 생성자
		// - ArrayList()
		// - ArrayList(Collection c)
		
		// 객체 추가(Create)
		// - add(E element):boolean
		// - add(int index, E element):void
		// - addAll(Collection c):boolean
		// - addAll(int index, Collection c):boolean  

		// - Integer 객체 추가
		Collection<Integer> list = new Vector<>();
		list.add(1); list.add(2); list.add(1); 
		System.out.println(list);
		
		System.out.println(list.add(3)); 
		System.out.println(list);
		list.add(777);                
		System.out.println(list);    
		
		// - String 객체 추가
//		List<String> list = new ArrayList<>();
//		list.add("lee"); list.add("sung"); list.add("lee"); 
//		System.out.println(list);
//		
//		System.out.println(list.add("koo")); 
//		System.out.println(list); 
//		list.add(2, "777");                  
//		System.out.println(list);
		
		// - Student 객체 추가		
//		List<Student> list = new ArrayList<>();
//		list.add(new Student(1, "성구"));
//		list.add(new Student(2, "경미"));
//		list.add(new Student(3, "길동")); 
//		System.out.println(list);
//		
//		List<Student> add_list = new ArrayList<>();
//		add_list.add(new Student(4, "lee"));
//		add_list.add(new Student(5, "kim"));
//		System.out.println(list.addAll(add_list));     
//		System.out.println(list);
//		System.out.println(list.addAll(2, add_list));   
//		System.out.println(list);
		
		// 객체 수정(Update)
		// - set(int index, E element):E
		
		// - Student 객체 수정
//		List<Student> list = new ArrayList<>();
//		list.add(new Student(1, "성구"));
//		list.add(new Student(2, "경미"));
//		list.add(new Student(1, "성구"));
//		list.add(new Student(3, "지은"));
//		System.out.println(list);
//		
//		System.out.println(list.set(1, new Student(5, "길동")));  
//		System.out.println(list);
		
		// 객체 제거(Remove)
		// - remove(int index):E
		// - remove(Object o):boolean
		// - removeAll(Collection c):boolean
		// - retainAll(Collection c):boolean
		// - clear():void
		
/*		List<Student> sts = new ArrayList();
//		sts.add(new Student(2, "lee"));
//		sts.add(new Student(4, "kim"));
//		sts.add(new Student(6, "park"));
//		sts.add(new Student(8, "lee"));
//		System.out.println(sts);
////		sts.remove(2);
////		System.out.println(sts);
////		sts.remove(new Student(2, "lee"));
////		System.out.println(sts);
//		
//		List<Student> another = new ArrayList();
//		another.add(new Student(22222, "lee"));
//		another.add(new Student(2, "kim"));
////		System.out.println(another);
////		
////		
////		sts.removeAll(another);
////		
//////		sts.removeAll(sts);
////		System.out.println(sts);
////		System.out.println(another);
//		
//		sts.retainAll(another);
//		System.out.println(sts);*/
		
		// - Student 객체 제거
//		List<Student> list = new ArrayList<>();
//		list.add(new Student(1, "성구"));
//		list.add(new Student(2, "경미"));
//		list.add(new Student(4, "성구"));
//		list.add(new Student(3, "지은"));
//		System.out.println(list);
//
//		System.out.println(list.remove(1));                     
//		System.out.println(list);
//		System.out.println(list.remove(new Student(3, "성구"))); 
//		System.out.println(list);
		
//		List<Student> list = new ArrayList<>();
//		list.add(new Student(1, "성구"));
//		list.add(new Student(2, "경미"));
//		list.add(new Student(1, "성구"));
//		list.add(new Student(3, "지은"));
//		System.out.println(list);
//
//		List<Student> remove_list = new ArrayList<>();
//		remove_list.add(new Student(2, "경미"));
//		remove_list.add(new Student(1, "성구"));
//		System.out.println(list.removeAll(remove_list)); // removeAll(Collection c):boolean
//		System.out.println(list);
		
//		List<Student> list = new ArrayList<>();
//		list.add(new Student(1, "성구"));
//		list.add(new Student(2, "경미"));
//		list.add(new Student(1, "성구"));
//		list.add(new Student(3, "지은"));
//		System.out.println(list);
//		
//		List<Student> retain_list = new ArrayList<>();
//		retain_list.add(new Student(1, "성구"));
//		retain_list.add(new Student(3, "경미"));
//		System.out.println(list.retainAll(retain_list));  // retainAll(Collection c):boolean
//		System.out.println(list);
//		list.clear();   // clear():void
//		System.out.println(list);	
		
		// 객체 검색(Read)
		// - contains(Object o):boolean
		// - containsAll(Collection c):boolean
		// - get(int index):E
		// - indexOf(Object o):int
		// - lastIndexOf(Object o):int  
		// - isEmpty():boolean, size():int
		
		// - Student 객체 검색
//		List<Student> list = new ArrayList<>();
//		list.add(new Student(1, "성구"));
//		list.add(new Student(2, "경미"));
//		list.add(new Student(1, "성구"));
//		list.add(new Student(3, "지은"));
//		System.out.println(list);
		
		/*List<Student> sts = new ArrayList<>();
		sts.add(new Student(2, "lee"));
		sts.add(new Student(4, "kim"));
		sts.add(new Student(6, "park"));
		sts.add(new Student(8, "lee"));
		System.out.println(sts.size());
		
//		boolean b = sts.containsAll(sts);
		int s = sts.lastIndexOf(new Student(2, "lee"));
//		System.out.println(b);
		System.out.println(s);*/
//		
//		System.out.println(list.contains(new Student(2, "성구"))); 
//		System.out.println(list.isEmpty());
//		System.out.println(list.size());
//		System.out.println(list.get(2));
//		System.out.println(list.indexOf(new Student(1, "지은")));
//		System.out.println(list.lastIndexOf(new Student(1, "성구")));
//		
//		List<Student> contain_list = new ArrayList<>();
//		contain_list.add(new Student(1, "성구"));
//		contain_list.add(new Student(2, "경미"));
//		System.out.println(list.containsAll(contain_list)); // containsAll(Collection c):boolean

		// 기타 메소드
		// - toArray():Object[]
		// - toArray(T[] a):T[]
		
//		List<Student> sts = new ArrayList<>();
//		sts.add(new Student(2, "lee"));
//		sts.add(new Student(4, "kim"));
//		sts.add(new Student(6, "park"));
//		sts.add(new Student(8, "lee"));
//		System.out.println(sts);
		
//		
//		Student[] arr =  sts.toArray(new Student[4]);
//		System.out.println(Arrays.toString(arr));
//		arr[1] = new Student();
//		System.out.println(Arrays.toString(arr));
		
//		Object[] arr1 =  sts.toArray(new Object[4]);
//		System.out.println(Arrays.toString(arr1));
//		arr1[1] = new Student();
//		System.out.println(Arrays.toString(arr1));
//		
		
		
		
		// - String 리스트를 배열로 전환 예제
//		List<String> list = new ArrayList<>(); 
//		list.add("lee"); list.add("sung"); list.add("koo"); list.add("sung");
//		System.out.println(list);
//		
//		Object[] objs = list.toArray();  
//		System.out.println(Arrays.toString(objs));
//		System.out.println(objs[1]);
//		String[] strs1 = list.toArray(new String[6]); 
//		System.out.println(Arrays.toString(strs1));	
//		String[] strs2 = list.toArray(new String[2]); 
//		System.out.println(Arrays.toString(strs2));	
//		String[] strs3 = list.toArray(new String[0]); 
//		System.out.println(Arrays.toString(strs3));	
		
		// - Student 리스트를 배열로 전환 보기
//		List<Student> list = new ArrayList<>();
//		list.add(new Student(1, "성구")); 
//		list.add(new Student(2, "경미")); 
//		list.add(new Student(3, "지은")); 
//		System.out.println(list);
//		
//		Object[] objs = list.toArray();               
//		System.out.println(Arrays.toString(objs));
//		System.out.println(objs[1]);
//		
//		Student[] stu1 = list.toArray(new Student[6]); 
//		System.out.println(Arrays.toString(stu1));	
//		Student[] stu2 = list.toArray(new Student[2]); 
//		System.out.println(Arrays.toString(stu2));	
//		Student[] stu3 = list.toArray(new Student[0]); 
//		System.out.println(Arrays.toString(stu3));
		
		// 모든 요소 접근: for, for-each, while ,iterator():Iterator<E>
		// - 반복자(iterator): 컬렉션에 저장된 요소를 읽어오는 표준화된 방법
		
/*		List<Student> sts = new ArrayList<>();
//		sts.add(new Student(2, "lee"));
//		sts.add(new Student(4, "kim"));
//		sts.add(new Student(6, "park"));
//		sts.add(new Student(8, "lee"));
//		System.out.println(sts);
//		
//		System.out.println("==============for문================");
//		for (int i = 0; i < sts.size(); i++) {
//			Student st = sts.get(i);
//			sts.remove(new Student(222, "lee"));
//			System.out.println(st.getName());
//		}
//		
//		System.out.println("==============for문 제거 버전================"); // 고로 쓰지말자. 
//		for (int i = 0; i < sts.size(); i++) {
//			sts.remove(new Student(222, "lee")); // for문으로 제거를 하게 되면 제거가 될 수록 배열길이가 줄어들기 때문에 전부 제거가 안될 수도 있다.
//
//		}
//		System.out.println(sts);
//		
//		System.out.println("==============for-each문================="); // 제거할땐 절대 쓰지 마삼
//		
//		for(Student st : sts) {
//			System.out.println(st.getName());
//		}
//		
//		System.out.println("==============While문=================");
//		
//		int i = 0;
//		while(i < sts.size()){
//			Student st = sts.get(i);
//			System.out.println(st.getName());
//			i++;
//		}
//		
//		System.out.println("==============iterator():Iterator<E>=================");
//		Iterator<Student> itor = sts.iterator();
//
//		while(itor.hasNext()) {
//			Student st = itor.next();
//			System.out.println(st);
//		}
//		
//		
//		System.out.println("==============iterator():Iterator<E> 제거=================");
//		Iterator<Student> itor1 = sts.iterator();
//
//		while(itor1.hasNext()) {
//			Student st1 = itor1.next();
//			if(st1.equals(new Student(222, "lee")))
//				itor1.remove();
//			System.out.println(st1);
/	} */
		
		
		
		
		
		// - Integer 객체 모든 원소 접근
//		List<Integer> list = new ArrayList<>();
//		list.add(1); list.add(2); list.add(1); list.add(3);
//		System.out.println(list);
//
//		for(int i = 0; i < list.size(); i++)
//			System.out.print(list.get(i) + " ");
//		System.out.println();
//		
//		for(Integer ele : list) // int ok
//			System.out.print(ele + " ");
//		System.out.println();
//
//		Iterator<Integer> iter = list.iterator();
//		while(iter.hasNext()) {
//			Integer ele = iter.next(); // int ok
//			System.out.print(ele + " ");
//		}

		// - String 객체 모든 원소 접근
//		List<String> list = new ArrayList<>();
//		list.add("lee"); list.add("sung"); list.add("lee"); list.add("koo");
//		System.out.println(list);
//		
//		for (int i = 0; i < list.size(); i++)
//			System.out.print(list.get(i) + " ");
//		System.out.println();
//
//		for(String ele : list)
//			System.out.print(ele + " ");
//		System.out.println();
//
//		Iterator<String> iter = list.iterator();
//		while (iter.hasNext()) {
//			String ele = iter.next();
//			System.out.print(ele + " ");
//		}
		
		// - Student 객체 모든 원소 접근
//		List<Student> list = new ArrayList<>();
//		list.add(new Student(1, "성구"));
//		list.add(new Student(2, "경미"));
//		list.add(new Student(1, "성구"));
//		list.add(new Student(3, "지은"));
//		System.out.println(list);
//		
//		for (int i = 0; i < list.size(); i++)
//			System.out.print(list.get(i) + " ");
//		System.out.println();
//		
//		for(Student ele : list)
//			System.out.print(ele + " ");
//		System.out.println();
//
//		Iterator<Student> iter = list.iterator();
//		while (iter.hasNext()) {
//			Student ele = iter.next();
//			System.out.print(ele + " ");
//		}
		
		// 모든 동일 원소 제거시 3가지 방법
		// - remove(Object o):boolean 사용
		// - removeAll(Collection c):boolean 사용
		// - Iterator의 remove() 사용
		
//		List<Student> list = new ArrayList<>();
//		list.add(new Student(1, "성구"));
//		list.add(new Student(2, "경미"));
//		list.add(new Student(1, "성구"));
//		list.add(new Student(3, "지은"));
//		System.out.println(list);
		
		/*List<Student> remove_list = new ArrayList<>();
		remove_list.add(new Student(1, "성구"));
		remove_list.add(new Student(2, "경미"));
		
		System.out.println(list.removeAll(remove_list));
		System.out.println(list.size());
		System.out.println(remove_list.size());
		System.out.println(list);*/
		
		/*Iterator<Student> itor = list.iterator();
		while(itor.hasNext()) {
			Student st = itor.next();
			if(st.equals(new Student(22221, "성구")))
				itor.remove();
		}
		System.out.println(list);*/
		
		
		
		
/*
		Student re_st = new Student(1, "성구");
		while(list.remove(re_st)) {
			System.out.println("제거완료.");
		}
		System.out.println(list);
*/
		// - remove(Object o):boolean 사용
//		List<Student> list = new ArrayList<>();
//		list.add(new Student(1, "성구"));
//		list.add(new Student(2, "경미"));
//		list.add(new Student(1, "성구"));
//		list.add(new Student(3, "지은"));
//		System.out.println(list.size());
//		System.out.println(list);
//		
//		Student st = new Student(111, "성구");
//		while(list.remove(st));
//		System.out.println(list.size());
//		System.out.println(list);
		
		// - removeAll(Collection c):boolean 사용
//		List<Student> list = new ArrayList<>();
//		list.add(new Student(1, "성구"));
//		list.add(new Student(2, "경미"));
//		list.add(new Student(1, "성구"));
//		list.add(new Student(3, "지은"));
//		System.out.println(list.size());
//		System.out.println(list);
//		
//		List<Student> remove_list = new ArrayList<>();
//		remove_list.add(new Student(1, "성구"));
//		remove_list.add(new Student(2, "경미"));
//		System.out.println(list.removeAll(remove_list));
//		System.out.println(list.size());
//		System.out.println(list);
		
		// - Iterator의 remove() 사용
//		List<Student> list = new ArrayList<>();
//		list.add(new Student(1, "성구"));
//		list.add(new Student(2, "경미"));
//		list.add(new Student(1, "성구"));
//		list.add(new Student(3, "지은"));
//		System.out.println(list.size());
//		System.out.println(list);
//		
//		Iterator<Student> it = list.iterator();       
//		while(it.hasNext()) {                       
//			if (it.next().equals(new Student(1, "성구")))               
//				it.remove();
//		}
//		System.out.println(list.size());
//		System.out.println(list);
		
		// Object 객체 다루기
		// - instanceof 키워드 이용
		
		// - 배열에서 Object 객체 다루기
//		List<Student> list = new ArrayList<>();
//		list.add(new Student(1, "성구"));
//		list.add(new Student(2, "경미"));
//		list.add(new Student(1, "성구"));
//		list.add(new Student(3, "지은"));
//		System.out.println(list);
		
		/*Object[] objs = new Object[4];
		objs[0] = new Student(55, "lee");
		objs[1] = 23;
		objs[2] = new Student(55, "sung");
		objs[3] = "koo";
		
		System.out.println(Arrays.toString(objs));
		
		for(Object obj : objs) {
			if(obj instanceof Student) {
				Student st = (Student)obj;
				System.out.println(st.getName());
			}
		}*/
		
		/*List<Object> list = new ArrayList<>();
		list.add("lee");
		list.add(29);
		list.add(new Student(55, "sung"));
		list.add(new Student(55, "kkkkk"));
		System.out.println(list);*/

		
		
		
		
		
		
		
//		Object[] objs = new Object[4];
//		objs[0] = "lee";
//		objs[1] = new Student(1, "성구");
//		objs[2] = 35;
//		objs[3] = new Student(2, "경미");
//		System.out.println(Arrays.toString(objs));
//		
//		for(Object obj : objs) {
//			if(obj instanceof Student) { // - instanceof 필요
//				Student st = (Student)obj;
//				System.out.println(st.getName());
//			}
//		}

		// - List에서 Object 객체 다루기
//		List list = new ArrayList(); // = List<Object> list = new ArrayList<>();
//		list.add("lee");
//		list.add(new Student(1, "성구"));
//		list.add(35);
//		list.add(new Student(2, "경미"));
//		System.out.println(list);
//
//		for(Object ele : list) {
//			if(ele instanceof Student) { // - instanceof 필요
//				Student st = (Student)ele;
//				System.out.println(st.getName());
//			}
//		}
	}
}


