package String;

public class StringBuilder {
	public static void main(String[] args) {

		new StringBuilder(); 
		 StringBuffer stringBuilder = new StringBuffer("AB"); 
		//  StringBuffer 와 StringBuilder 같은 기능을 가진다.
	    //StringBuilder stringBuilder = new StringBuilder("AB");  //error
		// error: 
		
		/*
		 * java는 가까운 명령어를 인식하기 때문에 가까이 있는 public class StringBuilder { 을 찾아간다. 내 자신으로
		 * 착각하는 것이다.
		 * 
		 * new StringBuilder(""); 입력 값을 넣지 않으면 public StringBuilder() {} 값으로 default 값으로
		 * 저장 되기 때문에 error가 나지 않는다.
		 * 
		 * 사용하는 명령의 이름과 같은 이름으로 class 이름을 만들지 않는다.
		 */ 
		

		//stringBuilder.append(25); //append 문자, 실수, 정수, booloan 자료형 상관없이  문자열화 해서 맨 뒤에 결합해준다. 
		//stringBuilder .append(3.14);
		//stringBuilder .append(true);
		//stringBuilder .append("Y");
		
		stringBuilder.append(25).append("Y").append(.14).append(true);
		System.out.println(stringBuilder); 
		
		stringBuilder.insert(3,false); 
		System.out.println(stringBuilder);
		// insert : 두번째 자리에 false를 입력하겠다는 것을 의미한다. 원하는 위치에 삽입해준다. 
	    // 0부터 카운팅. 


	}

}
