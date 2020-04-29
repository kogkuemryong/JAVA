package 객체지향언어.ClassVarAccess;

class AccesWay{
	static int num = 0; // static의 이름이 main 안에서 등장하는 순간 메모리를 할당 받기 때문에 값을 바로 넣어서 정확하게 한다. 
                                 // static의 궁극적 목적은 공유 하는 하는 것이다. 이름만으로 호출이 가능하다. 
	                             // 공유함으로 업데이트 되기 때문에 생성자 안에서 초기화 되면 누군가에 의해서 변할 수 있기 때문에 불가하다. 
	AccesWay(){
	inctrmentCnt();		
	}
	
	public void inctrmentCnt() {
		num++;
	}
	
}

public class ClassVarAccess {
	public static void main(String[] args) {
		AccesWay.num = 10;  // class 의 이름으로  static이 선언된 변수에 접근할 수 있도록 해준다. <참조변수>
		System.out.println(AccesWay.num); // class로 가서 static 을 보고 할당 받은 메모리가 있기 땨문에 가능하다. 
		
		AccesWay accesWay1 = new AccesWay();
		System.out.println(accesWay1.num); // 참조변수
		
		accesWay1.num++;
		System.out.println(accesWay1.num);
		
		AccesWay accesWay2 = new AccesWay();
		System.out.println(accesWay2.num);
		
		System.out.println(accesWay2.num++);
		
		System.out.println(AccesWay.num);
	}

}
//생성자 호출 -> this 값이 accesWay1에 담긴다. 
