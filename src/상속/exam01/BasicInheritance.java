package 상속.exam01;

public class BasicInheritance {
	public static void main(String[] args) {
Student student = new Student("홍길동", "20000504","서울시 종로구", "abc@naver.com","더조은", "경영학");
		
		student.diplayFriendInfo();  // 부모 class 의 method 사용 가능 
		
		student.displayStudentInfo();
		
		/*
		 * 출력값 
		 * 이름 : 홍길동 
		 * 생년월일 : 20000504
		 * 주소 : 서울시 종로구 
		 * 이메일 : abc@naver.com 
		 * 학교명 : 더조은 
		 * 전공 : 경영학
		 */
		
		
		BusinessMan bMan = new BusinessMan("이순신" , "20010504","경기도 안성","xyz@naver.com ", "더조은학원", "영업부", "123456");
	   
		bMan.diplayFriendInfo(); // 부모 class 의 method 사용 가능 
		
		bMan.displayBusinessManInfo();
		   
		/*
		 * 출력값 
		 * 이름 : 이순신 
		 * 생년월일 : 20010504 
		 * 주소 : 경기도 안성 
		 * 이메일 : xyz@naver.com 
		 * 회사명 : 더조은학원
		 *  부서명: 영업부 
		 *  사원번호 : 123456
		 */
		

	}

}
