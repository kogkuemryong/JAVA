package Object_Class;

import java.util.Random;

public class RandomNumberGenerator01 {

	public static void main(String[] args) {
      Random random  = new Random();
		
	    random.setSeed(System.currentTimeMillis()); // 컴퓨터의 현재 시간을 Millissecond 단위로 정수화 해서 계산 한것을 return 하는 것이다. (1/1000  초) 
        // random.setSeed(10); // 정해져있는 값을 넣으면 항상 같은 결과를 출력해준다.  setSeed(=기준값)
		
		for(int i=0; i<10 ; i++) { // 규칙성 없는 0~99의 정수에서 random 으로 10개의 숫자를 출력한다.   random을 선언했을 때, random.setSeed(System.currentTimeMillis()); 기본적으로 수행한다. 
			System.out.println(random.nextInt(100)); 
		}
	// 컴퓨터는 불규칙성을 가지고 출력 하는 것이 불가능 하다고 하는데 출력 할때마다 규칙성이 없게 출력 되는 이유는?
	// 현재 시간을 Millissecond 단위로 정수화 해서 계산 한것을 return 하므로 규칙된 값들이 random 으로 보이는 것이다. 기준값이 (1/1000 초) 으로 바뀌기 때문에 불규칙하게  출력되는 것으로 보인다.  
		

	}

}
