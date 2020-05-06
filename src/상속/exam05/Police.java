package 상속.exam05;

class Police extends Gun{
	
int handcuffs; // 소유한 수답의 수 
	
	Police(int bullet, int handcuffs){
	super(bullet);
	this.handcuffs= handcuffs;
	
	}
	
	public void putHandcuff() {
		if(handcuffs<1) {
			System.out.println("수갑이 없어요.");
			return;
		}
		System.out.println("SNAP!!!"); // 수값을 채우다. 
		handcuffs--;
		
	}

}
