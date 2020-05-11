package 상속.exam10;

class HighFriend extends Friend{

	// field 
		private String work;
		
		
		// 생성자 (Constructor)
		HighFriend(String name, String phoneNum , String address,  String work) {
			super(name,phoneNum,address);
			this.work = work;

			// 부모 field 초기화의 의무를 가지기 때문에 super(); 사용하여 자식의 생성자가 호출 될때 그 값을 
			// 전달 받게 매개변수에 넣어서 기능을 구성해준다. 
		}
		
		// Method(멤버매서드)
	    // public void displayHighFriendInfo() {
	    	public void displayFriendInfo() { // 부모와 이름이 같도록 한다. overriding
	    		
	    	super.displayFriendInfo(); // 부모의 method 호출
	    	System.out.println("직업 : " + work);
	    	
	    }
	    	
	    	
	    // 이름, 직업 
	    public void  displayBasicFriendInfo() {
	    	System.out.println("이름 : " + getName());
	    	System.out.println("직업 : " + work);
	 
	    	
	    }
	    
	    /*public void  displayBasicFriendInfo() {
	    	System.out.println("이름 : " + getName());
	    	System.out.println("직업 : " + work);
	 
	    	
	    }*/  // 부모 class가  abstact 일때, 반드시 overriding 해서 기능을 재정의 하라는 
	          // 의미가 내포되어 있기 때문에 위의 코드를 생략하게 되면 error 나타난다. 
}
