package ch05_BankApp2;

//CMA 계좌
class CMAAccount extends Account {
	double dayRate;		// 매일 이자율

	CMAAccount(int ano, String owner, double balance, double dayRate) {
		super(ano, owner, balance);
		this.dayRate = dayRate;
	}
	
	@Override
	public double computeInterest() {
		return super.getBalance() * dayRate;
	}
	
	@Override
	public String toString() { // BankApp1과 차이 - toString() 재정의
		String str = "매일이자율:" + dayRate;
		return "CMA계좌 -> " + super.toString() + ", " + str;
	}
}
