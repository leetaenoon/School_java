package ch09_BankApp3.common;

import java.util.*;

public class Account implements Accountable, Comparable<Account> {
	private int ano;		
	private String owner;	
	private double balance;	

	public Account(int ano) {
		this.ano = ano;
	}
	public Account(int ano, String owner, double balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public int getAno() { return ano; }
	public void setAno(int ano) { this.ano = ano; }
	public String getOwner() { return owner; }
	public void setOwner(String owner) { this.owner = owner; }
	public double getBalance() { return balance; }
	public void setBalance(double balance) { this.balance = balance; }

	@Override
	public void deposit(int money) {
		this.balance += money;
	}
	@Override
	public void withdraw(int money) {
		this.balance -= money;
	}

	public double computeInterest() {
		return 0.0;
	}

	// ------------ toString( ) 재정의 -----------------
	@Override
	public String toString() {
		String str = "계좌번호:" + ano + ", " + 
					"소유자:" + owner + ", " + 
					"잔액:" + balance;
		return str;
	}
	
	// ------------ equals( ) 재정의 : ano 기준 -----------------
	// case1: ano 기준
	@Override
	public boolean equals(Object obj) { 
		if (!(obj instanceof Account)) return false;
		Account acc = (Account) obj;
		return this.ano == acc.ano; // return Objects.equals(this.ano, other.ano) // 비효율
	}
	
	// case2: name 기준
//	@Override
//	public boolean equals(Object other) {
//		if (!(other instanceof Account)) return false;  
//		Account other1 = (Account) other;
//		return Objects.equals(this.owner, other1.owner); // return this.owner.equals(other1.owner); // null 처리 불가
//	}

	// ------------ hashCode( ) 재정의 -----------------
	// case1: ano 기준
	@Override
	public int hashCode() {
		return ano; // return Objects.hash(ano); 비효율
	}
	
	// case2: owner 기준
//	@Override
//	public int hashCode() {	
//		return Objects.hash(owner); // return owner.hashCode(); // null 처리 불가
//	}
	
	// ------------ compareTo( ) 재정의 -----------------
	// case1: ano 기준
	@Override
	public int compareTo(Account other) {
		return this.ano - other.ano; 
	}
	
	// case2: owner 기준
//	@Override
//	public int compareTo(Account other) {
//	    if (this.owner == null && other.owner == null) return 0; // 둘 다 null -> 정렬상 동등
//	    if (this.owner == null) return -1;  // this 더 작다고 간주 -> Tree 좌측 배치
//	    if (other.owner == null) return 1;  // this 더 크다고 간주 -> Tree 우측 배치
//	    return this.owner.compareTo(other.owner); // 문자열 사전식 비교 (오름차순), null 처리 불가하므로 앞에서 반드시 처리
//	}

}
