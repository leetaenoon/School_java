package ch02_BankApp1;

class Bank {
	private String name;
	private Account[] accounts;

	Bank(String name, int accountNum) {
		this.name = name;
		this.accounts = new Account[accountNum];
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Account[] getAccount(){
		return accounts;
	}
	
	public void setAccount(Account[] accounts) {
		this.accounts = accounts;
	}
	
	void addAccount(Account acc) { // 첫번째 null인 원소에 계좌 저장
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] == null) {
				accounts[i] = acc;
				break;
			}
		}
	}

	void printAccList() { // 모든 계좌 출력
		for(Account acc : accounts) {
			if(acc != null)
				System.out.println(acc.getInfo());	
			else
				continue;
		}
	}

	Account findAccount(int ano) { // 동일 중복 계좌 확인
		for(Account acc : accounts) {
			if(acc != null && acc.getAno() == ano) // 원소가 있고 계좌 번호가 동일한 경우
					return acc;
		}
		return null;
	}
	
	void removeAccount(int ano) {
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] != null  && accounts[i].getAno() == ano) { // 원소가 있고 계좌 번호가 동일한 경우
					accounts[i] = null;
					break;
			}
		}
	}
	
	void addInterest() {
		for(Account acc : accounts) {
			if(acc == null)
				continue;
			else {
				double interest = acc.computeInterest();
				acc.setBalance(acc.getBalance() + interest);
			}
		}
	}
}
