package ch05_BankApp2;

class Account implements Accountable {
	private int ano;		// 계좌번호
	private String owner;	// 소유자
	private double balance;	// 잔액

	public Account(int ano) {
		this.ano = ano;
	}
	public Account(int ano, String owner, double balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	// get/set 메소드
	int getAno() { return ano; }
	void setAno(int ano) { this.ano = ano; }
	String getOwner() { return owner; }
	void setOwner(String owner) { this.owner = owner; }
	double getBalance() { return balance; }
	void setBalance(double balance) { this.balance = balance; }

	@Override
	public void deposit(int money) {
		this.balance += money;
	}
	
	@Override
	public void withdraw(int money) {
		this.balance -= money;
	}
	
	double computeInterest() {
		return 0.0;
	}
	
	@Override
	public boolean equals(Object obj) { // BankApp1과 차이 - equals() 재정의
		if(this.ano == ((Account)obj).ano)
			return true;
		return false;
	}

	@Override
	public String toString() { // BankApp1과 차이 - -toString() 재정의
		String str = "계좌번호:" + ano + ", " + 
					"소유자:" + owner + ", " + 
					"잔액:" + balance;
		return str;
	}
}
