package 상속.exam06;

public class HasAInheritance {
	public static void main(String[] args) {
		
        Police police1 = new Police(5,3);
		
		police1.shut();
		police1.putHandcuff();
		
		Police police2 = new Police(7,9);
		
		police2.shut(); // 논리적 모순 - 총알이 없는데 총을 쏠 수 없다. 
		police2.putHandcuff();
		

	}

}
