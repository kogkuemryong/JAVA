package 상속.exam08;

class HighFriend  extends Friend{
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
	    public void displayHighFriendInfo() {
	    	displayFriendInfo(); 
	    	// overring 할 때는 super.을 붙여야 하고 , 그렇지 않을 때에는 붙이지 않아도 된다. 
	    	System.out.println("직업 : " + work);
	    	
	    }

}
