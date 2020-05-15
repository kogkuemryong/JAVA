package CollectionFramework;

import java.util.ArrayList;

public class AdvancedWrapperList {

	public static void main(String[] args) {
        ArrayList<Integer> instanceInteger  = new ArrayList<Integer>(); 
        // 저장할 set 을 Integer로 한정지었다. 
		
		// 데이터 저장
		instanceInteger.add(10); // wrapper class 정의되어 있어서 AutoBoxing/AutoUnboxing 되어서 편리하게 코드 작성이 가능해졌다. =  instanceInteger.add(new Integer(10));  
		instanceInteger.add(20); // instanceInteger.add(new Integer(20)); 
		instanceInteger.add(30); // instanceInteger.add(new Integer(30)); 
		
		// 데이터 참조 
		for(int i = 0; i < instanceInteger.size(); i++ ) {    //  instanceInteger.size() : 저장하고 있는 instance를 반환해준다. 
			System.out.println(instanceInteger.get(i));       // get을 통해서 출력 할 수 있는데 시작 숫자는 0이다. 
		}
		
		
		// 참조변수에 주소값이 저장이 되는데 참조 변수 없이도 get을통해서 주소값을 넣어주므로써 
		// 주소값이 가지고 있는 data를 출력해준다. ArrayList가 인스턴스를 관리해준다. 
		
		// 데이터 삭제
	
		System.out.println("=============");
		
		instanceInteger.remove(2); // 삭제와 동시에 안에 비여있는 공간에 뒤에 있는 내용을 땡겨준다. 
		
		for(int i = 0; i < instanceInteger.size(); i++ ) {    
			System.out.println(instanceInteger.get(i));       
		} 
		
	}

}
