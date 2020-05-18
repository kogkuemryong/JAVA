package Thread;


class SumThead extends Thread{

	String threadName; 
	int start, end;
	
	SumThead(String threadName, int start, int end){
		
		this.threadName = threadName;
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() { // run(); 을 통해서 main 2개인것과 같은 효과를 가진다. main과 동시 수행. 
		int sum = 0;
		
		for(int i = start ; i <= end; i++) {
			sum+=i;
			System.out.println(threadName);
		}
		System.out.printf("%s => %d ~ %d 까지의 합 : %d \n", threadName, start, end, sum);
	}
}
public class ThreadUnderstand {

	public static void main(String[] args) {// main = 프로그램을 시작 시키는 thread 이기도 하다.  
		
		// 3가지 한번에 수행하는 명령어 이다.  main, thread1, thread2
		
		SumThead  thread1 = new SumThead ("쓰레드1", 1, 10); // main 안에서 new 하는 컨셉은 변함없다. 
		// 1~10까지의 합
		
		SumThead  thread2 = new SumThead ("쓰레드2", 11, 20);
		// 11~20까지의 합 
		
		int sum = 0;
		
		thread1.start(); // .start(); 호출하러 가자마자 바로 복귀를 시켜서 다음 명령어를 수행하고, 운영체제에게 명령수행하기 전 준비하도록 요청한다.  
		                      // thead 를 수행하기 전  메모리들을 운영체제에게 요청해서  thead의 메모리를 할당받아
		                      // thread의 run을  호출하게끔 구현이 되어져있다. 
		                      // main은 main 대로 수행하고, start로 바로 복귀 시켜 두개가 함께 수행하도록 한다. 
	
		thread2.start(); // start(); 호출하러 가자마자 바로 복귀해서  method를 수행한다. 
		
		for(int i = 1 ; i <= 50 ; i++) {
			sum += i;
			System.out.println("main");
		}
		System.out.println("main() 메서드 실행 => 1~50까지의 합 : " + sum);
		System.out.println("프로그램 종료.");
		// 결과값 : main, thread1, thread2 함께 수행하는 효과를 주지만 출력되는 순서는 일정하게 나타나지 않는다. 
		// 현재 운영되는 프로그램에 따라서 다른 결과를 나타낸다. 결과의 순서는 운영체제의 알고리즘만 알 수 있다. 
		// 3개의 작업이 골고루 수행되는 효과를 보여줄 수 있다. 
		

	}

}
