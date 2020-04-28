package 객체지향언어;

class InstCnt{                 //int instNum;  출력값 1,1,1 , static int instNum;  출력값 1,2,3 
	static int instNum;      // static 있으면 먼저 메모리를 할당 한다. 
	
	
	InstCnt(){
		instNum++;            // instNum의 값을 초기화 하지 않았는데 error 이 나지 않았다. inutNum 가 static 되어 있어서 이미 메모리를 할당 받았기 때문이다. 
		
		System.out.println("인스턴스 생성 : " + instNum); 
	}                                                                         
}                                                  // 1) this 에 담고 2) 메모리 할당해주고 3) 생성자 호출해주고
                                                   // 4) this의 값이 instCnt1에 저장 된다. 

public class ClassVariable {
	public static void main(String[] args) {
		InstCnt  instCnt1;
//		System.out.println(instCnt1);  // error : instCnt1 new 요청에 의해서 java가 할당해주는 것은 별도의 초기화 없이 field 자료형의 따라 java가 초기화 해주는 특성을 가진다.  
		instCnt1 = new InstCnt();      // 그래서 default 값으로 초기화 된다. 초기화 된 값에 쓰레기 값이 들어가 있기 때문에 출력되지 않는다. 

		InstCnt  instCnt2= new InstCnt();
		InstCnt  instCnt3= new InstCnt();
		System.out.println(instCnt1.instNum); // instNum 하나의 값을 인스턴스가 공유하는 개념으로 알면 된다. 
		System.out.println(instCnt2.instNum);
		System.out.println(instCnt3.instNum);
		
		// 틀은 this 라는 것 하나지만 각각의 주소값은 다르게 나타난다. 
	}

// static 에 의해서 메모리 할당을 받았기 때문에 생성자가 바라볼 때는  instNum 이 값을 보기 때문에 공통되어 1이 누적이 되어서 출력된다. 
// new 할 때마다 instNum 공용으로 사용하겠다는 의미를 가진다. 그렇기 때문에 instNum 의 값이 누적 증가한다.  




		

	}


