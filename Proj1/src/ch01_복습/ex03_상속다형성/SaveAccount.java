package ch01_복습.ex03_상속다형성;

// 저축계좌(적립식)
class SaveAccount extends Account {
	private double interestRate;	// 이자율
	private int period;				// 저축기간
	
	SaveAccount() { } 
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
		return "저축계좌(Saving) -> " + super.getInfo() + ", " + str;
	}
}
