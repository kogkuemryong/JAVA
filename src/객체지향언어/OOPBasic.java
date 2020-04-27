package 객체지향언어;

class Employee{                                
                               // 사원이라는 대상의 속성으로 만들어낸 틀이다. 
// field / 멤버변수                          // class : 틀을 만들어주는 명령어
int empno;                     // 선언만 되어 있을 뿐이지  
String ename;                  // main 안에 들어있지 않기 때문에 결과가 수행되지 않는다.
String job;                    // Employee 이름의 자료형으로 내가 저장해준것이다. 
int mgr;
int sal; 
int deptno;	  


//멤버 메서드 (인스턴스 메서드)-- 기능 추가
public void displayEmployee() {                //카맬 방식으로 두단어를 합친 이름만들기
System.out.println("사원번호 : " + empno);
System.out.println("사원이름 : " + ename);
System.out.println("직책 : " + job);
System.out.println("사수번호 : " + mgr);
System.out.println("급여 : " + sal);
System.out.println("부서번호 : " + deptno);

// king.displayEmployee(); // main 안에서 입력 했을 떄 밑의 값이 출력된다. 
/*
* 사원번호 : 1000 
* 사원이름 : 사장님 
* 직책 : 관리 
* 사수번호 : 0
* 급여 : 5000 
* 부서번호 : 10
*/


}

}

class sale{

String name;
int tax;
int price;
int sum;

public void displaysale()	{
System.out.println("과일 이름 :" + name);
System.out.println("세금 :" + tax);
System.out.println("금액 :" + price);
System.out.println("수익합계 :" + sum);


}



}
public class OOPBasic {

	public static void main(String[] args) {
		

		Employee king ; // 참조변수(주소값) 내가 만든 자료형으로 변수 선언 / Employee 6개의 데이터를 가지고 있을 수 있다.
		king = new Employee();        // 참조 자료형  , 인스턴스화 -> 인스턴스(메모리할당)  
		// 주소값 : 할당 받은 memory의 시작 주소( 1개의 값만 저장할 수 있다.) 
		// 주소값을 통해서 내가 지정한 자료형으로 갈 수 있다. 
		// king 의 값을 주소값을 불러주는 참조변수라고 불러준다. (주소값을 가지고 있다. = 객체를 가지고 있고, 인스턴스화 시킨다.)
		// 참조변수는 별도로 4byte 할당 받는다. 
		// 이제부터 각자 관리 되는 것이 아니라 king하나로 관리하겠다.
		
		king.empno = 1000; // 인스턴트 변수 적용
		king.ename = "사장님";
		king.job = "관리";
		king.mgr =0;
		king.sal = 5000;
		king.deptno = 10;
				
		king.displayEmployee();
		
		/*
		 * 사원번호 : 1000 
		 * 사원이름 : 사장님 
		 * 직책 : 관리 
		 * 사수번호 : 0
		 * 급여 : 5000 
		 * 부서번호 : 10
		 */
	
		// 새로운 사람을 넣을 때! 
		Employee scott ;
		scott = new Employee();  // 1) 할당을 받는다. 
		
		scott.empno = 1001; // 이제부터 각자 관리 되는 것이 아니라 king하나로 관리하겠다.
		scott.ename = "scott";
		scott.job = "salesman";
		scott.mgr =1000;
		scott.sal = 2500;
		scott.deptno = 2;
		
	    scott.displayEmployee();
	   
	    sale apple ;
		apple = new sale();
		
		apple.name = "apple";
		apple.tax = 100;
		apple.price =  1000;
		apple.sum = (apple.price -apple.tax);
		
		apple.displaysale();
	    
	    /*
		 * 사원번호 : 1001
		 * 사원이름 : scott
		 * 직책 : salesman
		 * 사수번호 : 1000
		 * 급여 : 2500
		 * 부서번호 : 2
		 */
	    
		
		

	}

}
