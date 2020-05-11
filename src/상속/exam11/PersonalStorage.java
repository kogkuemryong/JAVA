package 상속.exam11;

// abstract class PersonalStorage {
interface PersonalStorage{ // 추상 method만 정의 되어 있는 class
	
	// 독립적으로 인스턴스 해서 사용할 자료형이 아니고, 부모 class로 사용할 것을 의미한다. 
	// 상속의 관계하에서 overriding해서 사용할 것이라는 추상 class 이다. 

	
	/* public abstract */ void addPersonalInfo(String purNum , String name); // 추상메서드
	public /*abstract */ String searchName(String perNum);
	
	// interface class 일때 /* public abstract */  생략이 가능하다. 
	// 대체로  interface class 일때  /*abstract */ 만 생략해서 사용을 많이 한다. 

}

//C++ 에서 사용되는 , java 에서는 다중 상속이 지원되지 않는다. 
//: 다중상속만으로 가능한 기능x , 
//C++ 에서 사용되는 다중 상속에 의해서 구조가 복잡해지고 프로젝트 자체가 가독성이 떨어진다. 
//가독성이 좋아지고 프로그램이 복접해지는것을 막기 위해서 지원하지 않는다. 
