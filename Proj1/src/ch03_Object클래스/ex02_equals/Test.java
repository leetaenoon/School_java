// 최상위 클래스 Object - equals()
//- Object 클래스의 equals() 메소드는 위치(번지) 비교하는 == 연산자와 동일하게 수행
//- 동일 객체 참조하면 false, 아니면 true 반환
//- 사용자 정의 클래스의 객체 비교 위해 equals() 메소드 재정의 필요
//- 많은 표준 라이브러리 클래스들은 내용 같으면 true 반환하도록 equals() 메소드 이미 재정의 
//  - String, Wrapper, Collection, 시간관련(LocalDate, ...)
// 웬만하면 toString은 오버라이딩 하삼 

package ch03_Object클래스.ex02_equals;

public class Test {
	
	public static void main(String[] args) {
		// String(문자열) 객체 생성하여 ==, equals() 비교
//		String a = "lee";
//		String b = "lee";
//		String c = new String("lee");
//		String d = new String("lee");
//		
//		System.out.println(a==b); 
//		System.out.println(a.equals(b)); 	
//		System.out.println(a==c); 
//		System.out.println(a.equals(c)); 	
//		System.out.println(c==d); 
//		System.out.println(c.equals(d)); 
		
		// Account 객체 생성후 ==, equals() 비교 - case1,2,3
		Account acc1 = new Account(10, "lee");
		Account acc2 = new Account(10, "sung");
		System.out.println(acc1 == acc2); 
		System.out.println(acc1.equals(acc2));

	}
}
