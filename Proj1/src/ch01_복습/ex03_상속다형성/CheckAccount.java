package ch01_복습.ex03_상속다형성;

// 보통계좌(입출금계좌)
class CheckAccount extends Account { // 상속
	int cardNo;	// 직불카드 번호
	int gg;

	CheckAccount() {
		super();
	} 
	CheckAccount(int ano, String owner, double balance, int cardNo) {
		super(ano, owner, balance);
		this.cardNo = cardNo;
	}

	@Override
	double computeInterest() { // 메소드 재정의
		return balance * 0.01;
	}

	@Override
	String getInfo() { // 메소드 재정의
		String str = "카드번호:" + cardNo;
		return "보통계좌(Checking) -> " + super.getInfo() + ", " + str;
	}
}
