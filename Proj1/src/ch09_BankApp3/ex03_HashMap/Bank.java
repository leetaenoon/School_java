package ch09_BankApp3.ex03_HashMap;

import java.util.*;
import ch09_BankApp3.common.Account;

public class Bank {
	private String name;
	private Map<Account, Integer> accounts; // 수정부분
	
	Bank(String name) {	
		this.name = name;
		this.accounts = new HashMap<>(); // TreeMap<>() 대체 가능 -> compareTo() 재정의하면
	}

	void addAccount(Account acc) {		
		accounts.put(acc, acc.getAno());
	}

	void printAccList() {
		for (Account acc : accounts.keySet()) { 
			System.out.println(acc);
		}
	}

	Account findAccount(Account acc) {
		if(accounts.containsKey(acc))
			for (Account acc_ele : accounts.keySet())
				if(acc_ele.equals(acc))
					return acc_ele;
		return null;
	}
	
	void removeAccount(Account acc) {
		if(accounts.containsKey(acc))
			accounts.remove(acc);
	}
	
	void addInterest() {
		for(Account acc : accounts.keySet()) {
			double interest = acc.computeInterest();
			acc.setBalance(interest);
		}
	}
}
