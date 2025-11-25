package ch02_BankApp1;

public class Test1 {

	public static void main(String[] args) {
		Bank korea = new Bank("한국", 5);
		
//		korea.addAccount(new Account(111));
//		Account acc1 = new Account(222);
//		Account acc2 = new Account(333, "lee", 5.6);
//		korea.addAccount(acc1);
//		korea.addAccount(acc2);
//		korea.printAccList();
//		
//		Account find_acc = korea.findAccount(222);
//		if(find_acc == null) {
//			System.out.println("No find");
//		}
//		else {
//			korea.removeAccount(222);
//		}
//		
////		System.out.println("find : " + find_acc.getInfo());
//		
//		korea.printAccList();
		
		Account[] accs = korea.getAccount();
		accs[1] = new Account(111, "sung", 55);
		accs[2] = new Account(222, "koo", 66);		
		double total = 0;
		for(Account acc : accs) {
			if(acc == null)
				continue;
				else
					total += acc.getBalance();
		}
		System.out.println(total);
		
	}

}
