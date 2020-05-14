package Object_Class;

public class MathClass {

	public static void main(String[] args) {
		// 원주율, 제곱근
				System.out.println("원주율 : " + Math.PI); // Math 를 사용했는데 error가 나지 않음 = java.lang에 저장 
				System.out.println("2의 제곱근 : " + Math.sqrt(9)); // 루트사용, 실수로 출력.
				
				// 원주율의 따른 각도의 값
				System.out.println("파이에 대한 Degree : " + Math.toDegrees(Math.PI)); // 각도의 값을 출력, 원주율을 각도 값으로 출력. 파이에 대한 Degree : 180.0
				System.out.println("파이에 대한 Degree : " + Math.toDegrees(2*Math.PI)); // 파이에 대한 Degree : 360.0

				// sin, cos, tan 의 값
				double radian45 = Math.toRadians(45); 
				System.out.println("sin45 : " +  Math.sin(radian45));
				System.out.println("cos45 : " +  Math.cos(radian45));
				System.out.println("tan45 : " +  Math.tan(radian45));
				
				// 로그 함수 
		        System.out.println("로그 25 : " + Math.log(25));
		        
		        // 제곱 값
		        System.out.println("2의 4승 : " + Math.pow(2,10));
		        

	}

}
