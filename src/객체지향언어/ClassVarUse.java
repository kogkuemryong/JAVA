package 객체지향언어;

class Circle{ // 원의 둘레, 넓이                                    static 변수 확인 double 8byte 할당 하여 공유, final 로 변경x
	private double radius;                                 
    static final double PI = 3.141592;
	
	Circle(double rad){
		this.radius = rad;
	}

	public void showPerimeter() { // 원의 둘레 출력
		double result = 0;
		result = 2* PI * radius;
		System.out.println("반지름 " + radius +" 의 둘레 : " + result);
	}
	
	public void showArea() { // 원의 넓이 출력
		double result = 0;
		result = PI * radius * radius;
	    System.out.println("반지름 " + radius + " 의 넓이 : " + result);
	}
}
public class ClassVarUse {
	public static void main(String[] args) {
		Circle circle1 = new Circle(2.5);                     
		circle1.showPerimeter();                              
		circle1.showArea();                                      

	
	}

}
