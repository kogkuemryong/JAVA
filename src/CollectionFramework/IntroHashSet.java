package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class IntroHashSet { // 중복 저장 x , 저장순서로 기록 x

	public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>(); // 문자열 
		
		// 데이터 저장
		set.add("Frist"); 
		set.add("Second");
		set.add("Third");
		set.add("Fourth");
		set.add("Second"); 
		
		
		System.out.println(set.size()); // 개수 : 4 (중복 저장x)
		
		System.out.println("=========================");
		/*
		// 데이터 참조 
		for(int i = 0; i < set.size(); i++ ) {    
			System.out.println(set.get(i));  error :  읽어오는 get() 을 지원해 주지 않는다. 체계화 되어서 사용된다고 하는데 왜 그럴까? 
			                                            list 는 저장한 순서대로 반환 하기 때문에 의미가 있지만 set은 저장한 순서를 유지 하지 않기 때문에 의미하지 않는
		}                                              
		*/
		
	
		System.out.println(set);
		
		System.out.println("=========================");
		
		// String 안에 기능중에 내용을 비교하게 기능을 넣어놨기 때문에 중복값을 저장하지 않을 수 있었다.  
		
		
		// 데이터 참조 
		Iterator<String> itr = set.iterator();  // iterator(); interface로 저장되어 있다. set에 담겨 있는 정보로 itr 을 반환해 주고 있는 것이다. 
		                                                    // emthod가 스스로 new 해준다. (ex = calendar) 
		
		while(itr.hasNext()){   // hasNext(): 데이터가 있는지 확인 하고 있으면 true, 없으면 false / 데이터의 위치까지 확인할 수 있다. 
    		System.out.println(itr.next());	// next() 사용하여 읽어 온다. 
		}
		
		
        System.out.println("========================="); 
		
		for(String e:set) {  // 5번전 부터 제공되는 for : each 문으로 Iterator를 사용하는 것 보다 간편하게 출력할 수 있게 제공해준다. 
			System.out.println(e);
		}


	}

}
