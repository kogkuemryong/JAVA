package 객체지향언어.person;

class person {
	private String name; // 이름
	private int milID; // 군번
	private int birthYear; // 년
	private int birthMonth; // 월
	private int birthDay; // 일
	
	person(String name, int milID, int birthYear,  int birthMonth ,  int birthDay){
		this.name = name; 
		this.milID =milID;                              // 생성자는 호출 할 수 없다. java만 new하는 시점에 한번만 출력된다. 
		this.birthYear = birthYear;                  // this 는 생성자를 호출할 수 있는 용도로 제공해준다. 
		this.birthMonth = birthMonth;            // 주의) 모든 생성자를 호출하는 값은 무조건 하나 있어야한다.
		this.birthDay = birthDay;

	}   

	person(String name, int birthYear,  int birthMonth ,  int birthDay){
		this(name, 0, birthYear, birthMonth, birthDay); 
		                                                                        
//		this.name = name;                                          
//		this.milID = 0;    
//		this.birthYear = birthYear;
//		this.birthMonth = birthMonth;
//		this.birthDay = birthDay;
	}
	
	person(String name){
		this(name, 0, 0, 0, 0);
 
		
//		this.name = name; 
//		this.milID = 0;    
//		this.birthYear = 0;
//		this.birthMonth =0;
//		this.birthDay = 0;
	}
	
	person(String name, int milID){
		this(name, milID, 0, 0, 0);
		
//		this.name = name; 
//		this.milID = milID;    
//		this.birthYear = 0;
//		this.birthMonth = 0;
//		this.birthDay = 0;
	}
	
	public void showInfo() {
		
		System.out.println("이름 : " + name);
		
		if (birthYear!=0){
		System.out.println("출생년도 : " + birthYear);}
		
		if (birthMonth!=0){
		System.out.println("출생월 : " + birthMonth);}
		
		if (birthDay!=0){
		System.out.println("출생일: " + birthDay);}
	
		if (milID!=0){
			System.out.println("군번 : " + milID);	}
		
		System.out.println();

}

}