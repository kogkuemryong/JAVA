package 상속.exam03;

class Accumulator {
private int value;
	
	Accumulator(int value){
		this.value = value;
	}
	
	protected void setValue(int value) {
		if(value < 0) return;
		
		this.value += value;
	}
	
	protected int getValue() {
		return value;
	}
}


