package CollectionFramework;

import java.util.TreeSet;

    class Person1 implements Comparable<Person1>{ // Comparable은
	String name; 
	int age;
	
	Person1(String name, int age){
		
		this.name = name;
		this.age = age;
	}
	
	public void showData() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		
	}

	@Override
	public int compareTo(Person1 o) {
		
		return  o.age- age;
		
		
		/*
		if(age > o.age) {
			return 1;
		}else if(age == o.age) {
			return 0; 
		}else {
			return -1; 
		}
	    */

		// hash code와 equals method를 사용하지 않아도 된다. 
		// 정렬하면서 필터링을 하기 때문에 필료하지 않는다. 
		// 빠르게 정렬하도록 overriding 되어 있기 때문에 hash code 사용하지 않는다. 
		// Comparable을 사용하여 정렬의 기준만 정확히 알려주면 data 중복도 확인하여 저장한다. 
	}
}

public class ComparablePerson {
	public static void main(String[] args) {
		
        TreeSet<Person1> set = new TreeSet<Person1>();
		
		set.add(new Person1("홍길동", 21));
		set.add(new Person1("이순신", 25));
		set.add(new Person1("강감찬", 28));
		set.add(new Person1("유관순", 23));
		set.add(new Person1("안중근", 25));
		set.add(new Person1("강감찬", 28));
		
		System.out.println(set.size()); // 어느것에 맞춰서 정렬해야할지 모르게 때문에 error
		
		
		for(Person1 e :  set) {   
			//System.out.println(e); // toStirng 하지 않았기 때문에 exam08.Person@15db9742 이러한 일련번호 나온다. 
			e.showData();
		}
		
	}

}
