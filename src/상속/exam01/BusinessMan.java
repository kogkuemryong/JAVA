package 상속.exam01;
//자식 class (부모의 속성을 그대로 물려받는 구조)

class BusinessMan  extends Friend{
	private String company ; // 회사명
	private String department ;  // 소속부서
	private String businessNum ; // 사원번호
	
	// 자식 생성자 = 부모의 생성자 + 자식의 생성자 (부모의 field 초기화 의무)
    BusinessMan(String name ,  String birth ,  String address , String email, String company, String department, String businessNum){
    	super(name , birth , address , email);
    	this.company= company;
    	this.department = department ;
    	this.businessNum = businessNum ;
    	
    }
    public void displayBusinessManInfo() {
    	diplayFriendInfo();
    	
    	System.out.println("회사명 : " + company);
    	System.out.println("부서명 : " + department);
    	System.out.println("사원번호 : " + businessNum);
    	System.out.println();
    	

}
}
