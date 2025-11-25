// 자료형 종류
// - 기본 자료형
//   - byte, short, char, int, long, float, double, boolean
// - 참조 자료형
//   - 배열, 문자열, 클래스, 인터페이스
// 연산자 종류
// - 산술, 증감, 비트(X), 시프트(X), 비교, 논리, 대입 삼항(조건)
// 제어문 종류
// - 선택문: if, if-else, if-else-if, switch
// - 반복문: for, while, do-while
// 배열
// - 참조 자료형
// - 연속된 메모리에 같은 타입의 데이터를 저장하는 자료구조
// - 인덱스로 접근 가능
// - 데이터 중복 가능

package ch01_복습.ex02_배열;
// 배열도 객체다.
import java.util.*;

public class Test {

	public static void main(String[] args) {
		// 기본 타입 vs. 참조 타입
//		int num = 3;
//		double radius = 3.4;
//		
//		String name1 = "lee";
//		String name2 = new String("lee");
//		
//		Account acc1 = new Account(1, "lee", 100);
//		Account acc2 = new Account(2, "sung", 200);

		// 배열 생성 4가지 방법
		// (1) 배열 선언과 동시에 생성
//		int[] arr1 = new int[3]; 
//		Account[] accs1 = new Account[3]; 

		// (2) 배열 선언 후 나중에 생성
//		String[] arr2;      
//		arr2 = new String[3]; 
//		Account[] accs2;
//		accs2 = new Account[3];

		// (3) 배열 선언과 동시에 초기화
//		int[] arr3 = {3, 4, 5};	
//		Account[] accs3 = {
//				new Account(1, "lee", 100),
//				new Account(2, "sung", 300),
//				new Account(3, "koo", 200)
//		};
		
		// (4) 배열 선언 후 나중에 생성과 동시에 초기화
//		String[] arr4;
//		arr4 = new String[] {"lee", "sung", "koo"};
//		Account[] accs4;
//		accs4 = new Account[] {
//				new Account(1, "lee", 100),
//				new Account(2, "sung", 200),
//				new Account(3, "koo", 300),
//		};
		
		// 배열 출력 4가지 방법		
		// (1) for 이용
//		int[] arr = {3, 4, 5};	
//		for(int i=0; i < arr.length; i++)
//			System.out.println(arr[i]);
//		
//		Account[] accs = new Account[3];
//		accs[0] = new Account(1, "lee", 100);
//		accs[1] = new Account(2, "sung", 200);
//		accs[2] = new Account(3, "koo", 300);
//		for(int i=0; i < accs.length; i++)
//			System.out.println(accs[i].getInfo());
		
		// (2) for-each 이용
//		String[] arr = {"lee", "sung", "koo"};
//		for(String ele : arr)
//			System.out.println(ele);
//		
//		Account[] accs = new Account[3];
//		accs[0] = new Account(1, "lee", 100);
//		accs[1] = new Account(2, "sung", 200);
//		accs[2] = new Account(3, "koo", 300);
//		for(Account acc : accs)
//			System.out.println(acc.getInfo());
		
		// (3) util 패키지의 Arrays 클래스의 toString() 메소드 이용
//		int[] arr = {3, 4, 5};	
//		System.out.println(Arrays.toString(arr));
		// toString은 정적 필드라고 함
//
//		Account[] accs = new Account[3];
//		accs[0] = new Account(1, "lee", 100);
//		accs[1] = new Account(2, "sung", 200);
//		accs[2] = new Account(3, "koo", 300);
//		System.out.println(Arrays.toString(accs)); // 오류, Object 클래스의 toString() 재정의 필요
		
		// (4) while 이용
//		String[] arr = {"lee", "sung", "koo"};
//		int i = 0;
//		while(i < arr.length) {
//			System.out.println(arr[i]);
//			i++;
//		}
//		
//		Account[] accs = new Account[3];
//		accs[0] = new Account(1, "lee", 100);
//		accs[1] = new Account(2, "sung", 200);
//		accs[2] = new Account(3, "koo", 300);
//		int j = 0;
//		while(j < accs.length) {
//			System.out.println(accs[j].getInfo());
//			j++;
//		}
	}
}
