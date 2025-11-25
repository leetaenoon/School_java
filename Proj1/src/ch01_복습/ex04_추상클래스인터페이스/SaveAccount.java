package ch01_복습.ex04_추상클래스인터페이스;

class SaveAccount extends Account {
	double interestRate;	// 이자율
	int period;				// 저축기간
	
	SaveAccount(int ano, String owner, int balance, double interestRate, int period) {
		super(ano, owner, balance);
		this.interestRate = interestRate;
		this.period = period;
	}
	
	@Override
	public double computeInterest() { // 메소드 재정의
		return balance * interestRate * period;
	}
	
	@Override
	String getInfo() { // 메소드 재정의
		String str = "이자율:" + interestRate + ", " + 
					"저축기간:" + period;
		return "저축계좌 -> " + super.getInfo() + ", " + str;
	}
}
