package 상속.exam01;

class Student extends Friend {
	private String university ; // 학교명
	private String major ; // 전공
	
	
	// 부모 class에서 생성자를 입력하는 순간 자식 class 에서 error를 낸다. 
	// 생성자를 입력하지 않으면 기본 default 값으로 class 와 같은 이름으로 만들어지기 때문이다. 
	// 해결점 : 부모class의 field 값을 초기화 해준다. 
	
	// 자식 생성자 = 부모의 생성자 + 자식의 생성자 (부모의 field 초기화 의무)
	Student(String name ,  String birth ,  String address , String email, String university , String major){
		//Friend(); 생성자를 직접 호출할 수 없기 때문에 error를 내기 때문에 대신하여 사용 되는 명령어 = super();
		
		super(name , birth , address , email); 
		// 자식 class가 부모의 class를 field 를 초기화 해줘야하는 의무를 가졌다. 
		// 생성자에 아무것도 넣지 않으면  error나지 않는다.
		// super 명령어는 상속에서만 사용 가능하다. 
		 
		
	    this.university = university;
	    this.major= major;
	    
	  }
	
	    public void displayStudentInfo() {
	    	diplayFriendInfo(); // 상속이 되어 있기 때문에 method도 이름만으로  가져올 수 있다. 
	    	System.out.println("학교명 : " + university);
	    	System.out.println("전공 : " + major);
	    	System.out.println();
	    	
	  
	
	    }
}
