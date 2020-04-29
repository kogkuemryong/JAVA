package String;

public class StringInstance {
	public static void main(String[] args) {
		String name = "홍길동"; 
		String hello = new String("안녕하세요, 여러분!!!");
		// String은 참조자료형 이므로 할당받기 위해서는 new를 해줘야 하는데 
		// String 생성자들이 많이 오버로딩되어 있다.  
	    // String의 field, 생성자, method  데이터들이 heap 영역에 저장되어 있다. 

		System.out.println(name);
		System.out.println(hello);
		 
		// String이 참조변수이기 때문에 가능하다. 
		System.out.println(name.length());   
		System.out.println(hello.length());     
		// 메모리에 담아서 언제든 사용할 수 있도록 한다. 
		
		System.out.println("홍길동".length());
		// 문자열.method = java 문자열을 보면 "홍길동" 의 주소값을 불러오고.length를 수행하여 해당 메모리로 간다. 
		// 메모리에 담지 않아도 한번만 수행하고 끝이면 문제가 없다. 
		
		String name1 = new String("세종대왕");
		String name2 = new String("세종대왕");
		// 각각 메모리가 할당 되어 독립적으로 동작되어진다. 
		
	
		if(name1==name2) {
			System.out.println("같은 메모리를 가지고 있다. 동일한 인스턴스 참조");
		}else {
			System.out.println("같은 메모리를 가지지 않는다. 다른 인스턴스 참조");	
		}
		
		String name3 =  "이순신"; // (new String)"이순신"
		String name4 =  "이순신"; 	
		
		if(name3==name4) {
			System.out.println("같은 메모리를 가지고 있다. 동일한 인스턴스 참조");
		}else {
			System.out.println("같은 메모리를 가지지 않는다. 다른 인스턴스 참조");	
		}
		
		// String 경우 주소값을 출력 하는 것이 아니라 참조변수가 메모리 할 당할 때 문자열의 데이터를 출력하게끔 println이 만든다. 
		// println이 String의 값이 오면 문자열 입력값을 출력하게해준다. 문자열에 주소값을 출력하는 기능은 없다. 
		// 비교연산자를 통해서 주소값 비교는 가능하다. 
		// 문자열이 많이 사용되기 때문에 new String를 생략하여도 포함되어지게 동작한다(융통성 제공) 
		// new 을 넣은 값과  new를 생략한 값이 다르게 나온다. 
		// 동일한 문자열이 있으면 주소값을 찾아서 참조 변수에 저장을 해준다. 같이 동작 된다. 
		// new 를 붙이지 않은게 수행 속도가 훨씬 빠르다. 
		// date의 최소 단위를 byte로 해서 byte은 8bit의 조화로 수치형으로 문자열을 만들어 낸다. 
		// 문자열이 사람이 가장 많이 사용되기 때문에 문자열을 가지고 수행되는 다양한 기능들이 문자열의 데이터를 처리함에 있어서 미리 method로 구현해내고 있다.
	}

}
