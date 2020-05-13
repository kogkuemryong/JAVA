package Object_Class;

public class UseWrapperClass {

	public static void main(String[] args) {
		String name = "홍길동";
		int num = 5;
		
		Integer intInst = new	Integer(5); 
		// java.lang 에서 제공. Integer: 기본자료형을 class로 감싸주는 명령어. 
		
		ShowData(intInst);	
		ShowData(num);	 
		// num 을 읽을 때 값이 5가 있고 그 자료형은 기본 자료형인 int 이기때문에 자동 AutoBoxing 되어서 가능해진 것이다. 
		// int -> Intiger
		
		ShowData(name);// String = 참조변수 //
		
	
		
		
		// 기본 자료형 은 참조 자료형이 아니므로 Object를 상속 받지 않는다? (모든 참조자료형은 Object 입력으로 전달 받을 수 있다.)
		// 원칙적으로 보면 int, String은 기본자료형으로 Object 를 상속 받지 않으므로 error 를 내야한다. 
		// 기본 자료형을 Object에 입력 으로 전달하고 싶을 때 wrapper로 사용한다. 
		// 기본 자료형값을 class로 감싸서 참조 자료형의 형태로 변화 시켜 사용할 수 있게 만드는 것이다.  
		
	}
	
	public static void ShowData(Object obj) {
		System.out.println(obj);

	}

}
