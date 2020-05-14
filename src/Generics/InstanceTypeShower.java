package Generics;


class FatherClass{

	@Override
	public String toString() {
		return "classs FatherClass"; // 자료형에 대한 inform의 설명. // 문구 선언 
	}
}

class ChildClass{
	
	@Override
	public String toString() {
		return "classs ChildClass"; 
	}
}

class InstanceTypeShower {
	
int showCnt; 
	
	InstanceTypeShower(){
		showCnt = 0;
	}
	
	// GenericsMethod (자료형 2개)
	public <T,U>void showInstType1(T inst1, U inst2) {  // 호출하는 순간 자료형으로 대신하겟다. 
		
		showCnt++;
		System.out.println(inst1);
		System.out.println(inst2);
	}
	
	// GenericsMethod (자료형 1개)
	public <T>void showInstType2(T inst1) {  // 호출하는 순간 자료형으로 대신하겟다. 
		
		showCnt++;
		System.out.println(inst1);
	}
	
	public void showPrintCnt() {
		System.out.println("showCnt = " + showCnt);
	}

}
