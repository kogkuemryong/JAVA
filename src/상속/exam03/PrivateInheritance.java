package 상속.exam03;

public class PrivateInheritance {

	public static void main(String[] args) {
    SavingAccount sAccount = new SavingAccount(10000);
		
		sAccount.saveMoney(10000);
		sAccount.saveMoney(10000);
		sAccount.saveMoney(10000);
		
		sAccount.showSavedMoney();

		

	}

}
