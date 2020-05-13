package Object_Class.exam01;

public class ObjectFinalize {
	public static void main(String[] args) {
		
		  System.out.println("프로그램 시작.");
		    
		    MyName obj1 = new MyName("인스턴스1");
		    
		    
		    
		    obj1 = null;
		    
		    System.gc(); // garbage collection  - interupt할 시간이 되지 않았더라도 소멸할 인스턴스가 있는지 찾으러 간다. 
		    
		    /*
		     출력 값:
		    
		     프로그램 시작.
		     프로그램 종료. 
		     인스턴스1이/가 소멸되었습니다. 
		     
		     System.gc(); 의 수행 되어야지 System.out.println("프로그램 종료."); 가 수행되는 것이 일반적인데 예외의 상황도 존재한다. 
		     */

		    
		    System.runFinalization(); // 먼저 프로그램이 종료 되지 않고 finalize가 수행되도록 한다. 
		    
		    /*
		    프로그램 시작.
		    인스턴스1이/가 소멸되었습니다.
		    프로그램 종료.
		    */

		    
		    
		    
		    System.out.println("프로그램 종료.");

		
	}

}
