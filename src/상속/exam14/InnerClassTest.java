package 상속.exam14;

public class InnerClassTest {

	public static void main(String[] args) {
		outerClass  outer1 = new outerClass("Frist");
		outerClass  outer2= new outerClass("Second");
	
        outer1. whoAreyou();
		// outerClass 가 new  된다 하더라도 InnerClass가 인스턴스화 되지 않는다. 
	
		
       // outerClass.InnerClass inner1 = new outerClass.InnerClass(); ///error 
        outerClass.InnerClass inner1 =  outer1.new InnerClass(); 
        outerClass.InnerClass inner2 =  outer1.new InnerClass();
        
        outerClass.InnerClass inner3 =  outer2.new InnerClass();
        outerClass.InnerClass inner4 =  outer2.new InnerClass();
        
        // static 이 붙고 붙지 않고의 차이로, 내부 class는 직접적인 접근이 불가능하다.
        // 내부 class는 외부 class의 의존적으로, 외부 class가 인스턴스가 되어 있어야지 인스턴스가 가능하다. 
        // 참조변수를 통해서 인스턴스화 한다. 
	

	}

}
