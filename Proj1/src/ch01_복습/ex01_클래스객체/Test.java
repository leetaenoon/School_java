// 클래스 vs. 객체 -> 시험 대비 내용이니 읽어 보도록 (용어 대해 알고 있어야 함)
// - 클래스(class)
//   - 객체 생성을 위한 설계도(타입,틀), 정체성 없음
//   - 내부 구조: 필드, 메소드, 생성자, 이너(내부) 클래스
// - 객체(object)
//   - 클래스로 부터 만들어진(생성된) 실체(인스턴스, instance), 클래스의 한 실제 보기
//   - 물리적인 혹은 개념적인 어떤 것으로 정체성을 갖는 것
// 필드 vs. 메소드
// - 필드(field)
//   - 인스턴스 필드 vs. 정적 필드
//   - 클래스에 소속된 변수(전역 변수 개념)
//   - 힙 영역에 저장되며 강제 초기화
//   - 지역 변수(local variable)
//     - 메소드 혹은 일반 블록 내부에 선언된 변수
//     - 스택 영역에 저장되며 강제 초기화 안됨
// - 메소드(method)
//   - 인스턴스 메소드 vs. 정적 메소드
//   - 클래스에 소속된 함수
//   - 인수(argument) vs. 매개변수(parameter)
//     - 인수: 메서드 호출시 메서드에 전달되는 값
//     - 매개변수: 메서드 정의시 메서드에 전달되는 값을 받아들이기 위해 사용되는 변수
//   - 실매개변수(actual parameter) vs. 형식매개변수(formal parameter)
//   - 클래스 외부에서 메소드 호출
//     - 객체 생성 후 호출 가능
//   - 클래스 내부에서 메소드 호출
//     - 객체 생성 없이 호출 가능
//   - 메소드 중복정의(method overloading)
//     - 매개변수의 갯수나 자료형이 다른 여러 동일한 이름을 갖는 메소드
//     - 생성자 중복정의
//   - 생성자(constructor)메소드
//     - 객체 생성과 필드 초기화 역할
//     - 클래스 이름과 동일한 메소드, 반환 타입 없음
//     - 기본(디폴트) 생성자 메소드
//       - 매개변수 없는 생성자
//       - 클래스가 생성자 포함하지 않으면 기본 생성자 메소드 자동 추가
// this vs. this()
// - this 키워드
//   - 자기 자신 객체를 가리키는 참조 변수
//   - 클래스 내부에서 멤버(필드, 메소드) 활용시 this 없으면 자동 추가
//   - 지역변수는 멤버 아니므로 this 추가 불가
// - this() 메소드
//   - 자기 자신 클래스의 다른 생성자를 호출하는 메소드
//   - 중복 코드 제거
//   - 생성자 내부에서만 사용 가능하며 생성자의 첫줄에 위치

package ch01_복습.ex01_클래스객체;

public class Test {

	public static void main(String[] args) {
		// 객체 생성
		Account acc1 = new Account(1001, "홍길동", 10000);
		Account acc2 = new Account(1002, "이순신");
		Account acc3; //지역변수이면서 참조 변수이다.
		
		
		acc3 = new Account(1003, null);
		System.out.println(acc1.balance); // 정적변수를 사용하게 되면 클래스 이름으로 불러와야 한다.
		
		System.out.println("출력을 신박하게 하는 방법 : " + acc1.balance);
		String str = acc2.getInfo();
		System.out.println(str);
		
				
		// 필드 접근
		System.out.println(acc1.balance);
		String name1 = acc2.owner;
		System.out.println(name1);

		// 메소드 호출
		acc1.deposit(100, 50); //100, 50은 인수이다.
		acc1.deposit(5000);             
		acc1.deposit(1000, 200); // 메소드 중복정의 이용        
		acc2.deposit(2000);

		System.out.println(acc1.getInfo());
		System.out.println(acc2.getInfo());
		System.out.println("acc1 이자: " + acc1.computeInterest());
	}
}
















