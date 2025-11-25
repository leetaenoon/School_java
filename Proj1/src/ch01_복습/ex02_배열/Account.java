package ch01_복습.ex02_배열;


class Account {
	int ano;
	String owner;
	double balance;

	Account(int ano, String owner, double balance) { 
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	void deposit(int money) {
		this.balance += money;
	}
	void withdraw(int money) {
		this.balance -= money;
	}
	double computeInterest() {
		return balance * 0.1;
	}

	String getInfo() { 
		String str = "계좌번호:" + ano + ", " + 
					 "소유자:" + owner + ", " + 
					 "잔액:" + balance;
		return str;
	}
}