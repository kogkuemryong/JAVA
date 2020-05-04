package quiz09;

class 고등학교친구정보 extends 부모class{
	
	String result;
	
	private String job; 
	
	   
	고등학교친구정보(String name, String phonenum, String address, String job){
		super( name,phonenum, address);
		this.job = job; 
		
	}
	
	public String display고등학교친구정보() {
		
		display부모();
	    job = ("직업 : " + job);
       
        result= display부모()+job; 
        return result;
        
		
	}

}
