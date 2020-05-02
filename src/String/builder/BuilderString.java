package String.builder;

public class BuilderString { // StringBuilder : string 의 기능중 concat의 문제를 해결하기 위해서 사용하는 자료형이다.
		public static void main(String[] args) {
			new StringBuilder(); // java.lang 에 저장되어 있어서 import 할 필요가 없다. 
			StringBuilder stringBuilder = new StringBuilder("AB");
		    
			System.out.println(stringBuilder);
		    
			
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
		
			/*
			 * append = 별도의 메모리를 가지고 있어서 추가되는 형태로 저장되며 자신이 할당한 메모리 보다 내용이 많아지면 스스로 메모리를
			 * 추가해가는 알고리즘으로 되어 있어서 concat이 가지고 있는 단점으로 극복하도록 한다. concat 이라는 매서드가 있는 이유는 빠르게
			 * 불러올 수 있다라는 장점을 가지고 있기에 사용한다. 큰 단점을 극복하기 위해서 java에서 제시해주는 것이 append 이다.
			 * 
			 * 문자열의 갯수가 많을 때는 StringBuilder 사용하는 것이 좋다. 메모리의 비효율성을 해결할 수 있다. 
			 */
		

	}

}
