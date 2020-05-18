package Generics;

public class IntroGenericArray {

	public static void main(String[] args) {
		String[] stArr = {"HI.", "I ' m so happy." , "JAva Generic Program."};
		
		
		showArrayData(stArr);

		
		
	}
	
	//public static <T>void showArrayData(T arr) {}  T 어떤 자료형이든 상관 없이 입력되는 순간 자료형으로 확정되므로  error가 나타난다. 
	public static <T>void showArrayData(T[] stArr) {  // 입력 받는 참조자료형이 배열이 확신할 때, 배열 형으로 넣어 준다. 
		                                                               
		for(int i = 0; i <stArr.length; i++) {
			System.out.println(stArr[i]);
		}
	}


}
