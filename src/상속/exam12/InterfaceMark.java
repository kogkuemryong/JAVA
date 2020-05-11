package 상속.exam12;

public class InterfaceMark {

	public static void main(String[] args) {
		PointOne pos1 = new PointOne(3,5); // UpperCasePrintable 상속 o
		PointTwo pos2 = new PointTwo(7,3);  // UpperCasePrintable 상속 x 
		
		
		ClassPrinter.print(pos1); // 오버라딩 된 값 (모두 대문자로 출력)
		ClassPrinter.print(pos2); // 그냥 method 의 return 으로 나타난 값 

		

	}

}
