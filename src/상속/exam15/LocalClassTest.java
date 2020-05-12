package 상속.exam15;

public class LocalClassTest {

	public static void main(String[] args) {
		

		OuterClass outer = new OuterClass("First");
		
		Readable localClass  = outer.createLocalClassInst(5);
		
		localClass.read();
		
// method 안에 자료형이 정의되고 그안에 입력 값이 존재한다면  사라지지 않고 수행하도록 java가 지원해준다. 

	}

}
