package 배열;

public class IntroArray {
	public static void main(String[] args) {
		int youngheeKorea  = 90;
		int youngheeEnglish = 95;
		int youngheeMath = 85;
		int youngheeSocial = 95;
		int youngheeScience = 90;

		System.out.println(youngheeKorea);
		System.out.println(youngheeEnglish);
		System.out.println(youngheeMath);
		System.out.println(youngheeSocial);
		System.out.println(youngheeScience);
		
		// 공통된 자료형을 가지고 있으므로 5개의 data를 한개의 변수로 지정 = 배열 
		// 같은 자료형일 때만 사용이 가능하다. 
		// 배열 형태 - 자료형 [] 이름
		// 배열의 index 값은 0부터 시작되고, 음수는 올 수 없다. 
		// 하나의 이름으로 이름으로 여러개의 데이터를 저장할 수 있다. 
		// 데이터 처리에 반복문을 이용할 수 있다. 
		
		
		// (heap영역에 저장) 되어 있기 때문에 참조자료형을 이용해서 찾아 갈수 있다. 
		// 참조변수 (stack 영역에 저장) 4byte 할당 주소값이 저장된다. 
		// 참조변수에  heap의 저장되어 있는 데이터의 주소값이 저장되어서 불러올 수 있게 만든다.
		// heap에 데이터의 0부터 숫자를 넣어준다. 
		
		
		//하나의 이름으로 이름으로 여러개의 데이터를 저장
		
		int[] younghee = new int[5];
		
		younghee[0] = 90; // 국어
		younghee[1] = 95; // 영어
		younghee[2] = 85; // 수학
		younghee[3] = 95; // 사회
		younghee[4] = 90; // 과학
		
		// 데이터 처리에 반복문을 이용
		
	    for(int i = 0 ; i < 5; i++) {
	    	System.out.println(younghee[i]);
	    }
	
	}

}
