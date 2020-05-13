package Object_Class.exam04;

public class AutoBoxingAutoUnboxing {

	public static void main(String[] args) {
		//Integer iValue = new Integer(10); // Boxing 
				Integer iValue =/*new Integer*/ 10;  // AutoBoxing
				// Integer기본 자료형이라고 처럼 사용 가능하며 new Integer의 내용을 생략하더라도 자동으로 들어간다. 
				
				System.out.println(iValue.intValue()); // Unboxing
				System.out.println(iValue); // AutoUnboxing

	}

}
