package quiz09;

import java.util.Scanner;

public class 종합 {

	public static void main(String[] args) {
		Scanner information = new Scanner(System.in);
          String result1;
		
		  System.out.println("이름 : "); 
		  String name = information.nextLine();
		  
		  System.out.println("전화번호 : "); 
		  String phonenum = information.nextLine();
		  
		  System.out.println("주소 : "); 
		  String address = information.nextLine();
		  
		  System.out.println("반 : "); 
		  String ban = information.nextLine();
		  
		  
		  중학교친구정보 중학교친구정_보 = new 중학교친구정보(name, phonenum,address,ban);
		  result1 = 중학교친구정_보.display중학교친구정보();
		  
		System.out.println(result1);

		  
		String result2;
		
		information.nextLine();
	
		System.out.println("이름 : ");
		String name1 = information.nextLine();
		
		System.out.println("전화번호 : ");
		String phonenum1 = information.nextLine();
        
		System.out.println("주소 : ");
		String address1 = information.nextLine();
        
		System.out.println("직업 : ");
		String job = information.nextLine();
		
		
		고등학교친구정보 고등학교친구정_보  = new 고등학교친구정보(name1, phonenum1,address1,job);
		
		result2 = 고등학교친구정_보.display고등학교친구정보();
		System.out.println(result2);
		

	}

}
