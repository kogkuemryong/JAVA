package 상속.exam02;

import 상속.exam02.protect.FatherClass;

class ChildClass extends FatherClass{ 
	
	// 상속의 관계에선 부모의 field를 초기화해야할 의무를 가진다. 	
	// ChildClass(){ super(); } - fault 
	ChildClass(int n1, int n2, int n3, int n4){
		super(n1, n2, n3,  n4);
	}
	
	public void childMethod() {
		// System.out.println("num1 = " + num1); 
		// error : private(접근불가) - 정보 은닉이 우선순위로 작동 
		// System.out.println("num2 = " + num2);
		// error : default - 같은 package 안에 있어야 함으로 다른 package에서 접근 불가.
		System.out.println("num3 = " + num3 );
		// protected int num3;(접근가능) 부모와 자식의 상속 관계 이므로 error 나지 않는다. 
		System.out.println("num4 = " + num4);
		// public int num4; (접근가능) 어디서든 호출 가능. 

	}
}

public class FieldInitheritance {
	public static void main(String[] args) {
		ChildClass child = new ChildClass(1,2,3,4);

		
		
	}

}
