package CollectionFramework;

import java.util.HashSet;

class Num{
	int num;
		
	Num(int num){
		this.num = num;
	}

	@Override
	public String toString() {  // String에 한해서 출력될 때, 입력값 그대로 출력해준다. 
		return String.valueOf(num); // 입력되는 데이터를 큰 따옴표를 붙여서 문자화 해준다. 
	}

	@Override
	public int hashCode() {
		System.out.println("hashCode() 호출.");
		return num % 3; // 3으로 나눠서 나온 값 (0,1,2) = 각각의 결과 값끼리만 비교되도록 만든다. 
	}

	@Override
	public boolean equals(Object obj) { 
		System.out.println("equals() 호출.");
		Num comp = (Num)obj;
		
		if(comp.num == num) {
			return true;
		}else {return false;}
	}	
}
public class HashSetEquals {
	public static void main(String[] args) {
        HashSet<Num> set = new HashSet<>(); // 낵가 만든 class를 넣어서 HashSet이 관리하게 만든다. 
		
		set.add(new Num(10));
		set.add(new Num(20));
		set.add(new Num(10));
		set.add(new Num(30));
		

		for(Num e:set) {  // 중복이 체크 되지 않고 입력된 값이 모두 출력된다. // toString을 overroding 해서 return 을 num의 값을 문자열로 보이도록 모두가 출력된다.  
			System.out.println(e);
			
			// HashSet 저장되기 이전에 검색이 되어지는데 검색은 Object 안에 equals method를 불러와서 검색한다. equals method는 참조변수의 주소값으로 같은지 다른지를 확인한다. 
            // add할 때, new 하여 각각의 인스턴트 주소값이 다르게 저장되어서  equals는 다른 값으로 인지하게 되여 모든 값이 출력된다. 
			// 해결방안으로는 equals merhod를 overriding 해서 사용한다. (true = 같다 , false = 다르다)
			
			// 하지만 set 은 검색의 기능은 중복을 확인하고 있기 성능이 좋지 않으므로 내용이 많아지면 너무 늦어 질 수 있어서 이를 해결하기 위한 알고리즘을 만들어서 문제를 해결해야한다. 
			// 어떻게 검색을 효율적으로 하면 좋을까? 
			// hashcode를 override 해서 해시알고리즘을 만들어서 보다 적은 단계로 비교하도록 만든다. 
			

			// String 안에 기능중에 내용을 비교하게 기능을 넣어놨기 때문에 중복값을 저장하지 않을 수 있었다.  
		}	
		

	}

}
