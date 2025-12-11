package ch09_BankApp3.ex03_HashMap;

import java.util.Scanner;

import ch09_BankApp3.common.*;

public class Test {

	public static void main(String[] args) {
		Bank bank = new Bank("한국은행"); 
		Account acc;
		
		Scanner scanner = new Scanner(System.in);
		boolean run = true; 
		
		System.out.println("---------------HashMap 사용---------------");
		while(run) {
			System.out.println("----------------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3. 계좌제거 | 4.예금 | 5.출금 | 6.이자 | 7.종료");
			System.out.println("----------------------------------------------------------------");
			System.out.print("메뉴선택: ");
			int selectNo = Integer.parseInt(scanner.nextLine());

			if(selectNo == 1) { // 계좌생성
				System.out.println("-------------------------------");
				System.out.println("1.보통계좌 | 2.저축계좌 | 3.CMA계좌");
				System.out.println("-------------------------------");
				System.out.print("계좌종류선택: ");
				int kind = Integer.parseInt(scanner.nextLine());
				
				System.out.print("계좌번호: "); 
				int ano = Integer.parseInt(scanner.nextLine());
				// 동일 계좌 확인
				acc = bank.findAccount(new Account(ano));
				if(acc != null) { // 동일 계좌 있는 경우
					System.out.println("동일 계좌가 이미 존재하여 생성 불가합니다.");
					continue;
				}
				
				System.out.print("계좌주: "); 
				String owner = scanner.nextLine();
				System.out.print("초기입금액: ");
				double balance = Double.parseDouble(scanner.nextLine());

				if(kind == 1) { // 보통 계좌(Check Account) 생성
					System.out.print("카드번호: ");
					int cardNo = Integer.parseInt(scanner.nextLine()); 
					
					acc = new CheckAccount(ano, owner, balance, cardNo);
					bank.addAccount(acc);
					System.out.println("결과: 보통 계좌가 생성되었습니다.");
				} else if(kind == 2) { // 저축 계좌(Save Account) 생성
					System.out.print("이자율: ");
					double interestRate = Double.parseDouble(scanner.nextLine());
					System.out.print("기간: ");
					int period = Integer.parseInt(scanner.nextLine());
					
					acc = new SaveAccount(ano, owner, balance, interestRate, period);
					bank.addAccount(acc);
					System.out.println("결과: 저축 계좌가 생성되었습니다.");
				} else if (kind == 3) { // CMA 계좌(CMA Account) 생성
					System.out.print("매일이자율: ");
					double dayRate = Double.parseDouble(scanner.nextLine());
					
					acc = new CMAAccount(ano, owner, balance, dayRate);
					bank.addAccount(acc);
					System.out.println("결과: CMA 계좌가 생성되었습니다.");
				}
			} else if(selectNo == 2) { // 계좌목록
				System.out.println();
				System.out.println("-----------------전체 계좌 목록--------------------");
				bank.printAccList();
				System.out.println("------------------------------------------------");
				System.out.println();
			} else if(selectNo == 3) { // 계좌제거
				System.out.print("계좌번호: "); 
				int ano = Integer.parseInt(scanner.nextLine());
				// 동일 계좌 확인
				acc = bank.findAccount(new Account(ano));
				if(acc == null) {
					System.out.println("결과: 계좌가 존재하지 않아 제거 불가합니다.");
					continue;
				}
				
				bank.removeAccount(acc);
				System.out.println("결과: 제거 하였습니다.");	
			} else if(selectNo == 4) { // 예금
				System.out.print("계좌번호: "); 
				int ano = Integer.parseInt(scanner.nextLine());
				// 동일 계좌 확인
				acc = bank.findAccount(new Account(ano));
				if(acc == null) {
					System.out.println("결과: 계좌가 존재하지 않아 예금 불가 합니다..");
					continue;
				}
				
				System.out.print("예금액: ");
				int money = Integer.parseInt(scanner.nextLine());
				acc.deposit(money); 
				System.out.println("결과: 예금 하였습니다.");		
			} else if(selectNo == 5) { // 출금
				System.out.print("계좌번호: "); 
				int ano = Integer.parseInt(scanner.nextLine());
				// 동일 계좌 확인
				acc = bank.findAccount(new Account(ano));
				if(acc == null) {
					System.out.println("결과: 계좌가 존재하지 않아 출금 불가합니다.");
					continue;
				}
				
				System.out.print("출금액: ");
				int money = Integer.parseInt(scanner.nextLine());
				acc.withdraw(money); 
				System.out.println("결과: 출금 하였습니다.");
			} else if(selectNo == 6) { // 이자계산
				bank.addInterest();
				System.out.println("결과: 모든 계좌 잔액에 이자를 더하였습니다.");
			} else if(selectNo == 7) { // 종료
				System.out.println("시스템을 종료 합니다...");
				run = false;
			}
		} // while
	} // main()
} // Bank
