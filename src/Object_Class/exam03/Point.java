package Object_Class.exam03;

class Point  implements Cloneable{
	private int xPos;
	private int yPos;
	
	Point(int x, int y){
		
		this.xPos = x;
		this.yPos = y;
		
	}
	
	public void showPosition(){
		System.out.printf("( %d , %d )\n", xPos, yPos);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException { // 모든 자료형들이 복사 될 수 있기 떄문에 최상위 부모 class 인 Object 로 관리하도록 범용적으로 만들기 위해서 자료형이 Object 이다. 
		return super.clone();
		// return super.clone(); heap 영역에 복사해서 만들어둔 clone 내용의 주소값이 return 된다.  
		
	}
	// CloneNotSupportedException 예외에 대한 처리할 수 있는 try / catch 문으로 감싸줘야지 수행할 수 있다. 
    // clone 은 인스터스에 대한 복사를 한다. (Point)
	// 복사 하기 위해서는 허락을 받아야 하는데, 허용한다는 의미로 class Point implements Cloneable 넣어준다.  = Cloneable 는 이름만 가진 interface 이다. 
	// 다른 method이 들어 있지 않은 interface  표시용으로 사용(이름만 가지고 있는 interface) 

}
