// 최상위 클래스 Object - toString()
//- Object 클래스의 toString() 메소드는 객체 정보를 문자열로 반환
//  - 패키지이름.클래스이름@해쉬코드16진수값
//- 사용자 정의 클래스의 객체 정보 출력 위해 toString() 메소드 재정의 필요
//- 많은 표준 라이브러리 클래스들은 toString() 메소드 이미 재정의
//  - String, Wrapper, Collection, 시간관련(LocalDate, ...)

package ch03_Object클래스.ex01_toString;

public class Test {
	
	public static void main(String[] args) {	
		// String(문자열) 객체 생성후 정보 출력
//		String s1 = "성구";
//		String s2 = new String("성구");
//		System.out.println(s1.toString());
//		System.out.println(s2);
		
		// Account 객체 생성 후 정보 출력 - getInfo() 이용
//		Account acc = new Account(1, "성구", 100);
//		System.out.println(acc.getInfo()); 
		
		// Account 객체 생성 후 정보 출력 - toString() 이용
		Account acc = new Account(1, "성구", 100);;
		System.out.println(acc); // acc.toString() 사용 X

	}
}
