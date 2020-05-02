package 배열;

public class InstanceArry {
	public static void main(String[] args) {// (String[] args) = 참조 변수를 매개변수로 선언 
		String[] strArr = new String[3]; // 12byte 할당. 
		
		
		System.out.println(strArr[0]); 
		// null 출력 : 선언이 되어서 메모리가 할당 되어 있지만 아무값도 입력되지 않아서 null이 출력된다. 
         
		
	    strArr[0] = "홍길동";
	    strArr[1] = "이순신";
	    strArr[2] = "세종대왕";
	    // 문자열이 저장되어 있는 주소값을 저장하려고 하는 것이다.
	    // 메모리 어딘가에 있는 문자열을 각각의 시장 주소값을 저장하기 위해서 new를 선언하여 
	    // strArr으로 주소값을 저장시키는 것이다. 
	    // String도 참조자료형
	 
	
		System.out.println(strArr[0]); 
		System.out.println(strArr[1]); 
		System.out.println(strArr[2]); 
		
		
		 for(int i = 0; i< strArr.length ; i ++){ 
			 System.out.println(strArr[i]); 
			 }
		
	    
		for(int i = 0 ; i < args.length ; i++){
	            System.out.println(args[i]);
	        }
		
		

	}

}
