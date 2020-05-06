package 상속.exam06;

class Gun {
    int bullet; // 장정된 총알의 수 
	
	Gun(int bullet){  // 생성자 
		this.bullet = bullet;
	}
	
	public void shut() {  // 총의 기능 
		if (bullet<1) {
			System.out.println("총알이 없어요.");
			return;  // 1) 값을 반환 2)만나는 즉시 매서드를 호출한 쪽으로 복귀
		}
		System.out.println("BBang");
		bullet--;
		}	
}
