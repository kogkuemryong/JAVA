package Thread; // 자료형을 선언했을 때, 그 자료형을 thread 로 상속받고 싶을 때 다른 class 를 상속받았을 때 사용법. 

class Sum {
	int num; 
	
	Sum(){num=0;}
	
	public void addNum(int num) {this. num += num;}
	public int getNum() {return num;}
}

class AddThread extends Sum implements Runnable{    // Sum 을 상속 받아서  thread를 상속하지 못할 때! implements Runnable 인터페이스 사용.  
	                                                                         // Runnable 안에 run(); 추상method 하나 들어가있다. 
	                                                                         // thread와는 상관이 없다. 단지 run method 만 오버라이딩 되어 있는 것이다.  
	                                                                         // thread기능을 탑재 시키기 위한 유일한 방법
	
	AddThread(int start , int end){
		this.start = start;
		this.end = end;
	}

	int start, end; 
	                                                          
	@Override                                                          
	public void run() {   
		for(int i = start; i <= end ; i++){
			addNum(i);
		}System.out.printf("%d ~ %d 의 총 합은 : %d  \n", start, end, num);
	}   
}

public class RunnalbleThread {
	public static void main(String[] args) { 

		 AddThread at1 = new  AddThread(0,50); // thread 기능이 탑재 되어 있지 않다. 
		 // runnable을 상속받는  AddThread을 사용하여 run을 사용한다. 
		 
		 AddThread at2 = new  AddThread(51,100);
		 
		Thread thread1 = new Thread(at1); // run 을 수행시킬 코드를 만들어줘야 한다. 
		Thread thread2 = new Thread(at2); 
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {  
			e.printStackTrace();
		} 
		
		// join() method는 try~each 문으로 감싸줘야하며, join() method는 run(); method가 수행될때까지 기다린다. 
		
		
		System.out.println("0~100까지의 합 : " +  (at1.getNum()+at2.getNum()));
		
		// (at1.getNum()+at2.getNum())의 값이 계속 다르게 나타나는 이유:
		// thread1, thread2 , main 함께 시작하기 때문에 컴퓨터의 상태에 따라서 언제 실행될지 알 수 없다.  
		// thread1, thread2이 구동되기 전에  main은 벌써 System.out.println("0~100까지의 합 : " +  (at1.getNum()+at2.getNum())); 실행했기 때문에 결과가 항상 다르다. 
		// thread1, thread2가 구동이 되고 나서 System.out.println("0~100까지의 합 : " +  (at1.getNum()+at2.getNum())); 실행 되어야지 올바른 결과값이 나온다. 
		

	}

}
