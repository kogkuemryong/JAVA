package 상속.exam06;
// Gun 을 가지고 있는 경찰에 대해서 정리 - 모든 경찰이 총을 가지고 있지 않다. 
// 예외가 존재하므로 상속 x


class Police {
	int handcuffs; // 소유한 수답의 수 
	Gun gun; 
	
	Police(int bullet, int handcuffs){
	this.handcuffs= handcuffs;
	
	if(bullet !=0) {
		gun = new Gun(bullet); // 총알이 존재한다면 gun을 생성하도록 한다. 	
	}else {
		gun = null;
	}
	
	}

	
	Police(int handcuffs){             // 매개변수 자료형의 타입이 다르던가, 개수가 달라야한다. 
	    gun = null;
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

	public void shut() {
		if(gun == null) {
			System.out.println("Hut BBAANG");
		}else {
			gun.shut();
		}

}
}
