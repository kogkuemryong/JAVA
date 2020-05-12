package 상속.exam13;

class OuterClassTwo {
NestedClass nst;
	
	OuterClassTwo(){
		nst = new NestedClass(); // private 여도 가족 안에서는 사용 가능 하다. 
		nst.simpleMethod();
		
	}
	
	private static class NestedClass{ // 자료형에 접근제어지시자는 일반적으로  public과  default만 가능한데
		public void simpleMethod() {   // NestedClass일때 private도 가능하다.  
			
			System.out.println("private NestedClass ==> simpleMethod()");
		}
		
		
	}

}
