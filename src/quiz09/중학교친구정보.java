package quiz09;

import java.util.Scanner;

class 중학교친구정보  extends 부모class{
	
	String result;
	private String ban; 
	
	   
	중학교친구정보(String name, String phonenum, String address, String ban){
		super( name,phonenum, address);
		this.ban = ban; 
		
	}
	
	public String display중학교친구정보() {
		
		Scanner information = new Scanner(System.in);
		
		display부모();
		ban = ("반 : " + ban);
		
		result = display부모()+ban;
	
		return result; 
		
	}

	
}
