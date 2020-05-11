package 상속.exam12;

class PointOne extends Object implements UpperCasePrintable{// 상속과 implements 가 하나의 자료형에 함께 사용되는 것은 문제가 없다. 
	private int xPos , yPos;                                                      //  extends Object 생략 가능. 

	PointOne(int x , int y){
		this.xPos = x;
		this.yPos = y;
	}
	
	@Override
	public String toString() {
		String posInfo = "[ x pos : " + xPos + ", y pos : " + yPos+ " ]";
		
		return posInfo;
	}
	
//  System.out.println(참조변수); 했을 때, toString()이 호출되도록 했다. 
	// 

}

// java는 컴파일을 할 때, class PointOne extends Object 형태로 , 강제로 Object 를 상속하게 한다.
// java가 앞으로 만드는 자료형에 대해서 예외 없이 참조변수를 System.out.println(참조변수); 수행했을 때 error 가 나지 않도록 하기 위함. 



