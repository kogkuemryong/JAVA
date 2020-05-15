package CollectionFramework;
// 읽기, 쓰기 , 삭제 가 동의하게 정의되어 있다. 
// 코드만 보고서는 알 수 없기 때문에 어떠한 특징을 가지고 있는지 명확하게 알고 있어야한다. 
// 완벽한 호환


import java.util.Iterator;
import java.util.LinkedList;  // 빈번하게 추가 삭제를 할 때 사용한다. 

public class IntroLinkedList { 
 
	public static void main(String[] args) {// Integer 기본형 int 를 class로 감싸서 참조변수화 시켜준다. 
		
		Integer num1 = new Integer(10); // 참조 변수 num1 : 인스턴스의 주소값을 저장해준다. (넓은 의미로 참조변수를 인스턴스라 부르기도 한다.)
		Integer num2 = new Integer(20);
		Integer num3 = new Integer(30);
		
		Integer[] num = new Integer[3]; // 참조변수가 담긴 값(주소값)을 할당하는 것이다.
		num[0] = new Integer(10);
		num[1] = new Integer(20);
		num[2] = new Integer(30);
		
		// 아쉬운 점 : index를 내가 관리해야한다. 
		
		//5버전 이후 부터 Generic으로 사용
		LinkedList<Integer> instanceInteger  = new LinkedList<Integer>(); // 저장할 set 을 Integer로 한정지었다. 
	
		// 데이터 저장
		instanceInteger.add(new Integer(10)); 
		instanceInteger.add(new Integer(20));
		instanceInteger.add(new Integer(30));
		
		// 데이터 참조 
		for(int i = 0; i < instanceInteger.size(); i++ ) {    //  instanceInteger.size() : 저장하고 있는 instance를 반환해준다. 
			System.out.println(instanceInteger.get(i));       // get을 통해서 출력 할 수 있는데 시작 숫자는 0이다. 
		}  // get이 추가 된 것이지 같은 컨셉으로 되어 있다. 
		
		System.out.println("=======================");
		
		Iterator<Integer> itr = instanceInteger.iterator();  // iterator(); interface로 저장되어 있다. set에 담겨 있는 정보로 itr 을 반환해 주고 있는 것이다. 
        // emthod가 스스로 new 해준다. (ex = calendar) 

        while(itr.hasNext()){   // hasNext(): 데이터가 있는지 확인 하고 있으면 true, 없으면 false / 데이터의 위치까지 확인할 수 있다. 
        System.out.println(itr.next());	// next() 사용하여 읽어 온다. 
        }
		
		
		// 참조변수에 주소값이 저장이 되는데 참조 변수 없이도 get을통해서 주소값을 넣어주므로써 
		// 주소값이 가지고 있는 data를 출력해준다. ArrayList가 인스턴스를 관리해준다. 
		
		// 데이터 삭제
	
		System.out.println("========================");
		
		instanceInteger.remove(2); // 삭제와 동시에 안에 비여있는 공간에 뒤에 있는 내용을 땡겨준다. 
		
		for(int i = 0; i < instanceInteger.size(); i++ ) {    
			System.out.println(instanceInteger.get(i));       
		} 
		
        System.out.println("=========================");
		
		for(Integer e:instanceInteger) {
			System.out.println(e);
		}
		

	}

}
