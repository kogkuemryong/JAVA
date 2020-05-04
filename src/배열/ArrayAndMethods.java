package 배열;

public class ArrayAndMethods {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5}; // new int[] 생략하고 초기화가 가능하다.   
        int num = 10;
        int [] result ; // 참조 변수 선언으로 stack 영역에 4byte 할당해준다. 
        
		 result = addAllArray(arr , num); // arr = a, num = 30
		 
		 for(int i = 0; i < result.length; i++) {
			 System.out.println("result : " + result[i]); 
		 }
		 
		 for(int i = 0; i < arr.length; i++) {
			 System.out.println("arr : " + arr[i]);	 
		 }
	}
	
	public static int[] addAllArray(int[] a, int n) {  // 매개변수 + 지역변수 - int[] arr 과 같은 주소값을 가진다. 
		                                                         // 참조변수 일 때, 주소값을 전달 받도록 해서 사용한다. 
		      

	for(int i = 0; i < a.length;i++) {
		a[i] += 10;
		System.out.println(a[i]);
	}
	    System.out.println(" n = " + n );
	    
	    for(int i = 0; i < a.length; i++) {
	    	System.out.println("메서드 : " +  a[i]);
	    }
	    
	  
	    
		return a; 	


	}

}
