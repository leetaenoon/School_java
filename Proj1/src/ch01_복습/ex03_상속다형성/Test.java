// 상속(inheritance)
// - 부모 클래스(수퍼 클래스) vs. 자식 클래스(서브 클래스)
// - 슈퍼 클래스의 필드와 메소드를 서브 클래스가 물려받는 것
// 다형성(polymorphism)
// - 하나의 타입(부모 클래스)으로 자식 클래스 객체를 참조할 수 있는 성질
// 메소드 재정의(method overriding)
// - 상속 관계에서 부모 클래스가 가진 메소드를 자식 클래스에서 
// - 동일한 시그니처(메소드명, 매개변수, 반환타입)로 다시 작성하는 것

package ch01_복습.ex03_상속다형성;

public class Test {

	public static void main(String[] args) {
		// 객체 생성 보기
//		Account acc = new Account();
		
//		CheckAccount c_acc = new CheckAccount(1, "성구", 100, 12345);
//		SaveAccount s_acc = new SaveAccount(2, "경미", 200, 0.02, 2);
//		System.out.println(acc.getInfo());
//		System.out.println(c_acc.getInfo());
//		System.out.println(s_acc.getInfo());
		
		// 생성자 중복정의 보기
//		Account acc1 = new Account();
//		Account acc2 = new Account(3, "경미", 300);
//		System.out.println(acc1.getInfo());
//		System.out.println(acc2.getInfo());
		
		// 메소드 중복정의 보기
//		Account acc = new Account(4, "현우", 400);
//		acc.deposit(12);
//		acc.deposit();
		
		// 다형성과 메소드 재정의 보기
//		Account acc1 = new Account(1, "지은", 100);
//		Account acc2 = new CheckAccount(2, "현우", 200, 23456);
//		Account acc3 = new SaveAccount(3, "길동", 300, 0.02, 2);
//		
//		System.out.println(acc1.computeInterest());
//		System.out.println(acc1.getInfo());
//		System.out.println(acc2.computeInterest());
//		System.out.println(acc2.getInfo());
//		System.out.println(acc3.computeInterest());
//		System.out.println(acc3.getInfo());
//		
//		Account[] accs = {acc1, acc2, acc3};
//		for(Account acc : accs) {
//			System.out.println(acc.computeInterest());
//			System.out.println(acc.getInfo());
//		}
	}
}
