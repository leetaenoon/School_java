package ch09_BankApp3.ex01_ArrayList;

import java.util.*;
import ch09_BankApp3.common.Account;

public class Bank {
	private String name;
	private List<Account> accounts; // 배열: private Account[] accounts;
	
	Bank(String name) {	// 배열: Bank(String name, int accountNum)
		this.name = name;
		this.accounts = new ArrayList<>(); // Vector<>(), LinkedList<>() 대체 가능
	}

	void addAccount(Account acc) {		
		accounts.add(acc);
	}
//	void addAccount(Account acc) {	// 배열	
//		for(int i=0; i<accounts.length; i++) {
//			if(accounts[i] == null) {
//				accounts[i] = acc;
//				break;
//			}
//		}
//	}

	void printAccList() {
		for(Account acc : accounts) {
			System.out.println(acc);	
		}
	}
//	void printAccList() { // 배열
//		for(int i=0; i<accounts.size(); i++) {
//			Account acc = accounts.get(i);
//			System.out.println(acc);	
//		}
//	}

	Account findAccount(Account acc) {
		if(accounts.contains(acc)) {			
			for(Account acc_ele : accounts) {
				if(acc_ele.equals(acc)) 
					return acc_ele;
			}
		}
		return null;
	}
//	Account findAccount(Account acc) { // 배열
//		for(Account acc_ele : accounts) {
//			if(acc_ele != null && acc_ele.equals(acc)) // 원소가 있고 동일 객체인 경우
//					return acc_ele;
//		}
//		return null;
//	}
	
	void removeAccount(Account acc) {
		while(accounts.contains(acc))
			accounts.remove(acc);
	}
//	void removeAccount(Account acc) { // 배열
//		for(int i=0; i<accounts.length; i++) {
//			if(accounts[i] != null  && accounts[i].equals(acc)) { // 원소가 있고 계좌 객체 내용이 동일한 경우
//					accounts[i] = null;
//					break;
//			}
//		}
//	}
	
	void addInterest() {
		for(Account acc : accounts) {
			double interest = acc.computeInterest();
			acc.setBalance(interest);
		}
	}
//	void addInterest() { // 배열
//		for(Account acc : accounts) {
//			if(acc == null)
//				break;
//			else {
//				double interest = acc.computeInterest();
//				acc.setBalance(interest);
//			}
//		}
//	}
}
