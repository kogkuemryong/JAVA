package 상속.exam12;

class PointTwo {
	private int xPos , yPos;

	PointTwo(int x , int y){
		this.xPos = x;
		this.yPos = y;
	}
	
	public String toString() {
		String posInfo = "[ x pos : " + xPos + ", y pos : " + yPos+ " ]";
		return posInfo;
	}
	//  System.out.println(참조변수); 했을 때, toString()이 호출되도록 했다. 


}
