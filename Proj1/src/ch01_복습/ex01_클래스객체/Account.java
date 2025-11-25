package ch01_복습.ex01_클래스객체;

//클래스(Class): 객체 생성을 위한 설계도
/*
 * 변수 종류
 * 
 * 지역 변수 - 메소드 내에 선언된 변수 (스택 영역)
 * 전역 변수 - 클래스 메소드 어디든 속하지 않고 어디든 쓸 수 있는 변수
 * 
 * 필드 - 클래스에 소속된 변수(힙영역)
 * 
 * 참조 변수 - 객체의 메모리 주소를 저장 
 * 기본 변수 - 실제 값(데이터) 자체를 저장
 * */
class Account {
	// 필드(Field): 객체의 속성을 저장하는 변수(c++에서는 전역변수라고 부름)
	int ano;          // 계좌번호(기본 타입의 필드)
	String owner;     // 소유자(참조 타입의 필드)
	static double balance;   // 잔액 static을 붙이게 되면 정적 변수(클래스 변수가 된다)

	// 생성자(Constructor)
	Account(int ano, String owner, double balance) {
		// this 키워드: 현재 객체 자신을 가리킴
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	// this() 메소드: 같은 클래스의 다른 생성자 호출
	Account(int ano, String owner) {
		this(ano, owner, 0.0);  
	}

	// 메소드(Method): 객체의 행동을 정의
	void deposit(int money) {
		this.balance += money;
	}
	// 메소드 오버로딩(Method Overloading)
	void deposit(int money, double bonus) {
		this.balance += (money + bonus);
	}
	void withdraw(int money) {
		this.balance -= money; //정적 메소드를 쓰면 this 를 빼야한다.
	}
	double computeInterest() {
		return balance * 0.1; 
	}
	
	String getInfo() {
		String str = "계좌번호: " + ano + ", " +
				"소유자: " + owner + ", " +
				"잔액: " + balance;
		return str;
	}
}
