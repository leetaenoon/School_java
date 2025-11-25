package ch05_BankApp2;

class Bank {
	private String name;
	private Account[] accounts;

	Bank(String name, int accountNum) {
		this.name = name;
		this.accounts = new Account[accountNum];
	}
	
	void addAccount(Account acc) {	
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] == null) {
				accounts[i] = acc;
				break;
			}
		}
	}

	void printAccList() { 
		for(int i=0; i<accounts.length; i++) {
			Account acc = accounts[i];
			if(acc != null)
				System.out.println(acc); // BankApp1과 차이 - acc	
			else
				continue;
		}
	}

	Account findAccount(Account acc) { 
		for(Account acc_ele : accounts) {
			if(acc_ele != null && acc_ele.equals(acc)) // BankApp1과 차이 - equals() 사용
				return acc_ele;
		}
		return null;
	}
	
	void removeAccount(Account acc) {
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] != null  && accounts[i].equals(acc)) { // BankApp1과 차이 - equals() 사용
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
