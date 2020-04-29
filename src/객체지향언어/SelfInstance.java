package 객체지향언어;


class Self{
	private int num = 0; // field
	
	Self(){ 
		num = 5;
	}
	public static void makeSelf() {   //class method 
		//new Self();// 자신인 class 를 인스턴스화 한다. 
	}
	public void useSelf() {
		System.out.println("num = " + num);
		new Self(); // useSelf 가 메모리에 할당 되어있지 않기 때문에 할당 되기 때문에 문제 될게 없다.
                           // 먼저 할당이 되어있는 상채이고 거기에서 useSelf()가 호출이 되면 new Self(); 실행되는 것이 아니다. 
		                    // method 크기 만큼만 할당 되는 것이다. 
	}
}

public class SelfInstance {
	public static void main(String[] args) {
    Self.makeSelf();
		

	}

}
