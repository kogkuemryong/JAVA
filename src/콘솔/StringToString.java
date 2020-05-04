package 콘솔;

class Friend{  
	
	// field 
	private String name ;
	
	// 생성자
	Friend(String name){ // 필드를 초기화 하는 것으로 생성 됐을 때 바로 사용될 수 있도록 만든단. 
		this.name = name; 
	}

	// method 
	public String toString() { // 생성자에서 초기화 된 자료형을 method에서 활용. 
		return "제 이름은 " +  name + " 입니다.";
	}
}

public class StringToString {
	public static void main(String[] args) {
		
Friend friend1 = new Friend("세종대왕"); 
		
		String result ; 
		result = friend1.toString();
		System.out.println(result);
		
		System.out.println(friend1); // 참조자료
		// 주소값이 출력 되는 것이 아니라, toString 메서드를 호출한 결과와 같은 결과값이 출력 된다. 
        // 참조자료형 으로 전달 받았을 때는 System.out.println가 메서드가 출력 되도록 오버로딩 되어있다. 
		
		String name = "홍길동";
		System.out.println(name);// 참조자료
		// 문자형으로 전달 받았을 때는 System.out.println가 데이터가 출력 되도록 오버로딩 되어있다. 
		
	}

}
