package Object_Class.exam01;

//import java.lang.*;   // Object - java.lang 에 저장되어 있다. // java.lang.*; java.lang에 들어있는 모든 매개변수를 import 한다. 


class MyName /*extends Object*/{
	
String name; 
	
	MyName(String name){  // this는 간접적인 생성자 호출 , super 상속일 때는 부모생성자 호출 
		this.name = name;
	}

	@Override
	protected void finalize() throws Throwable { // protected 상속의 개념 안에서 자식 안에서 이름 만으로 사용 가능.(pakage 안에서도 사용가능) 
		
		super.finalize();
		System.out.println(name + "이/가 소멸되었습니다.");
		
		// super.(부모의 시작위치로 감) 부모의 finalize(); method 호출.  / super :  상속에서만 사용
		// java 에서 제공해주는 method 를 먼저 수행을 하고, 내가 원하는 기능으로 수행하도록 해야한다 .
		// 내가 원하는 기능을 먼저 수행하게 되면 java에서 제공해주는 method 수행이 이루어 지지 않을 수 있고, 또는 error 가 나타날 수 있다. 
		
		
		 // finalize : heap에 담긴 인스턴스를 소멸하기 직전에 호출되는 명령어이다. 마지막으로 구현하고 싶은 기능을 사용하고 인스턴스가 소멸된다. 
		 // java가 자동으로  finalize 를 호출하는데 그 메서드를 override 해서 마지막 기능을 수행한다. 
		
		/*
		프로그램은 순차적으로 진행되는데 주기적으로 (interupt) 
		일정 주기마다 참조 변수들을 관찰하여 참조변수에 null  값이 수행된 것이 있는지 본다. 
	     인스턴스를 바라보는 참조 변수가 여러개가 있는지 일정시간 동안 확인을 하고 확실해지면 소멸시킨다. 일정시간이 지나기 전 프로그램이 종료되는 경우도 많이 있다. 
	     호출이 안되는 이유는 시점에 차이에 의한 것이다.  
	     
	    System.gc(); // garbage collection  - interupt할 시간이 되지 않았더라도 소멸할 인스턴스가 있는지 찾으러 간다.  
	     
	     
	     

	     
	     
	     프로그램이 종료되면 운영체제가 전체를 소멸 시킨다. 
		*/
		
	
	}

}
