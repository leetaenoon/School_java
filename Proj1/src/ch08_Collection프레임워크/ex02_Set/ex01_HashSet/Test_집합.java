// Set - 집합 연산
// - 합집합
//   - boolean addAll(Collection<? extends E> c);
//   - boolean addAll(Collection); - 시험때는 이렇게 준다고 함
// - 교집합
//   - boolean retainAll(Collection<?> c);
// - 차집합
//   - boolean removeAll(Collection<?> c);
// - 부분집합
//   - boolean containsAll(Collection<?> c);

package ch08_Collection프레임워크.ex02_Set.ex01_HashSet;

import java.util.*;

import ch08_Collection프레임워크.common.Student;


public class Test_집합 {

	public static void main(String[] args) {		
		// A반 학생
		Set<String> classA = new HashSet<>();
		classA.add("민수"); classA.add("성구"); classA.add("민수"); classA.add("경미"); 
		// B반 학생
		Set<String> classB = new HashSet<>();
		classB.add("현우"); classB.add("성구"); classB.add("지은"); 
		
//		// 합집합(addAll): A반 혹은 B반 수강한 모든 학생들
//		Set<String> union = new HashSet<>(classA);
//		union.addAll(classB);
//		System.out.println("합집합: " + union);
//		System.out.println("A반: " + classA);
//		System.out.println("B반: " + classB);
//
//		// 교집합(retainAll): A반 그리고 B반 모두 수강한 학생들
//		Set<String> intersection = new HashSet<>(classA);
//		intersection.retainAll(classB);
//		System.out.println("교집합: " + intersection);
//		System.out.println("A반: " + classA);
//		System.out.println("B반: " + classB);
//
		// 차집합(removeAll): A반만 수강한 학생들
//		Set<String> differenceA = new HashSet<>(classA);
//		differenceA.removeAll(classB);
//		System.out.println("차집합: " + differenceA);
//		System.out.println("A반: " + classA);
//		System.out.println("B반: " + classB);

//		// 차집합(removeAll): B반만 수강한 학생들
//		Set<String> differenceB = new HashSet<>(classB);
//		differenceB.removeAll(classA);
//		System.out.println("차집합: " + differenceB);
//		System.out.println("A반: " + classA);
//		System.out.println("B반: " + classB);
//
		// 부분집합(containsAll): A는 B를 포함하는가?
		boolean subset = classA.containsAll(classB);
		System.out.println("부분집합: " + subset);
		System.out.println("A반: " + classA);
		System.out.println("B반: " + classB);
	}
}
