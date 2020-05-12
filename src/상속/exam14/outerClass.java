package 상속.exam14;

class outerClass {
	private String myName; 
	private int num;
	
	InnerClass innerClass; // 가족 안에서는 이름안에서 얼마든지 접근이 가능하다. 
	
	outerClass(String name){
		
		myName= name ;
		num = 0;
		innerClass = new InnerClass();
		
	}
	public void whoAreyou() {
		num++;
		System.out.println(myName + "outerClass" + num); // 출력된 횟수
	}
	
	
	// 내부 class
	class InnerClass{
		InnerClass(){
			whoAreyou(); // 외부 class의 method나 field에 대한 접근이 자유롭다. 
			// 내부 class가 종속적으로 외부 class가 new 되어야지 내부 class 가 new 되기 때문이다. 
		}
	}
	
	
}


// Innerclass 는 outerclass에 종속적이다. 



