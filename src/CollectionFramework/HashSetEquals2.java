package CollectionFramework;

import java.util.HashSet;

class Person{
	
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this. age = age;
	}

	@Override
	public String toString() {
		return name + " : " + age; // " " 문자열이 있기 때문에 age 를 따로 변경할 필요 없다. 
	}

	@Override
	public int hashCode() { // 
		return (name+age).hashCode();  // 자료형이 다른 두개의 변수를 +연산자와 .hashCode()을 사용한다. 
	}

	@Override
	public boolean equals(Object obj) { // equals 어떤 자료형도 사용 가능 하다. 안전하게 하기 위해서는 동작되는 자료형으로 체크핮다. 
		
		if(obj instanceof Person) {  //  obj가 모든 자료형을 상속하기 때문에 Person의 자료형으로만 사용.
			Person tmp = (Person)obj;
			return name.equals(tmp.name) && (age == tmp.age);
	}      return false;
    }

}
public class HashSetEquals2 {

	public static void main(String[] args) {
        HashSet <Person> set = new HashSet <Person>();
		
		set.add(new Person("홍길동", 25));
		set.add(new Person("홍길동", 27)); // 다른 data로 생각한다. 
		set.add(new Person("홍길서", 25));
		set.add(new Person("홍길남", 25));
		set.add(new Person("홍길북", 25));
		set.add(new Person("홍길서", 25));
		
		for(Person e: set) { 
			System.out.println(e);
		}

	}

}
