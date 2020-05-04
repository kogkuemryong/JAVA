package 상속.exam02.protect;

public class FatherClass {
	private int num1; // 정보은닉
	int num2; //default  - package 안
	protected int num3;  // 부모 상속 관계 and 같은 package
	public int num4;  // everywhere
	
	public FatherClass(int n1, int n2, int n3, int n4) {
		
		this.num1 = n1;
		this.num2 = n2;
		this.num3 = n3;
		this.num4 = n4;
	}
}

// 접근제어어 사용 = 자료형(public, default), method , field  
// class가  public 이면 생성자도  public 으로 만들어야 한다. 



// 참조자료형 에서 method를 통해서 접근 할 수 있도록 하는 이유:
// method 로 접근 하도록 하는 이유는 내가 만든 것이기 때문에 조건을 제시하여 
// 값을 체크할 수 있는 안정성을 확보 하도록 하기위해서이다. 

// field 로 접근하도록 하면 정보 은닉 및 변경이 가능해지기 때문에 접근하지 
// 못하도록 하는 것이다. 

