package 객체지향언어;

class human {
	private String name; // 이름
	private int milID; // 군번
	

	human(String name, int mID){
		this.name = name;  // 생성자 매개변수와 필드의 자료형 이름과 동일하기 때문에 null 값이 나오고 있다. 
		this.milID =mID;     // java는 name 을 매개변수로 생각한다. 그래서 자기 자신한테 넣어주고 필드에 있는 name에 접근하지 않는다. 
	}                      
	
	//생성자 overloading = 1) 매개 변수의 갯수가 다르던지 2)자료형이 달라야한다. 
	
	human(String name){
		this.name = name;  
		this.milID =0; 
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		
		if (milID!=0){
			System.out.println("군번 : " + milID);	
		}

}
}
