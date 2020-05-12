package 예외처리;

public class RuntimeExceptionCase {

	public static void main(String[] args) {
		
		// ArrayIndexOutOfBoundsException
				try {
					int[] arr = new int[3];
					arr[-1] =20; // index 값은 0부터 시작. // ArrayIndexOutOfBoundsException 배열의 범위를 넘어설때 나타나는 예외
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println(e.getMessage()); // getMessage : java 가 사용하는 오류 메세지 출력
					System.out.println("배열의 범위를 벗어남."); 
				}	
			
				
				// ClassCastException
				try {
					Object obj = new int[10];  // 모든 자료형은 java가 Object를 상속하는 구조로 만들어주기 때문에 
					                                      // 다형성에 관계에 의해서 자식의 자료형을 부모의 자료형으로 바라 볼 수 있으므로 문제 없다.
					String Str = (String) obj;    // int 형을 String으로 잘못된 강제 형변환에 의한 error 발생 
				}catch(ClassCastException e) { // ClassCastException: 강제형변환 예외.
					System.out.println(e.getMessage()); // getMessage : java 가 사용하는 오류 메세지 출력
					System.out.println("int 형을 String으로 잘못된 강제 형변환에 의한 error 발생 "); 
				}

				// NegativeArraySizeException
				try {
					Object obj = new int[-10]; 
				}catch(NegativeArraySizeException e) { 
					System.out.println(e.getMessage()); // getMessage : java 가 사용하는 오류 메세지 출력 //
				} // null 출력 , 모든 결과가 메세지로 나오지 않는다. 
				
				
				// NullPointerException
				try {
					String name = null;
					int length = name.length(); // NullPointerException : 참조자료형에 new 의해서 주소값을 담아주지 않고 method를 생성하기 때문에 발생. 주소값이 담겨 있지 않는 null 값이다. // name 값이 null
				}catch(NullPointerException e) {  
					System.out.println(e.getMessage());
				}

	}

}
