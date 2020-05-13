package Object_Class;

public class BoxingUnBoxing {

	public static void main(String[] args) {
		// Wrpper class : 기본 자료형을 class 로 감싸서 참조 자료형으로 사용 할 수 있도록 한다. 
		
		
			Integer iValue = new Integer(10); // Boxing 
			Double dValue = new Double(3.14); // Boxing
			
			int num = iValue.intValue(); // UnBoxing 
			// intValue : int 자료형의 담긴 값을 기본 자료형으로 반환한다. 	
			System.out.println(num);
			
			double num2 = dValue.doubleValue();// UnBoxing 
			// doubleValue : double 자료형의 담긴 값을 기본 자료형으로 반환한다.
			System.out.println(num2);

			
			iValue = new Integer(iValue.intValue()+10); 
			System.out.println(iValue.intValue());

	}

}
