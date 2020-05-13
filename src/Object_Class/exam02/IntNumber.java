package Object_Class.exam02;

class IntNumber {

	private int num;
	private String name; 

	IntNumber(int num, String name){
		
		this.num = num;
		this.name = name;
		
	}
	
   IntNumber(String name){
		
		this.name = name;
		
	}
   
    IntNumber(int num){
		
		this.num = num;
		
	}
	
	public int getNum() {
		return num;
	}

	@Override
	public boolean equals(Object obj) {
		// return super.equals(obj); // 부모의 equals(obj); 메서드 호출 
		
		IntNumber intNum = (IntNumber) obj;
		IntNumber StringName = (IntNumber) obj;
		
		if(num == intNum.num) {
			return true;
		}else {
			return false;
		}
	
		

		// equals : 값에 대한 비교를 재정의 해서 구현하여 사용. 
		// toString : 오버라이딩해서 기능을 재정의 해라, 설명 또는 comment 

	}
}
