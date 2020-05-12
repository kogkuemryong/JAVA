package 상속.exam16;

interface Readable{ // 추상메서드만 들어있는 class 
    // new : x - 추상메서드 때문이다. 무조건 overriding 해서 사용해야하기 때문이다. 
    

public void read();
}



class OuterClass {

private String name;
	
	
	OuterClass(String name){
		this.name = name;
	}
	
	
	
	public Readable createLocalClassInst(int num) {
		// 메모리에 할당한 주소값만 return 할 수 있도록 만든다. 
		
		return new Readable() { // overriding 해서 문제 없이 사용된다.  
			@Override
			public void read() { // 이름이 없는 class Anonymous Class라고 한다.
				System.out.println("LocalClass read() : " + name);
				System.out.println("num : " +num);
			}
		};
		
		/*
		 class LocalClass implements Readable{
			public void read() {
				System.out.println("LocalClass read() : " + name);
				System.out.println("num : " +num);
			}
		}
	
		Readable  localClass = new  LocalClass();  // LocalClass 은 인스턴스화 할때 한번 사용. 
		return localClass;                                    // 밖에서는 Readable 사용. 
        */ 
	}
}
