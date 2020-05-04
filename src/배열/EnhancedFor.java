package 배열;

public class EnhancedFor {// for - each 문

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int sum = 0;
		
		//주의 (;) 세미콜론이 아닌 (:) 콜론 하나만 사용. 배열의 전체를 참조할 필요가 있는 경우에 유용되는 반복문이다. 
		// for (int e :arr){ } arr의 숫자 하나씩 e에 담아주면서 반복한다. 
		for(int e :arr) { 
			 System.out.println("e = " + e);
			 sum += e;
			
		}
		
		System.out.println("배열 요소의 합 :  " + sum);
		
		for(int e :arr) { // arr 의 값은 변경 없음. 
			e++; // e라는 별도의 저장공간을 할당 받아서 수행하는 것이기 때문에 arr과 상관이 없다. 
			System.out.print(e + " " ); // 한줄에 다 출력되게 만들 때 = print 사용.
		}
		System.out.println();
		
      
		for(int e : arr) {
			System.out.print(e + " ");
		}
		

	}

}
