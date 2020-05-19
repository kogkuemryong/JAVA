package Stream.Circle;

import java.io.Serializable;

class Circle implements Serializable{
	
	int xPos, yPos;
	double rad;
	
	Circle(int xPos, int yPos, double rad){
		
		this.xPos = xPos;
		this.yPos = yPos;
		this.rad = rad;
	}
	
	public void showCircleInfo() {
		System.out.printf("[%d , %d]\n", xPos, yPos);
		System.out.println("rad : " + rad);
	}

}
