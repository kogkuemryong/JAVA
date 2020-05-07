package 상속.exam04;

public class StaticInheritance {
	public static void main(String[] args) {
		Adder adder = new Adder() {}; 
		// Adder의 자료형과 field의 특징이 필요한 것이지 adderFriend와 상관없다. 

        adder.add(1);

        System.out.println(adder.val); 
        System.out.println(Adder.val); // class 변수 (class 이름으로 접근)
 
        AdderFriend aFriend = new AdderFriend();
        aFriend.add(1); // 부모 class의 add method 
        System.out.println(aFriend.val); //  자식의 자료형으로 생성된 것으로 부모 클래스의 method 의 접근이 가능. 
        System.out.println(AdderFriend.val); // 자식의 class의 이름으로 접근 가능하다. 

        aFriend.showVal();  

        // static 일 때 , 부모 와 자식 관계는 동일하게 사용가능 하다. 
        // static 자체가 공용이라는 의미를 가지고 있기 때문에 상속에 있어서 문제 되지 않는다.


	}

}
