package ch01_복습.ex04_추상클래스인터페이스;

abstract class Account implements Interest {
	int ano;		
	String owner;	
	double balance;
	
	Account() { } 
	Account(int ano, String owner, double balance) { 
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public void deposit() { 
		this.balance += 20;
	}
	void deposit(int money) { 
		this.balance += money;
	}
	void withdraw(int money) {
		this.balance -= money;
	}
	
	public abstract double computeInterest(); // 추상 메소드

	String getInfo() { 
		String str = "계좌번호:" + ano + ", " + 
					 "소유자:" + owner + ", " + 
					 "잔액:" + balance;
		return str;
	}
}
