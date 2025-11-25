// 최상위 클래스 Object - hashCode()
//- Object 클래스의 hashCode()
//  - 객체의 메모리 주소와 연관된 정수값 반환하는 메소드
//  - 해시 기반 컬렉션(HashMap, HashSet, HashTable)에서 
//    빠른 검색 위해 사용하는 1차 정수값(int)으로 이용
//- 해쉬함수
//  - 임의의 크기를 갖는 데이터를 고정된 크기를 갖는 데이터로 변환하는 함수
//  - 버킷 인덱스 계산을 위한 2차 정수값(% 16)으로 이용
//- 해쉬 기반 컬렉션에서 hashCode()와 함께 equals()도 재정의 필요,
//  동일 필드에 대한 일관성 있는 재정의 필요
//- 해쉬 기반 컬렉션에서 객체 저장 또는 검색시 hashCode()로 해시 버킷 선택후 
//  equals()로 최종 비교 수행  
//- 많은 표준 라이브러리 클래스들은 내용 같으면 동일 정수 반환하도록 hashCode() 이미 재정의
//  - String, Wrapper, Collection, 시간관련(LocalDate, ...)

package ch03_Object클래스.ex03_hashCode;

public class Test {
	
	public static void main(String[] args) {
		// String(문자열) 객체 생성후 hash 값 출력
//		String s1 = "lee";
//		String s2 = new String("lee");
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
		
		// Account 객체 생성후 hash 값 출력 - case1,2,3,4
//		Account acc1 = new Account(10, "lee");
//		Account acc2 = new Account(10, "lee");
//		System.out.println(acc1.hashCode());
//		System.out.println(acc2.hashCode());
	}
}
