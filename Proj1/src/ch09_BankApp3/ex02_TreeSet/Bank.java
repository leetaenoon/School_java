package ch09_BankApp3.ex02_TreeSet;

import java.util.*;
import ch09_BankApp3.common.Account;

public class Bank {
	private String name;
	private Set<Account> accounts; // 수정부분
	
	Bank(String name) {	
		this.name = name;
		this.accounts = new TreeSet<>(); // HashSet<>() 대체 가능 -> hashCode() 재정의하면
	}

	void addAccount(Account acc) {		
		accounts.add(acc);
	}

	void printAccList() {
		for(Account acc : accounts) {
			System.out.println(acc);	
		}
	}

	Account findAccount(Account acc) {
		if(accounts.contains(acc)) {			
			for(Account acc_ele : accounts) {
				if(acc_ele.equals(acc)) 
					return acc_ele;
			}
		}
		return null;
	}
	
	void removeAccount(Account acc) {
		while(accounts.contains(acc))
			accounts.remove(acc);
	}
	
	void addInterest() {
		for(Account acc : accounts) {
			double interest = acc.computeInterest();
			acc.setBalance(interest);
		}
	}
}
