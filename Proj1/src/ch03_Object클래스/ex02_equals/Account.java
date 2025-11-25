package ch03_Object클래스.ex02_equals;

import java.util.Objects;

class Account {
	int ano;		// 계좌번호
	String owner;	// 소유자
	double balance;	// 잔액
	
	Account() { } 
	Account(int ano, String owner) { 
		this.ano = ano;
		this.owner = owner;
	}
	Account(int ano, String owner, int balance) { 
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	// case1: 계좌번호(ano) 같으면 같은 객체
//	@Override
//	public boolean equals(Object other) {
//		if (this == other) return true; 
//		if (!(other instanceof Account)) return false; 
//		Account other1 = (Account) other;
//		return this.ano == other1.ano;  // = return Objects.hash(ano); 비효율
//	}
		
	// case2: 소유자(owner) 같으면 같은 객체
//	@Override
//	public boolean equals(Object other) {
//		if (this == other) return true;                 
//		if (!(other instanceof Account)) return false;  
//		Account other1 = (Account) other;
//		return Objects.equals(this.owner, other1.owner); // this.owner.equals((other.owner)); null 처리 불가
//	}
		
	// case3: 계좌번호(ano)와 소유자(owner) 모두 같아야 같은 객체
//	@Override
//	public boolean equals(Object other) {
//		if (this == other) return true;                 
//		if (!(other instanceof Account)) return false;  
//		Account other1 = (Account) other;
//		return this.ano == other1.ano &&
//				Objects.equals(this.owner, other1.owner);
//	}
}
