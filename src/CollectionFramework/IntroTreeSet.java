package CollectionFramework;

import java.util.TreeSet;

public class IntroTreeSet {  // 문자열일 때 알파벳 순으로 정의 되어있다. 


	public static void main(String[] args) {
        TreeSet<String>  set = new TreeSet();
		
		//데이터 저장
		set.add("First");
		set.add("Third");
		set.add("Scond");
		set.add("Scond");
		set.add("Fourth");
		

		System.out.println(set.size());
		
		for(String e :  set) {   
			System.out.println(e);   
		}
		

	}

}
