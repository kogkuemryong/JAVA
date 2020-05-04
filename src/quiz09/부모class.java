package quiz09;

class 부모class {
	private String name;
	private String phonenum;
	private String address;
	String result;
	
	부모class(String name, String phonenum, String address){
		this.name = name;
		this.phonenum = phonenum;
		this.address = address;
		
	}
	
	public String   display부모() {

	
	
	
	result= ("이름 :" + name + "전화번호 : " + phonenum +"주소 : " + address);
	
	return result;

}
	
}
