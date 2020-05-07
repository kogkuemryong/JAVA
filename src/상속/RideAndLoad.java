package 상속;

class AAA {public void rideMethod(){System.out.println("AAA's Method");} // overriding (가려짐)
public void loadMethod(){System.out.println("void Method");} // overloading
} 

class BBB extends AAA { public void rideMethod(){System.out.println("BBB's Method");} // overriding (가려짐)
                   public void loadMethod(int num){System.out.println("int Method");} //overloading
} 
class CCC extends BBB { public void rideMethod(){System.out.println("CCC's Method");} // overriding 
                   public void loadMethod(double num){System.out.println("double Method");} // overloading
}

public class RideAndLoad {
	public static void main(String[] args) {
		// 다형성 관계 
				AAA ref1 = new CCC();  
				BBB ref2 = new CCC(); 
				CCC ref3 = new CCC(); 
				 
				// method overriding 
				ref1.rideMethod(); // CCC's Method       // rideMethod(); 다형성의 overriding 되어 있으므로, 
				ref2.rideMethod(); // CCC's Method       // CCC 자료형의 overriding 되어 있는 rideMethod();로 실행한다. 
				ref3.rideMethod(); // CCC's Method  
				
				// method overloading
				ref3.loadMethod(); // void Method - AAA
				ref3.loadMethod(1); // int Method - BBB
				ref3.loadMethod(1.2); // double Method - CCC
		
	}

}
