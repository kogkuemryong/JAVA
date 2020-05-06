package 상속.exam07; // Speaker + alpha = BaseEnSpeaker

class BaseEnSpeaker extends Speaker{
     private static int baseRate; 
	 
	 public int getBaseRate() { // baseRate을 읽어오는 용도(getter)
		 return baseRate;
	 }
	 
	 public void setBaseRate(int baseRate) { // baseRate을 업데이트 하는 용도(setter)
		 this.baseRate = baseRate;
	 }

	 public void showCurrentState() {
		 
		super.showCurrentState(); // 같은 이름을 호출하게 되면 가까운 이름으로 인식하고 처리하기 때문에 
		                          // 나 자신을 인식하고 처리하므로 error를 낸다. 
		                          // super를 통해서 부모의 정의 되어있는 showCurrenState()를 호출해준다. 
		
		
		// System.out.println("베이스의 크기  : " + baseRate);
		 System.out.println("베이스의 크기  : " + getBaseRate());
	 }
	 
	 
	 // method overriding 
	 // 상속의 조건이 전제 되어야 한다. 
	 // 부모 class의 method의 입력이 형태는 물론이고 반환형 까지도 똑같은 이름의 method를 자식에게
	 // 똑같이 정의 해서 사용할 수 있다. 자식의 class에 (이름, 반환형)을 똑같이 정의 할 수 있도록 한다. 
	 // overloading 은 상속과 관련 없지만 overriding 은 꼭 상속의 전제 조건이 필요하고 
	 // 부모 자료형의 정의 되어 있어야만 의미를 가진다. 
	 // 자식의 class에 (이름, 반환형)을 똑같이 정의 할 수 있도록 한다. (기능도 같아야 하는 것은 아니다.)

}
