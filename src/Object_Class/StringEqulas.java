package Object_Class;

public class StringEqulas {

	public static void main(String[] args) {
		String str1 = new String("Hi my string");
		String str2 = new String("Hi my string");

		// new를 사용하면 같은 내용일지라도 다른 주소값을 가진다. 
		// new가 생략되면 같은 내용일 때 같은 주소값을 가진다. 
		
		if(str1 == str2) {
			System.out.println("인스턴스 값 일치");
		}else {
			System.out.println("인스턴스 값 불일치");
		}
		
		
		// 문자열 비교 compareTo() 사용. 
		// compareTo method는 사전상의 순서를 확인하고 싶을 떄 사용한다. 
		if(str1.compareTo(str2)==0){
			System.out.println("같은 내용 입니다.");
		}else {
			System.out.println("다른 내용 입니다.");
		}
		
		// 문자열 비교, equals : 내용을 비교하게 이미 String  안에 overriding  되어 있다.  
		// 문자열의 내용을 비교함에 있어서 거의 equals method를 사용한다. 
		if(str1.equals(str2)) {
			System.out.println("같은 내용 입니다.");
		}else {
			System.out.println("다른 내용 입니다.");
		}
		
	}

}
