package 배열;

public class JavaArrayLength {
	public static void main(String[] args) {
int[] age = new int[] {20,21,22,23,24,25,26};  //
		
		// count 값을 넣지 않아야 error 나지 않는다. 
		// 초기 값을 넣으면 그 값보다 작은 수를 넣으면 
		// 남은 공간에 무엇이 들어와야 하는지 모르기 때문에 java가 오류룰 낸다. 
		
		/*age[0] = 20;
		   age[1] = 21;
		   age[2] = 22;*/
		
		for(int i =0 ; i < age.length ;i++) {
			System.out.println("나이 : " + age[i]);
		}
       
		// age.length 의 age의 길이를 담기 때문에 code 시항되는데 문제 없이 수행된다. 
	

	}

}
