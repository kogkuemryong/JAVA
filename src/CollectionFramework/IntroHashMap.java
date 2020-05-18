package CollectionFramework;

import java.util.HashMap;

public class IntroHashMap {

	public static void main(String[] args) {
		HashMap <String, String> map = new HashMap <String, String>();
		// map : key를 통해서 해당 데이터를 간접적으로 관리해서 처리하는 형태이다. 
		// HashMap :  map 이 가지고 있는 특징을 그대로 상속 받는다.  <key, value>
		
		map.put("이름", "홍길동");  // add를 사용하지 않고  put을 사용하는 이유는 관리의 방법이 다르기 때문이다. put(); data 저장. 
		map.put("주소", "서울시 종로구");  // 직접적으로 어떤 data가 들어가있는지 직관적으로 볼 수 있어서 활발히 활용된다. 
		map.put("이메일", "abc@aaa.com"); 
		map.put("전화번호", "010-1111-1111"); 
		
		// 데이터 참조
		System.out.println(map.get("이름"));   // get(); 결과를 가져오는 명령어 // keyword 로 저장하여 원하는 data를 직관력있게 가져올 수 있다. <key, value>
		System.out.println(map.get("주소")); 
		System.out.println(map.get("이메일")); 
		System.out.println(map.get("전화번호")); 
		
		// 데이터 삭제 
		map.remove("주소"); // key 값을 이용해서 삭제. 
		
	    System.out.println(map.get("주소"));  // 주소 값이 삭제 되어 초기값인 null 출력 
	

	}

}
