package 상속;

class Person{
	private String name; 
	
	Person(String name){
		this.name = name; 
	 }

	@Override
	public String toString() {
		String str = name + "입니다.";
		return str;
	} 	
	
	// 만들어진 자료형이 어떤 특징을 가지고 있는지를 정의해서 알수있도록 사용하도록 만들어진 것이다. 
	
	
	
}

public class UseObject {
	public static void main(String[] args) {
		Person person = new Person("세종대왕");
		
            System.out.println(person); 
		
		
		// println 을 통해서  person 이라는 자료형을 넣어도 error 나지 않는다. 
		// 어떤 이름으로도 자료형을 선언하고 new 사용하여 인스턴스화 하여 넣어도 error 나지 않고 동작되게 만들어놨다. 
		// 컴파일할 때, java.lang 을 넣어줘서 import 하지 않아도 사용할 수 있게 해줬다. 
		// 새로 만든 class 를 컴파일 할 때, class 이름 extends Object{} 를 넣어주는 것이다. 
		// 무조건 Object를 상속하도록 한다. 
		// Object란?  - java.lang 에 저장되어 있다. 
		// 왜 Object를 상속하게 부모 class로 만들었나? 
		
		// println(object x) - 다형성에 의해서 object를 상속 받는 자식 class의 참조변수들이 error 가 나오지 않는 것이다. 
		// 참조 변수가 입력되면 toString() 이라는 method가 호출되게 만들었다. 
		
		// 만들어진 자료형이 어떤 특징을 가지고 있는지를 정의해서 알수있도록 사용하도록 만들어진 것이다.  
		
		
		
		
		

	}

}
