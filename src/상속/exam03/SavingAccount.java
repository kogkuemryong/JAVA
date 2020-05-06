package 상속.exam03;

class SavingAccount extends Accumulator{
	
	SavingAccount(int value){
		super(value);
	}
	
	public void saveMoney(int money) {
		//value += money; // 접근불가(private)
		setValue(money);
	}
	
	public void showSavedMoney() {
		System.out.println("누적 금액 : " + getValue());
	}

}
