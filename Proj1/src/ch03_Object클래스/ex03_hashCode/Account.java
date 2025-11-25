package ch03_Object클래스.ex03_hashCode;

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

	// case1: 계좌번호(ano) 기준
//	@Override
//	public int hashCode() {
//		return ano; // return Objects.hash(ano); 비효율
//	}
	
	// case2: 소유자(owner) 기준
//	@Override
//	public int hashCode() {	
//		return Objects.hash(owner);  // return owner.hashCode(); null 처리 불가
//	}
	
	// case3: 계좌번호(ano)와 소유자(owner) 기준
//	@Override
//	public int hashCode() {
//		return Objects.hash(ano, owner);
//	}
}
