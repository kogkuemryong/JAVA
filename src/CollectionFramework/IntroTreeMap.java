package CollectionFramework;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeMap;

public class IntroTreeMap {

	public static void main(String[] args) {
		
        TreeMap<Integer, String> map = new TreeMap<Integer, String> (); // key 값을 정수(Integer) data로 관리. 
		
		// 데이터 저장
	    map.put(6, "data6");   // map.put(new Integer(6), "data6");  // 5버전 부터 AutoBoxing 에 의해서 편리한 형태로 사용 가능 
	    map.put(4, "data4");
	    map.put(5, "data5");
	    map.put(2, "data2");
	    map.put(1, "data1");
	    map.put(3, "data3");
	    
	    
	    for(int i = 0; i <=6 ;i++) {
	    System.out.println(map.get(i));
	    }
	    
	    NavigableSet<Integer> navi = map.navigableKeySet();
		// 주어진 dataSet을 가지고 객체를 생성해줄 때에는 method의 정보를 기반으로 하여 객체를 생성해준다. (new(x))
	    
	    
	    // 데이터 출력
	    System.out.println("==== 오름차순 =====");
	    Iterator<Integer> itr =navi.iterator();  // 
	    
	    while(itr.hasNext()) {
	    	System.out.println(map.get(itr.next()));
	    	
	    }
	    
	    System.out.println("==== 내림차순 ====");
	    itr = navi.descendingIterator();
	    
	    while(itr.hasNext()) {
	    	System.out.println(map.get(itr.next()));
	    	
	    }
	    
		

	}

}
