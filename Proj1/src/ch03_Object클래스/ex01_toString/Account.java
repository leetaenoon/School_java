package ch03_Object클래스.ex01_toString;

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

	

	// Object 클래스의 toString() 메소드 재정의 필요	
	@Override
	public String toString() { 
		String str = "계좌번호:" + ano + ", " + 
					 "소유자:" + owner + ", " + 
					 "잔액:" + balance;
		return str;
	}
}
