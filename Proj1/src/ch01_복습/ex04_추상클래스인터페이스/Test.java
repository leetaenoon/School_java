// 추상 클래스
// - 하나 이상의 추상 메소드 있으면 추상 클래스
// - 객체 생성 불가
// 인터페이스
// - 모든 필드 제어자는 public static final, 생략가능
// - 모든 메소드 제어자는 public abstract, 생략 가능
// - 객체 생성 불가
// - 
// 구체 클래스
// - 단일 상속
// - 여러 인터페이스 구현 가능
// - 객체 생성 가능

package ch01_복습.ex04_추상클래스인터페이스;

public class Test {

	public static void main(String[] args) {
		Account[] accs = new Account[3];
		accs[0] = new CheckAccount(1, "check1", 100, 12345);
		accs[1] = new SaveAccount(2, "save1", 200, 0.2, 2);
		accs[2] = new CheckAccount(3, "check2", 300, 23456);
		
		for (Account acc : accs) {
			System.out.println("이전 " + acc.getInfo());
			acc.deposit();
			acc.withdraw(2);
			System.out.println("이후 " + acc.getInfo());
			System.out.println(acc.computeInterest());
		}
	}
}
