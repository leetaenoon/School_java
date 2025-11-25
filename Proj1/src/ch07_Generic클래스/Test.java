// 제너릭 클래스(인터페이스) = 제너릭 타입
// - 결정되지 않은 타입을 매개변수로 갖는 클래스
// - 실제 객체 생성시 제너릭 매개변수를 구체적인 타입으로 대체하는 클래스
// - 클래스 정의 시점이 아니라 객체 생성 시점에 타입을 지정하는 클래스
// - 제너릭 매개변수 = 타입 매개변수
//   - 제너릭 매개변수명 관례
//     - T(타입), K(키이), V(값), N(숫자), E(원소)
//   - 제너릭 매개변수 생략시 Object 타입으로 간주 
// 제너릭 메소드
// - 제너릭 매개변수를 갖는 메소드
// 제너릭 프로그래밍 장점
// - 실행시가 아닌 컴파일시 타입 체크 가능
// - 타입 변환 불필요

package ch07_Generic클래스;

import java.util.List;

public class Test {

	public static void main(String[] args) {   	
		
		Box2<Integer, String> box2 = new Box2<>();
	
		
        // 일반 클래스 Box 예제
//		Box box = new Box();
//		box.setItem(new Apple());
//		Object obj = box.getItem();
//		System.out.println(obj); // 캐스팅 필요 - Apple의 name 필드 이용하기 위해
		
        // 제너릭 클래스 Box1 예제 - 제너릭 매개변수 1개 (Apple)		
//		Box1<Apple> appleBox = new Box1<>();
//		appleBox.setItem(new Apple());
//		Apple apple = appleBox.getItem();
//		System.out.println(apple.name); // 캐스팅 불필요
        
        // 제너릭 클래스 Box2 예제 - 제너릭 매개변수 2개 (Apple, Car)
//		Box2<Apple, Car> allBox = new Box2<>();
//		allBox.setItem1(new Apple());
//		allBox.setItem2(new Car());
//		Apple apple = allBox.getItem1();
//		Car car = allBox.getItem2();
//		System.out.println(apple.name); // 캐스팅 불필요
//		System.out.println(car.price);  // 캐스팅 불필요
        
        // 제너릭 클래스 Box1 예제 - 제너릭 매개변수 생략 (Object)
//		Box1 appleBox = new Box1(); // <Object> 자동 포함
//		appleBox.setItem(new Apple());
//		Object obj = appleBox.getItem();
//		System.out.println(obj);   // 캐스팅 필요	
		
		// 제너릭 클래스 Box1 예제 - 제너릭 매개변수 1개 (String)
//		Box1<String> box1 = new Box1<>();
//		box1.setItem("sung");
//		String item = box1.getItem();
//		System.out.println(item); 
		
		// 제너릭 클래스 Box2 예제 - 제너릭 매개변수 2개 (Integer, String)
//		Box2<Integer, String> box2 = new Box2<>();
//		box2.setItem1(1000);
//		box2.setItem2("sung");
//		Integer item1 = box2.getItem1();
//		String item2 = box2.getItem2();
//		System.out.println(item1); 
//		System.out.println(item2); 		
	}
}
